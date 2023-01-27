package model;

/**
 * @author stephaniesink - sisink
 * CIS175 - Spring 2022
 * Jan 24, 2023
 */
public class Ticket {
	private String name; 
	private String seat;
	private double price;
	
	//default no-arg constructor
	public Ticket() {
		super();
	}
	
	//parameterized constructor
	public Ticket(String name, String seat, double price) {
		super();
		this.name = name;
		this.seat = seat;
		this.price = price;
	}


	//getters and setters 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
