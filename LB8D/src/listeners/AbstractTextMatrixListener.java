package listeners;

import javax.swing.JTextArea;
import classes2.Matrix;


public abstract class AbstractTextMatrixListener extends JTextArea implements IMatrixListener {
	@Override
	final public void matrixUpdated(Matrix matrix) {
		
		initialization(matrix);
		for (int i=0; i <matrix.getSize(); i++) {
			for (int j=0; j < matrix.getSize(); j++) {
				nextStep(matrix,i,j);
			}
		}
		finalization(matrix);
	}
	protected abstract void initialization(Matrix matrix);
	protected abstract void nextStep(Matrix matrix, int i, int j);
	protected abstract void finalization(Matrix matrix);
}
