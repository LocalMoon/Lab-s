package classes2;

import java.util.ArrayList;

import generators.IGenerator;
import listeners.IMatrixListener;

public class Matrix {
	final private int size = 10;
	private long[][] contents;
	private IGenerator generator;
	
	public int getSize() {
		return size;
	}
	
	public Matrix(IGenerator generator) {
		super();
		this.generator = generator;
	}

	public void setGenerator(IGenerator generator) {
		this.generator = generator;
	}
	
	private ArrayList<IMatrixListener> listeners = new ArrayList<IMatrixListener>();
	
	public void addListener(IMatrixListener listener) {
		listeners.add(listener);
	}
	
	private void notifyAboutUpdate() {
		for (IMatrixListener listener : listeners) {
			listener.matrixUpdated(this);
		}
	}
	
	public void update() {
		contents = new long[size][size];
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				contents[i][j] = generator.getElement(i, j);
			}
		}
		notifyAboutUpdate();
	}
	
	public long getValue(int i, int j) {
		return contents[i][j];
	}
	
}
