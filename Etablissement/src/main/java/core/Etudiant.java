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
public class Etudiant extends Contact {
    private String cycle ;
    private int niveau ;

    public Etudiant(String code, String nom, Date date_de_naissance, String address, String email, String tel_number , String cycle , int niveau) {
        super(code, nom, date_de_naissance, address, email, tel_number);
        this.cycle = cycle ;
        this.niveau = niveau ;
    }
    
    public String getCycle(){
        return cycle ;
    }
    
    public void setCycle(String cycle){
        this.cycle = cycle ;
    }
    
    public int getNiveau(){
        return niveau ;
    }
    
    public void setNiveau(int niveau){
        this.niveau = niveau ;
    }
        
}
