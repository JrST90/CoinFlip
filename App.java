package joshs.coinflip;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    @Override
    public void start(Stage stage)
    {
        BuildCoinFlip build = new BuildCoinFlip();
    }
}





/*package joshs.coinflip;

import javafx.application.Application;
import javafx.stage.Stage;


public class App extends Application 
{       
    private Button flipCoin;
    private Label resultLabel;
    private Image tailsImage,  headsImage;
    private ImageView viewResultImage;
   
    @Override
    public void start(Stage mainStage) 
    {   
        flipCoin = new Button("Flip Coin");
        resultLabel = new Label();
        flipCoin.setOnAction(new CoinFlipButtonHandler());
        
        headsImage = new Image("file:C:\\Users\\joshs\\Documents\\NetBeansProjects\\CoinFlip\\images\\Heads.jpg");
        tailsImage = new Image("file:C:\\Users\\joshs\\Documents\\NetBeansProjects\\CoinFlip\\images\\Tails.jpg");
       
        viewResultImage = new ImageView(headsImage);
        viewResultImage.setFitWidth(100);
        viewResultImage.setFitHeight(100);
        viewResultImage.setPreserveRatio(true);
        
        HBox imageHbox = new HBox(5, viewResultImage);
        imageHbox.setPadding(new Insets(5));
        imageHbox.setAlignment(Pos.CENTER);
        
        HBox buttonHbox = new HBox(5, flipCoin);
        buttonHbox.setPadding(new Insets(5));
        buttonHbox.setAlignment(Pos.CENTER);
        
        VBox vbox = new VBox(5, imageHbox, buttonHbox, resultLabel);
        vbox.setPadding(new Insets(5));
        vbox.setAlignment(Pos.CENTER);
        
        Scene mainScene = new Scene(vbox);
        mainStage.setScene(mainScene);
        mainStage.setTitle("Coin Flip App");
        mainStage.show();
    }
    public class CoinFlipButtonHandler implements EventHandler<ActionEvent>
    {
        @Override
        public void handle(ActionEvent event)
        {           
            if(Function.coinFlip() == 0)
            {
                resultLabel.setText("Heads!");
                viewResultImage.setImage(headsImage);
                viewResultImage.setFitWidth(100);
                viewResultImage.setFitHeight(100);
                viewResultImage.setPreserveRatio(true);      
            }
            else
            {
                resultLabel.setText("Tails!");            
                viewResultImage.setImage(tailsImage);
                viewResultImage.setFitWidth(100);
                viewResultImage.setFitHeight(100);
                viewResultImage.setPreserveRatio(true);
            }
        }
    }
}*/