package model;

/**
 * @author stephaniesink - sisink
 * CIS175 - Spring 2022
 * Jan 24, 2023
 */
public class TicketBusinessLogic {
	
	public double calculateTicketPrice(Ticket ticket) {
		final double TAX = 0.075;
		double ticketPrice = ticket.getPrice() * TAX + ticket.getPrice();
		return ticketPrice;
	}
	
	public String determineSection(Ticket ticket) {
		String section = "";
		
		if(ticket.getPrice() > 1000) {
			section = "First Class";
		} else {
			section = "Coach";
		}
		return section;
	}
	
	public boolean isRich(Ticket ticket) {
		
		if(ticket.getSeat() == "First Class") {
			return true;
		} else {
			return false;
		}
	}

}
