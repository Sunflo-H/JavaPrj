package chapter7ex2;

public class Program2_scoreManager extends Exam{//exam이 틀 즉 framework가 된다

	public static void main(String[] args) {
		Exam exam = new Exam();
		System.out.printf("kor:%d, eng:%d, math:%d\n", 
			exam.getKor(),exam.getEng(),exam.getMath());

	}

}
