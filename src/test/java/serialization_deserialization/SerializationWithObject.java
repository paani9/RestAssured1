package serialization_deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOclasses.SDcomplex;
import POJOclasses.SDwithObject;
import POJOclasses.SObject;

public class SerializationWithObject {
	
@Test
	
	public void serializationwithObject() throws JsonGenerationException, JsonMappingException, IOException
	{
		
		int[] phno= {2323,92966};
		SObject sdo=new SObject("Bangalore");
		SDwithObject s=new SDwithObject("p1", phno, sdo);
		
		ObjectMapper obj=new ObjectMapper();
		obj.writeValue(new File("./file3.json"),s);
		
	}
	

}
	
	
	
	
	
	
	
	
	
	
	


