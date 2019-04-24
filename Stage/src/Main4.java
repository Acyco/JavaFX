import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author Acyco
 * @create 2019-04-25 03:44
 */
public class Main4 extends Application {
    public static void main(String[] args){
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage s1 = new Stage();
        s1.setTitle("s1");
        s1.show();
        Stage s2 = new Stage();
        s2.initOwner(s1);//设置父窗口
        s2.initModality(Modality.WINDOW_MODAL);
        s2.setTitle("s2");
        s2.show();
        Stage s3 = new Stage();
//        s3.initModality(Modality.WINDOW_MODAL);
        s3.initModality(Modality.APPLICATION_MODAL);
        s3.setTitle("s3");
        s3.show();
    }
}
