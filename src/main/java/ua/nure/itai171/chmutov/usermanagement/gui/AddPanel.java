package main.java.ua.nure.itai171.chmutov.usermanagement.gui;

import main.java.ua.nure.itai171.chmutov.usermanagement.util.Messages;

import java.awt.event.ActionListener;

public class AddPanel extends AbstractModifiedPanel implements ActionListener {

    private static final String ADD_PANEL = "addPanel";
    private MainFrame parent;

    public AddPanel(MainFrame parent) {
        super(parent);
        this.parent = parent;
        this.setName(ADD_PANEL);
    }
    protected void performAction() {

    }
    protected String getConfirmButtonText() {
        return Messages.getString("addButton");
    }
}
