package ro.ase.unitTests.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import ro.ase.unitTests.mocks.FakePachet;
import ro.ase.unitTests.model.AgentieTurism;
import ro.ase.unitTests.model.IPachet;

public class TestingAgentieTurism {

	@Tag("tag1")
	@Test
	void testSumaTotala() {
		AgentieTurism agentie = new AgentieTurism();
		FakePachet fakePachet1 = new FakePachet();
		fakePachet1.setGetPretValue(100.0);
		agentie.adaugaPachet(fakePachet1);
		FakePachet fakePachet2 = new FakePachet();
		fakePachet2.setGetPretValue(250.0);
		agentie.adaugaPachet(fakePachet2);
		FakePachet fakePachet3 = new FakePachet();
		fakePachet3.setGetPretValue(150.0);
		agentie.adaugaPachet(fakePachet3);
		assertEquals(500, agentie.calculareSumaTotalaPachete());
	}

}
