
package uddi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para suma complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="suma"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="a" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="b" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="c" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="d" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="e" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="f" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suma", propOrder = {
    "a",
    "b",
    "c",
    "d",
    "e",
    "f"
})
public class Suma {

    protected double a;
    protected double b;
    protected double c;
    protected double d;
    protected double e;
    protected double f;

    /**
     * Obtiene el valor de la propiedad a.
     * 
     */
    public double getA() {
        return a;
    }

    /**
     * Define el valor de la propiedad a.
     * 
     */
    public void setA(double value) {
        this.a = value;
    }

    /**
     * Obtiene el valor de la propiedad b.
     * 
     */
    public double getB() {
        return b;
    }

    /**
     * Define el valor de la propiedad b.
     * 
     */
    public void setB(double value) {
        this.b = value;
    }

    /**
     * Obtiene el valor de la propiedad c.
     * 
     */
    public double getC() {
        return c;
    }

    /**
     * Define el valor de la propiedad c.
     * 
     */
    public void setC(double value) {
        this.c = value;
    }

    /**
     * Obtiene el valor de la propiedad d.
     * 
     */
    public double getD() {
        return d;
    }

    /**
     * Define el valor de la propiedad d.
     * 
     */
    public void setD(double value) {
        this.d = value;
    }

    /**
     * Obtiene el valor de la propiedad e.
     * 
     */
    public double getE() {
        return e;
    }

    /**
     * Define el valor de la propiedad e.
     * 
     */
    public void setE(double value) {
        this.e = value;
    }

    /**
     * Obtiene el valor de la propiedad f.
     * 
     */
    public double getF() {
        return f;
    }

    /**
     * Define el valor de la propiedad f.
     * 
     */
    public void setF(double value) {
        this.f = value;
    }

}
