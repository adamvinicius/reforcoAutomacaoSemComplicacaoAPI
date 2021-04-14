package steps.plataformafilmes;

import java.sql.Timestamp;
import java.util.LinkedHashMap;

import entidades.plataformafilmes.Plataformas;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import massa.plataformafilmes.PlataformaMassa;
import massa.plataformafilmes.TokenMassa;
import utils.BaseUtils;
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
	    value = BaseUtils.trataCampos(value);
		plataformas.setPlataformas(key, value);
	}
	
	



	
	@Quando("um request de POST for realizado de Plataforma")
	public void umRequestDePOSTForRealizadoDePlataforma() {
	    LinkedHashMap<String, String> header = new LinkedHashMap<>();
	    header.put("Authorization", TokenMassa.authorization);
	    
	    RestUtils.postRequest(PlataformaMassa.endpoint, header, plataformas.getPlataformas());
	}
	
	@Entao("armazeno o valor do campo nome do response de Plataforma")
	public void armazenoOValorDoCampoNomeDoResponseDePlataforma() {
	    PlataformaMassa.nome = RestUtils.getResponse("nome").toString();
	}
	
	@Dado("que tenha realizado um cadastro na plataforma e o valor do nome foi armazenado")
	public void queTenhaRealizadoUmCadastroNaPlataformaEOValorDoNomeFoiArmazenado() {
	    this.sejamPreenchidosOsValoresDePlataforma();
	    this.oCampoForAlteradoParaDePlataforma("nome", "Disney++[data]");
	    this.umRequestDePOSTForRealizadoDePlataforma();
	    this.armazenoOValorDoCampoNomeDoResponseDePlataforma();
	}









}
