package massa.plataformafilmes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import entidades.plataformafilmes.Categorias;
import entidades.plataformafilmes.Filme;
import entidades.plataformafilmes.Plataformas;

public class FilmeMassa {

	public static String url = "http://localhost:8080/";
	public static String endpoint = "filmes";
	public static String id;
	
	public Plataformas plataformas = new Plataformas("NetFlix");
	public List<LinkedHashMap<String, Object>> listPlataformas = new ArrayList<>();
	

	public Categorias terror = new Categorias("Terror");
	public Categorias thriller = new Categorias("Thriller");
	
	public List<LinkedHashMap<String, Object>> listCategorias = new ArrayList<>();
	

	public Filme filme;

	public FilmeMassa() {
		listPlataformas.add(plataformas.getPlataformas());
		listCategorias.add(terror.getCategorias());
		listCategorias.add(thriller.getCategorias());
		
		filme = new Filme("A espera de um milagre", "The Platform é um filme espanhol de "
				+ "terror e ficção científica de 2019 dirigido por Galder Gaztelu-Urrutia. "
				+ "O filme se passa em um grande Centro de Autogestão Vertical em estilo torre."
				+ "The Platform é um filme espanhol de terror e ficção ciadfadfadfadadfafe",
				1.35, listCategorias, listPlataformas);
	}
}
