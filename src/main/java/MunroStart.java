import static java.lang.System.*;


public class MunroStart  {

    public static void run(){
    out.println("MunroStart");
    MunroController munroController=new MunroController();
    munroController.menu();
    out.println("Thank you");
}

    public static void main(String[] args) {
        run();
    }


}
