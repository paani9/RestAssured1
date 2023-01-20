package serialization_deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOclasses.SDcomplex;


public class Deserializationwitharray {
	
	@Test
	public void deserializationComplex() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj=new ObjectMapper();
		SDcomplex s=obj.readValue(new File("./file1.json"),SDcomplex.class);
		System.out.println(s.getEname());
		System.out.println(s.getPhno()[0]);
		System.out.println(s.getPhno()[1]);
		
	}
	
	
	
	
	
	

}
