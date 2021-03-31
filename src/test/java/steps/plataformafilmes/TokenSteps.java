package steps.plataformafilmes;

import entidades.plataformafilmes.Token;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import massa.plataformafilmes.TokenMassa;
import utils.RestUtils;

public class TokenSteps {
	Token token;
	String endpoint;
	
	@Dado("sejam preenchidos os valores do token")
	public void sejamPreenchidosOsValoresDoToken() {
	    RestUtils.setBaseUri(TokenMassa.url);
	    endpoint = TokenMassa.endpoint;
	    TokenMassa tokenMassa = new TokenMassa();
	    token = tokenMassa.token;
	    
	}
	
	@Quando("um request de POST for realizado de Token")
	public void umRequestDePOSTForRealizadoDeToken() {
	    RestUtils.postRequest(endpoint, token.getToken());
	}
	@Entao("guardo o valor do token")
	public void guardoOValorDoToken() {
	    TokenMassa.authorization = "Bearer "+RestUtils.getResponse("token");
	}
	
	@Dado("que tenha realizado um Request de Token e guardado o valor do authorization")
	public void queTenhaRealizadoUmRequestDeTokenEGuardadoOValorDoAuthorization() {
	    this.sejamPreenchidosOsValoresDoToken();
	    this.umRequestDePOSTForRealizadoDeToken();
	    this.guardoOValorDoToken();
	}
	






}
