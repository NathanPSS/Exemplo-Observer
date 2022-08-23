public class main {
    public static void main(String[] args) {

        Clientes cliente1 = new Clientes("Joao","Alimento");
        Clientes cliente2 = new Clientes("Carlos","Bebida");
        Clientes cliente3 = new Clientes("Silva","Livro");
        Clientes cliente4 = new Clientes("Fonseco","Confeccoes");


        Produto produto1 = new Produto("Hambuerguer","Alimento");
        Produto produto12 = new Produto("Miojo","Alimento");
        Produto produto2 = new Produto("whiskey","Bebida");
        Produto produto3 = new Produto("Harry Potter" ,"Livro");
        Produto produto4 = new Produto("Mesa","Confecoes");

        Produtos produtos = new Produtos();
        produtos.addObserver(cliente1);
        produtos.addObserver(cliente2);
        produtos.addObserver(cliente3);
        produtos.addProduto(produto1);
        produtos.addProduto(produto2);
        produtos.addProduto(produto12);
    }
}
