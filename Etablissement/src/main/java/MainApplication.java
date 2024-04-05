
import core.Contact;
import core.Repertoire;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class MainApplication {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        List<Contact> list = new ArrayList<>();
        Repertoire repertoire = new Repertoire(list);
        String str = "04-02-2003";
        String str1 = "11-01-1998";
        Date date = new SimpleDateFormat("dd-MM-YYYY").parse(str);
        Date date1 = new SimpleDateFormat("dd-MM-YYYY").parse(str1);
        Contact Antoine = new Contact("ant","ESSOMBA",date,"Yaounde","esso87945@gmail.com","696212562");
        Contact Herve = new Contact("herv","ESSOMBA",date1,"Yaounde","esso87945@gmail.com","699255289");
        repertoire.ajouterContact(Herve);
        repertoire.ajouterContact(Antoine);
        System.out.println(repertoire.getListe_contacts());
        System.out.println(repertoire.rechercherContact(Herve).getDate_de_naissance().toLocaleString());
        repertoire.supprimerContact(Antoine);
        System.out.println(repertoire.getListe_contacts());
        
    }
    
}
