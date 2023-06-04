package generators;

public class DiagonalGenerator implements IGenerator {
	@Override
	public String getName() {
		return "Диагональная матрица";
	}

//	@Override
//	public long getElement(int i, int j) {
//		return i!=j ? 0 : (long) Math.floor(Math.random()*100);
//	}
	
	@Override
	public long getElement(int i, int j) {
		return i!=j ? 0 : (long) Math.floor(Math.random()*100);
	}
}
