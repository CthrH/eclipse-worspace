package formation;

import javax.xml.ws.Endpoint;

public class Principal {

	public static void main(String[] args) {
		
		 Endpoint.publish("http://10.130.10.49:9999/ws/compteur", new CompteurImpl());
	}
}