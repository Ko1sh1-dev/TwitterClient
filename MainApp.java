
import javax.swing.JFrame;

public class MainApp extends JFrame {

  MainApp() {

    this.setTitle("Twitter Client");

    this.getContentPane().setLayout(null);
    this.setSize(1080, 720);
    this.setLocation(60, 60);
    this.setResizable(true);

    //this.getContentPane().add(new column());
    this.getContentPane().add(new column(new Timeline(), new tlHeader()));

    this.setVisible(true);
  }

  public static void main(String args[]) {
    new MainApp();
  }
}
