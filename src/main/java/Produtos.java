import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Produtos extends Observable{
   public List<Produto> produtos = new ArrayList<>();

    public void addProduto(Produto produto){
        for(Produto p:produtos){
            if(p != produto){
                this.produtos.add(produto);
                this.notifyClientes(produto);
                return;
            }
        }
        this.produtos.add(produto);
        this.notifyClientes(produto);
    }
}
