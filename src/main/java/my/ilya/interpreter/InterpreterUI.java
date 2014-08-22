package my.ilya.interpreter;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class InterpreterUI {

  public static void main(String[] args) {
    Display display = new Display();
    Shell shell = new Shell(display);
    shell.setMaximized(true);
    shell.setSize(200, 200);
    shell.setText("Button Example");

    final Button button = new Button(shell, SWT.PUSH);
    button.setBounds(40, 50, 50, 20);
    button.setText("Click Me");

    final Text text = new Text(shell, SWT.BORDER);
    text.setBounds(100, 50, 70, 20);

    button.addSelectionListener(new SelectionListener() {

      public void widgetSelected(SelectionEvent event) {
        text.setText("No problem");
      }

      public void widgetDefaultSelected(SelectionEvent event) {
        text.setText("No worries!");
      }
    });

    shell.open();
    while (!shell.isDisposed()) {
      if (!display.readAndDispatch())
        display.sleep();
    }
    display.dispose();
  }

}