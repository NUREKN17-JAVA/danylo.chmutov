package main.java.ua.nure.itai171.chmutov.usermanagement.gui;

import main.java.ua.nure.itai171.chmutov.usermanagement.util.Messages;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class MainFrame extends JFrame {
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 600;

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }
    private void initialize() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle(Messages.getString("userManagement"));
        this.setContentPane(getContentPanel());
    }
    private JPanel getContentPanel() {
        if (Objects.isNull(contentPanel)) {
            contentPanel = new JPanel();
            contentPanel.setLayout(new BorderLayout());
            contentPanel.add(getBrowsePanel(), BorderLayout.CENTER);
        }
        return contentPanel;
    }
    private JPanel getBrowsePanel() {
        if (Objects.isNull(browsePanel)) {
            browsePanel = new BrowsePanel(this);
        }
        ((BrowsePanel) browsePanel).initTable();
        return browsePanel;
    }
    public void showBrowsePanel() {
        showPanel(getBrowsePanel());
    }
    public void showAddPanel() {
        showPanel(getAddPanel());
    }
    private void showPanel(JPanel panel) {
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setVisible(true);
        panel.repaint();
    }
}
