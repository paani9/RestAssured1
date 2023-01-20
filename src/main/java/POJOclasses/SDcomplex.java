package POJOclasses;

public class SDcomplex {
	
	String ename;
	int[] phno;
	public SDcomplex(String ename, int[] phno) {
		
		this.ename = ename;
		this.phno = phno;
	}
	
	public SDcomplex()
	{
		
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int[] getPhno() {
		return phno;
	}
	public void setPhno(int[] phno) {
		this.phno = phno;
	}
	

}
