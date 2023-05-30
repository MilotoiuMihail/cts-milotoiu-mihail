package ro.ase.unitTests.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import ro.ase.unitTests.mocks.StubPersoana;
import ro.ase.unitTests.mocks.StubPersoanaMinora;
import ro.ase.unitTests.model.PachetTuristic;

public class TestingPachetTuristic {

	@Tag("tag1")
	@Test
	void testPoateRezerva() {
		PachetTuristic pachetTuristic=new PachetTuristic(new StubPersoana(), "destinatie", 20.25);
		assertTrue(pachetTuristic.poateRezerva());
	}
	@Tag("tag2")
	@Test
	void testMinorNuPoateRezerva() {
		PachetTuristic pachetTuristic=new PachetTuristic(new StubPersoanaMinora(), "destinatie", 20.25);
		assertFalse(pachetTuristic.poateRezerva());
	}
}
