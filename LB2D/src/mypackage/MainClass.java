package mypackage;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class MainClass {
	public static void main(String[] args) {
        //Создание окна
		JFrame frame = new JFrame();
		//Завершить приложение при закрытии окна
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Размер окна
		frame.setSize(600, 500);
		//Позиция окна
		frame.setLocation(500, 500);
		//Заголовок окна
		frame.setTitle("Банковский калькулятор");
		//Сделать окно видимым
		frame.setVisible(true);
		frame.setLayout(new GridLayout(0, 2));
		
		frame.add(new JLabel("Тип продукта"));
		frame.add(new JComboBox<String>(new String[] {"Кредит", "Вклад"}));
		frame.add(new JLabel("Срок продукта (в мес.)"));
		JComboBox<Integer> period = new JComboBox<Integer>(new Integer[] {3, 6, 12});
		frame.add(period);
		frame.add(new JLabel("Сумма"));
		final JTextField firstField = new JTextField("          ");
		frame.add(firstField);
		frame.add(new JLabel("Процент(годовой)"));
		final JTextField secondField = new JTextField("          ");
		frame.add(secondField);
		//Создание кнопки
		final JButton calculateButton = new JButton("Выплаченная сумма = ");
		frame.add(calculateButton);
		final JTextField resultField = new JTextField("          ");
		frame.add(resultField);
		
		calculateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				float x = Float.parseFloat(firstField.getText());
				float y = Float.parseFloat(secondField.getText());
				float z = Float.parseFloat(period.getSelectedItem().toString());
				float result = x * y / 100 * z / 12;
				resultField.setText(String.valueOf(result));
			}			
		});
	}
}