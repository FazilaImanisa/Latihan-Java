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
public class loop {
    public static void main(String[] args) {
	    // soal nomor 1
        int a=17;
        int b=3;
        int n=14;
        int u=a;
        int s=a;

        System.out.println("Deret aritmatikanya adalah : ");
        for (int i=0;i<n;i++){
            System.out.println(u);
            u=u+b;
            s=s+u;
        }
        s=s-u;
        System.out.println("Jumlah aritmatika : "+s);
        System.out.println("==============================================");
        
            //soal nomor 2 matriks 3 x 4
        System.out.println("Matriks 5x4");
        for (int i=0;i<5;i++){
            for (int j=0;j<4;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            s=s-u;
            System.out.println();
        }
        System.out.println("==============================================");
        //soal nomor 3
        System.out.println("Matriks segitiga siku ke bawah");
        for (int i=0;i<3;i++){
            for (int j=0;j<1+i;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            s=s-u;
            System.out.println(" ");
        }
        System.out.println("==============================================");
        //soal nomor 4
        System.out.println("matriks segitiga model 1");
        for (int i=0;i<5;i++){
            for (int j=0;j<i;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            System.out.println(" ");
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3-i;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            System.out.println(" ");
        }
        System.out.println("==============================================");
        //soal nomor 4
        System.out.println("matriks segitiga model 2");
        for (int i=0;i<4;i++){
            for (int j=0;j<4-i;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            System.out.println(" ");
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<2+i;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            System.out.println(" ");
        }
    }
}
