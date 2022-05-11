package exemplo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class ProdutoRepository {
    public HashMap<String, Produto> catalogo = new HashMap<>();

    public String addProduto(Produto p){
        catalogo.put(p.getId(), p);
        return p.getId();
    }

    public Produto recuperaProduto(String id){
        return catalogo.get(id);
    }

    public void removerProduto(String id){
        catalogo.remove(id);
    }

    public void atualizarProduto(Produto p){
        String id = p.getId();
        catalogo.put(id, p);
    }

    public ArrayList<String> listaProdutos(){
        ArrayList<String> produtos = new ArrayList<>();
        for (String p : catalogo.keySet()){
            produtos.add(p);
        }
        return produtos;
    }

}
