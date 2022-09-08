
public class SecondsAndMinutes {

	private static final String INVALID_VALUE_MESSAGE = "Invalid value";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDurationString(65L, 45L));
		System.out.println(getDurationString(3945L));
		System.out.println(getDurationString(-41L));
		System.out.println(getDurationString(65L, 9L));
	}
	
//	Course solution
	private static String getDurationString(long minutes, long seconds) {
		if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
			return INVALID_VALUE_MESSAGE;
		}
		
		long hours = minutes / 60;
		long remainingMinutes = minutes % 60;
//		return hours + "h " + remainingMinutes + "m " + seconds + "s";
		
//		Bonus part - replace line 18 with the following:
		String hoursString = hours + "h";
		if(hours < 10) {
			hoursString = "0" + hoursString;
		}
		
		String minutesString = remainingMinutes + "m";
		if(remainingMinutes < 10) {
			minutesString = "0" + minutesString;
		}
		
		String secondsString = seconds + "s";
		if(seconds < 10) {
			secondsString = "0" + secondsString;
		}
		
		return hoursString + " " + minutesString + " " + secondsString;
//		End bonus part
	}
	
	private static String getDurationString(long seconds) {
		if(seconds < 0) {
			return INVALID_VALUE_MESSAGE;
		}
		
		long minutes = seconds / 60;
		long remainingSeconds = seconds % 60;
		
		return getDurationString(minutes, remainingSeconds);
	}
	
//	My solution
//	public static String getDurationString(int minutes, int seconds) {
//		if (minutes < 0 || seconds < 0 || seconds > 59) {
//			return "Invalid value";
//		}
//		System.out.println("At start: " + minutes + " minutes " + seconds + " seconds.");
//		int hours = minutes / 60;
//		minutes = minutes % 60;
//		System.out.println("At end: " + hours + "h " + minutes + "m " + seconds + "s");
//		return (hours + "h " + minutes + "m " + seconds + "s");
//	}
	
//	public static String getDurationString(int seconds) {
//		if (seconds < 0) {
//			return "Invalid value";
//		}
//		System.out.println("Seconds: " + seconds);
//		int hours = seconds / 3600;
//		int secondsWithoutHrs = seconds % 3600;
//		System.out.println("Hours: " + hours + " Seconds " + secondsWithoutHrs);
//		int minutes = secondsWithoutHrs / 60;
//		int remainingSeconds = secondsWithoutHrs % 60;
//		System.out.println("Hours, minutes & seconds: " + hours + "h " + minutes + "m " + remainingSeconds + "s");
//		return(hours + "h " + minutes + "m " + remainingSeconds + "s");
//		
//	}

}
