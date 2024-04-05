/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Repertoire {

    private List<Contact> liste_contacts = new ArrayList<>();
    
    public Repertoire(List<Contact> liste_contacts){
        this.liste_contacts = liste_contacts;
        
    }
    
    public List<Contact> getListe_contacts(){
        return liste_contacts ;
    }
    
    public void setListe_contacts(List<Contact> liste_contacts){
        this.liste_contacts = liste_contacts;
    }
    
    
    public void ajouterContact(Contact c) {
        liste_contacts.add(c);
    }

    public void supprimerContact(Contact c) {
        int t = liste_contacts.size();
        int s = 0;
        for (int j = 0; j < t; j++) {
            if (c == liste_contacts.get(j)) {
                s = j;
                
            }
        }
        liste_contacts.remove(s);
    }
    
    public void modifierContact (Contact c1, Contact new_c1){
        int t = liste_contacts.size();
        int s = 0;
        for (int j = 0; j < t; j++) {
            if (c1 == liste_contacts.get(j)) {
                s = j;
                
            }
        }
        liste_contacts.remove(s);
        liste_contacts.add(s, new_c1);
        
        
    }
    
    public Contact rechercherContact(Contact c){
        int t = liste_contacts.size();
        int s = 0;
        for (int j = 0; j < t; j++) {
            if (c == liste_contacts.get(j)) {
                s = j;
                
            }
        }
        return liste_contacts.get(s);
    }
    
}
