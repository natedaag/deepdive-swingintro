/**
 * 
 */
package edu.cnm.deepdive.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 * @author natedaag
 *
 */
public class HelloWorld implements ActionListener {
  
  private JFrame frame;
  
  private void createAndShowGui() {
    frame = new JFrame("Hello World in Swing");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label = new JLabel("Hello World");
    frame.getContentPane().add(label);
    frame.pack();
    frame.setVisible(true);
    
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {new HelloWorld().createAndShowGui();});// invoke when idle - once main is done
  }

  @Override
  public void actionPerformed(ActionEvent evt) { //this and invoke later are functional interfaces (lambdas) 
    // TODO Auto-generated method stub
    
  }

}
