package listeners;

import javax.swing.JTextArea;

import classes2.Matrix;

public class CalculateTraceListener extends JTextArea implements IMatrixListener {

	@Override
	public void matrixUpdated(Matrix matrix) {
		long trace = 0;
		for (int i=0; i<matrix.getSize(); i++) {
			trace += matrix.getValue(i, i);
		}
		setText("Trace = " + String.valueOf(trace));
	}
	
}
