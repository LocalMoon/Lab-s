package listeners;

import classes2.Matrix;

public class CalculateSumListener3 extends AbstractTextMatrixListener {

	long sum;
	
	@Override
	protected void initialization(Matrix matrix) {
		sum=0;
	}

	@Override
	protected void nextStep(Matrix matrix, int i, int j) {
		sum += matrix.getValue(i, j);
	}

	@Override
	protected void finalization(Matrix matrix) {
		setText("Summa=" + String.valueOf(sum));
	}

}
