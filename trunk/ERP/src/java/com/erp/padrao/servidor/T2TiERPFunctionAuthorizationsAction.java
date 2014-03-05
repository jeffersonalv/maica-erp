package com.erp.padrao.servidor;

import com.erp.cadastros.java.vo.PapelFuncaoVO;
import com.erp.cadastros.java.vo.UsuarioVO;
import java.util.ArrayList;
import java.util.List;
import org.openswing.swing.server.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.openswing.swing.message.receive.java.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.openswing.swing.mdi.java.ApplicationFunction;
import org.openswing.swing.internationalization.java.ResourcesFactory;
import org.openswing.swing.tree.java.OpenSwingTreeNode;

/**
 * <p>Title: T2Ti ERP</p>
 * <p>Description: Devolve para a aplicação do lado cliente as autorizações das
 * funções (menus) da aplicação.</p>
 *
 * <p>The MIT License</p>
 *
 * <p>Copyright: Copyright (C) 2010 T2Ti.COM</p>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * The author may be contacted at: t2ti.com@gmail.com</p>
 *
 * @author Albert Eije (T2Ti.COM)
 * @version 1.0
 */
public class T2TiERPFunctionAuthorizationsAction implements Action {

    public T2TiERPFunctionAuthorizationsAction() {
    }

    /**
     * @return request name
     */
    public final String getRequestName() {
        return "getFunctionAuthorizations";
    }

    /**
     * Business logic to execute.
     */
    public final Response executeCommand(Object inputPar, UserSessionParameters userSessionPars, HttpServletRequest request, HttpServletResponse response, HttpSession userSession, ServletContext context) {
        //recupera as definições de internacionalização (objeto Resources)...
        ResourcesFactory factory = (ResourcesFactory) context.getAttribute(Controller.RESOURCES_FACTORY);
        String langId = userSessionPars.getLanguageId();

        DefaultMutableTreeNode root = new OpenSwingTreeNode();
        root.setUserObject("ERP");
        DefaultTreeModel model = new DefaultTreeModel(root);






        ApplicationFunction n1 = new ApplicationFunction(factory.getResources(langId).getResource("Cadastros"), "MenuCadastros.png");

        ApplicationFunction n11 = new ApplicationFunction(factory.getResources(langId).getResource("Produto"), "MenuProdutos.png");
        ApplicationFunction n111 = new ApplicationFunction(factory.getResources(langId).getResource("Marca"), "produtoMarca", "marcaMenu.png", "getProdutoMarca");
        ApplicationFunction n112 = new ApplicationFunction(factory.getResources(langId).getResource("NCM"), "ncm", "NCMMenu.png", "getNcm");
        ApplicationFunction n113 = new ApplicationFunction(factory.getResources(langId).getResource("Unidade"), "unidadeProduto", "unidadeMenu.png", "getUnidadeProduto");
        ApplicationFunction n114 = new ApplicationFunction(factory.getResources(langId).getResource("Grupo"), "produtoGrupo", "grupoMenu.png", "getProdutoGrupo");
        ApplicationFunction n115 = new ApplicationFunction(factory.getResources(langId).getResource("Sub Grupo"), "produtoSubGrupo", "subgrupoMenu.png", "getProdutoSubGrupo");
        ApplicationFunction n116 = new ApplicationFunction(factory.getResources(langId).getResource("Produto"), "produto", "mercadoriasMenu.png", "getProduto");

        ApplicationFunction n12 = new ApplicationFunction(factory.getResources(langId).getResource("Empresa"), "empresaMenu.png");
        ApplicationFunction n121 = new ApplicationFunction(factory.getResources(langId).getResource("Quadro Societário"), "quadroSocietario", "sociosMenu.png", "getQuadroSocietario");
        ApplicationFunction n122 = new ApplicationFunction(factory.getResources(langId).getResource("Sócio"), "socio", "socioMenu.png", "getSocio");
        ApplicationFunction n123 = new ApplicationFunction(factory.getResources(langId).getResource("Empresa"), "empresa", "empresaMenu.png", "getEmpresa");
        ApplicationFunction n124 = new ApplicationFunction(factory.getResources(langId).getResource("Empresa Cnae"), "empresaCnae", "empresaCnae.png", "getEmpresaCnae");

        ApplicationFunction nPessoal = new ApplicationFunction(factory.getResources(langId).getResource("Pessoal"), "cadPessoas.png");




        ApplicationFunction n13 = new ApplicationFunction(factory.getResources(langId).getResource("Pessoa"), "pessoa16.png");
        ApplicationFunction n131 = new ApplicationFunction(factory.getResources(langId).getResource("Estado Civil"), "estadoCivil", "estado_civil16.png", "getEstadoCivil");
        ApplicationFunction n132 = new ApplicationFunction(factory.getResources(langId).getResource("Pessoa"), "pessoa", "pessoaMenu.png", "getPessoa");


        ApplicationFunction n14 = new ApplicationFunction(factory.getResources(langId).getResource("Cliente | Fornecedor | Transportadora"), "clientesMenu.png");
        ApplicationFunction n141 = new ApplicationFunction(factory.getResources(langId).getResource("Atividade"), "atividadeForCli", "atividade_for_cli16.png", "getAtividadeForCli");
        ApplicationFunction n142 = new ApplicationFunction(factory.getResources(langId).getResource("Situação"), "situacaoForCli", "situacao16.png", "getSituacaoForCli");
        ApplicationFunction n143 = new ApplicationFunction(factory.getResources(langId).getResource("Cliente"), "cliente", "clientesMenu.png", "getCliente");
        ApplicationFunction n144 = new ApplicationFunction(factory.getResources(langId).getResource("Fornecedor"), "fornecedor", "fornecedorMenu.png", "getFornecedor");
        ApplicationFunction n145 = new ApplicationFunction(factory.getResources(langId).getResource("Transportadora"), "transportadora", "transportadoraMenu.png", "getTransportadora");

        ApplicationFunction n15 = new ApplicationFunction(factory.getResources(langId).getResource("Colaborador"), "colaboradorMenu.png");
        ApplicationFunction n151 = new ApplicationFunction(factory.getResources(langId).getResource("Tipo Admissão"), "tipoAdmissao", "tipoContrato16.png", "getTipoAdmissao");
        ApplicationFunction n152 = new ApplicationFunction(factory.getResources(langId).getResource("Tipo Relacionamento"), "tipoRelacionamento", "relacionamento16.png", "getTipoRelacionamento");
        ApplicationFunction n153 = new ApplicationFunction(factory.getResources(langId).getResource("Situação"), "situacaoColaborador", "situacao16.png", "getSituacaoColaborador");
        ApplicationFunction n154 = new ApplicationFunction(factory.getResources(langId).getResource("Tipo Desligamento"), "tipoDesligamento", "desligamenti_16.png", "getTipoDesligamento");
        ApplicationFunction n155 = new ApplicationFunction(factory.getResources(langId).getResource("Tipo Colaborador"), "tipoColborador", "tipo_colaborador16.png", "getTipoColaborador");
        ApplicationFunction n156 = new ApplicationFunction(factory.getResources(langId).getResource("Cargo"), "tipoCargo", "cargo16.png", "getCargo");
        ApplicationFunction n157 = new ApplicationFunction(factory.getResources(langId).getResource("Nível Formação"), "nivelFormacao", "nivel_formacao16.png", "getNivelFormacao");
        ApplicationFunction n158 = new ApplicationFunction(factory.getResources(langId).getResource("Colaborador"), "colaborador", "colaborador16.png", "getColaborador");

        ApplicationFunction n16 = new ApplicationFunction(factory.getResources(langId).getResource("Outros"), "outros.png");
        ApplicationFunction n161 = new ApplicationFunction(factory.getResources(langId).getResource("Contador"), "contador", "contador16.png", "getContador");
        ApplicationFunction n162 = new ApplicationFunction(factory.getResources(langId).getResource("Sindicato"), "sindicato", "sidicato.png", "getSindicato");
        ApplicationFunction n163 = new ApplicationFunction(factory.getResources(langId).getResource("Convênio"), "convenio", "convenio16.png", "getConvenio");

        ApplicationFunction n17 = new ApplicationFunction(factory.getResources(langId).getResource("Diversos"), "varios.png");
        ApplicationFunction n171 = new ApplicationFunction(factory.getResources(langId).getResource("Setor"), "setor", "setor16.png", "getSetor");
        ApplicationFunction n172 = new ApplicationFunction(factory.getResources(langId).getResource("Almoxarifado"), "almoxarifado", "almoxarifado16.png", "getAlmoxarifado");
        ApplicationFunction n173 = new ApplicationFunction(factory.getResources(langId).getResource("Operadora Plano Saúde"), "operadoraPlanoSaude", "planodeSaude.png", "getOperadoraPlanoSaude");
        ApplicationFunction n174 = new ApplicationFunction(factory.getResources(langId).getResource("Operadora Cartão"), "operadoraCartao", "operadora_cartao16.png", "getOperadoraCartao");

        ApplicationFunction n18 = new ApplicationFunction(factory.getResources(langId).getResource("Endereço"), "enderecos16.png");
        ApplicationFunction n181 = new ApplicationFunction(factory.getResources(langId).getResource("País"), "pais", "pais16.png", "getPais");
        ApplicationFunction n182 = new ApplicationFunction(factory.getResources(langId).getResource("Estado"), "uf", "EstadosMenu.png", "getUf");
        ApplicationFunction n183 = new ApplicationFunction(factory.getResources(langId).getResource("Município"), "municipio", "municipio16.png", "getMunicipio");
        ApplicationFunction n184 = new ApplicationFunction(factory.getResources(langId).getResource("CEP"), "cep", "cep16.png", "getCep");

        ApplicationFunction n19 = new ApplicationFunction(factory.getResources(langId).getResource("Financeiro"), "financeiroMenu.png");
        ApplicationFunction n191 = new ApplicationFunction(factory.getResources(langId).getResource("Banco"), "banco", "bancoMenu.png", "getBanco");
        ApplicationFunction n192 = new ApplicationFunction(factory.getResources(langId).getResource("Agência"), "agenciaBanco", "agencia_banco16.png", "getAgenciaBanco");
        ApplicationFunction n193 = new ApplicationFunction(factory.getResources(langId).getResource("Conta Caixa"), "contaCaixa", "caixasBancosMenu.png", "getContaCaixa");
        ApplicationFunction n194 = new ApplicationFunction(factory.getResources(langId).getResource("Talonário Cheque"), "talonarioCheque", "talonario16.png", "getTalonarioCheque");
        ApplicationFunction n195 = new ApplicationFunction(factory.getResources(langId).getResource("Cheque"), "cheque", "cheque16.png", "getCheque");

        ApplicationFunction n110 = new ApplicationFunction(factory.getResources(langId).getResource("Tabelas"), "MenuTabela.png");
        ApplicationFunction n1101 = new ApplicationFunction(factory.getResources(langId).getResource("CFOP"), "cfop", "cfopMenu.png", "getCfop");
        ApplicationFunction n1102 = new ApplicationFunction(factory.getResources(langId).getResource("Feriados"), "feriados", "feriado.png", "getFeriados");




        ApplicationFunction n2 = new ApplicationFunction(factory.getResources(langId).getResource("GED"), "ged16.png");
        ApplicationFunction n22 = new ApplicationFunction(factory.getResources(langId).getResource("Documentos"), "documento", "folder.png", "getDocumento");
        ApplicationFunction n23 = new ApplicationFunction(factory.getResources(langId).getResource("Tipos de Documento"), "tipoDocumento", "tiposDocumentosMenu.png", "getTipoDocumento");


        ApplicationFunction n3 = new ApplicationFunction(factory.getResources(langId).getResource("Contabilidade"), "Caduceus-16.png");
        ApplicationFunction n31 = new ApplicationFunction(factory.getResources(langId).getResource("Plano Natureza Financeira"), "planoNaturezaFinanceira", "naturezaFinanceira16.png", "getPlanoNaturezaFinanceira");
        ApplicationFunction n32 = new ApplicationFunction(factory.getResources(langId).getResource("Plano Centro Resultado"), "planoCentroResultado", "centroResultado16.png", "getPlanoCentroResultado");
        ApplicationFunction n33 = new ApplicationFunction(factory.getResources(langId).getResource("Natureza Financeira"), "naturezaFinanceira", "ContabilParametros16.png", "getNaturezaFinanceira");
        ApplicationFunction n34 = new ApplicationFunction(factory.getResources(langId).getResource("Centro Resultado"), "centroResultado", "centroResultado16.png", "getCentroResultado");



        ApplicationFunction n57 = new ApplicationFunction(factory.getResources(langId).getResource("Conciliação Contábil"), "ConciliacaoContabil16.png");
        ApplicationFunction n359 = new ApplicationFunction(factory.getResources(langId).getResource("Conciliação Bancária"), "conciliacaoBancaria", "ConciliacaoBancaria16.png", "getConciliacaoBancaria");
        ApplicationFunction n360 = new ApplicationFunction(factory.getResources(langId).getResource("Conciliação Cliente"), "conciliacaoCliente", "ConciliacaoCliente16.png", "getConciliacaoCliente");
        ApplicationFunction n361 = new ApplicationFunction(factory.getResources(langId).getResource("Conciliação Fornecedor"), "conciliacaoFornecedor", "ConciliacaoFornecedor16.png", "getConciliacaoFornecedor");
        ApplicationFunction n362 = new ApplicationFunction(factory.getResources(langId).getResource("Conciliação Contábil"), "conciliacaoContabil", "ConciliacaoContabil16.png", "getConciliacaoContabil");
        ApplicationFunction n363 = new ApplicationFunction(factory.getResources(langId).getResource("Composiçao do Saldo"), "composicaoSaldo", "ComposicaoSaldo16.png", "getComposicaoSaldo");




        ApplicationFunction n58 = new ApplicationFunction(factory.getResources(langId).getResource("Controle de Orçamento"), "orcamento.png");

        ApplicationFunction n364 = new ApplicationFunction(factory.getResources(langId).getResource("Orçamento Período"), "orcamentoPeriodo", "orcamentoPEriodo.png", "getOrcamentoPeriodo");
        ApplicationFunction n365 = new ApplicationFunction(factory.getResources(langId).getResource("Orçamento Financeiro Período"), "orcamentoFluxoCaixaPeriodo", "orcamento_periodo_16.png", "getOrcamentoFluxoCaixaPeriodo");
        ApplicationFunction n366 = new ApplicationFunction(factory.getResources(langId).getResource("Orçamento Financeiro de Caixa"), "orcamentoFluxoCaixa", "orcamentoFluxoCaixa_16.png", "getOrcamentoFluxoCaixa");
        ApplicationFunction n367 = new ApplicationFunction(factory.getResources(langId).getResource("Orçamento Empresarial"), "orcamentoEmpresarial", "orcamento.png16", "getOrcamentoEmpresarial");




        ApplicationFunction n59 = new ApplicationFunction(factory.getResources(langId).getResource("Sintegra"), "sintegra.png");

        ApplicationFunction n60 = new ApplicationFunction(factory.getResources(langId).getResource("Emissão do Sintegra"), "sintegra", "sintegraTransm.png", "getSintegra");


        ApplicationFunction n4 = new ApplicationFunction(factory.getResources(langId).getResource("Financeiro"), "financeiroMenu.png");
        ApplicationFunction n41 = new ApplicationFunction(factory.getResources(langId).getResource("Documento Origem"), "finDocumentoOrigem", "documentoOrigem16.png", "getFinDocumentoOrigem");

        ApplicationFunction n5 = new ApplicationFunction(factory.getResources(langId).getResource("Contas a Receber"), "Recebimento16.png");
        ApplicationFunction n51 = new ApplicationFunction(factory.getResources(langId).getResource("Status Parcela"), "finStatusParcela", "statusParcela16.png", "getFinStatusParcela");
        ApplicationFunction n52 = new ApplicationFunction(factory.getResources(langId).getResource("Tipo Recebimento"), "finTipoRecebimento", "tipoPagamento16.png", "getFinTipoRecebimento");
        ApplicationFunction n53 = new ApplicationFunction(factory.getResources(langId).getResource("Configuração Boleto"), "finConfiguracaoBoleto", "boleto.png.png", "getFinConfiguracaoBoleto");
        ApplicationFunction n54 = new ApplicationFunction(factory.getResources(langId).getResource("Lançamento Receber"), "finLancamentoReceber", "lancamentoReceber16.png", "getFinLancamentoReceber");
        ApplicationFunction n55 = new ApplicationFunction(factory.getResources(langId).getResource("Recebimento"), "finParcelaRecebimento", "Recebimento16.png", "getFinParcelaRecebimento");

        ApplicationFunction n7 = new ApplicationFunction(factory.getResources(langId).getResource("Contas a Pagar"), "pagamentoMenu.png");
        ApplicationFunction n71 = new ApplicationFunction(factory.getResources(langId).getResource("Status Parcela"), "finStatusParcela", "statusParcela16.png", "getFinStatusParcela");
        ApplicationFunction n72 = new ApplicationFunction(factory.getResources(langId).getResource("Tipo Pagamento"), "finTipoPagamento", "tipoPagamento16.png", "getFinTipoPagamento");
        ApplicationFunction n73 = new ApplicationFunction(factory.getResources(langId).getResource("Lancamento Pagar"), "finLancamentoPagar", "lancamentoPagar16.png", "getFinLancamentoPagar");
        ApplicationFunction n74 = new ApplicationFunction(factory.getResources(langId).getResource("Pagamento"), "finParcelaPagamento", "pagamentoParcela16.png", "getFinParcelaPagamento");

        ApplicationFunction n6 = new ApplicationFunction(factory.getResources(langId).getResource("EDI Bancário"), "edi.png.png");
        ApplicationFunction n61 = new ApplicationFunction(factory.getResources(langId).getResource("Processa Retorno"), "finProcessaArquivoRetorno", "ptrp16.png", "getFinProcessaArquivoRetorno");

        ApplicationFunction n8 = new ApplicationFunction(factory.getResources(langId).getResource("Caixa e Bancos"), "caixasBancosMenu.png");
        ApplicationFunction n81 = new ApplicationFunction(factory.getResources(langId).getResource("Movimento Caixa Banco"), "finMovimentoCaixaBanco", "movimentoCaixaBanco16.png", "getFinMovimentoCaixaBanco");

        ApplicationFunction n9 = new ApplicationFunction(factory.getResources(langId).getResource("Tesouraria"), "tesouraria16.png");
        ApplicationFunction n91 = new ApplicationFunction(factory.getResources(langId).getResource("Emissão de Cheque"), "finParcelaPagamento", "cheque16.png", "getFinParcelaPagamento");
        ApplicationFunction n92 = new ApplicationFunction(factory.getResources(langId).getResource("Resumo Tesouraria"), "finResumoTesouraria", "ResumoTesouraria16.png", "getFinResumoTesouraria");



        ApplicationFunction n10 = new ApplicationFunction(factory.getResources(langId).getResource("Fluxo Caixa"), "fluxoCaixa16.png");
        ApplicationFunction n101 = new ApplicationFunction(factory.getResources(langId).getResource("Fluxo Caixa"), "finFluxoCaixa", "fluxodeCAixa.png", "getFinFluxoCaixa");


        ApplicationFunction n20 = new ApplicationFunction(factory.getResources(langId).getResource("Conciliação Bancária"), "ConciliacaoBancaria16.png");
        ApplicationFunction n21 = new ApplicationFunction(factory.getResources(langId).getResource("Extrato Conta Banco"), "extratoContaBanco", "extratoBancario.png", "getFinExtratoContaBanco");



        ApplicationFunction n29 = new ApplicationFunction(factory.getResources(langId).getResource("Recursos Humanos"), "rh.png");


        ApplicationFunction n30 = new ApplicationFunction(factory.getResources(langId).getResource("Ponto Eletrônico"), "pontoHorario16.png");
        ApplicationFunction n300 = new ApplicationFunction(factory.getResources(langId).getResource("Parâmetros"), "pontoParametro", "pontoParametro16.png", "getPontoParametro");
        ApplicationFunction n301 = new ApplicationFunction(factory.getResources(langId).getResource("Horários"), "pontoHorario", "pontoHorario16.png", "getPontoHorario");
        ApplicationFunction n302 = new ApplicationFunction(factory.getResources(langId).getResource("Escala e Turma"), "pontoEscala", "escalaTurma16.png", "getPontoEscala");
        ApplicationFunction n303 = new ApplicationFunction(factory.getResources(langId).getResource("Classificação Jornada"), "pontoClassificacaoJornada", "class_Jornada.png", "getPontoClassificacaoJornada");
        ApplicationFunction n304 = new ApplicationFunction(factory.getResources(langId).getResource("Abono"), "pontoAbono", "pontoAbono16.png", "getPontoAbono");
        ApplicationFunction n305 = new ApplicationFunction(factory.getResources(langId).getResource("Relógio"), "pontoRelogio", "relogio16.png", "getPontoRelogio");
        ApplicationFunction n306 = new ApplicationFunction(factory.getResources(langId).getResource("Banco de Horas"), "pontoBancoHoras", "pontoBancoHoras16.png", "getPontoBancoHoras");
        ApplicationFunction n307 = new ApplicationFunction(factory.getResources(langId).getResource("Importa Arquivo AFD"), "pontoImportaMarcacao", "AIDF16.png", "getPontoImportaMarcacao");
        ApplicationFunction n308 = new ApplicationFunction(factory.getResources(langId).getResource("Geração de Arquivos"), "pontoGeracaoArquivo", "pontoGeraArquivo16.png", "getPontoGeracaoArquivo");
        ApplicationFunction n309 = new ApplicationFunction(factory.getResources(langId).getResource("Espelho Ponto Eletrônico"), "pontoEspelho", "pontoRelatorioEspelho16.png", "getPontoEspelho");
        ApplicationFunction n310 = new ApplicationFunction(factory.getResources(langId).getResource("Registrar Marcação"), "pontoRegistraMarcacao", "pontoBatida16.png", "getPontoRegistraMarcacao");




        ApplicationFunction n40 = new ApplicationFunction(factory.getResources(langId).getResource("Folha de Pagamento"), "folhaFechamento16.png");


       // ApplicationFunction n311 = new ApplicationFunction(factory.getResources(langId).getResource("Cadastros"), null);
        ApplicationFunction n312 = new ApplicationFunction(factory.getResources(langId).getResource("Parâmetros"), "folhaParametro", "folhaParametro16.png", "getFolhaParametro");
        ApplicationFunction n313 = new ApplicationFunction(factory.getResources(langId).getResource("Guias Acumuladas"), "guiasAcumuladas", "folhaGuiasAcumuladas16.png", "getGuiasAcumuladas");
        ApplicationFunction n314 = new ApplicationFunction(factory.getResources(langId).getResource("Plano de Saúde"), "planoSaude", "folhaPlanoSaude-16.png", "getPlanoSaude");
        ApplicationFunction n315 = new ApplicationFunction(factory.getResources(langId).getResource("Eventos"), "evento", "folhaEvento16.png", "getEvento");


        ApplicationFunction n42 = new ApplicationFunction(factory.getResources(langId).getResource("Ausências"), "ausencia.png");
        ApplicationFunction n316 = new ApplicationFunction(factory.getResources(langId).getResource("Tipos de Afastamento"), "tipoAfastamento", "folhaTipoAfastamento16.png", "getTipoAfastamento");
        ApplicationFunction n317 = new ApplicationFunction(factory.getResources(langId).getResource("Afastamentos"), "afastamento", "folhaAfastamento-16.png", "getAfastamento");
        ApplicationFunction n318 = new ApplicationFunction(factory.getResources(langId).getResource("Férias Coletivas"), "feriasColetivas", "folhaFeriasColetivas16.png", "getFeriasColetivas");
        ApplicationFunction n319 = new ApplicationFunction(factory.getResources(langId).getResource("Férias - Período Aquisitivo"), "feriasPeriodoAquisitivo", "folhaFeriasPeriodosAquisitivos16.png", "getFeriasPeriodoAquisitivo");




        ApplicationFunction n43 = new ApplicationFunction(factory.getResources(langId).getResource("Movimento"), "movimentoMenu.png");
        ApplicationFunction n320 = new ApplicationFunction(factory.getResources(langId).getResource("Fechamento"), "fechamento", "folhaFechamento16.png", "getFechamento");
        ApplicationFunction n321 = new ApplicationFunction(factory.getResources(langId).getResource("Lançamentos"), "lancamento", "folhaLancamento16.png", "getLancamento");
        ApplicationFunction n323 = new ApplicationFunction(factory.getResources(langId).getResource("Alteração Salarial"), "alteracaoSalarial", "folhaParametro16.png", "getAlteracaoSalarial");
        ApplicationFunction n324 = new ApplicationFunction(factory.getResources(langId).getResource("Vale Transporte"), "valeTransporte", "folhaValeTransporte-16.png", "getValeTransporte");
        ApplicationFunction n325 = new ApplicationFunction(factory.getResources(langId).getResource("PPP"), "ppp", "folhaPPP16.png", "getPpp");
        ApplicationFunction n326 = new ApplicationFunction(factory.getResources(langId).getResource("Rescisão"), "rescisao", "folhaRescisao16.png", "getRescisao");
        ApplicationFunction n327 = new ApplicationFunction(factory.getResources(langId).getResource("Informativos e Guias"), "informativosGuias", "folhaGuiasAcumuladas16.png", "getInformativosGuias");



        ApplicationFunction n44 = new ApplicationFunction(factory.getResources(langId).getResource("INSS"), "inss_16.png");
        ApplicationFunction n330 = new ApplicationFunction(factory.getResources(langId).getResource("Serviços"), "inssServicos", "folhaInssServico16.png", "getInssServico");
        ApplicationFunction n331 = new ApplicationFunction(factory.getResources(langId).getResource("Retenções"), "inssRetencao", "folhaInssRetencao16.png", "getInssRetencao");





        ApplicationFunction n45 = new ApplicationFunction(factory.getResources(langId).getResource("Suprimentos"), "suprimentos.png");
        ApplicationFunction n46 = new ApplicationFunction(factory.getResources(langId).getResource("Gestão de Compras"), "gest_compras_16.png");
        ApplicationFunction n332 = new ApplicationFunction(factory.getResources(langId).getResource("Tipo de Requisição"), "compraTipoRequisicao", "tipoRequisicao16.png", "getCompraTipoRequisicao");
        ApplicationFunction n333 = new ApplicationFunction(factory.getResources(langId).getResource("Tipo de Pedido"), "compraTipoPedido", "tipoRequisicao16.png", "getCompraTipoPedido");
        ApplicationFunction n334 = new ApplicationFunction(factory.getResources(langId).getResource("Requisição"), "compraRequisicao", "requisicaoCompra16.png", "getCompraRequisicao");
        ApplicationFunction n335 = new ApplicationFunction(factory.getResources(langId).getResource("Cotação"), "compraCotacao", "cotacaoCompra16.png.png", "getCompraCotacao");
        ApplicationFunction n336 = new ApplicationFunction(factory.getResources(langId).getResource("Confirma Cotação"), "compraConfirmaCotacao", "confirm.png", "getCompraConfirmaCotacao");
        ApplicationFunction n337 = new ApplicationFunction(factory.getResources(langId).getResource("Mapa Comparativo"), "compraMapaComparativo", "mapaComparativo16.png", "getCompraMapaComparativo");
        ApplicationFunction n338 = new ApplicationFunction(factory.getResources(langId).getResource("Pedido"), "compraPedido", "pedidoCompra16.png", "getCompraPedido");
        ApplicationFunction n339 = new ApplicationFunction(factory.getResources(langId).getResource("CompraSugerida"), "compraSugerida", "compraSugerida16.pngc", "getCompraSugerida");



        ApplicationFunction n47 = new ApplicationFunction(factory.getResources(langId).getResource("Controle de Estoque"), "control_estoque.png");
        ApplicationFunction n340 = new ApplicationFunction(factory.getResources(langId).getResource("Entrada da Nota Fiscal"), "entradaNotaFiscal", "nfEntradaMenu.png", "getEntradaNotaFiscal");
        ApplicationFunction n341 = new ApplicationFunction(factory.getResources(langId).getResource("Requisição Interna"), "requisicaoInterna", "requisicaoInterna16.png", "getRequisicaoInterna");
        ApplicationFunction n342 = new ApplicationFunction(factory.getResources(langId).getResource("Contagem de Produtos"), "estoqueContagem", "contagemProdutos16.png", "getEstoqueContagem");
        ApplicationFunction n343 = new ApplicationFunction(factory.getResources(langId).getResource("Reajuste de Preço"), "estoqueReajuste", "reajustePrecos16.png", "getEstoqueReajuste");
        ApplicationFunction n344 = new ApplicationFunction(factory.getResources(langId).getResource("Formação de Preço"), "estoqueFormacaoPreco", "formacaoPreco16.png", "getEstoqueFormacaoPreco");


        ApplicationFunction n48 = new ApplicationFunction(factory.getResources(langId).getResource("Gestão de Contratos"), "gest_contratos_16.png");
        ApplicationFunction n345 = new ApplicationFunction(factory.getResources(langId).getResource("Tipo de Serviço"), "contratoTipoServico", "tipoServico16.png", "getContratoTipoServico");
        ApplicationFunction n346 = new ApplicationFunction(factory.getResources(langId).getResource("Tipo de Contrato"), "tipoContrato", "tipoContrato16.png", "getTipoContrato");
        ApplicationFunction n347 = new ApplicationFunction(factory.getResources(langId).getResource("Template"), "contratoTemplate", "template16.png", "getContratoTemplate");
        ApplicationFunction n348 = new ApplicationFunction(factory.getResources(langId).getResource("Solicitação do Serviço"), "contratoSolicitacaoServico", "solicitacaoServico16.png", "getContratoSolicitacaoServico");
        ApplicationFunction n349 = new ApplicationFunction(factory.getResources(langId).getResource("Contrato"), "contrato", "contrato16.png", "getContrato");


        ApplicationFunction n49 = new ApplicationFunction(factory.getResources(langId).getResource("Comercial"), "comercial_16");
        ApplicationFunction n50 = new ApplicationFunction(factory.getResources(langId).getResource("Nota Fiscal Eletrônica"), "nfe16.png");
        ApplicationFunction n350 = new ApplicationFunction(factory.getResources(langId).getResource("Emissão NF-e"), "nfe", "sintegraTransm.png", "getNfe");
        ApplicationFunction n351 = new ApplicationFunction(factory.getResources(langId).getResource("Status do Serviço"), "statusServico", "status.png", "getStatusServico");


        ApplicationFunction n56 = new ApplicationFunction(factory.getResources(langId).getResource("Vendas"), "venda16.png");
        ApplicationFunction n352 = new ApplicationFunction(factory.getResources(langId).getResource("Tipo Nota Fiscal"), "tipoNotaFiscal", "tipoNotaFiscal16.png", "getTipoNotaFiscal");
        ApplicationFunction n353 = new ApplicationFunction(factory.getResources(langId).getResource("Condições de Pagamento"), "vendaCondicoesPagamento", "tipoPagtosMenu.png", "getVendaCondicoesPagamento");
        ApplicationFunction n354 = new ApplicationFunction(factory.getResources(langId).getResource("Orçamento"), "vendaOrcamento", "condicoesPagamento16.png", "getVendaOrcamento");
        ApplicationFunction n355 = new ApplicationFunction(factory.getResources(langId).getResource("Venda"), "venda", "venda16.png", "getVenda");
        ApplicationFunction n356 = new ApplicationFunction(factory.getResources(langId).getResource("Frete"), "vendaFrete", "frete16.png", "getVendaFrete");
        ApplicationFunction n357 = new ApplicationFunction(factory.getResources(langId).getResource("Romaneio de Entrega"), "vendaRomaneioEntrega", "romaneio.png", "getVendaRomaneioEntrega");



        ApplicationFunction n100 = new ApplicationFunction(factory.getResources(langId).getResource("Administrativo"), "administrativo.png");

        ApplicationFunction n133 = new ApplicationFunction(factory.getResources(langId).getResource("Usuários/Controle de Acesso"), "usuario", "UsuarioAcesso16.png", "getUsuario");
        ApplicationFunction n134 = new ApplicationFunction(factory.getResources(langId).getResource("Papéis"), "papel", "PapelMenu.png", "getPapel");
        ApplicationFunction n135 = new ApplicationFunction(factory.getResources(langId).getResource("Auditoria"), "", "Auditoria16.png", "");
        ApplicationFunction n136 = new ApplicationFunction(factory.getResources(langId).getResource("Suporte"), "", "suporte.png", "");
        
        n100.add(n133);
        n100.add(n134);
        n100.add(n135);
        n100.add(n136);

        n50.add(n350);
        n50.add(n351);

        n56.add(n352);
        n56.add(n353);
        n56.add(n354);
        n56.add(n355);
        n56.add(n356);
        n56.add(n357);
        n49.add(n50);
        n49.add(n56);


        n47.add(n340);
        n47.add(n341);
        n47.add(n342);
        n47.add(n343);
        n47.add(n344);

        n48.add(n345);
        n48.add(n346);
        n48.add(n347);
        n48.add(n348);
        n48.add(n349);






        n46.add(n332);
        n46.add(n333);
        n46.add(n334);
        n46.add(n335);
        n46.add(n336);
        n46.add(n337);
        n46.add(n338);
        n46.add(n339);
        n45.add(n46);
        n45.add(n47);
        n45.add(n48);


        n42.add(n316);
        n42.add(n317);
        n42.add(n318);
        n42.add(n319);
        n43.add(n320);
        n43.add(n321);
        n43.add(n323);
        n43.add(n324);
        n43.add(n325);
        n43.add(n326);
        n43.add(n327);
        n44.add(n330);
        n44.add(n331);


        /// n14.add(n141);
        // n14.add(n142);
        n40.add(n42);
        n40.add(n43);
        n40.add(n44);





        n3.add(n31);
        n3.add(n32);
        n3.add(n33);
        n3.add(n34);

        n4.add(n41);

        n5.add(n51);
        n5.add(n52);
        n5.add(n53);
        n5.add(n54);
        n5.add(n55);

        n6.add(n61);
        n7.add(n71);
        n7.add(n72);
        n7.add(n73);
        n7.add(n74);
        n8.add(n81);
        n9.add(n91);
        n9.add(n92);
        n10.add(n101);
        n20.add(n21);
        n30.add(n300);
        n30.add(n301);
        n30.add(n302);
        n30.add(n303);
        n30.add(n304);
        n30.add(n305);
        n30.add(n306);
        n30.add(n307);
        n30.add(n308);
        n30.add(n309);
        n30.add(n310);


        n29.add(n30);
        n4.add(n5);
        n4.add(n6);
        n4.add(n7);
        n4.add(n8);
        n4.add(n9);
        n4.add(n10);
        n4.add(n20);

      //  n40.add(n311);
        n40.add(n312);
        n40.add(n313);
        n40.add(n314);
        n40.add(n315);
        n29.add(n40);
        /*  ApplicationFunction n2 = new ApplicationFunction(factory.getResources(langId).getResource("Tributação"), null);
         ApplicationFunction n21 = new ApplicationFunction(factory.getResources(langId).getResource("Operação Fiscal"), "tributOperacaoFiscal", null, "getTributOperacaoFiscal");
         ApplicationFunction n22 = new ApplicationFunction(factory.getResources(langId).getResource("Grupo Tributário"), "tributGrupoTributario", null, "getTributGrupoTributario");
         ApplicationFunction n23 = new ApplicationFunction(factory.getResources(langId).getResource("Configura Tributação"), "tributConfiguraOfGt", null, "getTributConfiguraOfGt");
         ApplicationFunction n24 = new ApplicationFunction(factory.getResources(langId).getResource("ICMS Customizado"), "tributIcmsCustomCab", null, "getTributIcmsCustomCab");
         ApplicationFunction n25 = new ApplicationFunction(factory.getResources(langId).getResource("ISS - Imposto Sobre Serviços"), "tributIss", null, "getTributIss");*/


        n1.add(n11);
        n1.add(n12);
        n1.add(nPessoal);
        n1.add(n17);
        n1.add(n18);
        n1.add(n19);
        n1.add(n110);

        nPessoal.add(n13);
        nPessoal.add(n14);
        nPessoal.add(n15);
        nPessoal.add(n16);

        n11.add(n111);
        n11.add(n112);
        n11.add(n113);
        n11.add(n114);
        n11.add(n115);
        n11.add(n116);

        n12.add(n121);
        n12.add(n122);
        n12.add(n123);
        n12.add(n124);

        n13.add(n131);
        n13.add(n132);
       // n13.add(n133);
      //  n13.add(n134);

        n14.add(n141);
        n14.add(n142);
        n14.add(n143);
        n14.add(n144);
        n14.add(n145);

        n15.add(n151);
        n15.add(n152);
        n15.add(n153);
        n15.add(n154);
        n15.add(n155);
        n15.add(n156);
        n15.add(n157);
        n15.add(n158);

        n16.add(n161);
        n16.add(n162);
        n16.add(n163);

        n17.add(n171);
        n17.add(n172);
        n17.add(n173);
        n17.add(n174);

        n18.add(n181);
        n18.add(n182);
        n18.add(n183);
        n18.add(n184);

        n19.add(n191);
        n19.add(n192);
        n19.add(n193);
        n19.add(n194);
        n19.add(n195);

        n110.add(n1101);
        n110.add(n1102);


        /*  n2.add(n23);
         n2.add(n24);
         n2.add(n25);
         n0.add(n2);*/
        // root.add(n1);
        n2.add(n22);
        n2.add(n23);


        n57.add(n359);
        n57.add(n360);
        n57.add(n361);
        n57.add(n362);
        n57.add(n363);
        n58.add(n364);
        n58.add(n365);
        n58.add(n366);
        n58.add(n367);
        n3.add(n57);
        n3.add(n58);
        n59.add(n60);
        n3.add(n59);
        root.add(n1);
        root.add(n2);
        root.add(n3);
        root.add(n4);
        root.add(n29);
        root.add(n45);
        root.add(n49);
        root.add(n100);











        UsuarioVO usuario = (UsuarioVO) inputPar;

        if (!usuario.getPapel().getAcessoCompleto().equals("S")) {
            for (int i = 0; i < root.getChildCount(); i++) {
                autorizaFuncoes((DefaultMutableTreeNode) root.getChildAt(i), buscaPapelFuncao(usuario));
            }
        }

        return new VOResponse(model);
    }

    private List<String> buscaPapelFuncao(UsuarioVO usuario) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(PapelFuncaoVO.class);
            criteria.add(Restrictions.eq("papel", usuario.getPapel()));

            List<PapelFuncaoVO> listaPapelFuncao = criteria.list();
            List<String> funcoes = new ArrayList<String>();
            for (int i = 0; i < listaPapelFuncao.size(); i++) {
                if (listaPapelFuncao.get(i).getPodeAlterar().equals("S")
                        || listaPapelFuncao.get(i).getPodeInserir().equals("S")
                        || listaPapelFuncao.get(i).getPodeExcluir().equals("S")) {
                    funcoes.add(listaPapelFuncao.get(i).getFuncao().getNome());
                } else if (listaPapelFuncao.get(i).getPodeConsultar().equals("S")) {
                    funcoes.add(listaPapelFuncao.get(i).getFuncao().getNome());
                }
            }
            return funcoes;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                session.close();
            } catch (Exception ex1) {
            }
        }
    }

    private void autorizaFuncoes(DefaultMutableTreeNode pasta, List<String> funcoes) {
        ApplicationFunction funcao;
        for (int i = 0; i < pasta.getChildCount(); i++) {
            funcao = (ApplicationFunction) pasta.getChildAt(i);
            if (funcao.isFolder()) {
                for (int j = 0; j < funcao.getChildCount(); j++) {
                    autorizaFuncoes(funcao, funcoes);
                }
            } else {
                if (!funcoes.contains(funcao.getFunctionId())) {
                    pasta.remove(i);
                   // ApplicationFunction appFunction = new ApplicationFunction(funcao.getDescription() + "*", "funcaoPadrao", null, "getFuncaoPadrao");
                   // pasta.insert(appFunction, i);
                }
            }
        }
    }
}
