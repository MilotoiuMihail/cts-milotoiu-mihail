package ro.ase.unitTests.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import ro.ase.unitTests.tests.TestingAgentieTurism;
import ro.ase.unitTests.tests.TestingPachetTuristic;
import ro.ase.unitTests.tests.TestingPachetTuristicDiscount;

@Suite
@SelectClasses({TestingAgentieTurism.class,TestingPachetTuristic.class,TestingPachetTuristicDiscount.class})
public class AllTests {

}
