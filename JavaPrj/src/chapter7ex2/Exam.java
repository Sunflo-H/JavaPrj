package chapter7ex2;
//캡슐화 + 은닉성
public class Exam {
	private int kor; // 이값을 밖에서
	// Exam exam = new Exam() , exam.kor
	// 이런식으로 이용하면 캡슐이 깨진것이다
	// 내가 kor을 ko 로 바꾸면 exam.kor 이 에러가 되겠지
	// 난 Exam 클래스를 바꿨는데 밖에서 에러가 나면 안되지
	// 따라서 private로 은닉화 해 (캡슐이 꺠지는걸 막는 도구)
	// 그럼 kor을 어떻게 써??
	// kor을 직접 건드리지 않고 값을 줄수있는 게터세터를 쓴다
	private int eng;
	private int math;

	public int total() {
		return kor + eng + math;
	}

	public float avg() {
		return total() / 3.0f;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

//	void print() {
//		System.out.printf("kor:%d, eng:%d, math:%d\n", kor, eng, math);
//	}
}