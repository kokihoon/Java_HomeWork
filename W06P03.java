package java_homework;

public class W06P03 {
	public static void main(String[] args) {
		Robot robot[] = new Robot[5];
		
		for(int i = 0; i < robot.length; i++) {
			robot[i] = new Robot();
		}
		System.out.println("·Îº¿ÀÇ ÃÑ °³¼ö : " + Robot.getNumberOfRobots());
		for(int i = 0; i < robot.length; i++) {
			System.out.println(robot[i].id);
		}
	}
}

class Robot {
	String id;
	static int count = 0;
	
	public static int getNumberOfRobots() {
		return count;
	}
	public Robot() {
		this.id = "Robot-" + ++count;
	}
}