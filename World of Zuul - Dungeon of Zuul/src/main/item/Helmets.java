/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.item;

/**
 *
 * @author Nicolai
 */
public class Helmets extends Armor {

    private String helmetName;

    public Helmets(String description, int uniqueID, String n, int a) {
	super(description, uniqueID, a);
	helmetName = n;
    }

    public String getHelmetName() {
	return helmetName;
    }
}