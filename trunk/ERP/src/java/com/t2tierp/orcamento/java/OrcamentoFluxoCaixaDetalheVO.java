package com.t2tierp.orcamento.java;

import com.t2tierp.contabilidade.java.NaturezaFinanceiraVO;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.openswing.swing.message.receive.java.ValueObjectImpl;


/**
* <p>Title: T2Ti ERP</p>
* <p>Description:  VO relacionado a tabela [ORCAMENTO_FLUXO_CAIXA_DETALHE]</p>
*
* <p>The MIT License</p>
*
* <p>Copyright: Copyright (C) 2010 T2Ti.COM
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
*        The author may be contacted at:
*            t2ti.com@gmail.com</p>
*
* @author Claudio de Barros (t2ti.com@gmail.com)
* @version 1.0
*/
@Entity
@Table(name = "ORCAMENTO_FLUXO_CAIXA_DETALHE")
public class OrcamentoFluxoCaixaDetalheVO extends ValueObjectImpl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "PERIODO")
    private String periodo;
    @Column(name = "VALOR_ORCADO")
    private BigDecimal valorOrcado;
    @Column(name = "VALOR_REALIZADO")
    private BigDecimal valorRealizado;
    @Column(name = "TAXA_VARIACAO")
    private BigDecimal taxaVariacao;
    @Column(name = "VALOR_VARIACAO")
    private BigDecimal valorVariacao;
    @JoinColumn(name = "ID_ORCAMENTO_FLUXO_CAIXA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private OrcamentoFluxoCaixaVO orcamentoFluxoCaixa;
    @JoinColumn(name = "ID_NATUREZA_FINANCEIRA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NaturezaFinanceiraVO naturezaFinanceira;

    public OrcamentoFluxoCaixaDetalheVO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public BigDecimal getValorOrcado() {
        return valorOrcado;
    }

    public void setValorOrcado(BigDecimal valorOrcado) {
        this.valorOrcado = valorOrcado;
    }

    public BigDecimal getValorRealizado() {
        return valorRealizado;
    }

    public void setValorRealizado(BigDecimal valorRealizado) {
        this.valorRealizado = valorRealizado;
    }

    public BigDecimal getTaxaVariacao() {
        return taxaVariacao;
    }

    public void setTaxaVariacao(BigDecimal taxaVariacao) {
        this.taxaVariacao = taxaVariacao;
    }

    public BigDecimal getValorVariacao() {
        return valorVariacao;
    }

    public void setValorVariacao(BigDecimal valorVariacao) {
        this.valorVariacao = valorVariacao;
    }

    public OrcamentoFluxoCaixaVO getOrcamentoFluxoCaixa() {
        return orcamentoFluxoCaixa;
    }

    public void setOrcamentoFluxoCaixa(OrcamentoFluxoCaixaVO orcamentoFluxoCaixa) {
        this.orcamentoFluxoCaixa = orcamentoFluxoCaixa;
    }

    public NaturezaFinanceiraVO getNaturezaFinanceira() {
        return naturezaFinanceira;
    }

    public void setNaturezaFinanceira(NaturezaFinanceiraVO naturezaFinanceira) {
        this.naturezaFinanceira = naturezaFinanceira;
    }


    @Override
    public String toString() {
        return "com.t2tierp.orcamento.java.OrcamentoFluxoCaixaDetalheVO[id=" + id + "]";
    }

}
