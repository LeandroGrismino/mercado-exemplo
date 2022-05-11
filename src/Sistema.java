import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {

		ProdutoRepository repProduto = new ProdutoRepository();
		String idP1 = repProduto.addProduto(new Produto("Leite", "Parmalat"));
		String idP2 = repProduto.addProduto(new Produto("Pão", "PlusVita"));
		String idP3 = repProduto.addProduto(new Produto("Ovo", "Galinha"));

		
		System.out.println(repProduto.recuperaProduto(idP1).toString());


	}
}
