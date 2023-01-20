package POJOclasses;

public class Serialization_deSerialization {
	String ename;
	String eid;
	long mobnum;
	public Serialization_deSerialization(String ename, String eid, long mobnum) {
		
		this.ename = ename;
		this.eid = eid;
		this.mobnum = mobnum;
	}
	public Serialization_deSerialization()
	{
		
}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public long getMobnum() {
		return mobnum;
	}
	public void setMobnum(long mobnum) {
		this.mobnum = mobnum;
	}
	

}
