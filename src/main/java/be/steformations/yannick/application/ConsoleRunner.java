package be.steformations.yannick.application;

import java.util.Scanner;

public class ConsoleRunner implements Runner {

	private Application application;

	@Override
	public void start() {
		if (this.application != null) {
			Scanner scan = new Scanner(System.in);
			String entre;
			do {
				System.out.print(this.application.getScreen());
				entre = scan.nextLine();
				this.application.newInput(entre);
			} while (!this.application.isFinish());
			System.out.print(this.application.getScreen());
		}
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

}
