
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Circumference_QNAME = new QName("http://services/", "Circumference");
    private final static QName _CircumferenceResponse_QNAME = new QName("http://services/", "CircumferenceResponse");
    private final static QName _AreaofaCircle_QNAME = new QName("http://services/", "AreaofaCircle");
    private final static QName _AreaofaCircleResponse_QNAME = new QName("http://services/", "AreaofaCircleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Circumference }
     * 
     */
    public Circumference createCircumference() {
        return new Circumference();
    }

    /**
     * Create an instance of {@link CircumferenceResponse }
     * 
     */
    public CircumferenceResponse createCircumferenceResponse() {
        return new CircumferenceResponse();
    }

    /**
     * Create an instance of {@link AreaofaCircle }
     * 
     */
    public AreaofaCircle createAreaofaCircle() {
        return new AreaofaCircle();
    }

    /**
     * Create an instance of {@link AreaofaCircleResponse }
     * 
     */
    public AreaofaCircleResponse createAreaofaCircleResponse() {
        return new AreaofaCircleResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Circumference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "Circumference")
    public JAXBElement<Circumference> createCircumference(Circumference value) {
        return new JAXBElement<Circumference>(_Circumference_QNAME, Circumference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CircumferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "CircumferenceResponse")
    public JAXBElement<CircumferenceResponse> createCircumferenceResponse(CircumferenceResponse value) {
        return new JAXBElement<CircumferenceResponse>(_CircumferenceResponse_QNAME, CircumferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaofaCircle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "AreaofaCircle")
    public JAXBElement<AreaofaCircle> createAreaofaCircle(AreaofaCircle value) {
        return new JAXBElement<AreaofaCircle>(_AreaofaCircle_QNAME, AreaofaCircle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaofaCircleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "AreaofaCircleResponse")
    public JAXBElement<AreaofaCircleResponse> createAreaofaCircleResponse(AreaofaCircleResponse value) {
        return new JAXBElement<AreaofaCircleResponse>(_AreaofaCircleResponse_QNAME, AreaofaCircleResponse.class, null, value);
    }

}
