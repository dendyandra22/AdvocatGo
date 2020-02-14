/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author Dendy
 */
public class Lawyer extends User {
    public String spec;
    public String biodata;
    
    public Lawyer(String id, String name, String dob, String spec, String biodata){
        super(id,name,dob);
        this.biodata = biodata;
        this.spec = spec;        
    }    

    /**
     * @return the spec
     */
    public String getSpec() {
        return spec;
    }

    /**
     * @return the biodata
     */
    public String getBiodata() {
        return biodata;
    }
    
    @Override
    public void showUser(){
        System.out.println("Name : "+getName());
        System.out.println("ID : "+getId());
        System.out.println("DOB : "+getDob());
        System.out.println("Spesialisasi : "+getSpec());
        System.out.println("Biodata : "+getBiodata());
    }
}
