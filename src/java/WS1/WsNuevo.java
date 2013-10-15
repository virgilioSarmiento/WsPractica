/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WS1;

import java.util.List;

/**
 *
 * @author APH
 */
public class WsNuevo  implements NuevoInterface {

    @Override
    public String Cadena(String uno) {
    
    return uno+", "+uno+", "+uno+", "+uno;
       
        
    }

    @Override
    public Integer Contador(String dos) {
        
        Integer x= Integer.parseInt(dos);
        Integer y= 0;
        for (int i = 0; x < 10; i++) {
            System.out.println("x:"+1);
            y = y + x;
        }
        
        return y;
    }

    @Override
    public List ListaCadenas(String Uno, String Dos, String Tres) {
        List u =null;
        
        u.add(Uno);
        u.add(Dos);
        u.add(Tres);
        return u;
    }
    
    
    
}
