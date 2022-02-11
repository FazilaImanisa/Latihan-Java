/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fazila
 */
public class Modul2 {
    
    public static void main(String[] args) {
        String nama, nama_panggilan, smp_asal;
        int usia;
        
        nama = "Fazila Imanisa";
        nama_panggilan = "Zila";
        smp_asal = "SMPN 3 Tangerang";
        usia = 16;
        
        System.out.println("nama :" +nama);
        System.out.println("nama panggilan : " +nama_panggilan);
        System.out.println("SMP Asal :" +smp_asal);
        System.out.println("usia :" +usia + " tahun");
        int suhu=36;
        if (suhu<37){
            System.out.println("Saya Sehat, Saya Kuat, dan Saya Bermanfaat!!!");
            }else{ 
            System.out.println("Istirahat yang cukup dan jagalah kesehatan!");
        }
    }
}