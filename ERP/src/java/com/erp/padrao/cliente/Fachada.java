package com.erp.padrao.cliente;

import com.erp.cadastros.cliente.AgenciaBancoGridController;
import com.erp.cadastros.cliente.AlmoxarifadoGridController;
import com.erp.cadastros.cliente.AtividadeForCliGridController;
import com.erp.cadastros.cliente.BancoGridController;
import com.erp.cadastros.cliente.CargoGridController;
import com.erp.cadastros.cliente.CepGridController;
import com.erp.cadastros.cliente.CfopGridController;
import com.erp.cadastros.cliente.ChequeGridController;
import com.erp.cadastros.cliente.ClienteGridController;
import com.erp.cadastros.cliente.ColaboradorGridController;
import com.erp.cadastros.cliente.ContaCaixaGridController;
import com.erp.cadastros.cliente.ContadorGridController;
import com.erp.cadastros.cliente.ConvenioGridController;
import com.erp.cadastros.cliente.EmpresaCnaeGridController;
import com.erp.cadastros.cliente.EmpresaGridController;
import com.erp.cadastros.cliente.EstadoCivilGridController;
import com.erp.cadastros.cliente.FeriadosGridController;
import com.erp.cadastros.cliente.FornecedorGridController;
import com.erp.cadastros.cliente.MunicipioGridController;
import com.erp.cadastros.cliente.NcmGridController;
import com.erp.cadastros.cliente.NivelFormacaoGridController;
import com.erp.cadastros.cliente.OperadoraCartaoGridController;
import com.erp.cadastros.cliente.OperadoraPlanoSaudeGridController;
import com.erp.cadastros.cliente.PaisGridController;
import com.erp.cadastros.cliente.PapelGridController;
import com.erp.cadastros.cliente.PessoaGridController;
import com.erp.cadastros.cliente.ProdutoGridController;
import com.erp.cadastros.cliente.ProdutoGrupoGridController;
import com.erp.cadastros.cliente.ProdutoMarcaGridController;
import com.erp.cadastros.cliente.ProdutoSubGrupoGridController;
import com.erp.cadastros.cliente.QuadroSocietarioGridController;
import com.erp.cadastros.cliente.SetorGridController;
import com.erp.cadastros.cliente.SindicatoGridController;
import com.erp.cadastros.cliente.SituacaoColaboradorGridController;
import com.erp.cadastros.cliente.SituacaoForCliGridController;
import com.erp.cadastros.cliente.SocioGridController;
import com.erp.cadastros.cliente.TalonarioChequeGridController;
import com.erp.cadastros.cliente.TipoAdmissaoGridController;
import com.erp.cadastros.cliente.TipoColaboradorGridController;
import com.erp.cadastros.cliente.TipoDesligamentoGridController;
import com.erp.cadastros.cliente.TipoRelacionamentoGridController;
import com.erp.cadastros.cliente.TransportadoraGridController;
import com.erp.cadastros.cliente.UfGridController;
import com.erp.cadastros.cliente.UnidadeProdutoGridController;
import com.erp.cadastros.cliente.UsuarioGridController;
import com.erp.tributacao.cliente.TributConfiguraOfGtGridController;
import com.erp.tributacao.cliente.TributGrupoTributarioGridController;
import com.erp.tributacao.cliente.TributIcmsCustomCabGridController;
import com.erp.tributacao.cliente.TributIssGridController;
import com.erp.tributacao.cliente.TributOperacaoFiscalGridController;
import com.t2tierp.compras.cliente.CompraConfirmaCotacaoGridController;
import com.t2tierp.compras.cliente.CompraCotacaoGridController;
import com.t2tierp.compras.cliente.CompraMapaComparativoGridController;
import com.t2tierp.compras.cliente.CompraPedidoGridController;
import com.t2tierp.compras.cliente.CompraRequisicaoGridController;
import com.t2tierp.compras.cliente.CompraSugeridaGridController;
import com.t2tierp.compras.cliente.CompraTipoPedidoGridController;
import com.t2tierp.compras.cliente.CompraTipoRequisicaoGridController;
import com.t2tierp.conciliacaocontabil.cliente.ComposicaoSaldoGridController;
import com.t2tierp.conciliacaocontabil.cliente.ConciliacaoBancariaGridController;
import com.t2tierp.conciliacaocontabil.cliente.ConciliacaoClienteGridController;
import com.t2tierp.conciliacaocontabil.cliente.ConciliacaoFornecedorGridController;
import com.t2tierp.conciliacaocontabil.cliente.ContabilLancamentoCabecalhoGridController;
import com.t2tierp.contabilidade.cliente.AidfAimdfGridController;
import com.t2tierp.contabilidade.cliente.BalancoPatrimonialGridController;
import com.t2tierp.contabilidade.cliente.CentroResultadoGridController;
import com.t2tierp.contabilidade.cliente.ContabilContaGridController;
import com.t2tierp.contabilidade.cliente.ContabilDreCabecalhoGridController;
import com.t2tierp.contabilidade.cliente.ContabilEncerramentoExeCabGridController;
import com.t2tierp.contabilidade.cliente.ContabilHistoricoGridController;
import com.t2tierp.contabilidade.cliente.ContabilIndiceGridController;
import com.t2tierp.contabilidade.cliente.ContabilLancamentoOrcadoGridController;
import com.t2tierp.contabilidade.cliente.ContabilLancamentoPadraoGridController;
import com.t2tierp.contabilidade.cliente.ContabilLivroGridController;
import com.t2tierp.contabilidade.cliente.ContabilLoteGridController;
import com.t2tierp.contabilidade.cliente.ContabilParametrosGridController;
import com.t2tierp.contabilidade.cliente.DfcGridController;
import com.t2tierp.contabilidade.cliente.FapGridController;
import com.t2tierp.contabilidade.cliente.LivroContabilGridController;
import com.t2tierp.contabilidade.cliente.NaturezaFinanceiraGridController;
import com.t2tierp.contabilidade.cliente.PlanoCentroResultadoGridController;
import com.t2tierp.contabilidade.cliente.PlanoContaGridController;
import com.t2tierp.contabilidade.cliente.PlanoContaRefSpedGridController;
import com.t2tierp.contabilidade.cliente.PlanoNaturezaFinanceiraGridController;
import com.t2tierp.contabilidade.cliente.RegistroCartorioGridController;
import com.t2tierp.contratos.cliente.ContratoGridController;
import com.t2tierp.contratos.cliente.ContratoSolicitacaoServicoGridController;
import com.t2tierp.contratos.cliente.ContratoTemplateGridController;
import com.t2tierp.contratos.cliente.ContratoTipoServicoGridController;
import com.t2tierp.contratos.cliente.TipoContratoGridController;
import com.t2tierp.controleestoque.cliente.EntradaNotaGridController;
import com.t2tierp.controleestoque.cliente.EstoqueContagemCabecalhoGridController;
import com.t2tierp.controleestoque.cliente.EstoqueFormacaoPrecoGridController;
import com.t2tierp.controleestoque.cliente.EstoqueReajusteCabecalhoGridController;
import com.t2tierp.controleestoque.cliente.RequisicaoInternaCabecalhoGridController;
import com.t2tierp.escritafiscal.cliente.FiscalApuracaoIcmsController;
import com.t2tierp.escritafiscal.cliente.FiscalParametrosGridController;
import com.t2tierp.escritafiscal.cliente.FiscalTermoGridController;
import com.t2tierp.escritafiscal.cliente.InformativosGuiasGrid;
import com.t2tierp.escritafiscal.cliente.SimplesNacionalCabecalhoGridController;
import com.t2tierp.financeiro.cliente.FinConfiguracaoBoletoGridController;
import com.t2tierp.financeiro.cliente.FinDocumentoOrigemGridController;
import com.t2tierp.financeiro.cliente.FinExtratoContaBancoGridController;
import com.t2tierp.financeiro.cliente.FinFluxoCaixaGridController;
import com.t2tierp.financeiro.cliente.FinLancamentoPagarGridController;
import com.t2tierp.financeiro.cliente.FinLancamentoReceberGridController;
import com.t2tierp.financeiro.cliente.FinMovimentoCaixaBancoGridController;
import com.t2tierp.financeiro.cliente.FinParcelaPagamentoGridController;
import com.t2tierp.financeiro.cliente.FinParcelaRecebimentoGridController;
import com.t2tierp.financeiro.cliente.FinResumoTesourariaGridController;
import com.t2tierp.financeiro.cliente.FinStatusParcelaGridController;
import com.t2tierp.financeiro.cliente.FinTipoPagamentoGridController;
import com.t2tierp.financeiro.cliente.FinTipoRecebimentoGridController;
import com.t2tierp.financeiro.cliente.FinTrataArquivoRetornoGridController;
import com.t2tierp.folhapagamento.cliente.FeriasPeriodoAquisitivoGridController;
import com.t2tierp.folhapagamento.cliente.FolhaAfastamentoGridController;
import com.t2tierp.folhapagamento.cliente.FolhaEventoGridController;
import com.t2tierp.folhapagamento.cliente.FolhaFechamentoGridController;
import com.t2tierp.folhapagamento.cliente.FolhaFeriasColetivasGridController;
import com.t2tierp.folhapagamento.cliente.FolhaHistoricoSalarialGridController;
import com.t2tierp.folhapagamento.cliente.FolhaInssGridController;
import com.t2tierp.folhapagamento.cliente.FolhaInssServicoGridController;
import com.t2tierp.folhapagamento.cliente.FolhaLancamentoGridController;
import com.t2tierp.folhapagamento.cliente.FolhaParametrosGridController;
import com.t2tierp.folhapagamento.cliente.FolhaPlanoSaudeGridController;
import com.t2tierp.folhapagamento.cliente.FolhaPppGridController;
import com.t2tierp.folhapagamento.cliente.FolhaRescisaoGridController;
import com.t2tierp.folhapagamento.cliente.FolhaTipoAfastamentoGridController;
import com.t2tierp.folhapagamento.cliente.FolhaValeTransporteGridController;
import com.t2tierp.folhapagamento.cliente.GuiasAcumuladasGridController;

import com.t2tierp.ged.cliente.GedDocumentoGridController;
import com.t2tierp.ged.cliente.GedTipoDocumentoGridController;
import com.t2tierp.nfe.cliente.NfeGridController;
import com.t2tierp.nfe.cliente.StatusServico;
import com.t2tierp.orcamento.cliente.OrcamentoEmpresarialGridController;
import com.t2tierp.orcamento.cliente.OrcamentoFluxoCaixaGridController;
import com.t2tierp.orcamento.cliente.OrcamentoFluxoCaixaPeriodoGridController;
import com.t2tierp.orcamento.cliente.OrcamentoPeriodoGridController;
import com.t2tierp.patrimonio.cliente.PatrimApoliceSeguroGridController;
import com.t2tierp.patrimonio.cliente.PatrimBemGridController;
import com.t2tierp.patrimonio.cliente.PatrimEstadoConservacaoGridController;
import com.t2tierp.patrimonio.cliente.PatrimGrupoBemGridController;
import com.t2tierp.patrimonio.cliente.PatrimIndiceAtualizacaoGridController;
import com.t2tierp.patrimonio.cliente.PatrimTaxaDepreciacaoGridController;
import com.t2tierp.patrimonio.cliente.PatrimTipoAquisicaoBemGridController;
import com.t2tierp.patrimonio.cliente.PatrimTipoMovimentacaoGridController;
import com.t2tierp.patrimonio.cliente.SeguradoraGridController;
import com.t2tierp.ponto.cliente.PontoAbonoGridController;
import com.t2tierp.ponto.cliente.PontoBancoHorasGridController;
import com.t2tierp.ponto.cliente.PontoClassificacaoJornadaGridController;
import com.t2tierp.ponto.cliente.PontoEscalaGridController;
import com.t2tierp.ponto.cliente.PontoEspelhoGridController;
import com.t2tierp.ponto.cliente.PontoGeracaoArquivoGridController;
import com.t2tierp.ponto.cliente.PontoHorarioGridController;
import com.t2tierp.ponto.cliente.PontoImportaMarcacaoController;
import com.t2tierp.ponto.cliente.PontoParametroGridController;
import com.t2tierp.ponto.cliente.PontoRegistraMarcacaoController;
import com.t2tierp.ponto.cliente.PontoRelogioGridController;
import com.t2tierp.sintegra.cliente.SintegraController;
import com.t2tierp.sped.cliente.SpedContabilGridController;
import com.t2tierp.sped.cliente.SpedFiscalGridController;
import com.t2tierp.vendas.cliente.TipoNotaFiscalGridController;
import com.t2tierp.vendas.cliente.VendaCondicoesPagamentoGridController;
import com.t2tierp.vendas.cliente.VendaFreteGridController;
import com.t2tierp.vendas.cliente.VendaGridController;
import com.t2tierp.vendas.cliente.VendaOrcamentoGridController;
import com.t2tierp.vendas.cliente.VendaRomaneioEntregaGridController;
import java.security.KeyStore;
import java.util.Map;

import javax.swing.JOptionPane;
import org.openswing.swing.mdi.client.*;

public class Fachada implements ClientFacade {

    public Fachada() {
    }

    public void getFuncaoPadrao() {
        JOptionPane.showMessageDialog(null, "Acesso não autorizado!", "Informação do Sistema", JOptionPane.INFORMATION_MESSAGE);
    }

    public void getProdutoMarca() {
        new ProdutoMarcaGridController();
    }

    public void getNcm() {
        new NcmGridController();
    }

    public void getUnidadeProduto() {
        new UnidadeProdutoGridController();
    }

    public void getProdutoGrupo() {
        new ProdutoGrupoGridController();
    }

    public void getProdutoSubGrupo() {
        new ProdutoSubGrupoGridController();
    }

    public void getProduto() {
        new ProdutoGridController();
    }

    //Tributacao
    public void getQuadroSocietario() {
        new QuadroSocietarioGridController();
    }

    public void getSocio() {
        new SocioGridController();
    }

    public void getEmpresaCnae() {
        new EmpresaCnaeGridController();
    }

    public void getEmpresa() {
        new EmpresaGridController();
    }
    
    
     public void getTributOperacaoFiscal() {
        new TributOperacaoFiscalGridController();
    }

    public void getTributGrupoTributario() {
        new TributGrupoTributarioGridController();
    }

    public void getTributConfiguraOfGt() {
        new TributConfiguraOfGtGridController();
    }

    public void getTributIcmsCustomCab() {
        new TributIcmsCustomCabGridController();
    }

    public void getTributIss() {
        new TributIssGridController();
    }


    //PESSOA
    public void getEstadoCivil() {
        new EstadoCivilGridController();
    }

    public void getPessoa() {
        new PessoaGridController();
    }

    //CLIENTE - FORNECEDOR - TRANSPORTADORA
    public void getAtividadeForCli() {
        new AtividadeForCliGridController();
    }

    public void getSituacaoForCli() {
        new SituacaoForCliGridController();
    }

    public void getCliente() {
        new ClienteGridController();
    }

    public void getFornecedor() {
        new FornecedorGridController();
    }

    public void getTransportadora() {
        new TransportadoraGridController();
    }

    //COLABORADOR
    public void getTipoAdmissao() {
        new TipoAdmissaoGridController();
    }

    public void getTipoRelacionamento() {
        new TipoRelacionamentoGridController();
    }

    public void getSituacaoColaborador() {
        new SituacaoColaboradorGridController();
    }

    public void getTipoDesligamento() {
        new TipoDesligamentoGridController();
    }

    public void getTipoColaborador() {
        new TipoColaboradorGridController();
    }

    public void getCargo() {
        new CargoGridController();
    }

    public void getNivelFormacao() {
        new NivelFormacaoGridController();
    }

    public void getColaborador() {
        new ColaboradorGridController();
    }

    //Pessoal - Outros
    public void getContador() {
        new ContadorGridController();
    }

    public void getSindicato() {
        new SindicatoGridController();
    }

    public void getConvenio() {
        new ConvenioGridController();
    }

    //Diversos
    public void getSetor() {
        new SetorGridController();
    }

    public void getAlmoxarifado() {
        new AlmoxarifadoGridController();
    }

    public void getOperadoraPlanoSaude() {
        new OperadoraPlanoSaudeGridController();
    }

    public void getOperadoraCartao() {
        new OperadoraCartaoGridController();
    }

    //Endereco
    public void getPais() {
        new PaisGridController();
    }

    public void getUf() {
        new UfGridController();
    }

    public void getMunicipio() {
        new MunicipioGridController();
    }

    public void getCep() {
        new CepGridController();
    }

    //Financeiro
    public void getBanco() {
        new BancoGridController();
    }

    public void getAgenciaBanco() {
        new AgenciaBancoGridController();
    }

    public void getContaCaixa() {
        new ContaCaixaGridController();
    }

    public void getTalonarioCheque() {
        new TalonarioChequeGridController();
    }

    public void getCheque() {
        new ChequeGridController();
    }

    //Tabelas
    public void getCfop() {
        new CfopGridController();
    }

    public void getFeriados() {
        new FeriadosGridController();
    }

    public void getUsuario() {
        new UsuarioGridController();
    }

    public void getPapel() {
        new PapelGridController();
    }

    //ged
    public void getTipoDocumento() {
        new GedTipoDocumentoGridController();
    }

    public void getDocumento() {
        new GedDocumentoGridController();
    }

    ///contas a receber
    public void getPlanoNaturezaFinanceira() {
        new PlanoNaturezaFinanceiraGridController();
    }

    public void getPlanoCentroResultado() {
        new PlanoCentroResultadoGridController();
    }

    public void getNaturezaFinanceira() {
        new NaturezaFinanceiraGridController();
    }

    public void getCentroResultado() {
        new CentroResultadoGridController();
    }

    public void getFinDocumentoOrigem() {
        new FinDocumentoOrigemGridController();
    }

    public void getFinStatusParcela() {
        new FinStatusParcelaGridController();
    }

    public void getFinTipoRecebimento() {
        new FinTipoRecebimentoGridController();
    }

    public void getFinConfiguracaoBoleto() {
        new FinConfiguracaoBoletoGridController();
    }

    public void getFinLancamentoReceber() {
        new FinLancamentoReceberGridController();
    }

    public void getFinParcelaRecebimento() {
        new FinParcelaRecebimentoGridController();
    }

    public void getFinProcessaArquivoRetorno() {
        new FinTrataArquivoRetornoGridController();
    }

    public void getFinTipoPagamento() {
        new FinTipoPagamentoGridController();
    }

    public void getFinLancamentoPagar() {
        new FinLancamentoPagarGridController();
    }

    public void getFinParcelaPagamento() {
        new FinParcelaPagamentoGridController();
    }

    //caixas e bancos
    public void getFinMovimentoCaixaBanco() {
        new FinMovimentoCaixaBancoGridController();
    }

//tesouraria
    public void getFinResumoTesouraria() {
        new FinResumoTesourariaGridController();
    }

    //fluxo de caixa   
    public void getFinFluxoCaixa() {
        new FinFluxoCaixaGridController();
    }
//conciliação

    public void getFinExtratoContaBanco() {
        new FinExtratoContaBancoGridController();
    }

    //PONTO
    public void getPontoParametro() {
        new PontoParametroGridController();
    }

    public void getPontoHorario() {
        new PontoHorarioGridController();
    }

    public void getPontoEscala() {
        new PontoEscalaGridController();
    }

    public void getPontoClassificacaoJornada() {
        new PontoClassificacaoJornadaGridController();
    }

    public void getPontoAbono() {
        new PontoAbonoGridController();
    }

    public void getPontoRelogio() {
        new PontoRelogioGridController();
    }

    public void getPontoBancoHoras() {
        new PontoBancoHorasGridController();
    }

    public void getPontoImportaMarcacao() {
        new PontoImportaMarcacaoController();
    }

    public void getPontoGeracaoArquivo() {
        new PontoGeracaoArquivoGridController();
    }

    public void getPontoEspelho() {
        new PontoEspelhoGridController();
    }

    public void getPontoRegistraMarcacao() {
        new PontoRegistraMarcacaoController();
    }

    //folha
    public void getFolhaParametro() {
        new FolhaParametrosGridController();
    }

    public void getGuiasAcumuladas() {
        new GuiasAcumuladasGridController();
    }

    public void getPlanoSaude() {
        new FolhaPlanoSaudeGridController();
    }

    public void getEvento() {
        new FolhaEventoGridController();
    }

    public void getTipoAfastamento() {
        new FolhaTipoAfastamentoGridController();
    }

    public void getAfastamento() {
        new FolhaAfastamentoGridController();
    }

    public void getFeriasColetivas() {
        new FolhaFeriasColetivasGridController();
    }

    public void getFeriasPeriodoAquisitivo() {
        new FeriasPeriodoAquisitivoGridController();
    }

    public void getFechamento() {
        new FolhaFechamentoGridController();
    }

    public void getLancamento() {
        new FolhaLancamentoGridController();
    }

    public void getAlteracaoSalarial() {
        new FolhaHistoricoSalarialGridController();
    }

    public void getValeTransporte() {
        new FolhaValeTransporteGridController();
    }

    public void getPpp() {
        new FolhaPppGridController();
    }

    public void getRescisao() {
        new FolhaRescisaoGridController();
    }

    public void getInssServico() {
        new FolhaInssServicoGridController();
    }

    public void getInssRetencao() {
        new FolhaInssGridController();
    }

    public void getInformativosGuias() {
        MDIFrame.add(new InformativosGuiasGrid());
        //   new InformativosGuiasController();
    }

    public void getCompraTipoRequisicao() {
        new CompraTipoRequisicaoGridController();
    }

    public void getCompraTipoPedido() {
        new CompraTipoPedidoGridController();
    }

    public void getCompraRequisicao() {
        new CompraRequisicaoGridController();
    }

    public void getCompraCotacao() {
        new CompraCotacaoGridController();
    }

    public void getCompraConfirmaCotacao() {
        new CompraConfirmaCotacaoGridController();
    }

    public void getCompraMapaComparativo() {
        new CompraMapaComparativoGridController();
    }

    public void getCompraPedido() {
        new CompraPedidoGridController();
    }

    public void getCompraSugerida() {
        new CompraSugeridaGridController();
    }

    ///estoque
    public void getRequisicaoInterna() {
        new RequisicaoInternaCabecalhoGridController();
    }

    public void getEstoqueContagem() {
        new EstoqueContagemCabecalhoGridController();
    }

    public void getEstoqueReajuste() {
        new EstoqueReajusteCabecalhoGridController();
    }

    public void getEstoqueFormacaoPreco() {
        new EstoqueFormacaoPrecoGridController();
    }

    public void getEntradaNotaFiscal() {
        new EntradaNotaGridController();
    }

    public void getContratoTipoServico() {
        new ContratoTipoServicoGridController();
    }

    public void getTipoContrato() {
        new TipoContratoGridController();
    }

    public void getContratoTemplate() {
        new ContratoTemplateGridController();
    }

    public void getContratoSolicitacaoServico() {
        new ContratoSolicitacaoServicoGridController();
    }

    public void getContrato() {
        new ContratoGridController();
    }

    public void getNfe() {
        new NfeGridController();
    }

    public void getStatusServico() {
        SelecionaCertificado selecionaCertificado = new SelecionaCertificado(null, true);
        selecionaCertificado.setVisible(true);
        if (!selecionaCertificado.isCancelado()) {
            Map map = selecionaCertificado.getDadosCertificado();
            KeyStore ks = (KeyStore) map.get("keyStore");
            String alias = (String) map.get("alias");
            char[] senha = (char[]) map.get("senha");

            StatusServico statusNfe = new StatusServico();
            JOptionPane.showMessageDialog(null, statusNfe.verificaStatusServico(ks, alias, senha), "Status do serviço NF-e", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void getTipoNotaFiscal() {
        new TipoNotaFiscalGridController();
    }

    public void getVendaCondicoesPagamento() {
        new VendaCondicoesPagamentoGridController();
    }

    public void getVendaOrcamento() {
        new VendaOrcamentoGridController();
    }

    public void getVenda() {
        new VendaGridController();
    }

    public void getVendaFrete() {
        new VendaFreteGridController();
    }

    public void getVendaRomaneioEntrega() {
        new VendaRomaneioEntregaGridController();
    }

    public void getConciliacaoBancaria() {
        new ConciliacaoBancariaGridController();
    }

    public void getConciliacaoCliente() {
        new ConciliacaoClienteGridController();
    }

    public void getConciliacaoFornecedor() {
        new ConciliacaoFornecedorGridController();
    }

    public void getConciliacaoContabil() {
        new ContabilLancamentoCabecalhoGridController();
    }

    public void getComposicaoSaldo() {
        new ComposicaoSaldoGridController();
    }

    //orçamento
    public void getOrcamentoPeriodo() {
        new OrcamentoPeriodoGridController();
    }

    public void getOrcamentoFluxoCaixaPeriodo() {
        new OrcamentoFluxoCaixaPeriodoGridController();
    }

    public void getOrcamentoFluxoCaixa() {
        new OrcamentoFluxoCaixaGridController();
    }

    public void getOrcamentoEmpresarial() {
        new OrcamentoEmpresarialGridController();
    }

    public void getSintegra() {
        new SintegraController();
    }

    public void getRegistroCartorio() {
        new RegistroCartorioGridController();
    }

    public void getParametros() {
        new ContabilParametrosGridController();
    }

    public void getIndices() {
        new ContabilIndiceGridController();
    }

    public void getHistorico() {
        new ContabilHistoricoGridController();
    }

    public void getAidfAimdf() {
        new AidfAimdfGridController();
    }

    public void getFap() {
        new FapGridController();
    }

    public void getPlanoContas() {
        new PlanoContaGridController();
        
        
            }
    
    

    public void getPlanoContasRefSped() {
        new PlanoContaRefSpedGridController();
    }

    public void getContaContabil() {
        new ContabilContaGridController();
    }

    public void getLancamentoPadrao() {
        new ContabilLancamentoPadraoGridController();
    }

    public void getLancamentoLote() {
        new ContabilLoteGridController();
    }

    public void getLancamentoOrcado() {
        new ContabilLancamentoOrcadoGridController();
    }

    public void getLancamentoContabil() {
        new com.t2tierp.contabilidade.cliente.ContabilLancamentoCabecalhoGridController();
    }

    public void getDre() {
        new ContabilDreCabecalhoGridController();
    }

    public void getEncerramentoExercicio() {
        new ContabilEncerramentoExeCabGridController();
    }

    public void getLivrosTermos() {
        new ContabilLivroGridController();
    }

    public void getDfc() {
        new DfcGridController();
    }

    public void getBalancoPatrimonial() {
        new BalancoPatrimonialGridController();
    }

    public void getLivroContabil() {
        new LivroContabilGridController();
    }

    public void getFiscalParametros() {
        new FiscalParametrosGridController();
    }

    public void getSimplesNacional() {
        new SimplesNacionalCabecalhoGridController();
    }

    public void getFiscalTermo() {
        new FiscalTermoGridController();
    }

    public void getRegistroEntradaSaida() {
    }

    public void getApuracaoIcms() {
        new FiscalApuracaoIcmsController();
    }

    public void getPatrimTaxaDepreciacao() {
        new PatrimTaxaDepreciacaoGridController();
    }

    public void getPatrimIndiceAtualizacao() {
        new PatrimIndiceAtualizacaoGridController();
    }

    public void getPatrimTipoAquisicaoBem() {
        new PatrimTipoAquisicaoBemGridController();
    }

    public void getPatrimTipoMovimentacao() {
        new PatrimTipoMovimentacaoGridController();
    }

    public void getPatrimEstadoConservacao() {
        new PatrimEstadoConservacaoGridController();
    }

    public void getPatrimGrupoBem() {
        new PatrimGrupoBemGridController();
    }

    public void getPatrimBem() {
        new PatrimBemGridController();
    }

    public void getSeguradora() {
        new SeguradoraGridController();
    }

    public void getPatrimApoliceSeguro() {
        new PatrimApoliceSeguroGridController();
    }

    public void getSpedContabil() {
        new SpedContabilGridController();
    }

    public void getSpedFiscal() {
        new SpedFiscalGridController();
    }
}
