package wipro_oops.com;

public class shapemain {
	public static void main(String[] args) {
		shape c=new circle();
		shape t=new triangle();
		shape s=new square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
	}
}
