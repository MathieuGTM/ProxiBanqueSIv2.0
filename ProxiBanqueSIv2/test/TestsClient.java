import static org.junit.Assert.*;

import org.junit.Test;

import metier.Client;
import service.IServiceClient;
import service.ServiceClient;

public class TestsClient {

//  TEST instanciation d'un object client
	@Test
	public void TestClientNotNull() {
		Client c1 = new Client(101, "dup1", "ali1", "ali1@gmail.com", "15 rue des zoo1", "Paris", 75001);
		assertNotNull(c1);
	}
}
