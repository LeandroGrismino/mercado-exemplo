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

    public ArrayList<Produto> getProdutoByName(String nome){
        ArrayList<Produto> produtos = new ArrayList<>();
        for (String p : catalogo.keySet()){
            Produto produto = catalogo.get(p);
            if (produto.getNome().contains(nome)){
                produtos.add(catalogo.get(p));
            }
        }
        return produtos;
    }

    public ArrayList<Produto> listaProdutos(){
        ArrayList<Produto> produtos = new ArrayList<>();
        for (String p : catalogo.keySet()){
            produtos.add(catalogo.get(p));
        }
        return produtos;
    }

}
