/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scanerip;
/*
BUENO INGENIERO NO FUE NADA FACIL REALIZAR ESTA PRACTICA, PERO AL FIN SE REALIZO.... BIEN
*/
/**
 *
 * @author MENDEZ
 */
public class ScanerIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fromEcanner princicpal = new fromEcanner();
        princicpal.setTitle("ESCANNER DE IP'S");
        princicpal.layout();
        princicpal.setVisible(true);
    }
}
