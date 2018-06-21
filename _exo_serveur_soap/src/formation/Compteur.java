package formation;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface Compteur {

	@WebMethod void ecrire( String user, Integer i);
	@WebMethod Integer lire (String user );
	
}