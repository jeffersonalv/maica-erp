package com.erp.padrao.servidor;

import com.erp.cadastros.servidor.AgenciaBancoDetalheAction;
import com.erp.cadastros.servidor.AgenciaBancoGridAction;
import com.erp.cadastros.servidor.AlmoxarifadoDetalheAction;
import com.erp.cadastros.servidor.AlmoxarifadoGridAction;
import com.erp.cadastros.servidor.AtividadeForCliDetalheAction;
import com.erp.cadastros.servidor.AtividadeForCliGridAction;
import com.erp.cadastros.servidor.BancoDetalheAction;
import com.erp.cadastros.servidor.BancoGridAction;
import com.erp.cadastros.servidor.CargoDetalheAction;
import com.erp.cadastros.servidor.CargoGridAction;
import com.erp.cadastros.servidor.CepDetalheAction;
import com.erp.cadastros.servidor.CepGridAction;
import com.erp.cadastros.servidor.CfopDetalheAction;
import com.erp.cadastros.servidor.CfopGridAction;
import com.erp.cadastros.servidor.ChequeDetalheAction;
import com.erp.cadastros.servidor.ChequeGridAction;
import com.erp.cadastros.servidor.ClienteDetalheAction;
import com.erp.cadastros.servidor.ClienteGridAction;
import com.erp.cadastros.servidor.ColaboradorDetalheAction;
import com.erp.cadastros.servidor.ColaboradorGridAction;
import com.erp.cadastros.servidor.ContaCaixaDetalheAction;
import com.erp.cadastros.servidor.ContaCaixaGridAction;
import com.erp.cadastros.servidor.ContadorDetalheAction;
import com.erp.cadastros.servidor.ContadorGridAction;
import com.erp.cadastros.servidor.ConvenioDetalheAction;
import com.erp.cadastros.servidor.ConvenioGridAction;
import com.erp.cadastros.servidor.EmpresaCnaeDetalheAction;
import com.erp.cadastros.servidor.EmpresaCnaeGridAction;
import com.erp.cadastros.servidor.EmpresaContatoGridAction;
import com.erp.cadastros.servidor.EmpresaDetalheAction;
import com.erp.cadastros.servidor.EmpresaEnderecoGridAction;
import com.erp.cadastros.servidor.EmpresaGridAction;
import com.erp.cadastros.servidor.EstadoCivilDetalheAction;
import com.erp.cadastros.servidor.EstadoCivilGridAction;
import com.erp.cadastros.servidor.FeriadosDetalheAction;
import com.erp.cadastros.servidor.FeriadosGridAction;
import com.erp.cadastros.servidor.FornecedorDetalheAction;
import com.erp.cadastros.servidor.FornecedorGridAction;
import com.erp.cadastros.servidor.MunicipioDetalheAction;
import com.erp.cadastros.servidor.MunicipioGridAction;
import com.erp.cadastros.servidor.NcmGridAction;
import com.erp.cadastros.servidor.NivelFormacaoDetalheAction;
import com.erp.cadastros.servidor.NivelFormacaoGridAction;
import com.erp.cadastros.servidor.OperadoraCartaoDetalheAction;
import com.erp.cadastros.servidor.OperadoraCartaoGridAction;
import com.erp.cadastros.servidor.OperadoraPlanoSaudeDetalheAction;
import com.erp.cadastros.servidor.OperadoraPlanoSaudeGridAction;
import com.erp.cadastros.servidor.PaisDetalheAction;
import com.erp.cadastros.servidor.PaisGridAction;
import com.erp.cadastros.servidor.PapelDetalheAction;
import com.erp.cadastros.servidor.PapelFuncaoGridAction;
import com.erp.cadastros.servidor.PapelGridAction;
import com.erp.cadastros.servidor.PessoaContatoGridAction;
import com.erp.cadastros.servidor.PessoaDetalheAction;
import com.erp.cadastros.servidor.PessoaEnderecoGridAction;
import com.erp.cadastros.servidor.PessoaFisicaDetalheAction;
import com.erp.cadastros.servidor.PessoaGridAction;
import com.erp.cadastros.servidor.PessoaJuridicaDetalheAction;
import com.erp.cadastros.servidor.ProdutoDetalheAction;
import com.erp.cadastros.servidor.ProdutoGridAction;
import com.erp.cadastros.servidor.ProdutoGrupoDetalheAction;
import com.erp.cadastros.servidor.ProdutoGrupoGridAction;
import com.erp.cadastros.servidor.ProdutoMarcaDetalheAction;
import com.erp.cadastros.servidor.ProdutoMarcaGridAction;
import com.erp.cadastros.servidor.ProdutoSubGrupoDetalheAction;
import com.erp.cadastros.servidor.ProdutoSubGrupoGridAction;
import com.erp.cadastros.servidor.QuadroSocietarioDetalheAction;
import com.erp.cadastros.servidor.QuadroSocietarioGridAction;
import com.erp.cadastros.servidor.SetorDetalheAction;
import com.erp.cadastros.servidor.SetorGridAction;
import com.erp.cadastros.servidor.SindicatoDetalheAction;
import com.erp.cadastros.servidor.SindicatoGridAction;
import com.erp.cadastros.servidor.SituacaoColaboradorDetalheAction;
import com.erp.cadastros.servidor.SituacaoColaboradorGridAction;
import com.erp.cadastros.servidor.SituacaoForCliDetalheAction;
import com.erp.cadastros.servidor.SituacaoForCliGridAction;
import com.erp.cadastros.servidor.SocioDependenteGridAction;
import com.erp.cadastros.servidor.SocioDetalheAction;
import com.erp.cadastros.servidor.SocioGridAction;
import com.erp.cadastros.servidor.SocioParticipacaoSocietariaGridAction;
import com.erp.cadastros.servidor.TalonarioChequeDetalheAction;
import com.erp.cadastros.servidor.TalonarioChequeGridAction;
import com.erp.cadastros.servidor.TipoAdmissaoDetalheAction;
import com.erp.cadastros.servidor.TipoAdmissaoGridAction;
import com.erp.cadastros.servidor.TipoColaboradorDetalheAction;
import com.erp.cadastros.servidor.TipoColaboradorGridAction;
import com.erp.cadastros.servidor.TipoDesligamentoDetalheAction;
import com.erp.cadastros.servidor.TipoDesligamentoGridAction;
import com.erp.cadastros.servidor.TipoRelacionamentoDetalheAction;
import com.erp.cadastros.servidor.TipoRelacionamentoGridAction;
import com.erp.cadastros.servidor.TransportadoraDetalheAction;
import com.erp.cadastros.servidor.TransportadoraGridAction;
import com.erp.cadastros.servidor.UfDetalheAction;
import com.erp.cadastros.servidor.UfGridAction;
import com.erp.cadastros.servidor.UnidadeProdutoDetalheAction;
import com.erp.cadastros.servidor.UnidadeProdutoGridAction;
import com.erp.cadastros.servidor.UsuarioDetalheAction;
import com.erp.cadastros.servidor.UsuarioGridAction;
import com.t2tierp.compras.servidor.CompraConfirmaCotacaoDetalheAction;
import com.t2tierp.compras.servidor.CompraConfirmaCotacaoDetalheGridAction;
import com.t2tierp.compras.servidor.CompraConfirmaCotacaoGridAction;
import com.t2tierp.compras.servidor.CompraCotacaoDetalheAction;
import com.t2tierp.compras.servidor.CompraCotacaoDetalheGridAction;
import com.t2tierp.compras.servidor.CompraCotacaoGridAction;
import com.t2tierp.compras.servidor.CompraFornecedorCotacaoGridAction;
import com.t2tierp.compras.servidor.CompraItensNaoCotadosGridAction;
import com.t2tierp.compras.servidor.CompraMapaComparativoDetalheAction;
import com.t2tierp.compras.servidor.CompraMapaComparativoDetalheGridAction;
import com.t2tierp.compras.servidor.CompraMapaComparativoGridAction;
import com.t2tierp.compras.servidor.CompraPedidoDetalheAction;
import com.t2tierp.compras.servidor.CompraPedidoDetalheGridAction;
import com.t2tierp.compras.servidor.CompraPedidoGridAction;
import com.t2tierp.compras.servidor.CompraRequisicaoDetalheAction;
import com.t2tierp.compras.servidor.CompraRequisicaoDetalheGridAction;
import com.t2tierp.compras.servidor.CompraRequisicaoGridAction;
import com.t2tierp.compras.servidor.CompraSugeridaGridAction;
import com.t2tierp.compras.servidor.CompraTipoPedidoDetalheAction;
import com.t2tierp.compras.servidor.CompraTipoPedidoGridAction;
import com.t2tierp.compras.servidor.CompraTipoRequisicaoDetalheAction;
import com.t2tierp.compras.servidor.CompraTipoRequisicaoGridAction;
import com.t2tierp.conciliacaocontabil.servidor.ComposicaoSaldoGridAction;
import com.t2tierp.conciliacaocontabil.servidor.ConciliacaoBancariaGridAction;
import com.t2tierp.conciliacaocontabil.servidor.ConciliacaoClienteGridAction;
import com.t2tierp.conciliacaocontabil.servidor.ConciliacaoFornecedorGridAction;
import com.t2tierp.conciliacaocontabil.servidor.ExtratoConciliacaoBancariaGridAction;
import com.t2tierp.conciliacaocontabil.servidor.LancamentoConciliacaoBancariaGridAction;
import com.t2tierp.conciliacaocontabil.servidor.ParcelaConciliacaoClienteGridAction;
import com.t2tierp.conciliacaocontabil.servidor.ParcelaConciliacaoFornecedorGridAction;
import com.t2tierp.contabilidade.servidor.AidfAimdfDetalheAction;
import com.t2tierp.contabilidade.servidor.AidfAimdfGridAction;
import com.t2tierp.contabilidade.servidor.BalancoPatrimonialGridAction;
import com.t2tierp.contabilidade.servidor.CentroResultadoDetalheAction;
import com.t2tierp.contabilidade.servidor.CentroResultadoGridAction;
import com.t2tierp.contabilidade.servidor.ContabilContaDetalheAction;
import com.t2tierp.contabilidade.servidor.ContabilContaGridAction;
import com.t2tierp.contabilidade.servidor.ContabilDreCabecalhoDetalheAction;
import com.t2tierp.contabilidade.servidor.ContabilDreCabecalhoGridAction;
import com.t2tierp.contabilidade.servidor.ContabilDreDetalheGridAction;
import com.t2tierp.contabilidade.servidor.ContabilEncerramentoExeCabDetalheAction;
import com.t2tierp.contabilidade.servidor.ContabilEncerramentoExeCabGridAction;
import com.t2tierp.contabilidade.servidor.ContabilEncerramentoExeDetGridAction;
import com.t2tierp.contabilidade.servidor.ContabilFechamentoDetalheAction;
import com.t2tierp.contabilidade.servidor.ContabilFechamentoGridAction;
import com.t2tierp.contabilidade.servidor.ContabilHistoricoDetalheAction;
import com.t2tierp.contabilidade.servidor.ContabilHistoricoGridAction;
import com.t2tierp.contabilidade.servidor.ContabilIndiceDetalheAction;
import com.t2tierp.contabilidade.servidor.ContabilIndiceGridAction;
import com.t2tierp.contabilidade.servidor.ContabilIndiceValorGridAction;
import com.t2tierp.contabilidade.servidor.ContabilLancamentoCabecalhoDetalheAction;
import com.t2tierp.contabilidade.servidor.ContabilLancamentoCabecalhoGridAction;
import com.t2tierp.contabilidade.servidor.ContabilLancamentoDetalheGridAction;
import com.t2tierp.contabilidade.servidor.ContabilLancamentoOrcadoDetalheAction;
import com.t2tierp.contabilidade.servidor.ContabilLancamentoOrcadoGridAction;
import com.t2tierp.contabilidade.servidor.ContabilLancamentoPadraoDetalheAction;
import com.t2tierp.contabilidade.servidor.ContabilLancamentoPadraoGridAction;
import com.t2tierp.contabilidade.servidor.ContabilLivroDetalheAction;
import com.t2tierp.contabilidade.servidor.ContabilLivroGridAction;
import com.t2tierp.contabilidade.servidor.ContabilLoteDetalheAction;
import com.t2tierp.contabilidade.servidor.ContabilLoteGridAction;
import com.t2tierp.contabilidade.servidor.ContabilParametrosDetalheAction;
import com.t2tierp.contabilidade.servidor.ContabilParametrosGridAction;
import com.t2tierp.contabilidade.servidor.ContabilTermoGridAction;
import com.t2tierp.contabilidade.servidor.DfcGridAction;
import com.t2tierp.contabilidade.servidor.FapDetalheAction;
import com.t2tierp.contabilidade.servidor.FapGridAction;
import com.t2tierp.contabilidade.servidor.LivroContabilGridAction;
import com.t2tierp.contabilidade.servidor.NaturezaFinanceiraDetalheAction;
import com.t2tierp.contabilidade.servidor.NaturezaFinanceiraGridAction;
import com.t2tierp.contabilidade.servidor.PlanoCentroResultadoDetalheAction;
import com.t2tierp.contabilidade.servidor.PlanoCentroResultadoGridAction;
import com.t2tierp.contabilidade.servidor.PlanoContaDetalheAction;
import com.t2tierp.contabilidade.servidor.PlanoContaGridAction;
import com.t2tierp.contabilidade.servidor.PlanoContaRefSpedDetalheAction;
import com.t2tierp.contabilidade.servidor.PlanoContaRefSpedGridAction;
import com.t2tierp.contabilidade.servidor.PlanoNaturezaFinanceiraDetalheAction;
import com.t2tierp.contabilidade.servidor.PlanoNaturezaFinanceiraGridAction;
import com.t2tierp.contabilidade.servidor.RegistroCartorioDetalheAction;
import com.t2tierp.contabilidade.servidor.RegistroCartorioGridAction;
import com.t2tierp.contratos.servidor.ContratoDetalheAction;
import com.t2tierp.contratos.servidor.ContratoGridAction;
import com.t2tierp.contratos.servidor.ContratoHistFaturamentoGridAction;
import com.t2tierp.contratos.servidor.ContratoHistoricoReajusteGridAction;
import com.t2tierp.contratos.servidor.ContratoPrevFaturamentoGridAction;
import com.t2tierp.contratos.servidor.ContratoSolicitacaoServicoDetalheAction;
import com.t2tierp.contratos.servidor.ContratoSolicitacaoServicoGridAction;
import com.t2tierp.contratos.servidor.ContratoTemplateDetalheAction;
import com.t2tierp.contratos.servidor.ContratoTemplateGridAction;
import com.t2tierp.contratos.servidor.ContratoTipoServicoDetalheAction;
import com.t2tierp.contratos.servidor.ContratoTipoServicoGridAction;
import com.t2tierp.contratos.servidor.TipoContratoDetalheAction;
import com.t2tierp.contratos.servidor.TipoContratoGridAction;
import com.t2tierp.controleestoque.servidor.EntradaNotaDetalheAction;
import com.t2tierp.controleestoque.servidor.EntradaNotaGridAction;
import com.t2tierp.controleestoque.servidor.EstoqueContagemCabecalhoDetalheAction;
import com.t2tierp.controleestoque.servidor.EstoqueContagemCabecalhoGridAction;
import com.t2tierp.controleestoque.servidor.EstoqueContagemDetalheGridAction;
import com.t2tierp.controleestoque.servidor.EstoqueFormacaoPrecoDetalheGridAction;
import com.t2tierp.controleestoque.servidor.EstoqueFormacaoPrecoGridAction;
import com.t2tierp.controleestoque.servidor.EstoqueReajusteCabecalhoDetalheAction;
import com.t2tierp.controleestoque.servidor.EstoqueReajusteCabecalhoGridAction;
import com.t2tierp.controleestoque.servidor.EstoqueReajusteDetalheGridAction;
import com.t2tierp.controleestoque.servidor.FiscalNotaFiscalEntradaDetalheAction;
import com.t2tierp.controleestoque.servidor.NfeCteReferenciadoGridAction;
import com.t2tierp.controleestoque.servidor.NfeCupomFiscalReferenciadoGridAction;
import com.t2tierp.controleestoque.servidor.NfeDetalheGridAction;
import com.t2tierp.controleestoque.servidor.NfeDuplicataGridAction;
import com.t2tierp.controleestoque.servidor.NfeEmitenteDetalheAction;
import com.t2tierp.controleestoque.servidor.NfeFaturaDetalheAction;
import com.t2tierp.controleestoque.servidor.NfeLocalEntregaDetalheAction;
import com.t2tierp.controleestoque.servidor.NfeLocalRetiradaDetalheAction;
import com.t2tierp.controleestoque.servidor.NfeNfReferenciadaGridAction;
import com.t2tierp.controleestoque.servidor.NfeProdRuralReferenciadaGridAction;
import com.t2tierp.controleestoque.servidor.NfeReferenciadaGridAction;
import com.t2tierp.controleestoque.servidor.NfeTransporteDetalheAction;
import com.t2tierp.controleestoque.servidor.NfeTransporteReboqueGridAction;
import com.t2tierp.controleestoque.servidor.NfeTransporteVolumeGridAction;
import com.t2tierp.controleestoque.servidor.NfeTransporteVolumeLacreGridAction;
import com.t2tierp.controleestoque.servidor.RequisicaoInternaCabecalhoDetalheAction;
import com.t2tierp.controleestoque.servidor.RequisicaoInternaCabecalhoGridAction;
import com.t2tierp.controleestoque.servidor.RequisicaoInternaDetalheGridAction;
import com.t2tierp.escritafiscal.servidor.FiscalApuracaoIcmsAction;
import com.t2tierp.escritafiscal.servidor.FiscalLivroDetalheAction;
import com.t2tierp.escritafiscal.servidor.FiscalParametrosDetalheAction;
import com.t2tierp.escritafiscal.servidor.FiscalParametrosGridAction;
import com.t2tierp.escritafiscal.servidor.FiscalTermoGridAction;
import com.t2tierp.escritafiscal.servidor.SimplesNacionalCabecalhoDetalheAction;
import com.t2tierp.escritafiscal.servidor.SimplesNacionalCabecalhoGridAction;
import com.t2tierp.escritafiscal.servidor.SimplesNacionalDetalheGridAction;
import com.t2tierp.financeiro.servidor.FinConfiguracaoBoletoDetalheAction;
import com.t2tierp.financeiro.servidor.FinConfiguracaoBoletoGridAction;
import com.t2tierp.financeiro.servidor.FinDocumentoOrigemDetalheAction;
import com.t2tierp.financeiro.servidor.FinDocumentoOrigemGridAction;
import com.t2tierp.financeiro.servidor.FinExtratoContaBancoDetalheAction;
import com.t2tierp.financeiro.servidor.FinFechamentoCaixaBancoAction;
import com.t2tierp.financeiro.servidor.FinFluxoCaixaDetalheAction;
import com.t2tierp.financeiro.servidor.FinFluxoCaixaGridAction;
import com.t2tierp.financeiro.servidor.FinLancamentoPagarDetalheAction;
import com.t2tierp.financeiro.servidor.FinLancamentoPagarGridAction;
import com.t2tierp.financeiro.servidor.FinLancamentoReceberDetalheAction;
import com.t2tierp.financeiro.servidor.FinLancamentoReceberGridAction;
import com.t2tierp.financeiro.servidor.FinLctoPagarNtFinanceiraGridAction;
import com.t2tierp.financeiro.servidor.FinLctoReceberNtFinanceiraGridAction;
import com.t2tierp.financeiro.servidor.FinMovimentoCaixaBancoDetalheAction;
import com.t2tierp.financeiro.servidor.FinMovimentoCaixaBancoGridAction;
import com.t2tierp.financeiro.servidor.FinParcelaPagamentoDetalheAction;
import com.t2tierp.financeiro.servidor.FinParcelaPagamentoEfetuadoGridAction;
import com.t2tierp.financeiro.servidor.FinParcelaPagamentoGridAction;
import com.t2tierp.financeiro.servidor.FinParcelaPagarGridAction;
import com.t2tierp.financeiro.servidor.FinParcelaReceberGridAction;
import com.t2tierp.financeiro.servidor.FinParcelaRecebimentoDetalheAction;
import com.t2tierp.financeiro.servidor.FinParcelaRecebimentoEfetuadoGridAction;
import com.t2tierp.financeiro.servidor.FinParcelaRecebimentoGridAction;
import com.t2tierp.financeiro.servidor.FinResumoTesourariaDetalheAction;
import com.t2tierp.financeiro.servidor.FinResumoTesourariaGridAction;
import com.t2tierp.financeiro.servidor.FinStatusParcelaDetalheAction;
import com.t2tierp.financeiro.servidor.FinStatusParcelaGridAction;
import com.t2tierp.financeiro.servidor.FinTipoPagamentoDetalheAction;
import com.t2tierp.financeiro.servidor.FinTipoPagamentoGridAction;
import com.t2tierp.financeiro.servidor.FinTipoRecebimentoDetalheAction;
import com.t2tierp.financeiro.servidor.FinTipoRecebimentoGridAction;
import com.t2tierp.financeiro.servidor.FinTrataArquivoRetornoGridAction;
import com.t2tierp.financeiro.servidor.ImportaChequeAction;
import com.t2tierp.financeiro.servidor.ValidaChequeAction;
import com.t2tierp.folhapagamento.servidor.FeriasPeriodoAquisitivoDetalheAction;
import com.t2tierp.folhapagamento.servidor.FeriasPeriodoAquisitivoGridAction;
import com.t2tierp.folhapagamento.servidor.FolhaAfastamentoDetalheAction;
import com.t2tierp.folhapagamento.servidor.FolhaAfastamentoGridAction;
import com.t2tierp.folhapagamento.servidor.FolhaEventoDetalheAction;
import com.t2tierp.folhapagamento.servidor.FolhaEventoGridAction;
import com.t2tierp.folhapagamento.servidor.FolhaFechamentoDetalheAction;
import com.t2tierp.folhapagamento.servidor.FolhaFechamentoGridAction;
import com.t2tierp.folhapagamento.servidor.FolhaFeriasColetivasDetalheAction;
import com.t2tierp.folhapagamento.servidor.FolhaFeriasColetivasGridAction;
import com.t2tierp.folhapagamento.servidor.FolhaHistoricoSalarialDetalheAction;
import com.t2tierp.folhapagamento.servidor.FolhaHistoricoSalarialGridAction;
import com.t2tierp.folhapagamento.servidor.FolhaInssDetalheAction;
import com.t2tierp.folhapagamento.servidor.FolhaInssGridAction;
import com.t2tierp.folhapagamento.servidor.FolhaInssRetencaoGridAction;
import com.t2tierp.folhapagamento.servidor.FolhaInssServicoDetalheAction;
import com.t2tierp.folhapagamento.servidor.FolhaInssServicoGridAction;
import com.t2tierp.folhapagamento.servidor.FolhaLancamentoDetalheAction;
import com.t2tierp.folhapagamento.servidor.FolhaLancamentoDetalheGridAction;
import com.t2tierp.folhapagamento.servidor.FolhaLancamentoGridAction;
import com.t2tierp.folhapagamento.servidor.FolhaParametrosDetalheAction;
import com.t2tierp.folhapagamento.servidor.FolhaParametrosGridAction;
import com.t2tierp.folhapagamento.servidor.FolhaPlanoSaudeDetalheAction;
import com.t2tierp.folhapagamento.servidor.FolhaPlanoSaudeGridAction;
import com.t2tierp.folhapagamento.servidor.FolhaPppAtividadeGridAction;
import com.t2tierp.folhapagamento.servidor.FolhaPppCatGridAction;
import com.t2tierp.folhapagamento.servidor.FolhaPppDetalheAction;
import com.t2tierp.folhapagamento.servidor.FolhaPppExameMedicoGridAction;
import com.t2tierp.folhapagamento.servidor.FolhaPppFatorRiscoGridAction;
import com.t2tierp.folhapagamento.servidor.FolhaPppGridAction;
import com.t2tierp.folhapagamento.servidor.FolhaRescisaoDetalheAction;
import com.t2tierp.folhapagamento.servidor.FolhaRescisaoGridAction;
import com.t2tierp.folhapagamento.servidor.FolhaTipoAfastamentoDetalheAction;
import com.t2tierp.folhapagamento.servidor.FolhaTipoAfastamentoGridAction;
import com.t2tierp.folhapagamento.servidor.FolhaValeTransporteDetalheAction;
import com.t2tierp.folhapagamento.servidor.FolhaValeTransporteGridAction;
import com.t2tierp.folhapagamento.servidor.GuiasAcumuladasDetalheAction;
import com.t2tierp.folhapagamento.servidor.GuiasAcumuladasGridAction;
import com.t2tierp.folhapagamento.servidor.InformativosGuiasAction;

import com.t2tierp.ged.servidor.GedDocumentoDetalheAction;
import com.t2tierp.ged.servidor.GedDocumentoGridAction;
import com.t2tierp.ged.servidor.GedTipoDocumentoDetalheAction;
import com.t2tierp.ged.servidor.GedTipoDocumentoGridAction;
import com.t2tierp.nfe.servidor.NfeDestinatarioDetalheAction;
import com.t2tierp.nfe.servidor.NfeDetalheAction;
import com.t2tierp.nfe.servidor.NfeGridAction;
import com.t2tierp.nfe.servidor.nfeTributAction;
import com.t2tierp.orcamento.servidor.OrcamentoDetalheGridAction;
import com.t2tierp.orcamento.servidor.OrcamentoEmpresarialDetalheAction;
import com.t2tierp.orcamento.servidor.OrcamentoEmpresarialGridAction;
import com.t2tierp.orcamento.servidor.OrcamentoFluxoCaixaDetalheAction;
import com.t2tierp.orcamento.servidor.OrcamentoFluxoCaixaDetalheGridAction;
import com.t2tierp.orcamento.servidor.OrcamentoFluxoCaixaGridAction;
import com.t2tierp.orcamento.servidor.OrcamentoFluxoCaixaPeriodoGridAction;
import com.t2tierp.orcamento.servidor.OrcamentoPeriodoGridAction;
import com.t2tierp.patrimonio.servidor.PatrimApoliceSeguroDetalheAction;
import com.t2tierp.patrimonio.servidor.PatrimApoliceSeguroGridAction;
import com.t2tierp.patrimonio.servidor.PatrimBemDetalheAction;
import com.t2tierp.patrimonio.servidor.PatrimBemGridAction;
import com.t2tierp.patrimonio.servidor.PatrimDepreciacaoBemGridAction;
import com.t2tierp.patrimonio.servidor.PatrimDocumentoBemGridAction;
import com.t2tierp.patrimonio.servidor.PatrimEstadoConservacaoDetalheAction;
import com.t2tierp.patrimonio.servidor.PatrimEstadoConservacaoGridAction;
import com.t2tierp.patrimonio.servidor.PatrimGrupoBemDetalheAction;
import com.t2tierp.patrimonio.servidor.PatrimGrupoBemGridAction;
import com.t2tierp.patrimonio.servidor.PatrimIndiceAtualizacaoDetalheAction;
import com.t2tierp.patrimonio.servidor.PatrimIndiceAtualizacaoGridAction;
import com.t2tierp.patrimonio.servidor.PatrimMovimentacaoBemGridAction;
import com.t2tierp.patrimonio.servidor.PatrimTaxaDepreciacaoDetalheAction;
import com.t2tierp.patrimonio.servidor.PatrimTaxaDepreciacaoGridAction;
import com.t2tierp.patrimonio.servidor.PatrimTipoAquisicaoBemDetalheAction;
import com.t2tierp.patrimonio.servidor.PatrimTipoAquisicaoBemGridAction;
import com.t2tierp.patrimonio.servidor.PatrimTipoMovimentacaoDetalheAction;
import com.t2tierp.patrimonio.servidor.PatrimTipoMovimentacaoGridAction;
import com.t2tierp.patrimonio.servidor.SeguradoraDetalheAction;
import com.t2tierp.patrimonio.servidor.SeguradoraGridAction;
import com.t2tierp.ponto.servidor.PontoAbonoDetalheAction;
import com.t2tierp.ponto.servidor.PontoAbonoGridAction;
import com.t2tierp.ponto.servidor.PontoAbonoUtilizacaoGridAction;
import com.t2tierp.ponto.servidor.PontoBancoHorasGridAction;
import com.t2tierp.ponto.servidor.PontoClassificacaoJornadaDetalheAction;
import com.t2tierp.ponto.servidor.PontoClassificacaoJornadaGridAction;
import com.t2tierp.ponto.servidor.PontoEscalaDetalheAction;
import com.t2tierp.ponto.servidor.PontoEscalaGridAction;
import com.t2tierp.ponto.servidor.PontoEspelhoDetalheAction;
import com.t2tierp.ponto.servidor.PontoEspelhoGridAction;
import com.t2tierp.ponto.servidor.PontoFechamentoJornadaGridAction;
import com.t2tierp.ponto.servidor.PontoGeracaoArquivoGridAction;
import com.t2tierp.ponto.servidor.PontoHoraAction;
import com.t2tierp.ponto.servidor.PontoHorarioDetalheAction;
import com.t2tierp.ponto.servidor.PontoHorarioGridAction;
import com.t2tierp.ponto.servidor.PontoImportaMarcacaoAction;
import com.t2tierp.ponto.servidor.PontoParametroDetalheAction;
import com.t2tierp.ponto.servidor.PontoParametroGridAction;
import com.t2tierp.ponto.servidor.PontoProcessaFechamentoJornadaAction;
import com.t2tierp.ponto.servidor.PontoRegistraMarcacaoAction;
import com.t2tierp.ponto.servidor.PontoRelogioDetalheAction;
import com.t2tierp.ponto.servidor.PontoRelogioGridAction;
import com.t2tierp.ponto.servidor.PontoTurmaGridAction;
import com.t2tierp.sintegra.servidor.GeraSintegraAction;
import com.t2tierp.sped.servidor.GeraSpedContabilAction;
import com.t2tierp.sped.servidor.GeraSpedFiscalAction;
import com.t2tierp.vendas.servidor.ImportaVendaOrcamentoAction;
import com.t2tierp.vendas.servidor.TipoNotaFiscalDetalheAction;
import com.t2tierp.vendas.servidor.TipoNotaFiscalGridAction;
import com.t2tierp.vendas.servidor.ValidaVendaOrcamentoAction;
import com.t2tierp.vendas.servidor.VendaCondicoesPagamentoDetalheAction;
import com.t2tierp.vendas.servidor.VendaCondicoesPagamentoGridAction;
import com.t2tierp.vendas.servidor.VendaCondicoesParcelasGridAction;
import com.t2tierp.vendas.servidor.VendaDetalheAction;
import com.t2tierp.vendas.servidor.VendaDetalheGridAction;
import com.t2tierp.vendas.servidor.VendaFreteDetalheAction;
import com.t2tierp.vendas.servidor.VendaFreteGridAction;
import com.t2tierp.vendas.servidor.VendaGridAction;
import com.t2tierp.vendas.servidor.VendaOrcamentoDetalheAction;
import com.t2tierp.vendas.servidor.VendaOrcamentoDetalheGridAction;
import com.t2tierp.vendas.servidor.VendaOrcamentoGridAction;
import com.t2tierp.vendas.servidor.VendaRomaneioEntregaDetalheAction;
import com.t2tierp.vendas.servidor.VendaRomaneioEntregaDetalheGridAction;
import com.t2tierp.vendas.servidor.VendaRomaneioEntregaGridAction;

import org.openswing.swing.server.ActionsCollection;
import org.openswing.swing.server.Action;

/**
 * <p>Title: T2Ti ERP</p>
 * <p>Description: Mapeia todas as ações tomadas no lado do servidor.</p>
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
 * @author Claudio de Barros (T2Ti.COM)
 * @version 1.0
 */
public class T2TiERPActionClasses extends ActionsCollection {

    public T2TiERPActionClasses() {
        Action a = null;

        //infra

        //infra
        a = new T2TiERPButtonAuthorizationsAction();
        put(a.getRequestName(), a);
        a = new T2TiERPFunctionAuthorizationsAction();
        put(a.getRequestName(), a);
        a = new UserLoginAction();
        put(a.getRequestName(), a);
        a = new T2TiERPContainerAction();
        put(a.getRequestName(), a);


        /*actions do módulo */
        a = new UsuarioGridAction();
        put(a.getRequestName(), a);
        a = new UsuarioDetalheAction();
        put(a.getRequestName(), a);
        a = new PapelGridAction();
        put(a.getRequestName(), a);
        a = new PapelDetalheAction();
        put(a.getRequestName(), a);
        a = new PapelFuncaoGridAction();
        put(a.getRequestName(), a);
        a = new PapelFuncaoGridAction();
        put(a.getRequestName(), a);
        /*actions do módulo */
        //Produto
        a = new ProdutoMarcaGridAction();
        put(a.getRequestName(), a);
        a = new ProdutoMarcaDetalheAction();
        put(a.getRequestName(), a);
        a = new NcmGridAction();
        put(a.getRequestName(), a);
        a = new UnidadeProdutoGridAction();
        put(a.getRequestName(), a);
        a = new UnidadeProdutoDetalheAction();
        put(a.getRequestName(), a);
        a = new ProdutoGrupoGridAction();
        put(a.getRequestName(), a);
        a = new ProdutoGrupoDetalheAction();
        put(a.getRequestName(), a);
        a = new ProdutoSubGrupoGridAction();
        put(a.getRequestName(), a);
        a = new ProdutoSubGrupoDetalheAction();
        put(a.getRequestName(), a);
        a = new ProdutoGridAction();
        put(a.getRequestName(), a);
        a = new ProdutoDetalheAction();
        put(a.getRequestName(), a);
        a = new QuadroSocietarioGridAction();
        put(a.getRequestName(), a);
        a = new QuadroSocietarioDetalheAction();
        put(a.getRequestName(), a);
        a = new SocioGridAction();
        put(a.getRequestName(), a);
        a = new SocioDetalheAction();
        put(a.getRequestName(), a);
        a = new SocioDependenteGridAction();
        put(a.getRequestName(), a);
        a = new SocioParticipacaoSocietariaGridAction();
        put(a.getRequestName(), a);
        a = new EmpresaCnaeGridAction();
        put(a.getRequestName(), a);
        a = new EmpresaCnaeDetalheAction();
        put(a.getRequestName(), a);
        a = new EmpresaGridAction();
        put(a.getRequestName(), a);
        a = new EmpresaDetalheAction();
        put(a.getRequestName(), a);
        a = new EmpresaContatoGridAction();
        put(a.getRequestName(), a);
        a = new EmpresaEnderecoGridAction();
        put(a.getRequestName(), a);


        //PESSOA
        a = new EstadoCivilGridAction();
        put(a.getRequestName(), a);
        a = new EstadoCivilDetalheAction();
        put(a.getRequestName(), a);
        a = new PessoaGridAction();
        put(a.getRequestName(), a);
        a = new PessoaDetalheAction();
        put(a.getRequestName(), a);
        a = new PessoaContatoGridAction();
        put(a.getRequestName(), a);
        a = new PessoaEnderecoGridAction();
        put(a.getRequestName(), a);
        a = new PessoaFisicaDetalheAction();
        put(a.getRequestName(), a);
        a = new PessoaJuridicaDetalheAction();
        put(a.getRequestName(), a);

        //CLIENTE - FORNECEDOR - TRANSPORTADORA
        a = new AtividadeForCliGridAction();
        put(a.getRequestName(), a);
        a = new AtividadeForCliDetalheAction();
        put(a.getRequestName(), a);
        a = new SituacaoForCliGridAction();
        put(a.getRequestName(), a);
        a = new SituacaoForCliDetalheAction();
        put(a.getRequestName(), a);
        a = new ClienteGridAction();
        put(a.getRequestName(), a);
        a = new ClienteDetalheAction();
        put(a.getRequestName(), a);
        a = new FornecedorGridAction();
        put(a.getRequestName(), a);
        a = new FornecedorDetalheAction();
        put(a.getRequestName(), a);
        a = new TransportadoraGridAction();
        put(a.getRequestName(), a);
        a = new TransportadoraDetalheAction();
        put(a.getRequestName(), a);

        //Colaborador
        a = new TipoAdmissaoGridAction();
        put(a.getRequestName(), a);
        a = new TipoAdmissaoDetalheAction();
        put(a.getRequestName(), a);
        a = new TipoRelacionamentoGridAction();
        put(a.getRequestName(), a);
        a = new TipoRelacionamentoDetalheAction();
        put(a.getRequestName(), a);
        a = new SituacaoColaboradorGridAction();
        put(a.getRequestName(), a);
        a = new SituacaoColaboradorDetalheAction();
        put(a.getRequestName(), a);
        a = new TipoDesligamentoGridAction();
        put(a.getRequestName(), a);
        a = new TipoDesligamentoDetalheAction();
        put(a.getRequestName(), a);
        a = new TipoColaboradorGridAction();
        put(a.getRequestName(), a);
        a = new TipoColaboradorDetalheAction();
        put(a.getRequestName(), a);
        a = new CargoGridAction();
        put(a.getRequestName(), a);
        a = new CargoDetalheAction();
        put(a.getRequestName(), a);
        a = new NivelFormacaoGridAction();
        put(a.getRequestName(), a);
        a = new NivelFormacaoDetalheAction();
        put(a.getRequestName(), a);
        a = new ColaboradorGridAction();
        put(a.getRequestName(), a);
        a = new ColaboradorDetalheAction();
        put(a.getRequestName(), a);

        //CONTADOR - SINDICATO - CONVENIO
        a = new ContadorGridAction();
        put(a.getRequestName(), a);
        a = new ContadorDetalheAction();
        put(a.getRequestName(), a);
        a = new SindicatoGridAction();
        put(a.getRequestName(), a);
        a = new SindicatoDetalheAction();
        put(a.getRequestName(), a);
        a = new ConvenioGridAction();
        put(a.getRequestName(), a);
        a = new ConvenioDetalheAction();
        put(a.getRequestName(), a);

        //DIVERSOS
        a = new SetorGridAction();
        put(a.getRequestName(), a);
        a = new SetorDetalheAction();
        put(a.getRequestName(), a);
        a = new AlmoxarifadoGridAction();
        put(a.getRequestName(), a);
        a = new AlmoxarifadoDetalheAction();
        put(a.getRequestName(), a);
        a = new OperadoraPlanoSaudeGridAction();
        put(a.getRequestName(), a);
        a = new OperadoraPlanoSaudeDetalheAction();
        put(a.getRequestName(), a);
        a = new OperadoraCartaoGridAction();
        put(a.getRequestName(), a);
        a = new OperadoraCartaoDetalheAction();
        put(a.getRequestName(), a);

        //ENDERECO
        a = new PaisGridAction();
        put(a.getRequestName(), a);
        a = new PaisDetalheAction();
        put(a.getRequestName(), a);
        a = new UfGridAction();
        put(a.getRequestName(), a);
        a = new UfDetalheAction();
        put(a.getRequestName(), a);
        a = new MunicipioGridAction();
        put(a.getRequestName(), a);
        a = new MunicipioDetalheAction();
        put(a.getRequestName(), a);
        a = new CepGridAction();
        put(a.getRequestName(), a);
        a = new CepDetalheAction();
        put(a.getRequestName(), a);

        //FINANCEIRO
        a = new BancoGridAction();
        put(a.getRequestName(), a);
        a = new BancoDetalheAction();
        put(a.getRequestName(), a);
        a = new AgenciaBancoGridAction();
        put(a.getRequestName(), a);
        a = new AgenciaBancoDetalheAction();
        put(a.getRequestName(), a);
        a = new ContaCaixaGridAction();
        put(a.getRequestName(), a);
        a = new ContaCaixaDetalheAction();
        put(a.getRequestName(), a);
        a = new TalonarioChequeGridAction();
        put(a.getRequestName(), a);
        a = new TalonarioChequeDetalheAction();
        put(a.getRequestName(), a);
        a = new ChequeGridAction();
        put(a.getRequestName(), a);
        a = new ChequeDetalheAction();
        put(a.getRequestName(), a);

        //TABELAS
        a = new CfopGridAction();
        put(a.getRequestName(), a);
        a = new CfopDetalheAction();
        put(a.getRequestName(), a);
        a = new FeriadosGridAction();
        put(a.getRequestName(), a);
        a = new FeriadosDetalheAction();
        put(a.getRequestName(), a);





        /*actions do módulos Financeiro */



        /*actions do módulo */
        a = new GedDocumentoGridAction();
        put(a.getRequestName(), a);
        a = new GedDocumentoDetalheAction();
        put(a.getRequestName(), a);
        a = new GedTipoDocumentoGridAction();
        put(a.getRequestName(), a);
        a = new GedTipoDocumentoDetalheAction();
        put(a.getRequestName(), a);



        /*actions do módulo contas a receber*/
        a = new PlanoNaturezaFinanceiraGridAction();
        put(a.getRequestName(), a);
        a = new PlanoNaturezaFinanceiraDetalheAction();
        put(a.getRequestName(), a);
        a = new PlanoCentroResultadoGridAction();
        put(a.getRequestName(), a);
        a = new PlanoCentroResultadoDetalheAction();
        put(a.getRequestName(), a);
        a = new NaturezaFinanceiraGridAction();
        put(a.getRequestName(), a);
        a = new NaturezaFinanceiraDetalheAction();
        put(a.getRequestName(), a);
        a = new CentroResultadoGridAction();
        put(a.getRequestName(), a);
        a = new CentroResultadoDetalheAction();
        put(a.getRequestName(), a);
        a = new FinDocumentoOrigemGridAction();
        put(a.getRequestName(), a);
        a = new FinDocumentoOrigemDetalheAction();
        put(a.getRequestName(), a);
        a = new FinStatusParcelaGridAction();
        put(a.getRequestName(), a);
        a = new FinStatusParcelaDetalheAction();
        put(a.getRequestName(), a);
        a = new FinTipoRecebimentoGridAction();
        put(a.getRequestName(), a);
        a = new FinTipoRecebimentoDetalheAction();
        put(a.getRequestName(), a);
        a = new FinConfiguracaoBoletoGridAction();
        put(a.getRequestName(), a);
        a = new FinConfiguracaoBoletoDetalheAction();
        put(a.getRequestName(), a);
        a = new FinParcelaReceberGridAction();
        put(a.getRequestName(), a);
        a = new FinLancamentoReceberGridAction();
        put(a.getRequestName(), a);
        a = new FinLancamentoReceberDetalheAction();
        put(a.getRequestName(), a);
        a = new FinLctoReceberNtFinanceiraGridAction();
        put(a.getRequestName(), a);
        a = new FinParcelaRecebimentoGridAction();
        put(a.getRequestName(), a);
        a = new FinParcelaRecebimentoDetalheAction();
        put(a.getRequestName(), a);
        a = new FinParcelaRecebimentoEfetuadoGridAction();
        put(a.getRequestName(), a);
        a = new FinTrataArquivoRetornoGridAction();
        put(a.getRequestName(), a);






        /*actions do módulo caixas e bancos */
        a = new FinMovimentoCaixaBancoGridAction();
        put(a.getRequestName(), a);
        a = new FinMovimentoCaixaBancoDetalheAction();
        put(a.getRequestName(), a);
        a = new FinFechamentoCaixaBancoAction();
        put(a.getRequestName(), a);



        /*actions do módulo contas a pagar */


        a = new FinTipoPagamentoGridAction();
        put(a.getRequestName(), a);
        a = new FinTipoPagamentoDetalheAction();
        put(a.getRequestName(), a);
        a = new FinLancamentoPagarGridAction();
        put(a.getRequestName(), a);
        a = new FinLancamentoPagarDetalheAction();
        put(a.getRequestName(), a);
        a = new FinParcelaPagarGridAction();
        put(a.getRequestName(), a);
        a = new FinLctoPagarNtFinanceiraGridAction();
        put(a.getRequestName(), a);
        a = new FinParcelaPagamentoGridAction();
        put(a.getRequestName(), a);
        a = new FinParcelaPagamentoEfetuadoGridAction();
        put(a.getRequestName(), a);
        a = new FinParcelaPagamentoDetalheAction();
        put(a.getRequestName(), a);



        //modulo ged
        try {
            a = (Action) Class.forName("com.t2tierp.ged.servidor.GedDocumentoGridAction").newInstance();
            put(a.getRequestName(), a);

            a = (Action) Class.forName("com.t2tierp.ged.servidor.GedDocumentoDetalheAction").newInstance();
            put(a.getRequestName(), a);
        } catch (Exception e) {
            e.printStackTrace();
        }


        /*patrimonio*/
        a = new PatrimTaxaDepreciacaoGridAction();
        put(a.getRequestName(), a);
        a = new PatrimTaxaDepreciacaoDetalheAction();
        put(a.getRequestName(), a);
        a = new PatrimIndiceAtualizacaoGridAction();
        put(a.getRequestName(), a);
        a = new PatrimIndiceAtualizacaoDetalheAction();
        put(a.getRequestName(), a);
        a = new PatrimTipoAquisicaoBemGridAction();
        put(a.getRequestName(), a);
        a = new PatrimTipoAquisicaoBemDetalheAction();
        put(a.getRequestName(), a);
        a = new PatrimTipoMovimentacaoGridAction();
        put(a.getRequestName(), a);
        a = new PatrimTipoMovimentacaoDetalheAction();
        put(a.getRequestName(), a);
        a = new PatrimEstadoConservacaoGridAction();
        put(a.getRequestName(), a);
        a = new PatrimEstadoConservacaoDetalheAction();
        put(a.getRequestName(), a);
        a = new PatrimGrupoBemGridAction();
        put(a.getRequestName(), a);
        a = new PatrimGrupoBemDetalheAction();
        put(a.getRequestName(), a);
        a = new PatrimBemGridAction();
        put(a.getRequestName(), a);
        a = new PatrimBemDetalheAction();
        put(a.getRequestName(), a);
        a = new PatrimDepreciacaoBemGridAction();
        put(a.getRequestName(), a);
        a = new PatrimDocumentoBemGridAction();
        put(a.getRequestName(), a);
        a = new PatrimMovimentacaoBemGridAction();
        put(a.getRequestName(), a);
        a = new SeguradoraGridAction();
        put(a.getRequestName(), a);
        a = new SeguradoraDetalheAction();
        put(a.getRequestName(), a);
        a = new PatrimApoliceSeguroGridAction();
        put(a.getRequestName(), a);
        a = new PatrimApoliceSeguroDetalheAction();
        put(a.getRequestName(), a);


        /*actions do módulo tributacao*/
        /*  a = new TributOperacaoFiscalGridAction(); put(a.getRequestName(), a);
         a = new TributOperacaoFiscalDetalheAction(); put(a.getRequestName(), a);
         a = new TributGrupoTributarioGridAction(); put(a.getRequestName(), a);
         a = new TributGrupoTributarioDetalheAction(); put(a.getRequestName(), a);
         a = new TributConfiguraOfGtGridAction(); put(a.getRequestName(), a);
         a = new TributConfiguraOfGtDetalheAction(); put(a.getRequestName(), a);
         a = new TributIcmsUfGridAction(); put(a.getRequestName(), a);
         a = new TributPisCodApuracaoDetalheAction(); put(a.getRequestName(), a);
         a = new TributCofinsCodApuracaoDetalheAction(); put(a.getRequestName(), a);
         a = new TributIpiDipiDetalheAction(); put(a.getRequestName(), a);
         a = new TributIcmsCustomCabGridAction(); put(a.getRequestName(), a);
         a = new TributIcmsCustomCabDetalheAction(); put(a.getRequestName(), a);
         a = new TributIcmsCustomDetGridAction(); put(a.getRequestName(), a);
         a = new TributIssGridAction(); put(a.getRequestName(), a);
         a = new TributIssDetalheAction(); put(a.getRequestName(), a);*/

        //tesouraria 
        a = new FinResumoTesourariaGridAction();
        put(a.getRequestName(), a);
        a = new FinResumoTesourariaDetalheAction();
        put(a.getRequestName(), a);

        //fluxo de caixa
        a = new FinFluxoCaixaGridAction();
        put(a.getRequestName(), a);
        a = new FinFluxoCaixaDetalheAction();
        put(a.getRequestName(), a);


        /*validacoes e importacoes*/
        a = new ImportaDadosAction();
        put(a.getRequestName(), a);
        a = new ValidaDadosAction();
        put(a.getRequestName(), a);
        a = new ImportaDadosAction();
        put(a.getRequestName(), a);
        a = new ValidaDadosAction();
        put(a.getRequestName(), a);
        a = new ImportaChequeAction();
        put(a.getRequestName(), a);
        a = new ValidaChequeAction();
        put(a.getRequestName(), a);

        a = new ImportaVendaOrcamentoAction();
        put(a.getRequestName(), a);
        a = new ValidaVendaOrcamentoAction();
        put(a.getRequestName(), a);



        /*actions do Conciliação bancaria */

        a = new FinExtratoContaBancoDetalheAction();
        put(a.getRequestName(), a);

        a = new ContaCaixaGridAction();
        put(a.getRequestName(), a);



        /*actions do módulo PONTO */
        a = new PontoParametroGridAction();
        put(a.getRequestName(), a);
        a = new PontoParametroDetalheAction();
        put(a.getRequestName(), a);
        a = new PontoHorarioGridAction();
        put(a.getRequestName(), a);
        a = new PontoHorarioDetalheAction();
        put(a.getRequestName(), a);
        a = new PontoEscalaGridAction();
        put(a.getRequestName(), a);
        a = new PontoEscalaDetalheAction();
        put(a.getRequestName(), a);
        a = new PontoTurmaGridAction();
        put(a.getRequestName(), a);
        a = new PontoClassificacaoJornadaGridAction();
        put(a.getRequestName(), a);
        a = new PontoClassificacaoJornadaDetalheAction();
        put(a.getRequestName(), a);
        a = new PontoAbonoGridAction();
        put(a.getRequestName(), a);
        a = new PontoAbonoDetalheAction();
        put(a.getRequestName(), a);
        a = new PontoAbonoUtilizacaoGridAction();
        put(a.getRequestName(), a);
        a = new PontoRelogioGridAction();
        put(a.getRequestName(), a);
        a = new PontoRelogioDetalheAction();
        put(a.getRequestName(), a);
        a = new PontoBancoHorasGridAction();
        put(a.getRequestName(), a);
        a = new PontoImportaMarcacaoAction();
        put(a.getRequestName(), a);
        a = new PontoProcessaFechamentoJornadaAction();
        put(a.getRequestName(), a);
        a = new PontoGeracaoArquivoGridAction();
        put(a.getRequestName(), a);
        a = new PontoFechamentoJornadaGridAction();
        put(a.getRequestName(), a);
        a = new PontoEspelhoGridAction();
        put(a.getRequestName(), a);
        a = new PontoEspelhoDetalheAction();
        put(a.getRequestName(), a);
        a = new PontoHoraAction();
        put(a.getRequestName(), a);
        a = new PontoRegistraMarcacaoAction();
        put(a.getRequestName(), a);


        /*SPED*/
        a = new GeraSpedContabilAction();
        put(a.getRequestName(), a);
        a = new GeraSpedFiscalAction();
        put(a.getRequestName(), a);

        /*actions do módulo FOLHA*/
        a = new FolhaParametrosGridAction();
        put(a.getRequestName(), a);
        a = new FolhaParametrosDetalheAction();
        put(a.getRequestName(), a);
        a = new GuiasAcumuladasGridAction();
        put(a.getRequestName(), a);
        a = new GuiasAcumuladasDetalheAction();
        put(a.getRequestName(), a);
        a = new FolhaPlanoSaudeGridAction();
        put(a.getRequestName(), a);
        a = new FolhaPlanoSaudeDetalheAction();
        put(a.getRequestName(), a);
        a = new FolhaEventoGridAction();
        put(a.getRequestName(), a);
        a = new FolhaEventoDetalheAction();
        put(a.getRequestName(), a);
        a = new FolhaTipoAfastamentoGridAction();
        put(a.getRequestName(), a);
        a = new FolhaTipoAfastamentoDetalheAction();
        put(a.getRequestName(), a);
        a = new FolhaAfastamentoGridAction();
        put(a.getRequestName(), a);
        a = new FolhaAfastamentoDetalheAction();
        put(a.getRequestName(), a);
        a = new FolhaFeriasColetivasGridAction();
        put(a.getRequestName(), a);
        a = new FolhaFeriasColetivasDetalheAction();
        put(a.getRequestName(), a);
        a = new FeriasPeriodoAquisitivoGridAction();
        put(a.getRequestName(), a);
        a = new FeriasPeriodoAquisitivoDetalheAction();
        put(a.getRequestName(), a);
        a = new FolhaFechamentoGridAction();
        put(a.getRequestName(), a);
        a = new FolhaFechamentoDetalheAction();
        put(a.getRequestName(), a);
        a = new FolhaLancamentoGridAction();
        put(a.getRequestName(), a);
        a = new FolhaLancamentoDetalheAction();
        put(a.getRequestName(), a);
        a = new FolhaLancamentoDetalheGridAction();
        put(a.getRequestName(), a);
        a = new FolhaHistoricoSalarialGridAction();
        put(a.getRequestName(), a);
        a = new FolhaHistoricoSalarialDetalheAction();
        put(a.getRequestName(), a);
        a = new FolhaValeTransporteGridAction();
        put(a.getRequestName(), a);
        a = new FolhaValeTransporteDetalheAction();
        put(a.getRequestName(), a);
        a = new FolhaPppGridAction();
        put(a.getRequestName(), a);
        a = new FolhaPppDetalheAction();
        put(a.getRequestName(), a);
        a = new FolhaPppCatGridAction();
        put(a.getRequestName(), a);
        a = new FolhaPppAtividadeGridAction();
        put(a.getRequestName(), a);
        a = new FolhaPppFatorRiscoGridAction();
        put(a.getRequestName(), a);
        a = new FolhaPppExameMedicoGridAction();
        put(a.getRequestName(), a);
        a = new FolhaRescisaoGridAction();
        put(a.getRequestName(), a);
        a = new FolhaRescisaoDetalheAction();
        put(a.getRequestName(), a);
        a = new FolhaInssServicoGridAction();
        put(a.getRequestName(), a);
        a = new FolhaInssServicoDetalheAction();
        put(a.getRequestName(), a);
        a = new FolhaInssGridAction();
        put(a.getRequestName(), a);
        a = new FolhaInssDetalheAction();
        put(a.getRequestName(), a);
        a = new FolhaInssRetencaoGridAction();
        put(a.getRequestName(), a);
        a = new InformativosGuiasAction();
        put(a.getRequestName(), a);



        /*actions do Compras */
        a = new CompraTipoRequisicaoGridAction();
        put(a.getRequestName(), a);
        a = new CompraTipoRequisicaoDetalheAction();
        put(a.getRequestName(), a);
        a = new CompraTipoPedidoGridAction();
        put(a.getRequestName(), a);
        a = new CompraTipoPedidoDetalheAction();
        put(a.getRequestName(), a);
        a = new CompraRequisicaoGridAction();
        put(a.getRequestName(), a);
        a = new CompraRequisicaoDetalheAction();
        put(a.getRequestName(), a);
        a = new CompraRequisicaoDetalheGridAction();
        put(a.getRequestName(), a);
        a = new CompraCotacaoGridAction();
        put(a.getRequestName(), a);
        a = new CompraCotacaoDetalheAction();
        put(a.getRequestName(), a);
        a = new CompraCotacaoDetalheGridAction();
        put(a.getRequestName(), a);
        a = new CompraFornecedorCotacaoGridAction();
        put(a.getRequestName(), a);
        a = new CompraItensNaoCotadosGridAction();
        put(a.getRequestName(), a);
        a = new CompraConfirmaCotacaoGridAction();
        put(a.getRequestName(), a);
        a = new CompraConfirmaCotacaoDetalheAction();
        put(a.getRequestName(), a);
        a = new CompraConfirmaCotacaoDetalheGridAction();
        put(a.getRequestName(), a);
        a = new CompraMapaComparativoGridAction();
        put(a.getRequestName(), a);
        a = new CompraMapaComparativoDetalheAction();
        put(a.getRequestName(), a);
        a = new CompraMapaComparativoDetalheGridAction();
        put(a.getRequestName(), a);
        a = new CompraPedidoGridAction();
        put(a.getRequestName(), a);
        a = new CompraPedidoDetalheAction();
        put(a.getRequestName(), a);
        a = new CompraPedidoDetalheGridAction();
        put(a.getRequestName(), a);
        a = new CompraSugeridaGridAction();
        put(a.getRequestName(), a);



        /*actions do módulo estoque */
        a = new EntradaNotaGridAction();
        put(a.getRequestName(), a);
        a = new EntradaNotaDetalheAction();
        put(a.getRequestName(), a);
        a = new NfeEmitenteDetalheAction();
        put(a.getRequestName(), a);
        a = new NfeDetalheGridAction();
        put(a.getRequestName(), a);
        a = new NfeReferenciadaGridAction();
        put(a.getRequestName(), a);
        a = new NfeNfReferenciadaGridAction();
        put(a.getRequestName(), a);
        a = new NfeCteReferenciadoGridAction();
        put(a.getRequestName(), a);
        a = new NfeProdRuralReferenciadaGridAction();
        put(a.getRequestName(), a);
        a = new NfeCupomFiscalReferenciadoGridAction();
        put(a.getRequestName(), a);
        a = new NfeLocalEntregaDetalheAction();
        put(a.getRequestName(), a);
        a = new NfeLocalRetiradaDetalheAction();
        put(a.getRequestName(), a);
        a = new NfeTransporteDetalheAction();
        put(a.getRequestName(), a);
        a = new NfeTransporteReboqueGridAction();
        put(a.getRequestName(), a);
        a = new NfeTransporteVolumeGridAction();
        put(a.getRequestName(), a);
        a = new NfeTransporteVolumeLacreGridAction();
        put(a.getRequestName(), a);
        a = new NfeFaturaDetalheAction();
        put(a.getRequestName(), a);
        a = new NfeDuplicataGridAction();
        put(a.getRequestName(), a);
        a = new FiscalNotaFiscalEntradaDetalheAction();
        put(a.getRequestName(), a);
        a = new RequisicaoInternaCabecalhoGridAction();
        put(a.getRequestName(), a);
        a = new RequisicaoInternaCabecalhoDetalheAction();
        put(a.getRequestName(), a);
        a = new RequisicaoInternaDetalheGridAction();
        put(a.getRequestName(), a);
        a = new EstoqueContagemCabecalhoGridAction();
        put(a.getRequestName(), a);
        a = new EstoqueContagemCabecalhoDetalheAction();
        put(a.getRequestName(), a);
        a = new EstoqueContagemDetalheGridAction();
        put(a.getRequestName(), a);
        a = new EstoqueReajusteCabecalhoGridAction();
        put(a.getRequestName(), a);
        a = new EstoqueReajusteCabecalhoDetalheAction();
        put(a.getRequestName(), a);
        a = new EstoqueReajusteDetalheGridAction();
        put(a.getRequestName(), a);
        a = new EstoqueFormacaoPrecoGridAction();
        put(a.getRequestName(), a);
        a = new EstoqueFormacaoPrecoDetalheGridAction();
        put(a.getRequestName(), a);



        /*actions do módulo contratos */
        a = new ContratoTipoServicoGridAction();
        put(a.getRequestName(), a);
        a = new ContratoTipoServicoDetalheAction();
        put(a.getRequestName(), a);
        a = new TipoContratoGridAction();
        put(a.getRequestName(), a);
        a = new TipoContratoDetalheAction();
        put(a.getRequestName(), a);
        a = new ContratoTemplateGridAction();
        put(a.getRequestName(), a);
        a = new ContratoTemplateDetalheAction();
        put(a.getRequestName(), a);
        a = new ContratoSolicitacaoServicoGridAction();
        put(a.getRequestName(), a);
        a = new ContratoSolicitacaoServicoDetalheAction();
        put(a.getRequestName(), a);
        a = new ContratoHistFaturamentoGridAction();
        put(a.getRequestName(), a);
        a = new ContratoHistoricoReajusteGridAction();
        put(a.getRequestName(), a);
        a = new ContratoPrevFaturamentoGridAction();
        put(a.getRequestName(), a);
        a = new ContratoGridAction();
        put(a.getRequestName(), a);
        a = new ContratoDetalheAction();
        put(a.getRequestName(), a);

        ///NFE
        a = new NfeGridAction();
        put(a.getRequestName(), a);
        a = new NfeDetalheAction();
        put(a.getRequestName(), a);
        a = new NfeDestinatarioDetalheAction();
        put(a.getRequestName(), a);
        a = new com.t2tierp.nfe.servidor.NfeDetalheGridAction();
        put(a.getRequestName(), a);
        a = new com.t2tierp.nfe.servidor.NfeReferenciadaGridAction();
        put(a.getRequestName(), a);
        a = new com.t2tierp.nfe.servidor.NfeNfReferenciadaGridAction();
        put(a.getRequestName(), a);
        a = new com.t2tierp.nfe.servidor.NfeCteReferenciadoGridAction();
        put(a.getRequestName(), a);
        a = new com.t2tierp.nfe.servidor.NfeProdRuralReferenciadaGridAction();
        put(a.getRequestName(), a);
        a = new com.t2tierp.nfe.servidor.NfeCupomFiscalReferenciadoGridAction();
        put(a.getRequestName(), a);
        a = new com.t2tierp.nfe.servidor.NfeLocalEntregaDetalheAction();
        put(a.getRequestName(), a);
        a = new com.t2tierp.nfe.servidor.NfeLocalRetiradaDetalheAction();
        put(a.getRequestName(), a);
        a = new com.t2tierp.nfe.servidor.NfeTransporteDetalheAction();
        put(a.getRequestName(), a);
        a = new com.t2tierp.nfe.servidor.NfeTransporteReboqueGridAction();
        put(a.getRequestName(), a);
        a = new com.t2tierp.nfe.servidor.NfeTransporteVolumeGridAction();
        put(a.getRequestName(), a);
        a = new com.t2tierp.nfe.servidor.NfeTransporteVolumeLacreGridAction();
        put(a.getRequestName(), a);
        a = new com.t2tierp.nfe.servidor.NfeFaturaDetalheAction();
        put(a.getRequestName(), a);
        a = new com.t2tierp.nfe.servidor.NfeDuplicataGridAction();
        put(a.getRequestName(), a);
        a = new nfeTributAction();
        put(a.getRequestName(), a);





        /*actions do Vendas*/
        a = new TipoNotaFiscalGridAction();
        put(a.getRequestName(), a);
        a = new TipoNotaFiscalDetalheAction();
        put(a.getRequestName(), a);
        a = new VendaCondicoesPagamentoGridAction();
        put(a.getRequestName(), a);
        a = new VendaCondicoesPagamentoDetalheAction();
        put(a.getRequestName(), a);
        a = new VendaCondicoesParcelasGridAction();
        put(a.getRequestName(), a);
        a = new VendaOrcamentoGridAction();
        put(a.getRequestName(), a);
        a = new VendaOrcamentoDetalheAction();
        put(a.getRequestName(), a);
        a = new VendaOrcamentoDetalheGridAction();
        put(a.getRequestName(), a);
        a = new VendaGridAction();
        put(a.getRequestName(), a);
        a = new VendaDetalheAction();
        put(a.getRequestName(), a);
        a = new VendaDetalheGridAction();
        put(a.getRequestName(), a);
        a = new VendaFreteGridAction();
        put(a.getRequestName(), a);
        a = new VendaFreteDetalheAction();
        put(a.getRequestName(), a);
        a = new VendaRomaneioEntregaGridAction();
        put(a.getRequestName(), a);
        a = new VendaRomaneioEntregaDetalheAction();
        put(a.getRequestName(), a);
        a = new VendaRomaneioEntregaDetalheGridAction();
        put(a.getRequestName(), a);



        /*actions do módulo */
        a = new ConciliacaoBancariaGridAction();
        put(a.getRequestName(), a);
        a = new LancamentoConciliacaoBancariaGridAction();
        put(a.getRequestName(), a);
        a = new ExtratoConciliacaoBancariaGridAction();
        put(a.getRequestName(), a);
        a = new ConciliacaoClienteGridAction();
        put(a.getRequestName(), a);
        a = new ParcelaConciliacaoClienteGridAction();
        put(a.getRequestName(), a);
        a = new ConciliacaoFornecedorGridAction();
        put(a.getRequestName(), a);
        a = new ParcelaConciliacaoFornecedorGridAction();
        put(a.getRequestName(), a);
        a = new ContabilLancamentoCabecalhoGridAction();
        put(a.getRequestName(), a);
        a = new ContabilLancamentoCabecalhoDetalheAction();
        put(a.getRequestName(), a);
        a = new ContabilLancamentoDetalheGridAction();
        put(a.getRequestName(), a);
        a = new ComposicaoSaldoGridAction();
        put(a.getRequestName(), a);



        a = new RegistroCartorioGridAction();
        put(a.getRequestName(), a);
        a = new RegistroCartorioDetalheAction();
        put(a.getRequestName(), a);
        a = new ContabilParametrosGridAction();
        put(a.getRequestName(), a);
        a = new ContabilParametrosDetalheAction();
        put(a.getRequestName(), a);
        a = new ContabilIndiceGridAction();
        put(a.getRequestName(), a);
        a = new ContabilIndiceDetalheAction();
        put(a.getRequestName(), a);
        a = new ContabilIndiceValorGridAction();
        put(a.getRequestName(), a);
        a = new ContabilHistoricoGridAction();
        put(a.getRequestName(), a);
        a = new ContabilHistoricoDetalheAction();
        put(a.getRequestName(), a);
        a = new AidfAimdfGridAction();
        put(a.getRequestName(), a);
        a = new AidfAimdfDetalheAction();
        put(a.getRequestName(), a);
        a = new FapGridAction();
        put(a.getRequestName(), a);
        a = new FapDetalheAction();
        put(a.getRequestName(), a);
        a = new PlanoContaGridAction();
        put(a.getRequestName(), a);
        a = new PlanoContaDetalheAction();
        put(a.getRequestName(), a);
        a = new PlanoContaRefSpedGridAction();
        put(a.getRequestName(), a);
        a = new PlanoContaRefSpedDetalheAction();
        put(a.getRequestName(), a);
        a = new ContabilContaGridAction();
        put(a.getRequestName(), a);
        a = new ContabilContaDetalheAction();
        put(a.getRequestName(), a);
        a = new ContabilFechamentoGridAction();
        put(a.getRequestName(), a);
        a = new ContabilFechamentoDetalheAction();
        put(a.getRequestName(), a);
        a = new ContabilLancamentoPadraoGridAction();
        put(a.getRequestName(), a);
        a = new ContabilLancamentoPadraoDetalheAction();
        put(a.getRequestName(), a);
        a = new ContabilLoteGridAction();
        put(a.getRequestName(), a);
        a = new ContabilLoteDetalheAction();
        put(a.getRequestName(), a);
        a = new ContabilLancamentoOrcadoGridAction();
        put(a.getRequestName(), a);
        a = new ContabilLancamentoOrcadoDetalheAction();
        put(a.getRequestName(), a);
        a = new ContabilLancamentoCabecalhoGridAction();
        put(a.getRequestName(), a);
        a = new ContabilLancamentoCabecalhoDetalheAction();
        put(a.getRequestName(), a);
        a = new ContabilLancamentoDetalheGridAction();
        put(a.getRequestName(), a);
        a = new ContabilDreCabecalhoGridAction();
        put(a.getRequestName(), a);
        a = new ContabilDreCabecalhoDetalheAction();
        put(a.getRequestName(), a);
        a = new ContabilDreDetalheGridAction();
        put(a.getRequestName(), a);
        a = new ContabilEncerramentoExeCabGridAction();
        put(a.getRequestName(), a);
        a = new ContabilEncerramentoExeCabDetalheAction();
        put(a.getRequestName(), a);
        a = new ContabilEncerramentoExeDetGridAction();
        put(a.getRequestName(), a);
        a = new ContabilLivroGridAction();
        put(a.getRequestName(), a);
        a = new ContabilLivroDetalheAction();
        put(a.getRequestName(), a);
        a = new ContabilTermoGridAction();
        put(a.getRequestName(), a);
        a = new DfcGridAction();
        put(a.getRequestName(), a);
        a = new BalancoPatrimonialGridAction();
        put(a.getRequestName(), a);
        a = new LivroContabilGridAction();
        put(a.getRequestName(), a);




        /*actions do módulo orçamentos */
        a = new OrcamentoPeriodoGridAction();
        put(a.getRequestName(), a);
        a = new OrcamentoFluxoCaixaPeriodoGridAction();
        put(a.getRequestName(), a);
        a = new OrcamentoFluxoCaixaGridAction();
        put(a.getRequestName(), a);
        a = new OrcamentoFluxoCaixaDetalheAction();
        put(a.getRequestName(), a);
        a = new OrcamentoFluxoCaixaDetalheGridAction();
        put(a.getRequestName(), a);
        a = new OrcamentoEmpresarialGridAction();
        put(a.getRequestName(), a);
        a = new OrcamentoEmpresarialDetalheAction();
        put(a.getRequestName(), a);
        a = new OrcamentoDetalheGridAction();
        put(a.getRequestName(), a);

        /*actions do módulo sintegra */
        a = new GeraSintegraAction();
        put(a.getRequestName(), a);


        /*actions do módulo escrita Fiscal */
        a = new FiscalParametrosGridAction();
        put(a.getRequestName(), a);
        a = new FiscalParametrosDetalheAction();
        put(a.getRequestName(), a);
        a = new SimplesNacionalCabecalhoGridAction();
        put(a.getRequestName(), a);
        a = new SimplesNacionalCabecalhoDetalheAction();
        put(a.getRequestName(), a);
        a = new SimplesNacionalDetalheGridAction();
        put(a.getRequestName(), a);
        a = new FiscalLivroDetalheAction();
        put(a.getRequestName(), a);
        a = new FiscalLivroDetalheAction();
        put(a.getRequestName(), a);
        a = new FiscalTermoGridAction();
        put(a.getRequestName(), a);
        a = new FiscalApuracaoIcmsAction();
        put(a.getRequestName(), a);



    }
}
