package Student_info;

import java.util.List;

public class test {
	public static void main(String[] args) {
		Operate_Student_info s = new Operate_Student_info();
		List<Student> students = s.selectStudent();
		
		for(int i=0;i<students.size();i++) {
			System.out.print(students.get(i).get����());
			System.out.print(students.get(i).getѧ��());
			System.out.println(students.get(i).get�Ա�());
		}
	}
}
