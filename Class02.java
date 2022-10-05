package Java111Q1;

public class Class01 {

	public static void main(String[] args) {
		int[][]a = {{85,92},{77,56};
			
	
}
class Data{
	private String name;
	private Test score;
	void show() {
		System.out.println("name:"+name+" english="+score.english+ " math="+score.math+" avg="+score.avg);
	}
	class Test{
		int english;
		int math;
		int avg;
		public Test(int eng,int m) {
			english = eng;
			math = m;
		}
		double avg() {
			avg = (english+math)/2;
			return avg;
		}
	}
}
