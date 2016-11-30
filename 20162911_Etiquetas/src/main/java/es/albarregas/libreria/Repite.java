/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.libreria;

import java.io.IOException;
import java.io.Writer;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Daw2
 */
public class Repite extends TagSupport {

    private char caracter;
    private int veces;

    public void setCaracter(char carcater) {
        this.caracter = carcater;
    }

    public void setVeces(int veces) {
        this.veces = veces;
    }

    @Override
    public int doStartTag() throws JspException {
        Writer out = pageContext.getOut();
        for (int i = 0; i < veces; i++) {
            try {
                out.write(caracter);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return Tag.EVAL_BODY_INCLUDE;
    }

    @Override
    public int doEndTag() throws JspException {
        Writer out = pageContext.getOut();
        for (int i = 0; i < veces; i++) {
            try {
                out.write(caracter);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return Tag.EVAL_PAGE;
    }

}
