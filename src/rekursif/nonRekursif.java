/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekursif;

/**
 *
 * @author Jesslyn
 */
public class nonRekursif {

    static int Faktorial(int a){
        int hasil = 1;
        for (int i=a; i>0; i--){
            hasil *=i;
        }
        return hasil;
    }
    public static void main(String[] args) {
    long startTime = System.nanoTime();
    for (int i = 1; i <= 10; i++) {
        Faktorial(i);
    }
    long endTime = System.nanoTime();
    long time = endTime - startTime;
    System.out.print("looping 1 - 10 faktorial : ");
    System.out.println("Waktu : "+(time));
    
    long startTime1 = System.nanoTime();
    for (int i = 1; i <= 50; i++) {
        Faktorial(i);
    }
    long endTime1 = System.nanoTime();
    long time1 = endTime1 - startTime1;
    System.out.print("looping 1 - 50 faktorial : ");
    System.out.println("Waktu : "+(time1));
    
    long startTime2 = System.nanoTime();
    for (int i = 1; i <= 100; i++) {
        Faktorial(i);
    }
    long endTime2 = System.nanoTime();
    long time2 = endTime2 - startTime2;
    System.out.print("looping 1 - 100 faktorial : ");
    System.out.println("Waktu : "+(time2));
    }
    
}
