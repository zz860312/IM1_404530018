
/*
 * [C]62
 * [TA's Advise]
 * 1. 你的Tester呢?
 * 2. 黃揚如果對於作業有任何問題請一定要和助教說喔!
 * */

import java.util.ArrayList;

class Mycount {
	String name;
	int count;

	Mycount() {
	}

	Mycount(String _name, int _count) {
		this.name = _name;
		this.count = _count;
	}

	public String toString() {
		return this.name + " = " + this.count;
	}

}

public class GradeAnalyzer {

	int CountUserIn = 0;
	double TotalNumber = 0, Avg = 0, SD = 0, GetNumber = 0, SDtemp = 0;
	ArrayList<Double> ScoreNumber = new ArrayList<Double>();
	Mycount[] GradeInterval = new Mycount[11];
	boolean FirstTime = true;

	static boolean ValidGrade(double Grade) {
		if (Grade <= 110 && Grade >= 0)
			return true;
		return false;
	}

	void addGrade(double Grade) {
		// Good, +2
		if (FirstTime) {
			GradeInterval[0] = new Mycount("A+", 0);
			GradeInterval[1] = new Mycount("A", 0);
			GradeInterval[2] = new Mycount("A-", 0);
			GradeInterval[3] = new Mycount("B+", 0);
			GradeInterval[4] = new Mycount("B", 0);
			GradeInterval[5] = new Mycount("B-", 0);
			GradeInterval[6] = new Mycount("C+", 0);
			GradeInterval[7] = new Mycount("C", 0);
			GradeInterval[8] = new Mycount("C-", 0);
			GradeInterval[9] = new Mycount("D", 0);
			GradeInterval[10] = new Mycount("F", 0);
			FirstTime = false;
		}
	}

}