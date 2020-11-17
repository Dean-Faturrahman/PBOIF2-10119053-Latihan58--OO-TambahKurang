/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dean
 */
public class SelisihBilangan extends Bilangan{
    public void  tampilSelisih(){
        int hasil = super.getX()-super.getY();
        System.out.println("Hasil Selisih " + super.getX() + " - " + super.getY() + " = " + hasil);
    }
    
}
