/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WS1;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author APH
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Cadena")
    public String Cadena(@WebParam(name = "uno") String uno) {
        //TODO write your implementation code here:
       
    return uno+", "+uno+", "+uno+", "+uno;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Contador")
    public Integer Contador(@WebParam(name = "Dos") Integer Dos) {
        //TODO write your implementation code here:
                Integer x= Dos;
        Integer y= 0;
        for (int i = 0; x < 10; i++) {
            System.out.println("x:"+1);
            y = y + x;
        }
        
        return y;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListaCadenas")
    public List ListaCadenas(@WebParam(name = "Uno") String Uno, @WebParam(name = "Dos") String Dos, @WebParam(name = "Tres") String Tres) {
        //TODO write your implementation code here:
        List u =null;
        
        u.add(Uno);
        u.add(Dos);
        u.add(Tres);
        
        return u;
    }
}
