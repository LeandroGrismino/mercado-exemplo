package exemplo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    public LoteRepository repLote;
    public ProdutoRepository repProduto;

    public ProdutoService(){
        this.repProdutos = new ProdutoRepository();
        this.repLotes = new LoteRepository();
    }

    public ArrayList<Produto> listarProdByName(String nome) {
        ArrayList<Produto> produtos = repProduto.listaProdutos();
        ArrayList<Produto> prods = listaProdutoNome(produtos, nome);
        return(prods);
    }
    public List<Produto> listarProdLoteByName(String nome) {
        List<Lote> lotes = repLote.listaLotes();
        ArrayList<Produto> produtos = getProdutosFromLotes(lotes);
        ArrayList<Produto> prods = listaProdutoNome(produtos, nome);
        return(prods);
    }
    public ArrayList<Produto> getProdutosFromLotes(List<Lote> lotes){
        ArrayList<Produto> produtos = new ArrayList<>();
        for(Lote l : lotes){
           produtos.add(l.getProduto());
        }
        return produtos;

    }

    public ArrayList<Produto> listaProdutoNome(ArrayList<Produto> produtos, String nome){
        produtos = new ArrayList<>();
        for (Produto produto : produtos){
            if (produto.getNome().contains(nome)){
                produtos.add(produto);
            }
        }
        return produtos;
    }
}
