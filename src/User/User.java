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
public abstract class User {
    public String id;
    public String name;
    public String dob;
    
    public User(String id, String name, String dob){
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }           
    
    public abstract void showUser();    
}
