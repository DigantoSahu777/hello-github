import java.awt.Toolkit;
import javax.swing.JFrame;
import java.awt.Dimension;

public class DDDTutorial extends JFrame 
{
    static Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
    static JFrame F = new DDDTutorial();
    Screen ScreenObject = new Screen();
    
    public DDDTutorial()
    {
       add(ScreenObject);
       setUndecorated(true);
       setSize(ScreenSize);
       setVisible(true);
    }
   
    public static void main(String[] args)
    {
    }
}
