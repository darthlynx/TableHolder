package jface.tableholder.view.actions;

import org.eclipse.jface.action.Action;

import jface.tableholder.view.TableCreator;

public class PasteRowAction extends Action {
    
    private TableCreator tableCreator;

    public PasteRowAction() {
        super("&Paste@Ctrl+V", AS_PUSH_BUTTON);
        setToolTipText("Paste line from clipboard");
    }

    public void run() {
        tableCreator.pasteRow();
    }
    
    public void setTableCreator(TableCreator tableCreator) {
        this.tableCreator = tableCreator;
    }
}
