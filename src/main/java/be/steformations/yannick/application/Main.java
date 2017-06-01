package be.steformations.yannick.application;

public class Main {

	public static void main(String[] args) {
		if (args.length == 1) {
			RunnerFactory factory = RunnerFactory.getInstance(args[0]);
			if (factory != null) {
				Runner run = factory.getRunner();
				run.start();
			}else{
				System.out.println("Application inconnue: "+args[0]);
			}
		}else{
			System.out.println("Nom de l'application manquante");
		}

	}

}
