public class InitDestroy {
    private String message;
    public InitDestroy(){

    }

    public InitDestroy(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init(){
        System.out.println(message + " to jest Init");
    }
    public void destroy(){
        System.out.println(message + " to jest Destroy");
    }
}
