


/*public class TestFinally{
    
 

    public static void main(String[] args) {
     
            System.out.println("entrer votre code ");
            // traiter cette exception 
          int x =   System.in.read();

     

        // afficher toujours le message "Merci de votre visite"
     
    }

}*/

import java.io.IOException;

public class TestFinally {

    public static void main(String[] args) {
        try {
            System.out.println("Entrer votre code : ");
            int x = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Merci de votre visite");
        }
    }
}



