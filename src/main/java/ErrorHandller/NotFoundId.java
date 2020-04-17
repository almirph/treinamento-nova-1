package ErrorHandller;

public class NotFoundId extends RuntimeException {

    public NotFoundId(Integer id, String nomeClasse) {
        super(nomeClasse + " com Id " + id + " não existe.");
    }

}