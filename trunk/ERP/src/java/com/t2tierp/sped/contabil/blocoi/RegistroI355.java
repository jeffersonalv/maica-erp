package com.t2tierp.sped.contabil.blocoi;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>Title: T2Ti ERP</p>
 * <p>Description: Classe que representa o registro I355x do sped contabil.</p>
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
 * @author Claudio de Barros (T2Ti.COM)
 * @version 1.0
 */
public class RegistroI355 implements Serializable {

    private static final long serialVersionUID = 1L;
    private String codCta; /// Código da conta analítica de resultado.
    private String codCcus; /// Código do centro de custos.
    private BigDecimal vlCta; /// Valor do saldo final antes do lançamento de encerramento.
    private String indDc; /// Indicador da situação do saldo final

    /**
     * @return the codCta
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * @param codCta the codCta to set
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    /**
     * @return the codCcus
     */
    public String getCodCcus() {
        return codCcus;
    }

    /**
     * @param codCcus the codCcus to set
     */
    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }

    /**
     * @return the vlCta
     */
    public BigDecimal getVlCta() {
        return vlCta;
    }

    /**
     * @param vlCta the vlCta to set
     */
    public void setVlCta(BigDecimal vlCta) {
        this.vlCta = vlCta;
    }

    /**
     * @return the indDc
     */
    public String getIndDc() {
        return indDc;
    }

    /**
     * @param indDc the indDc to set
     */
    public void setIndDc(String indDc) {
        this.indDc = indDc;
    }
}
