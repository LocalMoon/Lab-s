package listeners;
import javax.swing.JTextArea;

import classes2.Matrix;

public class DisplayMatrixListener extends JTextArea implements IMatrixListener {
	@Override
	public void matrixUpdated(Matrix matrix) {
		String text="";
		for (int i=0; i<matrix.getSize(); i++) {
			for (int j=0; j<matrix.getSize(); j++) {
				text += matrix.getValue(i, j);
				text += " ";
			}
			text += "\n";
		}
		setText(text);
	}
}
