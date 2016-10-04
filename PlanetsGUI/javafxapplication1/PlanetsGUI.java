package javafxapplication1;
/*-------------------------Imports--------------------------*/
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.text.DecimalFormat;
import javafx.scene.input.MouseEvent;

/**
 *This is a Planet Weight Calculator
 *User Enters their weight in pounds then chooses planet selection
 *Will validate later with try and catch method
 * @author Benjamen ngo
 */
public class PlanetsGUI extends Application {
  /*---------------Variable Declarations--------------------------------*/
    private String weight; // variables should all be private
    private double earthWeight;
    private double planetWeight;
    private String result;
    DecimalFormat forma = new DecimalFormat("#.#");// formats the data to have only 1 decimal place
    @Override
    public void start(Stage primaryStage) {
        
        
        HBox hbox = new HBox(100);// creates a horizontal flow box with 100px between elements
       
        final HBox hbox2 = new HBox(10);// creates a horizontal flow box with 10px padding
        hbox2.setAlignment(Pos.BASELINE_CENTER);
        
        VBox vbox2 = new VBox(20);
        vbox2.setAlignment(Pos.CENTER);
        vbox2.autosize();
     /*----------Creating labels to display stuff--------*/   
        final Label lab1 = new Label();
        
        Label header = new Label("Enter your weight and select a planet to view your weight on that planet");
        
        final Label lab3 = new Label();
       
        final Label lab4 = new Label();
        
        final Label request = new Label("Enter your weight below in lbs: ");
        final TextField txtFld = new TextField();

 /*-------------Images--------------------------------------------------------------------*/
       
       /*------------------Mercury---------------------------------------------------*/
        final Image initMercury = new Image(getClass().getResourceAsStream("mercury.jpg"));

            ImageView mercury3 = new ImageView(initMercury);
            mercury3.setFitWidth(100);
            mercury3.setFitHeight(100);          
            mercury3.setOnMouseClicked(new EventHandler<MouseEvent>(){//if the image is clicked the mouse event will run below

            @Override
            public void handle(MouseEvent t) {// this is the mouse event
                
                ImageView mercury2 = new ImageView(initMercury); // makes a new image 
                mercury2.setFitWidth(400); // makes the image 400px width
                mercury2.setFitHeight(400); //400px in height
                lab3.setGraphic(mercury2); // sets the image onto the label of lab3
                lab1.setText("Mercury"); //sets the text in the label lab1 to mercury
                
                planetWeight = earthWeight*0.37; // takes the information from the textbox and does the calculation
                result = String.valueOf(forma.format(planetWeight)); //sets the result to the string of the planet weight
                lab4.setText("Your Weight on Mercury is: "+result+"lbs"); //displays the weight
            }
        });

   /*------------------Venus---------------------------------------------------*/
        final Image initVenus = new Image(getClass().getResourceAsStream("venus.jpg"));
        final ImageView venus = new ImageView(initVenus);
        venus.setFitWidth(100);
        venus.setFitHeight(100);
              
        
                          
        venus.setOnMouseClicked(new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent t) {
                lab1.setText("Venus");
                
                ImageView venus2 = new ImageView(initVenus);
                venus2.setFitWidth(400);
                venus2.setFitHeight(400);
                lab3.setGraphic(venus2);
                
                planetWeight = earthWeight*0.88;
                result = String.valueOf(forma.format(planetWeight));
                lab4.setText("Your Weight on Venus is: "+result+"lbs"); 
            }
    });
   /*-------------------------Earth---------------------------------------------*/
        final Image initEarth = new Image(getClass().getResourceAsStream("earth.jpg"));
        final ImageView earth = new ImageView(initEarth);
        earth.setFitWidth(100);
        earth.setFitHeight(100);
        
        earth.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent t) {
                lab1.setText("Earth, You should know your weight here...");
                
                ImageView earth2 = new ImageView(initEarth);
                earth2.setFitWidth(400);
                earth2.setFitHeight(400);
                lab3.setGraphic(earth2);
                
                planetWeight = earthWeight;
                result = String.valueOf(forma.format(planetWeight));
                lab4.setText("Your Weight on Earth is: "+result+"lbs");
            }
    });
        /*------------------Mars---------------------------------------------------*/
        final Image initMars = new Image(getClass().getResourceAsStream("mars.jpg"));
        final ImageView mars = new ImageView(initMars);
        mars.setFitWidth(100);
        mars.setFitHeight(100);
        
        mars.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent t) {
                lab1.setText("Mars");
                
                ImageView mars2 = new ImageView(initMars);
                mars2.setFitWidth(400);
                mars2.setFitHeight(400);
                lab3.setGraphic(mars2);
                
                planetWeight = earthWeight*0.38;
                result = String.valueOf(forma.format(planetWeight));
                lab4.setText("Your Weight on Mars is: "+result+"lbs");
            }
        });
    /*------------------Jupiter---------------------------------------------------*/
        final Image initJupiter = new Image(getClass().getResourceAsStream("jupiter.jpg"));
        final ImageView jupiter = new ImageView(initJupiter);
        jupiter.setFitWidth(100);
        jupiter.setFitHeight(100);
        
        jupiter.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent t) {
                lab1.setText("Jupiter");
                
                ImageView jupiter2 = new ImageView(initJupiter);
                jupiter2.setFitWidth(400);
                jupiter2.setFitHeight(400);
                lab3.setGraphic(jupiter2);
                
                
                planetWeight = earthWeight*2.64;
                result = String.valueOf(forma.format(planetWeight));
                lab4.setText("Your Weight on Jupiter is: "+result+"lbs"); 
            }
            
        });
        
        /*------------------Saturn---------------------------------------------------*/
        final Image initSaturn = new Image(getClass().getResourceAsStream("saturn.jpg"));
        final ImageView saturn = new ImageView(initSaturn);
        saturn.setFitWidth(100);
        saturn.setFitHeight(100);
       
        saturn.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent t) {
                lab1.setText("Saturn");
        
                ImageView saturn2 = new ImageView(initSaturn);
                saturn2.setFitWidth(400);
                saturn2.setFitHeight(400);
                lab3.setGraphic(saturn2);
                
                planetWeight = earthWeight*1.15;
                result = String.valueOf(forma.format(planetWeight));
                lab4.setText("Your Weight on Saturn is: "+result+"lbs");
            }
            
        });
        
        /*------------------Uranus---------------------------------------------------*/
        final Image initUranus = new Image(getClass().getResourceAsStream("uranus.jpg"));
        final ImageView uranus = new ImageView(initUranus);
        uranus.setFitWidth(100);
        uranus.setFitHeight(100);
        
        uranus.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent t) {
                lab1.setText("Uranus");
        
                ImageView uranus2 = new ImageView(initUranus);
                uranus2.setFitWidth(400);
                uranus2.setFitHeight(400);
                lab3.setGraphic(uranus2);
                
                planetWeight = earthWeight*1.15;
                result = String.valueOf(forma.format(planetWeight));
                lab4.setText("Your Weight on Uranus is: "+result+"lbs");
        
            }
            
        });
        
        /*------------------Neptune---------------------------------------------------*/
        final Image initNeptune = new Image(getClass().getResourceAsStream("neptune.jpg"));
        final ImageView neptune = new ImageView(initNeptune);
        neptune.setFitWidth(100);
        neptune.setFitHeight(100);
        
        neptune.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent t) {
                lab1.setText("Neptune");
        
                ImageView neptune2 = new ImageView(initNeptune);
                neptune2.setFitWidth(400);
                neptune2.setFitHeight(400);
                lab3.setGraphic(neptune2);
                
                planetWeight = earthWeight*1.12;
                result = String.valueOf(forma.format(planetWeight));
                lab4.setText("Your Weight on Neptune is: "+result+"lbs");
            }
            
        });
        
  /*------------------Pluto---------------------------------------------------*/
        final Image initPluto = new Image(getClass().getResourceAsStream("pluto.jpg"));
        final ImageView pluto = new ImageView(initPluto);
        pluto.setFitWidth(100);
        pluto.setFitHeight(100);
        
        pluto.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent t) {
                lab1.setText("Pluto");
        
                ImageView pluto2 = new ImageView(initPluto);
                pluto2.setFitWidth(400);
                pluto2.setFitHeight(400);
                lab3.setGraphic(pluto2);
                
                planetWeight = earthWeight*0.04;
                result = String.valueOf(forma.format(planetWeight));
                lab4.setText("Your Weight on Pluto is: "+result+"lbs");
            }
            
        });
        
    /*------------------Submit Button---------------------------------------------------*/
        Button submit = new Button("submit");
        submit.setOnAction(new EventHandler<ActionEvent>() {
           
            @Override
            public void handle(ActionEvent event) {
            
                weight = txtFld.getText();//gets the users input as string
                if(Double.parseDouble(weight)>0){ // if the weight is greater than 0 itll convert it to primitive double
                earthWeight = Double.parseDouble(weight);//converts the users string to double
                request.setText("Thank You. Please select a planet or enter another number to try again");
                }else {
                    request.setText("Please Enter a number greater than 0"); 
                }
                
                
            }
        });
/*-------------------Putting things in boxes-------------------------------------*/    
        hbox2.getChildren().addAll(mercury3, venus, earth, mars, jupiter, saturn, uranus, neptune, pluto);
        vbox2.getChildren().addAll(hbox2, header,request, txtFld, submit, lab3, lab1, lab4);
        hbox.getChildren().addAll(vbox2);
/*--------------------------Creating the scene and Showing it-------------------------------------*/        
Scene scene = new Scene(hbox, 980, 800);
     
        primaryStage.setTitle("Hello Planets!");// sets the title of the window stage
        primaryStage.setScene(scene);// sets the scene of hbox to the stage
        primaryStage.show();//displays the stage
    }

    public static void main(String[] args) {
        launch(args); //runs the application launcher. This calls the constructor to build the javafx
    }
    
}
