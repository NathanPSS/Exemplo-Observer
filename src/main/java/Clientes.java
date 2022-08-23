import java.util.List;

public class Clientes implements Observer {
    public String nincho;
    public String nome;

   public Clientes(String nome,String ninchoCliente){
       super();
       this.nome = nome;
       this.nincho = ninchoCliente;
   }
    public void update(Produto produto) {
            if (this.nincho.equals(produto.nincho)) {
                System.out.println("Cliente " + this.nome + " Notificado");
        }
    }
}

