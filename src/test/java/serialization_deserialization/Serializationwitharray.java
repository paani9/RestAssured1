package serialization_deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOclasses.SDcomplex;


public class Serializationwitharray {
	@Test
	
	public void serialization() throws JsonGenerationException, JsonMappingException, IOException
	{
		
		int[] phno= {12344,455666};
		SDcomplex s=new SDcomplex("sdet2",phno);
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./file2.json"),s);
		
	}
	

}
