package dream.test;

import java.util.ArrayList;

public class pushpush {
	
	private ArrayList scoreArr;
	
	int score = 0;

	public pushpush(){
		scoreArr = new ArrayList();
	}
	
	public void calc(Object b){
		int pop = (int) b;
		if(pop %2 == 0){
			scoreArr.add(b);
			score++;
		}
	}
	
	@Override
	public String toString() {
		return "[จำนวนที่หาร 2 ลงตัว คือ: " + scoreArr + " มีทั้งหมด =" + score  + "ตัว";
	}
	
}
