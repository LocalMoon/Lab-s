package MyPackage;

import java.awt.*;
import java.awt.event.*;
import java.util.Enumeration;
import javax.swing.*;
import java.util.List;

public class CoffeeChooserFrame extends JFrame {

        public CoffeeChooserFrame() {
            super("Список кофеен");
            setSize(900, 700);
            setLocation(300,200);
            setLayout(new BorderLayout());


            createMenubar();
            createToolbar();
            createListsPanel();
            createToolbarListeners();
            createButtonsListeners();
        }

    private void createMenubar() {

        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
        JMenu fileMenu = new JMenu("Файл");
        menubar.add(fileMenu);
        JMenuItem exitItem = new JMenuItem("Выйти");
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0));
        exitItem.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e) {
                int option = JOptionPane.showConfirmDialog(getParent(), " Вы действительно хотите выйти? ", " Подтвердить",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                if (option == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }
            }
        });
        fileMenu.add(exitItem);
    }

    private JButton resetButton, saveButton;
    private void createToolbar() {

        saveButton = new JButton("Сохранить");
        resetButton = new JButton("Повторить");
        JPanel toolbar = new JPanel();
        toolbar.setLayout(new FlowLayout());
        toolbar.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        toolbar.add(saveButton); toolbar.add(resetButton);
        add(toolbar, BorderLayout.NORTH);
    }

    private DefaultListModel<String> coffeeModel, teamModel;
	private JList<String> coffeeList, teamList;
	private JButton takeButton, returnButton, takeAllButton, returnAllButton;
	private JPanel createButtonsPanel() {

		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		buttonsPanel.setLayout(new GridLayout(4, 0));
		takeButton = new JButton(">");
		takeButton.setToolTipText("Добавить выделенные кофейни");
		takeAllButton = new JButton(">>");
		takeAllButton.setToolTipText("Добавить все кофейни");
		returnButton = new JButton("<");
		returnButton.setToolTipText("Вернуть выделенные кофейни");
		returnAllButton = new JButton("<<");
		returnAllButton.setToolTipText("Вернуть все кофейни");
		buttonsPanel.add(takeButton);
		buttonsPanel.add(takeAllButton);
		buttonsPanel.add(returnButton);
		buttonsPanel.add(returnAllButton);
		
		return buttonsPanel;
	}

    private void createButtonsListeners() {

		takeButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				List<String> selection = coffeeList.getSelectedValuesList();
				for (String coffee : selection) {
					teamModel.addElement(coffee);
				}
				for (String coffee : selection) {
					coffeeModel.removeElement(coffee);
				}
			}		
		});
		
		returnButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				List<String> selection = teamList.getSelectedValuesList();
				for (String coffee : selection) {
					coffeeModel.addElement(coffee);
				}
				for (String coffee : selection) {
					teamModel.removeElement(coffee);
				}
			}			
		});
		
		takeAllButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				Enumeration<String> elements = coffeeModel.elements();
				while (elements.hasMoreElements()) {
					String next = elements.nextElement();
					teamModel.addElement(next);
				}
				coffeeModel.removeAllElements();
			}
		});
		
		returnAllButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				Enumeration<String> elements = teamModel.elements();
				while (elements.hasMoreElements()) {
					String next = elements.nextElement();
					coffeeModel.addElement(next);
				}
				teamModel.removeAllElements();
			}
		});
		
	}

	private void createToolbarListeners() {

		saveButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				String all = "";
				Enumeration<String> elements = teamModel.elements();
				while (elements.hasMoreElements()) {
					all += elements.nextElement() + "\n";
				}
				JOptionPane.showMessageDialog(getParent(), all,
						"Выбраны кофейни: ",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		resetButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				teamModel.removeAllElements();
				coffeeModel.removeAllElements();
				for (String coffee : coffeeBase.getcoffee()) {
					coffeeModel.addElement(coffee);
				}
			}
		});
	}
    
	private void createListsPanel() {

		coffeeModel = new DefaultListModel<String>();
		for (String coffee : coffeeBase.getcoffee()) {
			coffeeModel.addElement(coffee);
		}		
		teamModel = new DefaultListModel<String>();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout());
		coffeeList = new JList<String>(coffeeModel);
		coffeeList.setToolTipText("Доступные кофейни");
		coffeeList.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		teamList = new JList<String>(teamModel);
		teamList.setToolTipText("Выбранные кофейни");
		teamList.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel.add(coffeeList);
		panel.add(createButtonsPanel());
		panel.add(teamList);
		add(panel, BorderLayout.CENTER);
	}	
	
}
