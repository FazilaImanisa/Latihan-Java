/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
public class Perulangan {
    public static void main(String[] args) {
        //soal 1
        int a=17;
        int b=3;
        int n=14;
        int u=a;
        int s=a;
        int total = 0;
        System.out.println("Deret Aritmatika :");
        for (int i=2; i<= n; i++) {
            u = a + (2-1) * b;
            a += b;
            s=s+u;
            System.out.println("suku ke-"+i+" = "+u);
            total += u;        
        }
        s=s-u;
        System.out.println("Jumlah nilai deret aritmatika = "+total);
        System.out.println("==============================================");
        
        //soal 2
        System.out.println("Matriks 5x4");
        for (int i=0;i<5;i++){
            for (int j=0;j<4;j++){
                System.out.print(u+"\t");
                u = a + (2-1) * b;
                a += b;
                s=s+u;
            }
            s=s-u;
            System.out.println();
        }
        System.out.println("==============================================");
        
        //soal 3
        System.out.println("Matriks Segitiga ke Bawah : ");
        for (int i=0; i<3; i++){
            for (int j=0; j<1+i; j++){
                System.out.print(u+"\t");
                u = a + (2-1) * b;
                a += b;
                s=s+u;
            }
            s=s-u;
            System.out.println();
        }
        System.out.println("==============================================");
        
        System.out.println("Matriks Segitiga ke Atas : ");
        for (int i=0; i<3; i++){
            for (int j=0; j<3-i; j++){
                System.out.print(u+"\t");
                u = a + (2-1) * b;
                a += b;
                s=s+u;
            }
            s=s-u;
            System.out.println();
        }
        System.out.println("==============================================");
        
        //soal 4
        System.out.println("Matriks Segitiga Model A");
        for (int i=0; i<3; i++){
            for (int j=0; j<i; j++){
                System.out.print(u+"\t");
                u = a + (2-1) * b;
                a += b;
                s=s+u;
            }
            s=s-u;
            System.out.println();
            }
        for (int i=0; i<1; i++){
            for (int j=0; j<1-0;j++){
                System.out.print(u+"\t");
                u = a + (2-1) * b;
                a += b;
                s=s+u;
            }
            s=s-u;
            System.out.println();
            }
        System.out.println("==============================================");
        
        System.out.println("Matriks Segitiga Model B");
        for (int i=0; i<4; i++){
            for (int j=0; j<4-i; j++){
                System.out.print(u+"\t");
                u = a + (2-1) * b;
                a += b;
                s=s+u;
            }
            s=s-u;
            System.out.println();
            }
        for (int i=0; i<3; i++){
            for (int j=0; j<2+i; j++){
                System.out.print(u+"\t");
                u = a + (2-1) * b;
                a += b;
                s=s+u;
            }
            s=s-u;
            System.out.println();
            }
        }
}
            
        
  

        
        
    

