package lk.ijse.notecal.execption;

public class NoteNotFoundExecption extends RuntimeException{

    public NoteNotFoundExecption() {
        super();
    }


    public NoteNotFoundExecption(String message) {
        super(message);
    }


    public NoteNotFoundExecption(String message, Throwable cause) {
        super(message, cause);
    }
}
