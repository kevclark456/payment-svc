package com.sun.mdm.index.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.5
 * 2016-06-27T20:34:27.504-07:00
 * Generated source version: 3.0.5
 * 
 */
@WebServiceClient(name = "PersonEJBService", 
                  wsdlLocation = "file:/home/kevclark/ENABLEMENT/fuse-for-practitioners-labs/usecase1/core/artifacts/src/main/resources/META-INF/wsdl/EMPI_18080_2.wsdl",
                  targetNamespace = "http://webservice.index.mdm.sun.com/") 
public class PersonEJBService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservice.index.mdm.sun.com/", "PersonEJBService");
    public final static QName PersonEJBPort = new QName("http://webservice.index.mdm.sun.com/", "PersonEJBPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/kevclark/ENABLEMENT/fuse-for-practitioners-labs/usecase1/core/artifacts/src/main/resources/META-INF/wsdl/EMPI_18080_2.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PersonEJBService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/kevclark/ENABLEMENT/fuse-for-practitioners-labs/usecase1/core/artifacts/src/main/resources/META-INF/wsdl/EMPI_18080_2.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PersonEJBService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PersonEJBService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonEJBService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PersonEJBService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PersonEJBService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public PersonEJBService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns PersonEJB
     */
    @WebEndpoint(name = "PersonEJBPort")
    public PersonEJB getPersonEJBPort() {
        return super.getPort(PersonEJBPort, PersonEJB.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonEJB
     */
    @WebEndpoint(name = "PersonEJBPort")
    public PersonEJB getPersonEJBPort(WebServiceFeature... features) {
        return super.getPort(PersonEJBPort, PersonEJB.class, features);
    }

}
