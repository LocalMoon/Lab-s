package classes3;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import classes2.Matrix;
import generators.IGenerator;
import listeners.DisplayMatrixListener;
import listeners.IMatrixListener;

public class Main {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Окно с матрицами");
		frame.setLocation(500, 500);
		frame.setSize(700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JPanel listenersPanel = new JPanel();
		listenersPanel.setLayout(new GridLayout(0,5));
		frame.add(listenersPanel, BorderLayout.NORTH);
		
		JComboBox<String> combo = new JComboBox<String>();
		var matrixArea = new DisplayMatrixListener();
		frame.add(combo, BorderLayout.SOUTH);
		frame.add(matrixArea, BorderLayout.CENTER);
		Matrix matrix = new Matrix(MatrixData.generators[0]);

		for (IGenerator g : MatrixData.generators) {
			combo.addItem(g.getName());
		}
		
//		Непонятно, куда вставлять код ниже
		for (IMatrixListener listener : MatrixData.listeners) {
			listenersPanel.add((JTextArea) listener);
			matrix.addListener(listener);
		}
		
		matrix.update();
		
		combo.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
				matrix.setGenerator(MatrixData.generators[combo.getSelectedIndex()]);
				matrix.update();
			}
		});
		frame.setVisible(true);

	}
}
