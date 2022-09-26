public class TooMuchStuffException extends Exception{
    public TooMuchStuffException(){
        super("Too Much Stuff!");
    }
    public TooMuchStuffException(String message){
        super(message);
    }
}
