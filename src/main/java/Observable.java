import java.util.ArrayList;
import java.util.List;

public class Observable {
    public List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){

        for(Observer i:observers) {
            if (i != observer) {
                this.observers.add(observer);
                return;
            } else {
                System.out.println("Observer já adicionado");
            }
        }
        this.observers.add(observer);
    }
    public void removeObserver(Observer observer){
        this.observers.add(observer);
    }
    public void notifyClientes(Produto produto){
        for(Observer o:observers){
           o.update(produto);
       }
    }
}
