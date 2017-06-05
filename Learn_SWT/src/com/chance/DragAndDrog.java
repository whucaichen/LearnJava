package com.chance;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Created by Chance on 16/08/25.
 */
public class DragAndDrog extends ApplicationWindow {
    private Text dropText;
    private Text dragText;

    /**
     * Create the application window.
     */
    public DragAndDrog() {
        super(null);
        createActions();
        addToolBar(SWT.FLAT | SWT.WRAP);
        addMenuBar();
        addStatusLine();
    }

    /**
     * Create contents of the application window.
     *
     * @param parent
     */
    @Override
    protected Control createContents(Composite parent) {
        Composite container = new Composite(parent, SWT.NONE);

        dropText = new Text(container, SWT.BORDER);
        dropText.setBounds(46, 48, 73, 21);

        DropTarget target = new DropTarget(dropText, DND.DROP_MOVE);
        target.setTransfer(new Transfer[]{TextTransfer.getInstance()});
        target.addDropListener(new DropTargetListener() {

            @Override
            public void dropAccept(DropTargetEvent event) {
                // TODO Auto-generated method stub

            }

            @Override
            public void drop(DropTargetEvent event) {
                // TODO Auto-generated method stub
                dropText.setText(String.valueOf(event.data));
            }

            @Override
            public void dragOver(DropTargetEvent event) {
                // TODO Auto-generated method stub

            }

            @Override
            public void dragOperationChanged(DropTargetEvent event) {
                // TODO Auto-generated method stub

            }

            @Override
            public void dragLeave(DropTargetEvent event) {
                // TODO Auto-generated method stub

            }

            @Override
            public void dragEnter(DropTargetEvent event) {
                // TODO Auto-generated method stub

            }
        });

        dragText = new Text(container, SWT.BORDER);
        dragText.setBounds(198, 48, 73, 21);

        DragSource dragSource = new DragSource(dragText, DND.DROP_MOVE);
        dragSource.setTransfer(new Transfer[]{TextTransfer.getInstance()});
        dragSource.addDragListener(new DragSourceListener() {

            @Override
            public void dragStart(DragSourceEvent event) {
                // TODO Auto-generated method stub

            }

            @Override
            public void dragSetData(DragSourceEvent event) {
                event.data = dragText.getText();

            }

            @Override
            public void dragFinished(DragSourceEvent event) {
                // TODO Auto-generated method stub

            }
        });

        return container;
    }

    /**
     * Create the actions.
     */
    private void createActions() {
        // Create the actions
    }

    /**
     * Create the menu manager.
     *
     * @return the menu manager
     */
    @Override
    protected MenuManager createMenuManager() {
        MenuManager menuManager = new MenuManager("menu");
        return menuManager;
    }

    /**
     * Create the toolbar manager.
     *
     * @return the toolbar manager
     */
    @Override
    protected ToolBarManager createToolBarManager(int style) {
        ToolBarManager toolBarManager = new ToolBarManager(style);
        return toolBarManager;
    }

    /**
     * Create the status line manager.
     *
     * @return the status line manager
     */
    @Override
    protected StatusLineManager createStatusLineManager() {
        StatusLineManager statusLineManager = new StatusLineManager();
        return statusLineManager;
    }

    /**
     * Launch the application.
     *
     * @param args
     */
    public static void main(String args[]) {
        try {
            DragAndDrog window = new DragAndDrog();
            window.setBlockOnOpen(true);
            window.open();
            Display.getCurrent().dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Configure the shell.
     *
     * @param newShell
     */
    @Override
    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText("New Application");
    }

    /**
     * Return the initial size of the window.
     */
    @Override
    protected Point getInitialSize() {
        return new Point(450, 300);
    }
}