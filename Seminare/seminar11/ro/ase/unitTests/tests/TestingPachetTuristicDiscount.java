package ro.ase.unitTests.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import ro.ase.unitTests.mocks.FakePerson;
import ro.ase.unitTests.model.PachetTuristic;

public class TestingPachetTuristicDiscount {

	@Test
	void shouldApplyDiscountForSeniorCitizens() {
		FakePerson fakePerson=new FakePerson();
		fakePerson.setGetVarstaValue(66);
		fakePerson.setGetSexValue("M");
		PachetTuristic pachetTuristic=new PachetTuristic(fakePerson, "Grecia", 1000.0);
		pachetTuristic.aplicaDiscountVarstnici(10);
		assertEquals(900, pachetTuristic.getPret());
	}
	
	@Tag("tag2")
	@Test
	void shouldNotApplyDiscount() {
		FakePerson fakePerson=new FakePerson();
		fakePerson.setGetVarstaValue(21);
		PachetTuristic pachetTuristic=new PachetTuristic(fakePerson, "Bulgaria", 1000.0);
		pachetTuristic.aplicaDiscountVarstnici(10);
		assertEquals(1000, pachetTuristic.getPret());
	}

}
