import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepository;

import java.util.ArrayList;
import java.util.Iterator;

public class Sistema {

	public static void main(String[] args) {

		ProdutoRepository repProduto = new ProdutoRepository();
		String idP1 = repProduto.addProduto(new Produto("Leite", "Parmalat"));
		String idP2 = repProduto.addProduto(new Produto("Pão", "PlusVita"));
		String idP3 = repProduto.addProduto(new Produto("Ovo", "Galinha"));
		String idP4 = repProduto.addProduto(new Produto("Leite", "Italac"));
		String idP5 = repProduto.addProduto(new Produto("Leite", "Vaca"));
		String idP6 = repProduto.addProduto(new Produto("Leite", "Cabra"));

		ArrayList<Produto>produtos = repProduto.getProdutoByName("Lei");
		for(Produto p : produtos){
			System.out.println(p.getNome()+"   "+p.getFabricante());
		}
		System.out.println(repProduto.recuperaProduto(idP1).toString());


	}
}
