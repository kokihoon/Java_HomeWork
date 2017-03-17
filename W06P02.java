package java_homework;

public class W06P02 {
	public static void main(String[] args) {
		Volunteer volunteer[] = {
				new Doctor("��ö��", "�ܰ�"),
				new Nurse("�̿���", 7),
				new Doctor("�ڹ̰�", "�Ҿư�"),
				new Nurse("��ö��", 3),
				new Nurse("������", 10)
		};
		
		for(Volunteer v : volunteer) {
			System.out.print("�̸� : " + v.name+",");
			if(v instanceof Doctor) System.out.println("�����о� : " + ((Doctor)v).specialty);
			if(v instanceof Nurse) System.out.println("��³�� : " + ((Nurse)v).careerYear);
		}
	}
}

class Volunteer {
	String name;

	public Volunteer(String name) {
		this.name = name;
	}
}

class Doctor extends Volunteer {
	String specialty;
	
	public Doctor(String name, String specialty) {
		super(name);
		this.specialty = specialty;
	}
}

class Nurse extends Volunteer {
	int careerYear;
	
	public Nurse(String name, int careerYear) {
		super(name);
		this.careerYear = careerYear;
	}
}