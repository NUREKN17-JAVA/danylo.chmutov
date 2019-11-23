package test.java.ua.nure.itai171.chmutov.usermanagement.gui;
import junit.extensions.jfcunit.JFCTestCase;
import junit.extensions.jfcunit.JFCTestHelper;
import main.java.ua.nure.itai171.chmutov.usermanagement.gui.MainFrame;

public class MainFrameTest extends JFCTestCase {
    private MainFrame mainFrame;

    public void setUp(){
        setHelper(new JFCTestHelper());
        mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
    public void tearDown() throws Exception{


        mainFrame.setVisible(false);
        TestHelper.cleanUp(this);
    }
}
