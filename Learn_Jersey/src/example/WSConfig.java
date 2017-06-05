package example;

//import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;

public class WSConfig extends ResourceConfig {
	public WSConfig() {
		register(JerseyTest.class);
	}
}
