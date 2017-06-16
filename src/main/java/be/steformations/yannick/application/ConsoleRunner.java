package be.steformations.yannick.application;

import java.util.Scanner;

public class ConsoleRunner implements Runner {

	private Application application;

	@Override
	public void start() {
		if (this.application != null) {
			this.application.begin();
			Scanner scan = new Scanner(System.in);
			String entre;
			System.out.print(this.application.getScreen());
			while (!this.application.isFinish()) {
				entre = scan.nextLine();
				this.application.newInput(entre);
				System.out.print(this.application.getScreen());
			} 
		}
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

}
