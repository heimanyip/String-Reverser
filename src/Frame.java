import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class Frame {

	private JFrame frmStringReverser;
	private JTextField inputField;
	private JTextField outputField;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					window.frmStringReverser.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStringReverser = new JFrame();
		frmStringReverser.setTitle("String Reverser");
		frmStringReverser.setBounds(100, 100, 450, 300);
		frmStringReverser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStringReverser.getContentPane().setLayout(null);
		
		inputField = new JTextField();
		inputField.setBounds(95, 52, 247, 34);
		frmStringReverser.getContentPane().add(inputField);
		inputField.setColumns(10);
		
		outputField = new JTextField();
		outputField.setEditable(false);
		outputField.setBounds(95, 96, 247, 34);
		frmStringReverser.getContentPane().add(outputField);
		outputField.setColumns(10);
		
		JButton btnReverse = new JButton();
		btnReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReverse.setAction(action);
		btnReverse.setBounds(173, 177, 89, 23);
		frmStringReverser.getContentPane().add(btnReverse);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Reverse");
			putValue(SHORT_DESCRIPTION, "Click to reverse the string");
		}
		public void actionPerformed(ActionEvent e) {
			outputField.setText(ReverseString.reverse(inputField.getText()));
		}
	}
	

}
