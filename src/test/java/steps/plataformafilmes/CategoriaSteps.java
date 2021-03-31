package steps.plataformafilmes;

import java.util.LinkedHashMap;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import massa.plataformafilmes.TokenMassa;
import utils.RestUtils;

public class CategoriaSteps {

	
	String url = "http://localhost:8080/";
	String endpoint = "categorias";
	LinkedHashMap<String, String> header = new LinkedHashMap<>();
	
	@Dado("sejam preenchidos os valores do categorias")
	public void sejamPreenchidosOsValoresDoCategorias() {
	    RestUtils.setBaseUri(url);
	    header.put("Authorization", TokenMassa.authorization);
	}
	
	@Quando("um request de GET for realizado de Categoria")
	public void umRequestDeGETForRealizadoDeCategoria() {
	    RestUtils.getRequest(endpoint, header);
	}
	
	



}
