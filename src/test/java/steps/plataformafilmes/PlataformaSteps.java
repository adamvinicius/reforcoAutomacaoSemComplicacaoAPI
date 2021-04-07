package steps.plataformafilmes;

import java.sql.Timestamp;
import java.util.LinkedHashMap;

import entidades.plataformafilmes.Plataformas;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import massa.plataformafilmes.PlataformaMassa;
import massa.plataformafilmes.TokenMassa;
import utils.RestUtils;

public class PlataformaSteps {
	Plataformas plataformas;
	
	@Dado("sejam preenchidos os valores de plataforma")
	public void sejamPreenchidosOsValoresDePlataforma() {
	    PlataformaMassa plataformaMassa = new PlataformaMassa();
	    plataformas = plataformaMassa.plataforma;
	    RestUtils.setBaseUri(PlataformaMassa.url);
	}
	
	@Quando("o campo {string} for alterado para {string} de Plataforma")
	public void oCampoForAlteradoParaDePlataforma(String key, String value) {
	    value = trataCampos(value);
		plataformas.setPlataformas(key, value);
	}
	
	public String trataCampos(String value) {
		if (value.contains("[data]")) {
			String timestamp = new Timestamp(System.currentTimeMillis()).toString();  
	        timestamp = timestamp.replace("-", "").replace(" ", "").replace(":", "").replace(".", "");
	        value = value.replace("[data]", timestamp);
		}
		
		return value;
	}



	
	@Quando("um request de POST for realizado de Plataforma")
	public void umRequestDePOSTForRealizadoDePlataforma() {
	    LinkedHashMap<String, String> header = new LinkedHashMap<>();
	    header.put("Authorization", TokenMassa.authorization);
	    
	    RestUtils.postRequest(PlataformaMassa.endpoint, header, plataformas.getPlataformas());
	    
	    System.out.println(RestUtils.getBody());
	}



}
