package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
	
	public static void main (String[] args) {
		
		Produto produto = new Produto("Monitor", 789.9);
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		//dao.abrirT().incluirT(produto).fecharT().fechar();
		dao.incluirAtomico(produto).fechar();
	}

}
