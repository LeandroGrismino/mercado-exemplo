import exemplo.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Sistema {

	public static void main(String[] args) {


		ProdutoService serviceProduto = new ProdutoService();
		String idP1 = serviceProduto.repProduto.addProduto(new Produto("Leite", "Parmalat"));
		String idP2 = serviceProduto.repProduto.addProduto(new Produto("Pão", "PlusVita"));
		String idP3 = serviceProduto.repProduto.addProduto(new Produto("Ovo", "Galinha"));
		String idP4 = serviceProduto.repProduto.addProduto(new Produto("Leite", "Italac"));
		String idP5 = serviceProduto.repProduto.addProduto(new Produto("Leite", "Vaca"));
		String idP6 = serviceProduto.repProduto.addProduto(new Produto("Leite", "Cabra"));

		ArrayList<Produto>produtos = serviceProduto.listarProdByName("Lei");
		for(Produto p : produtos){
			System.out.println(p.getNome()+"   "+p.getFabricante());
		}

		serviceProduto.repLote.addLote(new Lote((serviceProduto.repProduto.recuperaProduto(idP5)), 15L));
		serviceProduto.repLote.addLote(new Lote((serviceProduto.repProduto.recuperaProduto(idP6)), 15L));

		System.out.println("\nLista de produtos com lote");
		produtos = serviceProduto.listarProdLoteByName("Lei");
		for(Produto p : produtos){
			System.out.println(p.getNome()+"   "+p.getFabricante());
		}

	}
}
