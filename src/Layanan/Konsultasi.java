/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layanan;

/**
 *
 * @author Dendy
 */
public class Konsultasi extends Layanan{
    private String alamat;
    
    public Konsultasi(String jenisBantuan, String kasus, String alamat){
        super(jenisBantuan,kasus);
        this.alamat = alamat;
    }
    
    @Override
    public void tarif(){
        String jenisBantuan = getJenisBantuan();
        String kasus = getKasus();
        if(jenisBantuan.equalsIgnoreCase("Tidak Mampu")){
            switch(kasus){
                case "Pidana": System.out.println("Gratis");
                                break;
                case "Perdata Umum": System.out.println("Gratis");
                                break;
                case "Ketenagakerjaan": System.out.println("Gratis");    
                                        break;
            }
        }
        else if(jenisBantuan.equalsIgnoreCase("LBH")){
            switch(kasus){
                case "Pidana": System.out.println("12.000.000");
                               break;
                case "Perdata Umum": System.out.println("19.000.000");
                               break;
                case "Ketenagakerjaan": System.out.println("10.000.000");   
                                        break;
                default: System.out.println("Harga ditentukan oleh Lawyer");
            }
        }
    }
    
    public String getAlamat(){
        return alamat;
    }
}
