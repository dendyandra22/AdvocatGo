/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layanan;

import User.Lawyer;

/**
 *
 * @author Dendy
 */
public abstract class Layanan {
    private String jenisBantuan;
    private String kasus;
    private Lawyer lawyer;
    
    
    public Layanan(String jenisBantuan, String kasus){
        this.jenisBantuan = jenisBantuan;
        this.kasus = kasus;        
    }

    /**
     * @return the jenisBantuan
     */
    public String getJenisBantuan() {
        return jenisBantuan;
    }

    /**
     * @return the kasus
     */
    public String getKasus() {
        return kasus;
    }
    
    public void setlawyer(Lawyer l){
        this.lawyer = l;
    }
    
    public Lawyer getLawyer(){
        return lawyer;
    }
    
    public abstract void tarif();
    
}
