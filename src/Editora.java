
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Editora implements Subject {

    private Entregavel e;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);

    }

    @Override
    public void notifyObserver() {
        List<Observer> aux = new ArrayList<>();

        for (Observer o : observers) {
            o.update(e);
            if (!((Pessoa) o).queroCancelar()) {
                aux.add(o);
            }
            System.out.println(" ");
        }
        observers.clear();
        observers.addAll(aux);
    }

    public void iniciar() {
        Calendar rightNow = Calendar.getInstance();
        //System.out.println("Data e Hora atual: " + rightNow.getTime());
        int dia = rightNow.get(Calendar.DAY_OF_WEEK);
        //System.out.println("Data e Hora atual: " + dia);
        if (dia == 7 || dia == 8) {
            notifyObserver();
        }
        

    }

}
