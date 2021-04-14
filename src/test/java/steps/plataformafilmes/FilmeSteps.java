package steps.plataformafilmes;

import java.util.LinkedHashMap;
import java.util.List;

import entidades.plataformafilmes.Filme;
import entidades.plataformafilmes.Plataformas;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import massa.plataformafilmes.FilmeMassa;
import massa.plataformafilmes.PlataformaMassa;
import massa.plataformafilmes.TokenMassa;
import utils.BaseUtils;
import utils.RestUtils;

public class FilmeSteps {

	Filme filme;
	FilmeMassa filmeMassa;
	LinkedHashMap<String, String> header = new LinkedHashMap<>();
	
	@Dado("que sejam preenchidos os valores de filmes")
	public void queSejamPreenchidosOsValoresDeFilmes() {
	    RestUtils.setBaseUri(FilmeMassa.url);
	    filmeMassa = new FilmeMassa();
	    filme = filmeMassa.filme;
	    
	}
	@Quando("o campo {string} for alterado para {string} de Filme")
	public void oCampoForAlteradoParaDeFilme(String key, String value) {
		value = BaseUtils.trataCampos(value);
	    filme.setFilme(key, value);
	}
	@Quando("um request de POST for realizado de Filme")
	public void umRequestDePOSTForRealizadoDeFilme() {
		
		header.put("Authorization", TokenMassa.authorization);
	    RestUtils.postRequest(FilmeMassa.endpoint, header, filme.getFilme());

	}
	
	@Entao("armazeno o valor do campo id do response de Filme")
	public void armazenoOValorDoCampoIdDoResponseDeFilme() {
	    FilmeMassa.id = RestUtils.getResponse("id").toString();
	}
	
	@Quando("o campo {string} de plataformas for alterado para o valor armazenado em Filme")
	public void oCampoDePlataformasForAlteradoParaOValorArmazenadoEmFilme(String key) {
	    filmeMassa.plataformas.setPlataformas(key, PlataformaMassa.nome);

	}
	
	@Quando("realizo uma request de Get de filmes")
	public void realizoUmaRequestDeGetDeFilmes() {
	    RestUtils.getRequest(FilmeMassa.endpoint, header);
	}
	@Entao("valido que a lista {string} possua o filme armazenado")
	public void validoQueAListaPossuaOFilmeArmazenado(String key) throws Exception {
	    List<String> listNomes = (List<String>) RestUtils.getResponse(key);
	    String nomeFilme = filme.getFilme().get("nome").toString();
	    
	    if(!listNomes.contains(nomeFilme)) {
	    	throw new Exception("nao foi encontrado o filme: "+nomeFilme);
	    };
	}
	
	












}
