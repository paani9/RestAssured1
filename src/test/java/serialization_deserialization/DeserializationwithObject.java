package serialization_deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOclasses.SDwithObject;

public class DeserializationwithObject {
	
	@Test
	public void deserializationComplex() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj=new ObjectMapper();
		SDwithObject s = obj.readValue(new File("./file3.json"), SDwithObject.class);
		System.out.println(s.getSObject().getCity());
	}
	
	
	
	

}
