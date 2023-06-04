package generators;

public class RandomGenerator implements IGenerator {
	@Override
	public String getName() {
		return "Случайная матрица";
	}

//	@Override
//	public long getElement(int i, int j) {
//		return (long) Math.floor(Math.random()*100);
//	}
	
	@Override
	public long getElement(int i, int j) {
		return (long) Math.floor(Math.random()*100);
	}
}
