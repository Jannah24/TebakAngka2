/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttebakangka2;

/**
 *
 * @author HP
 */
public class ProjectTebakAngka2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Haii.. Nama saya Jannah, saya telah memilih "
                + "sebuah bilangan bulat secara acak antara 0 s/d 100."
                + "Silahkan tebak ya!!");
        System.out.println("---------------------------------------------------");
        System.out.println("Score awal pemain 100 poin");
        System.out.println("Setap tebakan yang salah, score akan berkurang 2 poin");
        System.out.println("Score minimal adalah 0");
        System.out.println("Jika bisa menebak angka secara benar dengan tidak lebih dari 5 tebakan, maka bonus score 50 poin");
        System.out.println("---------------------------------------------------");
        AngkaTebak AT = new AngkaTebak();
        AT.acak();
        AT.tebakanmu();
    }
    
}
