/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tes;

import Layanan.JalurPengadilan;
import Layanan.Konsultasi;
import Layanan.Layanan;
import User.Lawyer;
import User.Recipient;
import User.User;

/**
 *
 * @author Dendy
 */
public class Main {
    public static void main(String[] args) {
        Recipient u1 = new Recipient("123","Poi","01-11-1800","poipoi","123456"); 
        Lawyer l1 = new Lawyer("XP01","Asep","09-09-1990","Pidana","hiyahiya");
        Layanan k1  = new JalurPengadilan("LBH","Perdata Umum","Bandung");
        k1.setlawyer(l1);        
        u1.setLayanan(k1);
        u1.showUser();
        System.out.println(u1.getLayanan().getLawyer().name);
        u1.getLayanan().tarif();
    }
}
