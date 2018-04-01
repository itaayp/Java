package lista11ex2;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JotaWind
 */
public class ThreadConta extends Thread {

    private int numeroMax;

    public ThreadConta(int numero) {
        this.numeroMax = numero;
    }

    public void run() {
        for (int i = 0; i < this.numeroMax; i++) {
            System.out.println("Nome: " + getName() + " - " + (i+1) );
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadConta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
