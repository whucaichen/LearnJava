package com.chance;

import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * Created by Chance on 16/08/24.
 */
abstract class Origin {
    public void run() {
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText("shell example");
        shell.setBounds(100, 100, 400, 200);
        shell.setLayout(new FillLayout());
        todo(shell);
        shell.open();

        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }
        //dispose the resource
        display.beep();
        display.dispose();
    }

    public abstract void todo(Shell shell);//extension something here
}

/*
public class mainTestExample extends Origin {
    public static void main(String[] args) {
        new mainTestExample().run();
    }

    public void todo(Shell shell) {
        //...add something you like
        Label label_1 = new Label(shell, SWT.CENTER);
        label_1.setText("this is the text of a label");
    }
}
*/