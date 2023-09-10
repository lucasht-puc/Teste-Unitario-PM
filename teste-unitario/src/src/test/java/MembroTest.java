import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tdd.Livro;
import tdd.Membro;

class MembroTest {
	Membro membro = new Membro(0, "Jose");
	Livro livro = new Livro(0, "Hobbit", "Tolkien");
	
	@Test
	void testCriarMembro() {
        assertEquals("Jose", membro.getNome());
        assertEquals(0 , membro.getId());
	}
	
	@Test
	void testMembroPegaEmprestado() {
		membro.pegaEmprestado(livro);
		assertEquals(0, membro.getLivrosEmprestados(0).getId());
		
	}
	
	@Test
	void testMembroRetornaLivro() {
		membro.retornaLivro(0);
		assertNull(membro.getLivrosEmprestados(0));
	
	}

}
