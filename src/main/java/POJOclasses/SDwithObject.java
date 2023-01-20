package POJOclasses;

public class SDwithObject {

	
	String ename;
	int[] phno;
	SObject SObject;
	public SDwithObject(String ename, int[] phno, POJOclasses.SObject sObject) {
	
		this.ename = ename;
		this.phno = phno;
		SObject = sObject;
	}
	public SDwithObject()
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
	public SObject getSObject() {
		return SObject;
	}
	public void setSObject(SObject sObject) {
		SObject = sObject;
	}
	
	
}