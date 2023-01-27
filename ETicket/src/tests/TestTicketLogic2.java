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
public class TestTicketLogic2 {
	TicketBusinessLogic ticketLogic = new TicketBusinessLogic();
	Ticket ticket = new Ticket();

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testPassengerIsRich() {
		ticket.setSeat("First Class");
		assertTrue(ticketLogic.isRich(ticket));
	}
	
	@Test
	public void testPassengerIsNotRich() {
		ticket.setSeat("Coach");
		assertFalse(ticketLogic.isRich(ticket));
	}

}
