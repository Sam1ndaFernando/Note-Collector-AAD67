package lk.ijse.notecal.execption;

public class DataPersistsExecption extends RuntimeException{

    public DataPersistsExecption() {
        super();
    }


    public DataPersistsExecption(String message) {
        super(message);
    }

    public DataPersistsExecption(String message, Throwable cause) {
        super(message, cause);
    }
}
