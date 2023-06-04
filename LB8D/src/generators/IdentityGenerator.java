package generators;

public class IdentityGenerator implements IGenerator {
	@Override
	public String getName() {
		return "Единичная матрица";
	}

//	@Override
//	public long getElement(int i, int j) {
//		return i!=j ? 1 : 0;
//	}

	@Override
	public long getElement(int i, int j) {
		return 1;
//		return i==0 || j==0? 
//				(long) Math.floor(Math.random()*100) : 0;
	}
	
}
