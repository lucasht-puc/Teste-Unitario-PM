package tdd;
import java.util.ArrayList;

public class Membro {
	
	private int id;
    private String nome;
    private ArrayList<Livro> livrosEmprestados;
    
    public Membro(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<Livro>();
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
    
    public Livro getLivrosEmprestados(int idLivro) {
    	for(Livro i : this.livrosEmprestados) 
    		if(i.getId() == idLivro)
    			return i;
    	return null;
    }
    public void printTodosLivrosEmprestados() {
    	for(Livro i : this.livrosEmprestados) 
    		System.out.println("ID livro: " +i.getId()+"; Titulo Livro: "+i.getTitulo());
    }
    
    public void pegaEmprestado(Livro livroEmprestado) {
    	this.livrosEmprestados.add(livroEmprestado);
    }
    
    public void retornaLivro(int idLivro) {
    	for(Livro i : this.livrosEmprestados) 
    		if(i.getId() == idLivro)
    			this.livrosEmprestados.remove(i);
    }
}
