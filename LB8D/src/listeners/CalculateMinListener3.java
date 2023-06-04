package listeners;

import classes2.Matrix;

public class CalculateMinListener3 extends AbstractTextMatrixListener {

	long min;
	
	@Override
	protected void initialization(Matrix matrix) {
		min = matrix.getValue(0, 0);		
	}

	@Override
	protected void nextStep(Matrix matrix, int i, int j) {
		if (min > matrix.getValue(i, j)) {
			min = matrix.getValue(i, j);
		}
	}

	@Override
	protected void finalization(Matrix matrix) {
		setText("Minimum=" + String.valueOf(min));
	}

}
