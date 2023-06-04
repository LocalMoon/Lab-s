package classes3;

import generators.*;
import listeners.CalculateMaxListener3;
import listeners.CalculateMinListener3;
import listeners.CalculateSumListener3;
import listeners.CalculateTraceListener3;
import listeners.DisplayMatrixListener;
import listeners.IMatrixListener;

public class MatrixData {
	public static IMatrixListener[] listeners = {
		new DisplayMatrixListener(), // Данная функция не описана
		new CalculateMaxListener3(),
		new CalculateMinListener3(),
		new CalculateSumListener3(),
		new CalculateTraceListener3()
	};
	
	public static IGenerator[] generators = {
			new ZeroGenerator(),
			new IdentityGenerator(),
			new DiagonalGenerator(),
			new RandomGenerator(),
			new ChessOrderGenerator()
		};
}




























