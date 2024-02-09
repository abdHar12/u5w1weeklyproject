package harouane.u5w1weeklyproject.Exceptions;

public class NotFindAnyElement extends RuntimeException{
    public NotFindAnyElement(){
        super("Non è stato trovato nessun elemento");
    }
}
