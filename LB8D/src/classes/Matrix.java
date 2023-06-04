package classes;

import generators.IGenerator;

public class Matrix {
	final private int size = 10;
	private long[][] contents;
	private IGenerator generator;
	
	public int getSize() {
		return size;
	}
	
	public void setGenerator(IGenerator generator) {
		this.generator = generator;
	}
	
//	public void update() {
//		contents = new long[size][size];
//		for (int i=0; i<size; i++) {
//			for (int j=0; j<size; j++) {
//				contents[i][j] = generator.getElement(i, j);
//			}
//		}
//	}
	
	public void update() {
		contents = new long[size][size];
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				contents[i][j] = generator.getElement(i, j);
			}
		}
	}
	
	public long getValue(int i, int j) {
		return contents[i][j];
	}

	
	
	
}
