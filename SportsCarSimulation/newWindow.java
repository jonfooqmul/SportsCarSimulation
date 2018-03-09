import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class newWindow extends Frame implements ActionListener{

    private TextField tf =new TextField(30);
    private TextField tf1=new TextField(30);
    private Label acceleration;
    private Label fuel;

    public newWindow () {
        super("Vehicle Class Creator");
        setSize(500,500);
        setLayout(new FlowLayout());
        addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent windowEvent){
                    System.exit(0);
                }
            });
        acceleration=new Label("Acceleration: ");
        add(acceleration);
        
        add(tf);
        
        fuel=new Label ("Fuel consumption: ");
        add(fuel);
        
        add(tf1);
      
        acceleration.setAlignment(Label.LEFT);
        fuel.setAlignment(Label.LEFT);
        
        
        
        Button sportCar = new Button("Create Sport Car");
        sportCar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double horsepower = Double.parseDouble(JOptionPane.showInputDialog("Enter horsepower"));
                    double weight =Double.parseDouble( JOptionPane.showInputDialog("Enter weight"));
                    double topspeed =Double.parseDouble( JOptionPane.showInputDialog("Enter topspeed"));
                    Sportcar s = new Sportcar(horsepower,weight,topspeed);
                    tf.setText(Double.toString(TestConsumption.fuelConsumption(s)));
                    tf1.setText(Double.toString(s.acceleration()));
                }
            });
            
            
        Button van = new Button("Create Van");
        van.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    double horsepower = Double.parseDouble(JOptionPane.showInputDialog("Enter horsepower"));
                    double aerodynamics = Double.parseDouble(JOptionPane.showInputDialog("Enter aerodynamics"));
                    double weight =Double.parseDouble( JOptionPane.showInputDialog("Enter weight"));
                    double carryweight =Double.parseDouble( JOptionPane.showInputDialog("Enter carry weight"));
                    Van v = new Van(horsepower,aerodynamics,weight,carryweight);
                    tf.setText("N/A");
                    tf1.setText(Double.toString(v.acceleration()));
                }
            });

        add(sportCar);
        add(van);


        setVisible(true);
    }

    public void actionPerformed (ActionEvent e){

    }

    public static void main (String [] args) {
        newWindow w1 = new newWindow();
    }
}

