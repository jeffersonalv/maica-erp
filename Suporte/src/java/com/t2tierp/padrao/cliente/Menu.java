package com.t2tierp.padrao.cliente;

import com.t2tierp.suporte.cliente.SuporteTecnicoGridController;
import com.t2tierp.suporte.java.ChamadoVO;
import java.util.*;
import org.openswing.swing.mdi.client.*;
import org.openswing.swing.util.client.*;
import org.openswing.swing.permissions.client.*;
import javax.swing.*;
import javax.swing.tree.DefaultTreeModel;
import org.openswing.swing.domains.java.Domain;
import org.openswing.swing.internationalization.java.*;
import org.openswing.swing.message.receive.java.*;
import org.openswing.swing.permissions.java.ButtonsAuthorizations;

public class Menu implements MDIController, LoginController {

    private Fachada fachadaCliente = null;
    private Hashtable domains = new Hashtable();
    private String nomeUsuario = null;
    private boolean acessoUsuario;
    private ChamadoVO chamado;

    public Menu(boolean acessoUsuario, String parametros) {
        ClientUtils.setObjectSender(new HessianObjectSender());
        fachadaCliente = new Fachada();
        this.acessoUsuario = acessoUsuario;
        try {
            if (acessoUsuario) {
                String[] s = parametros.split("\\|");

                Integer idEmpresa = Integer.valueOf(s[0]);
                String nomeEmpresa = s[1];
                Integer idUsuarioErp = Integer.valueOf(s[2]);
                String nomeUsuarioErp = s[3];
                String modulo = s[4];
                String janela = s[5];

                chamado = new ChamadoVO();
                chamado.setAbertoPor("U");
                chamado.setStatusChamado("A");
                chamado.setIdEmpresa(idEmpresa);
                chamado.setNomeEmpresa(nomeEmpresa);
                chamado.setIdUsuario(idUsuarioErp);
                chamado.setNomeUsuario(nomeUsuarioErp);
                chamado.setModulo(modulo);
                chamado.setJanela(janela);
            }
            //LoginDialog d = new LoginDialog(null, false, this);
            authenticateUser(null);
            loginSuccessful(null);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao iniciar a aplicação!\n" + ex.getMessage(), "Erro do Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * @return client facade, invoked by the MDI Frame tree/menu
     */
    public ClientFacade getClientFacade() {
        return fachadaCliente;
    }

    /**
     * Method used to destroy application.
     */
    public void stopApplication() {
        ClientUtils.getData("closeApplication", Boolean.TRUE);
        System.exit(0);
    }

    /**
     * Defines if application functions must be viewed inside a tree panel of MDI Frame.
     * @return <code>true</code> if application functions must be viewed inside a tree panel of MDI Frame, <code>false</code> no tree is viewed
     */
    public boolean viewFunctionsInTreePanel() {
        return !acessoUsuario;
    }

    /**
     * Defines if application functions must be viewed in the menubar of MDI Frame.
     * @return <code>true</code> if application functions must be viewed in the menubar of MDI Frame, <code>false</code> otherwise
     */
    public boolean viewFunctionsInMenuBar() {
        return !acessoUsuario;
    }

    /**
     * @return <code>true</code> if the MDI frame must show a login menu in the menubar, <code>false</code> no login menu item will be added
     */
    public boolean viewLoginInMenuBar() {
        return !acessoUsuario;
    }

    /**
     * @return application title
     */
    public String getMDIFrameTitle() {
        return "ERP - Suporte Técnico";
    }

    /**
     * @return text to view in the about dialog window
     */
    public String getAboutText() {
        return "Aplicação: ERP\n"
                + "\n"
                + "The MIT License\n"
                + "Copyright: Copyright (C) 2011 T2Ti.COM\n"
                + "\n"
                + "Permission is hereby granted, free of charge, to any person\n"
                + "obtaining a copy of this software and associated documentation\n"
                + "files (the 'Software'), to deal in the Software without\n"
                + "restriction, including without limitation the rights to use,\n"
                + "copy, modify, merge, publish, distribute, sublicense, and/or sell\n"
                + "copies of the Software, and to permit persons to whom the\n"
                + "Software is furnished to do so, subject to the following\n"
                + "conditions:\n"
                + "\n"
                + "The above copyright notice and this permission notice shall be\n"
                + "included in all copies or substantial portions of the Software.\n"
                + "\n"
                + "THE SOFTWARE IS PROVIDED 'AS IS', WITHOUT WARRANTY OF ANY KIND,\n"
                + "EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES\n"
                + "OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND\n"
                + "NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT\n"
                + "HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,\n"
                + "WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING\n"
                + "FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR\n"
                + "OTHER DEALINGS IN THE SOFTWARE.\n";
    }

    /**
     * @return image name to view in the about dialog window
     */
    public String getAboutImage() {
        return "about.jpg";
    }

    /**
     * @param parentFrame parent frame
     * @return a dialog window to logon the application; the method can return null if viewLoginInMenuBar returns false
     */
    public JDialog viewLoginDialog(JFrame parentFrame) {
        JDialog d = new LoginDialog(parentFrame, true, this);
        return d;
    }

    /**
     * @return maximum number of failed login
     */
    public int getMaxAttempts() {
        return 3;
    }

    /**
     * Method called by MDI Frame to authenticate the user.
     * @param loginInfo login information, like nomeUsuario, password, ...
     * @return <code>true</code> if user is correcly authenticated, <code>false</code> otherwise
     */
    public boolean authenticateUser(Map loginInfo) throws Exception {

        Response response = ClientUtils.getData("login", new String[]{"", ""});

        if (response.isError()) {
            throw new Exception(response.getErrorMessage());
        }

        String languageId = ((TextResponse) response).getMessage();

        response = ClientUtils.getData("getButtonAuthorizations", new Object[0]);
        if (response.isError()) {
            throw new Exception(response.getErrorMessage());
        }

        ButtonsAuthorizations buttonsAuthorizations = (ButtonsAuthorizations) ((VOResponse) response).getVo();

        Hashtable xmlFiles = new Hashtable();
        xmlFiles.put("EN", "Resources_en.xml");
        xmlFiles.put("IT", "Resources_it.xml");
        xmlFiles.put("ES", "Resources_es.xml");
        xmlFiles.put("PT_BR", "Resources_ptBR.xml");

        ClientSettings clientSettings = new ClientSettings(
                new XMLResourcesFactory(xmlFiles, true),
                domains,
                buttonsAuthorizations,
                false);

        ClientSettings.PERC_TREE_FOLDER = "folder3.gif";
        ClientSettings.BACKGROUND = "background4.jpg";
        ClientSettings.TREE_BACK = "treeback2.jpg";
        ClientSettings.FILTER_PANEL_ON_GRID = true;
        //ClientSettings.LOOK_AND_FEEL_CLASS_NAME = "com.birosoft.liquid.LiquidLookAndFeel";
        //com.birosoft.liquid.LiquidLookAndFeel.setLiquidDecorations(true);
        ClientSettings.LOOK_AND_FEEL_CLASS_NAME = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        ClientSettings.MAX_NR_OF_LOOPS_IN_ANALYZE_VO = 2;

        ClientSettings.getInstance().setLanguage(languageId);

        return true;
    }

    public static void main(String[] argv) {
        if (argv.length > 0) {
            if (argv[0].equals("-open")) {
                new Menu(true, argv[1]);
            }
        } else {
            new Menu(false, null);
        }
    }

    /**
     * Method called after MDI creation.
     */
    public void afterMDIcreation(MDIFrame frame) {
        GenericStatusPanel userPanel = new GenericStatusPanel();
        userPanel.setColumns(12);
        MDIFrame.addStatusComponent(userPanel);
        userPanel.setText(nomeUsuario);
        MDIFrame.addStatusComponent(new Clock());

        if (acessoUsuario){
            SuporteTecnicoGridController suporteTecnicoGridController = new SuporteTecnicoGridController(chamado);
        }
    }

    /**
     * @see JFrame getExtendedState method
     */
    public int getExtendedState() {
        return JFrame.MAXIMIZED_BOTH;
    }

    /**
     * Method called by LoginDialog to notify the sucessful login.
     * @param loginInfo login information, like nomeUsuario, password, ...
     */
    public void loginSuccessful(Map loginInfo) {

        Domain suporteAbertoPor = new Domain("suporteAbertoPor");
        suporteAbertoPor.addDomainPair("U", "Usuário");
        suporteAbertoPor.addDomainPair("S", "Software House");

        Domain suporteStatus = new Domain("suporteStatus");
        suporteStatus.addDomainPair("A", "Aberto");
        suporteStatus.addDomainPair("F", "Fechado");
        suporteStatus.addDomainPair("E", "Em análise pela SH");

        domains.clear();
        domains.put(suporteAbertoPor.getDomainId(), suporteAbertoPor);
        domains.put(suporteStatus.getDomainId(), suporteStatus);

        MDIFrame mdi = new MDIFrame(this);
    }

    /**
     * @return <code>true</code> if the MDI frame must show a change language menu in the menubar, <code>false</code> no change language menu item will be added
     */
    public boolean viewChangeLanguageInMenuBar() {
        return true;
    }

    /**
     * @return list of languages supported by the application
     */
    public ArrayList getLanguages() {
        ArrayList list = new ArrayList();
        list.add(new Language("EN", "English"));
        list.add(new Language("IT", "Italiano"));
        list.add(new Language("ES", "Espanhol"));
        list.add(new Language("PT_BR", "Português do Brasil"));
        return list;
    }

    /**
     * @return application functions (ApplicationFunction objects), organized as a tree
     */
    public DefaultTreeModel getApplicationFunctions() {
        return (DefaultTreeModel) ((VOResponse) ClientUtils.getData("getFunctionAuthorizations", new Object[]{acessoUsuario})).getVo();
    }

    /**
     * @return <code>true</code> if the MDI frame must show a panel in the bottom, containing last opened window icons, <code>false</code> no panel is showed
     */
    public boolean viewOpenedWindowIcons() {
        return true;
    }

    public boolean viewFileMenu() {
        return true;
    }
}
