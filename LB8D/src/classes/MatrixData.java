package classes;

import generators.DiagonalGenerator;
import generators.IGenerator;
import generators.IdentityGenerator;
import generators.RandomGenerator;
import generators.ZeroGenerator;

public class MatrixData {
	public static IGenerator[] generators = {
		new ZeroGenerator(),
		new IdentityGenerator(),
		new DiagonalGenerator(),
		new RandomGenerator()
	};
	
}
