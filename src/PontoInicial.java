
public class PontoInicial {

    public static void main(String[] args) {
        Editora abril = new Editora();
        abril.addObserver(new Pessoa("Jose"));
        abril.addObserver(new Pessoa("Joao"));
        abril.addObserver(new Pessoa("Maria"));
        abril.iniciar();

    }

}
