package classes2;

import generators.*;
import listeners.CalculateMaxListener;
import listeners.CalculateMinListener;
import listeners.CalculateSumListener;
import listeners.CalculateTraceListener;
import listeners.DisplayMatrixListener;
import listeners.IMatrixListener;

public class MatrixData {
	public static IMatrixListener[] listeners = {
		new DisplayMatrixListener(), // Данная функция не описана
		new CalculateMaxListener(),
		new CalculateMinListener(),
		new CalculateSumListener(),
		new CalculateTraceListener()
	};
	
	public static IGenerator[] generators = {
			new ZeroGenerator(),
			new IdentityGenerator(),
			new DiagonalGenerator(),
			new RandomGenerator(),
			new ChessOrderGenerator()
		};
	
}
