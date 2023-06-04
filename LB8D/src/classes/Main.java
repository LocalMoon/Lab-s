package classes;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import classes2.Matrix;
import classes2.MatrixData;
import generators.IGenerator;
import listeners.DisplayMatrixListener;

public class Main {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Окно с матрицами");
		frame.setLocation(500, 500);
		frame.setSize(700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		JComboBox<String> combo = new JComboBox<String>();
		var matrixArea = new DisplayMatrixListener();
		frame.add(combo, BorderLayout.SOUTH);
		frame.add(matrixArea, BorderLayout.CENTER);
		Matrix matrix = new Matrix(MatrixData.generators[0]);

		for (IGenerator g : MatrixData.generators) {
			combo.addItem(g.getName());
		}
		

		combo.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			matrix.setGenerator(MatrixData.generators[combo.getSelectedIndex()]);
			matrix.update();
			String text = "";
			for (int i=0; i<matrix.getSize(); i++) {
				for (int j=0; j<matrix.getSize(); j++) {
					text += matrix.getValue(i, j);
					text += "\t";
					}
					text += "\n";
					matrixArea.setText(text);
				}
			System.out.print(text);
			}
		});
		
	}
}
