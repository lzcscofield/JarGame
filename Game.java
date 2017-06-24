/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jar;

/**
 *
 * @author Li
 */
public class Game {
    public static void main(String[] args) {
        Jar jar = new Jar();
        System.out.println("------------Guess Jar Game------------");
        jar.printName();
        jar.RandomGem();
        System.out.println("------------Let's Play----------------");
        jar.Guess();
        jar.Compare();
    }
    
}
