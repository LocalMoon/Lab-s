package listeners;

import javax.swing.JTextArea;

import classes2.Matrix;

public class CalculateTraceListener3 extends AbstractTextMatrixListener {

	long trace;
	
	@Override
	protected void initialization(Matrix matrix) {
		trace=0;
	}

	@Override
	protected void nextStep(Matrix matrix, int i, int j) {
		if (i==j) {
			trace += matrix.getValue(i, j);
		}
	}

	@Override
	protected void finalization(Matrix matrix) {
		setText("Trace="+String.valueOf(trace));
	}


	
}
