package edu.gatech.oad.antlab.person;
import java.util.Random;
/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string
 *
 * @author Scylla Snow
 * @version 1.1
 */
public class Person2 {
	/** Holds the persons real name */
	private String name;
	/**
	 * The constructor, takes in the persons
	 * name
	 * @param name the person's real name
	 */
	public Person2(String name) {
		this.name = name;
	}
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 * @throws IllegalArgumentException if input is null
	 */
	private String calc(String input) {
		//Person 2 put your implementation here
		Random rand = new Random();
		String output = "";
		int change;
		if (input == null) {
			throw new IllegalArgumentException("There was no input");
		} else if (input.length() == 1) {
			return input;
		}
		while (input.length() > 0) {
			change = rand.nextInt(input.length());
			output = output + input.charAt(change);
			input = input.substring(0, change) + input.substring(change + 1);
		}

		return output;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
		return "Original name: " + name + " \nRandom Name: " + calc(input);
	}
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name = name;
	}


}
