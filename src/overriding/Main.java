/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args){
        Tumbuhan melati = new Tumbuhan();
        Mawar Mawar =  new Mawar();
        Tumbuhan mawar2 = new Mawar();
        
        melati.duri();
        Mawar.duri();
        mawar2.duri();
        mawar2.duri();
    }
}
