package be.steformations.yannick.application;

public abstract class RunnerFactory {

	public static RunnerFactory getInstance(String applicationName) {
		RunnerFactory factory = null;
		try {
			Class<RunnerFactory> forName = (Class<RunnerFactory>) Class.forName(applicationName);
			factory = forName.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return factory;
	}

	public abstract Runner getRunner();

}
