package week7.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LeadsTestCases {
	@Test
	public void createLead() {
		System.out.println("CreateLead");
		throw new NoSuchElementException();
	}

	@Test
	public void editLead() {
		System.out.println("editLead");
	}

	@Test
	public void duplicateLead() {
		System.out.println("duplicateLead");
	}

	@Test
	public void mergeLead() {
		System.out.println("mergeLead");
		/* throw new NoSuchElementException(); */
	}

	@Test
	public void deleteLead() {
		System.out.println("deleteLead");
	}

}
