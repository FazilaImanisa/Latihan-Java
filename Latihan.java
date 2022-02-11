/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author User
 */
public class Latihan {
    public static void main(String[] args) {
        int a[][]={{6,2},{4,9}};
        int b[][]={{1,6},{5,3}};
        int h[][]={{0,0},{0,0}};
        System.out.println("Hasil A X B :");
    //proses perhitungan
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            for(int k=0;k<2;k++){
                h[i][j]=h[i][j]+a[i][k]*b[k][j];
            }
        }
    }
    //menampilkan hasil
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            System.out.print(h[i][j]+"\t");
        }
        System.out.println();
    }
}
}
