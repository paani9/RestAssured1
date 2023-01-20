package serialization_deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOclasses.Serialization_deSerialization;

public class Serialization {
	
	
	@Test
	public void serialization() throws JsonGenerationException, JsonMappingException, IOException
	{
		Serialization_deSerialization sd=new Serialization_deSerialization("sdet1","sdet1",12334555);
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./file.json"),sd);
		
	}
	
	
	
	
	
	
	
	
	
	

}
