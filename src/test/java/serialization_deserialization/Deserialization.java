package serialization_deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOclasses.Serialization_deSerialization;

public class Deserialization {
	@Test
	public void deserialization() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj=new ObjectMapper();
		Serialization_deSerialization sd=obj.readValue(new File("./file.json"),Serialization_deSerialization.class);
		System.out.println(sd.getEname());
		System.out.println(sd.getEid());
		System.out.println(sd.getMobnum());
	}

}
