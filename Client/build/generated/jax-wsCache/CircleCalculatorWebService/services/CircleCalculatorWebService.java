
package services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CircleCalculatorWebService", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CircleCalculatorWebService {


    /**
     * 
     * @param radius
     * @return
     *     returns double
     */
    @WebMethod(operationName = "AreaofaCircle")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AreaofaCircle", targetNamespace = "http://services/", className = "services.AreaofaCircle")
    @ResponseWrapper(localName = "AreaofaCircleResponse", targetNamespace = "http://services/", className = "services.AreaofaCircleResponse")
    @Action(input = "http://services/CircleCalculatorWebService/AreaofaCircleRequest", output = "http://services/CircleCalculatorWebService/AreaofaCircleResponse")
    public double areaofaCircle(
        @WebParam(name = "radius", targetNamespace = "")
        double radius);

    /**
     * 
     * @param radius
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Circumference")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Circumference", targetNamespace = "http://services/", className = "services.Circumference")
    @ResponseWrapper(localName = "CircumferenceResponse", targetNamespace = "http://services/", className = "services.CircumferenceResponse")
    @Action(input = "http://services/CircleCalculatorWebService/CircumferenceRequest", output = "http://services/CircleCalculatorWebService/CircumferenceResponse")
    public double circumference(
        @WebParam(name = "radius", targetNamespace = "")
        double radius);

}
