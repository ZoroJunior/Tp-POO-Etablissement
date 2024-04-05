/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Agent extends Contact {
    float salaire;
    String statut;
    String categorie;
    String indice_salaire;
    String occupation;

    public Agent(String code, String nom, Date date_de_naissance, String address, String email, String tel_number , float salaire , String statut , String categorie , String indice_salaire , String occupation ) {
        super(code, nom, date_de_naissance, address, email, tel_number);
        this.salaire = salaire ;
        this.statut = statut ;
        this.categorie = categorie ;
        this.indice_salaire = indice_salaire ;
        this.occupation = occupation ;
    }
    
    public float getSalaire(){
        return salaire ;
    }
    
    public void setSalaire(){
        this.salaire = salaire ;
    }
    
    public String getStatut(){
        return statut ;
    }
    
    public void setStatut(String statut){
        this.statut = statut ;
    }
    
    public String getCategorie(){
        return categorie ;
    }
    
    public void setCategorie(String categorie){
        this.categorie = categorie ;
    }
    
    public String getIndice_salaire(){
        return indice_salaire ;
    }
    
    public void setIndice_salaire(String indice_salaire){
        this.indice_salaire = indice_salaire ;
    }
    
    public String getOccupation(){
        return occupation ;
    }
    
    public void setOccupation(String occupation){
        this.occupation = occupation ;
    }
}   

