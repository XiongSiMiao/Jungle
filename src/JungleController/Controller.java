package JungleController;
import JungleModel.Board;
import Exception.WrongMovement;
import Exception.LosePieces;
public class Controller {
    public Controller(){
    }

    public static void start() {
    }

    public static void movement(String dir){}

    public static enum Owner{
        user1,user2;
        private Owner(){}
    }
}
