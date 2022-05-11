package exemplo;

import java.util.ArrayList;
import java.util.HashMap;

public class LoteRepository {

    public HashMap<String, Lote> catalogo = new HashMap<>();
    public String addLote(Lote l){
        catalogo.put(l.getId(), l);
        return l.getId();
    }

    public Lote recuperaLote(String id){
        return catalogo.get(id);
    }

    public void removerLote(String id){
        catalogo.remove(id);
    }

    public void atualizarLote(Lote l){
        String id = l.getId();
        catalogo.put(id, l);
    }

    public ArrayList<String> listaLotes(){
        ArrayList<String> lotes = new ArrayList<>();
        for (String p : catalogo.keySet()){
            lotes.add(p);
        }
        return lotes;
    }


}
