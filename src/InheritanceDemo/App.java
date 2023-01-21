package InheritanceDemo;

public class App {

	public static void main(String[] args) {
		Students std = new Students();
		std.markAttendance();
		std.attendLectures();
		
		Teachers t = new Teachers();
		t.markAttendance();
		t.conductLectures();
		
		Staff stf = new Staff();
		stf.markAttendance();
		
		std.m1();
		
//		SchoolBase sb = new SchoolBase();
//		sb.markAttendance();
		
		std.lunchBreak();
		t.lunchBreak();
		stf.lunchBreak();
	
		
		
		
		
	}
}
