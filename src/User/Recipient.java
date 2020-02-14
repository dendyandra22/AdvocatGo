/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Layanan.Layanan;

/**
 *
 * @author Dendy
 */
public class Recipient extends User{
    public String uname;
    public String pass;
    private Layanan layanan;
    
    public Recipient(String id, String name, String dob, String uname, String pass){        
        super(id,name,dob);
        this.uname = uname;
        this.pass = pass;       
    }
        
    public void setLayanan(Layanan l){
        this.layanan = l;
    }
    /**
     * @return the uname
     */
    public String getUname() {
        return uname;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }
    
    public Layanan getLayanan(){
        return layanan;
    }
    
    @Override
    public void showUser(){
        System.out.println("Name : "+getName());
        System.out.println("ID : "+getId());
        System.out.println("DOB : "+getDob());
        System.out.println("Username : "+getUname());
        System.out.println("Password : "+getPass());
    }
}
