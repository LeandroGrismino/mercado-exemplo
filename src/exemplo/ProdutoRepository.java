package exemplo;

import java.util.HashMap;

public class ProdutoRepository {
    public HashMap<String, Produto> catalogo = new HashMap<>();

    public void addProduto(Produto p){
        catalogo.put(p.getId(), p);
    }
}
