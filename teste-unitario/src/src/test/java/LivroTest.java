
import tdd.Livro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class LivroTest {

    @Test
    public void testCriarLivro() {
        Livro livro = new Livro(0, "Hobbit", "Tolkien");

        assertEquals("Hobbit", livro.getTitulo());
        assertEquals("Tolkien", livro.getAutor());
    }

    @Test
    public void testEmprestarLivro() {
        Livro livro = new Livro(0, "Hobbit", "Tolkien");
        livro.emprestarLivro();
        assertEquals(true, livro.isEmprestado());
    } 

    @Test
    public void testRetornarLivro() {
        Livro livro = new Livro(0, "Hobbit", "Tolkien");
        livro.emprestarLivro();
        livro.retornarLivro();
        assertEquals(false, livro.isEmprestado());
    }
}
