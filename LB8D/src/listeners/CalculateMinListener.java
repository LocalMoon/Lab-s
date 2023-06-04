package listeners;

import javax.swing.JTextArea;

import classes2.Matrix;

public class CalculateMinListener extends JTextArea implements IMatrixListener {

	@Override
	public void matrixUpdated(Matrix matrix) {
		long min = 100;
		for (int i=0; i <matrix.getSize(); i++) {
			for (int j=0; j < matrix.getSize(); j++) {
				if (min > matrix.getValue(i, j)) {
					min = matrix.getValue(i, j);
				}
				;
			}
		}
		setText("Minimum = " + String.valueOf(min));
	}
}
