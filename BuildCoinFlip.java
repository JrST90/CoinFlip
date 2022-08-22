package joshs.coinflip;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BuildCoinFlip 
{
    private Button flipCoin;
    private Label resultLabel;
    private Image tailsImage,  headsImage;
    private ImageView viewResultImage;
    private Stage mainStage;
    private Scene mainScene;
    
    public BuildCoinFlip()
    {
       
        flipCoin = new Button("Flip Coin");
        resultLabel = new Label();
        flipCoin.setOnAction(new CoinFlipButtonHandler());
        mainStage = new Stage();
        
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
        
        mainScene = new Scene(vbox);
        mainStage.setScene(mainScene);
        mainStage.setTitle("Coin Flip App");
        mainStage.show(); 
    }
    
    private class CoinFlipButtonHandler implements EventHandler<ActionEvent>
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
}
