/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttebakangka2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class AngkaTebak {
    int bilangan;
    int tebakan;
    int score=100;
    int kesempatan=0;
    
    void acak(){
        this.bilangan = (int)(Math.random()*101);
    }
    void tebakanmu(){
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Masukkan angka yang kamu tebak: ");
            this.tebakan = input.nextInt();
            if(tebakan > bilangan){
                System.out.println("Huhuhu.. Tebakanmu terlalu besar");
                kesempatan += 1;
                score -= 2;
            }else if (tebakan < bilangan){
                System.out.println("Yahh.. Tebakanmu terlalu kecil");
                kesempatan += 1;
                score -= 2;
            }else{
                System.out.println("Hurray!!Tebakanmu BENAR");
                if(kesempatan <= 5){
                    score += 50;
                    System.out.println("<Bonus: 50 poin>");
                }
                System.out.println("============================================");
                System.out.println("Total Score: "+score);
                System.out.println("Anda menebak sebanyak: "+kesempatan+"kali");
                break;
            }
            if (score == 0){
                System.out.println("ANDA GAGAL");
                break;
            }
        }while (tebakan != bilangan);
    }
}
