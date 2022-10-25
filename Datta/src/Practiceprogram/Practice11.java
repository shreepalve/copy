package Practiceprogram;

class Add {
	int i=32;
    int j=65;
	double k=23.22, add, multi ;
	void add () {
		int i=98;
	int	j=2;
		add=i+j;
		System.out.println("addition in Add class "+add);
		
		System.out.println(Add.this.j);
		System.out.println(j);
	}
	void multi() {
		multi=i*j;
		System.out.println("multi in add " +multi);
	}
	Add(){
		System.out.println("i am constructor");
	}
}
class Multi extends Add{
	double add= i+k;
	void add() {
		System.out.println("addition in Multi "+add);
		super.add();
	}
	void multi(){
		System.out.println(+super.i); 
		super.multi();
	}
	void disp() {
		System.out.println("display");
	}
}
public class Practice11 {
public static void main(String[]args) {
	Multi ref=new Multi();
	ref.multi();
	ref.add();
	Add g=new Multi();
	g.add();
	ref.disp();
}
} 
