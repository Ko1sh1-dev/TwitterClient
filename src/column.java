
import javax.swing.JPanel;
import java.awt.Color;

public class column extends JPanel {

  private Timeline timeline;
  private tlHeader header;

  /*column() {
    this.setLayout(null);
    this.setSize(250, 600);
    this.setLocation(0, 0);
    this.setBackground(Color.BLACK);
  }*/

  column(Timeline timeline, tlHeader header) {
    this.timeline = timeline;
    this.header = header;
    build();
  }

  private void build() {
    this.setLayout(null);
    this.setSize(280, 400);
    this.setLocation(0, 0);
    this.setBackground(Color.BLACK);

    this.add(timeline);
    this.add(header);
  }

  public void setTimeline(Timeline timeline) {
    this.timeline = timeline;
  }

  public void setHeader(tlHeader header) {
    this.header = header;
  }
}
