import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tdd.Livro;

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
		membro.pegaEmprestado(0);
		assertEquals(0, membro.getLivrosEmprestados(0));
	}
	
	@Test
	void testMembroRetornaLivro() {
		membro.retornaLivro(0);
		assertNull(membro.getLivrosEmprestados(0));
	}

}
