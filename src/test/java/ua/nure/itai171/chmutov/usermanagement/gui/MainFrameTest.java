package test.java.ua.nure.itai171.chmutov.usermanagement.gui;

import junit.extensions.jfcunit.JFCTestCase;
import junit.extensions.jfcunit.JFCTestHelper;
import main.java.ua.nure.itai171.chmutov.usermanagement.gui.MainFrame;

import java.awt.*;

import static junit.framework.Assert.assertNotNull;

public class MainFrameTest extends JFCTestCase {
    private MainFrame mainFrame;

    public void setUp() {
        setHelper(new JFCTestHelper());
        mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }

    public void tearDown() throws Exception {


        mainFrame.setVisible(false);
        TestHelper.cleanUp(this);
    }

    private Component find(Class componentClass, String name) {
        NamedComponentFinder finder = new NamedComponentFinder(componentClass, name);
        finder.setWait(0);
        Component component = finder.find(mainFrame, 0);
        assertNotNull("Could not find component ‘" + name + "’", component);
        return component;
    }
}
