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
public class JalurPengadilan extends Layanan{
    private String jenisPeradilan;
    
    public JalurPengadilan(String jenisBantuan, String kasus, String jenisPeradilan){
        super(jenisBantuan,kasus);
        this.jenisPeradilan = jenisPeradilan;
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
                case "Pidana": System.out.println("50.000.000");
                               break;
                case "Perdata Umum": System.out.println("20.000.000");
                               break;
                case "Ketenagakerjaan": System.out.println("35.000.000");   
                                        break;
                default: System.out.println("Harga ditentukan oleh Lawyer");
            }
        }
    }
    
    public String getJenisPengadilan(){
        return jenisPeradilan;
    }
}
