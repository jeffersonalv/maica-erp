package com.t2tierp.contabilidade.java;

import com.erp.cadastros.java.vo.EmpresaVO;
import com.erp.cadastros.java.vo.IndiceEconomicoVO;
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
import org.openswing.swing.message.receive.java.ValueObjectImpl;


/**
* <p>Title: T2Ti ERP</p>
* <p>Description:  VO relacionado a tabela [CONTABIL_INDICE]</p>
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
@Table(name = "CONTABIL_INDICE")
public class ContabilIndiceVO extends ValueObjectImpl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "PERIODICIDADE")
    private String periodicidade;
    @Temporal(TemporalType.DATE)
    @Column(name = "DIARIO_A_PARTIR_DE")
    private Date diarioAPartirDe;
    @Column(name = "MENSAL_MES_ANO")
    private String mensalMesAno;
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private EmpresaVO empresa;
    @JoinColumn(name = "ID_INDICE_ECONOMICO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private IndiceEconomicoVO indiceEconomico;

    public ContabilIndiceVO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public Date getDiarioAPartirDe() {
        return diarioAPartirDe;
    }

    public void setDiarioAPartirDe(Date diarioAPartirDe) {
        this.diarioAPartirDe = diarioAPartirDe;
    }

    public String getMensalMesAno() {
        return mensalMesAno;
    }

    public void setMensalMesAno(String mensalMesAno) {
        this.mensalMesAno = mensalMesAno;
    }

    public EmpresaVO getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaVO empresa) {
        this.empresa = empresa;
    }

    public IndiceEconomicoVO getIndiceEconomico() {
        return indiceEconomico;
    }

    public void setIndiceEconomico(IndiceEconomicoVO indiceEconomico) {
        this.indiceEconomico = indiceEconomico;
    }


    @Override
    public String toString() {
        return "com.t2tierp.contabilidade.java.ContabilIndiceVO[id=" + id + "]";
    }

}
