package main.java.ua.nure.itai171.chmutov.usermanagement.gui;

import main.java.ua.nure.itai171.chmutov.usermanagement.util.Messages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class BrowsePanel extends JPanel implements ActionListener {

    private static final String BROWSE_PANEL = "browsePanel";
    private static final String ADD_BUTTON = "addButton";
    private static final String CANCEL_BUTTON = "cancelButton";
    private static final String OK_BUTTON= "okButton";
    private static final String EDIT_BUTTON = "editButton";
    private static final String DELETE_BUTTON = "deleteButton";
    private static final String DETAILS_BUTTON = "detailsButton";
    private static final String USER_TABLE = "userTable";
    private static final String ERROR_TITLE = "Error";

    private MainFrame parent;
    private JScrollPane tablePanel;
    private JPanel buttonPanel;
    private JButton addButton;
    private JButton cancelButton;
    private JButton okButton;
    private JButton editButton;
    private JButton deleteButton;
    private JButton detailsButton;
    private JTable userTable;

    private void initialize() {
        setLayout(new BorderLayout());
        this.setName(BROWSE_PANEL);
        add(getTablePanel(), BorderLayout.CENTER);
        add(getButtonsPanel(), BorderLayout.SOUTH);
    }
    private JScrollPane getTablePanel() {
        if (Objects.isNull(tablePanel)) {
            tablePanel = new JScrollPane(getUserTable());
        }
        return tablePanel;
    }

    private JPanel getButtonsPanel() {
        if (Objects.isNull(buttonPanel)) {
            buttonPanel = new JPanel();
            buttonPanel.add(getAddButton());
            buttonPanel.add(getEditButton());
            buttonPanel.add(getDeleteButton());
            buttonPanel.add(getDetailsButton());
        }
        return buttonPanel;
    }

    private JButton getAddButton() {
        if (Objects.isNull(addButton)) {
            addButton = new JButton();
            addButton.setText(Messages.getString("BrowsePanel.addButton"));
            addButton.setName(ADD_BUTTON);
            addButton.setActionCommand("add");
            addButton.addActionListener(this);
        }
        return addButton;
    }

    private JButton getEditButton() {
        if (Objects.isNull(editButton)) {
            editButton = new JButton();
            editButton.setText(Messages.getString("editButton"));
            editButton.setName(EDIT_BUTTON);
            editButton.setActionCommand("edit");
            editButton.addActionListener(this);
        }
        return editButton;
    }
    private JButton getOkButton() {
        if (okButton == null){
            okButton = new JButton();
            okButton.setText("Добавить");
            okButton.setName("okButton");
            okButton.setActionCommand("ok");
            okButton.addActionListener(this);
        }
        return okButton;
    }
    private JButton getCancelButton() {
        if (cancelButton == null){
            cancelButton = new JButton();
            cancelButton.setText("canceled");
            cancelButton.setName("canceledButton");
            cancelButton.setActionCommand("cancel");
            cancelButton.addActionListener(this);
        }
        return cancelButton;
    }

    private JButton getDeleteButton() {
        if (Objects.isNull(deleteButton)) {
            deleteButton = new JButton();
            deleteButton.setText(Messages.getString("deleteButton"));
            deleteButton.setName(DELETE_BUTTON);
            deleteButton.setActionCommand("delete");
            deleteButton.addActionListener(this);
        }
        return deleteButton;
    }
    private JTable getUserTable() {
        if (Objects.isNull(userTable)) {
            userTable = new JTable();
            userTable.setName(USER_TABLE);
        }
        initTable();
        return userTable;
    }

    private JButton getDetailsButton() {
        if (Objects.isNull(detailsButton)) {
            detailsButton = new JButton();
            detailsButton.setText(Messages.getString("detailsButton"));
            detailsButton.setName(DETAILS_BUTTON);
            detailsButton.setActionCommand("details");
            detailsButton.addActionListener(this);
        }
        return detailsButton;
    }
    public void actionPerformed(ActionEvent e) {

    }

}
