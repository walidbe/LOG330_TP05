package log330_tp05.log330_tp05;

/**
* La classe Student contient les chapitre de chaque etudiant et la note de lintra.
* @author Walid
*
*/
public class Student {
	private String name;
	private double c1=0;
	private double c2=0;
	private double c3=0;
	private double c4=0;
	private double c5=0;
	private double c6=0;
	private double intra =0;
	public final static int N = 6;

	public Student(String name, double c1, double c2, double c3, double c4, double c5, double c6, double intra){
		this.name = name;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
		this.c5 = c5;
		this.c6 = c6;
		this.intra = intra;
	}
	
	public double getC1(){
		return this.c1;
	}
	
	
	public double getC2(){
		return this.c2;
	}
	
	
	public double getC3(){
		return this.c3;
	}
	
	
	public double getC4(){
		return this.c4;
	}
	
	
	public double getC5(){
		return this.c5;
	}
	
	
	public double getC6(){
		return this.c6;
	}
	
	
	public double getIntra(){
		return this.intra;
	}
	
	
	public String getName(){
		return this.name;
	}
	
	public double getAverage(){
		return (c1+c2+c3+c4+c5+c6)/N;
	}
}

