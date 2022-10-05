package Java111Q1;

public class Class02 {
	public static void main(String[] args) {
		Data [] data = new Data[2];
		data[0] = new Data("Annie",85,92);
		data[1] = new Data("Brian",77,56);
		data[0].show();
		data[1].show();
	}
}

class Data{
	private String name;
	private Test score;
	public Data(String name,int e,int m) {
		this.name = name; 
		score = new Test(e, m);
				
	}
	void show() {
		System.out.println("name:"+name+" english="+score.english+ " math="+score.math+" avg="+this.score.avg());
	}
	public class Test{
		int english;
		int math;
		public Test(int eng,int m) {
			english = eng;
			math = m;
		}
		double avg() {
			return ((english+math)/2.0);
		}
	}
}
