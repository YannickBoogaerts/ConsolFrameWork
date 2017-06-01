package be.steformations.yannick.application;

import junit.framework.TestCase;

public class RunnerFactoryTest extends TestCase {

	public void testGetInstance() {
		assertNotNull(RunnerFactory.getInstance("be.steformations.yannick.application.MyRunnerFactory"));
	}

	public void testGetRunner() {
		//fail("Not yet implemented");
	}

}
