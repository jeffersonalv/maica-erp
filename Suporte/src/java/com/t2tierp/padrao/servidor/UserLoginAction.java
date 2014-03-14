package com.t2tierp.padrao.servidor;

import org.openswing.swing.server.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import org.hibernate.Session;
import org.openswing.swing.message.receive.java.*;

/**
 * <p>Title: T2Ti ERP</p>
 * <p>Description: Executa o login de acordo com os dados informados pelo usuário.</p>
 *
 * <p>The MIT License</p>
 *
 * <p>Copyright: Copyright (C) 2010 T2Ti.COM</p>
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 *       The author may be contacted at:
 *           t2ti.com@gmail.com</p>
 *
 * @author Albert Eije (T2Ti.COM)
 * @version 1.0
 */
public class UserLoginAction extends LoginAction {

    public UserLoginAction() {
    }

    /**
     * Login operation.
     */
    public final Response executeCommand(Object inputPar, UserSessionParameters userSessionPars, HttpServletRequest request, HttpServletResponse response, HttpSession userSession, ServletContext context) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();

            String languageId = null;

            languageId = "PT_BR";
            TextResponse tr = new TextResponse(languageId);
            SessionIdGenerator gen = (SessionIdGenerator) context.getAttribute(Controller.SESSION_ID_GENERATOR);
            tr.setSessionId(gen.getSessionId(request, response, userSession, context));

            Hashtable userSessions = (Hashtable) context.getAttribute(Controller.USER_SESSIONS);
            HashSet authenticatedIds = (HashSet) context.getAttribute(Controller.SESSION_IDS);
            if (userSessionPars != null) {
                userSessions.remove(userSessionPars.getSessionId());
                authenticatedIds.remove(userSessionPars.getSessionId());
            }
            userSessionPars = new UserSessionParameters();
            userSessionPars.setSessionId(tr.getSessionId());
            userSessionPars.setUsername("Suporte");
            userSessions.put(tr.getSessionId(), userSessionPars);
            userSessionPars.setLanguageId(languageId);

            authenticatedIds.add(tr.getSessionId());

            return tr;
        } catch (Exception ex1) {
            ex1.printStackTrace();
            return new ErrorResponse(ex1.getMessage());
        } finally {
            try {
                session.close();
            } catch (Exception ex) {
            }
        }

    }
}
