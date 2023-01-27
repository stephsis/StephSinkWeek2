package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Ticket;
import model.TicketBusinessLogic;

/**
 * @author stephaniesink - sisink
 * CIS175 - Spring 2022
 * Jan 24, 2023
 */
public class TestTicketLogic1 {
	TicketBusinessLogic ticketLogic = new TicketBusinessLogic();
	Ticket ticket = new Ticket();


	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testTicketPrice() {
		ticket.setPrice(599);
		double price = ticketLogic.calculateTicketPrice(ticket);
		assertEquals (643.925, price, 0.0);
	}
	
	@Test
	public void testDetermineSection() {
		ticket.setPrice(599);
		String section = ticketLogic.determineSection(ticket);
		assertEquals("Coach", section);
	}

}
