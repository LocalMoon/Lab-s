package listeners;

import classes2.Matrix;

public class CalculateMaxListener3 extends AbstractTextMatrixListener {

	long max;
	
	@Override
	protected void initialization(Matrix matrix) {
		max = matrix.getValue(0, 0);		
	}

	@Override
	protected void nextStep(Matrix matrix, int i, int j) {
		if (max < matrix.getValue(i, j)) {
			max = matrix.getValue(i, j);
		}
	}

	@Override
	protected void finalization(Matrix matrix) {
		setText("Maximum=" + String.valueOf(max));
	}

}
