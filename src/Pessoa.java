import java.util.Random;

public class Pessoa implements Observer {
    private boolean queroCancelar = false;
    public String nome;
    private Random gerador = new Random ();

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Entregavel e) {
        System.out.println("recebi " + e.getConteudo());
        queroCancelar = gerador.nextDouble() <= 0.1;
    }

    public boolean queroCancelar () {
	return this.queroCancelar;
    }
}
