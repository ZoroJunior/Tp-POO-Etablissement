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
public class Contact {
    private String code;
    private String nom;
    private Date date_de_naissance;
    private String address;
    private String email;
    private String tel_number;
    
    public Contact (String code, String nom, Date date_de_naissance,String address, String email,String tel_number){
        this.code = code;
        this.nom = nom;
        this.date_de_naissance = date_de_naissance ;
        this.address = address ;
        this.email = email;
        this.tel_number = tel_number;
    }
    
    public String getCode(){
        return code;
    }
    
    public void setCode(String code){
        this.code = code ;
        
    }
    
    public String getNom(){
        return nom ;
    }
    
    public void setNom(String nom){
        this.nom = nom ;
    }
    
    public Date getDate_de_naissance(){
        return date_de_naissance;
        
    }
    
    public void setDate_de_naissance(Date date_de_naissance){
        this.date_de_naissance = date_de_naissance;
    }
    
    public String getAddress(){
        return address ;
        
        
    }
    public void setAdress(String address){
        this.address = address ;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email ;
    }
    
    public String getTel_number(){
        return tel_number;
    }
    
    public void setTel_number(String tel_number){
        this.tel_number = tel_number;
    }
    
    
    
    
    
    
}
