package com.t2tierp.controleestoque.java;

import com.erp.cadastros.java.vo.EmpresaVO;
import com.erp.cadastros.java.vo.ProdutoSubGrupoVO;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.openswing.swing.message.receive.java.ValueObjectImpl;


/**
* <p>Title: T2Ti ERP</p>
* <p>Description:  VO relacionado a tabela [ESTOQUE_CONTAGEM_CABECALHO]</p>
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
@Table(name = "ESTOQUE_CONTAGEM_CABECALHO")
public class EstoqueContagemCabecalhoVO extends ValueObjectImpl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_CONTAGEM")
    private Date dataContagem;
    @Column(name = "ESTOQUE_ATUALIZADO")
    private String estoqueAtualizado;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private EmpresaVO empresa;
    @Transient
    private ProdutoSubGrupoVO produtoSubGrupo;

    public EstoqueContagemCabecalhoVO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataContagem() {
        return dataContagem;
    }

    public void setDataContagem(Date dataContagem) {
        this.dataContagem = dataContagem;
    }

    public String getEstoqueAtualizado() {
        return estoqueAtualizado;
    }

    public void setEstoqueAtualizado(String estoqueAtualizado) {
        this.estoqueAtualizado = estoqueAtualizado;
    }

    public EmpresaVO getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaVO empresa) {
        this.empresa = empresa;
    }


    @Override
    public String toString() {
        return "com.t2tierp.controleestoque.java.EstoqueContagemCabecalhoVO[id=" + id + "]";
    }

    /**
     * @return the produtoSubGrupo
     */
    public ProdutoSubGrupoVO getProdutoSubGrupo() {
        return produtoSubGrupo;
    }

    /**
     * @param produtoSubGrupo the produtoSubGrupo to set
     */
    public void setProdutoSubGrupo(ProdutoSubGrupoVO produtoSubGrupo) {
        this.produtoSubGrupo = produtoSubGrupo;
    }

}
