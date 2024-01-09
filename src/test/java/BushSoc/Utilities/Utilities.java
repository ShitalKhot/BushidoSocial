package BushSoc.Utilities;

public class Utilities {
	
	public static void hardWait(int timeInSeconds) {
		try {
			Thread.sleep(timeInSeconds * 1000);
		} catch (InterruptedException e) {
			
		}
	}

}
