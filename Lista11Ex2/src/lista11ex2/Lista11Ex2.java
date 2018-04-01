/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista11ex2;

/**
 *
 * @author JotaWind
 */
public class Lista11Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreadConta t1 = new ThreadConta(10);
        t1.start();
        ThreadConta t2 = new ThreadConta(20);        
        t2.start();
    }
    
}
