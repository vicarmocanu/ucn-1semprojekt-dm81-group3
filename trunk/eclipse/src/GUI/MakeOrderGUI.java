package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.BoxLayout;
import java.awt.Window.Type;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MakeOrderGUI extends JFrame {

	private JPanel contentPane;
	private JTextField idField;
	private JTextField customerNameField;
	private JTextField employeeNameField;
	private JTextField nameField;
	private JTextField nrOfProductsField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MakeOrderGUI frame = new MakeOrderGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MakeOrderGUI() {
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 374, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		final JPanel makeSalePanel = new JPanel();
		contentPane.add(makeSalePanel);
		makeSalePanel.setLayout(new MigLayout("", "[][][grow][]", "[][][][][][][][][][][][]"));
		
		JLabel lblNewSale = new JLabel("NEW SALE");
		makeSalePanel.add(lblNewSale, "cell 2 0");
		
		JSeparator separator_3 = new JSeparator();
		makeSalePanel.add(separator_3, "cell 0 1 4 1,growx");
		
		JLabel lblId = new JLabel("ID:");
		makeSalePanel.add(lblId, "cell 1 2");
		
		idField = new JTextField();
		makeSalePanel.add(idField, "cell 2 2,growx");
		idField.setColumns(10);
		
		JLabel lblCustomerName = new JLabel("CUSTOMER NAME:");
		makeSalePanel.add(lblCustomerName, "cell 1 3");
		
		customerNameField = new JTextField();
		makeSalePanel.add(customerNameField, "cell 2 3,growx");
		customerNameField.setColumns(10);
		
		JLabel lblEmployeeName = new JLabel("EMPLOYEE NAME:");
		makeSalePanel.add(lblEmployeeName, "cell 1 4");
		
		employeeNameField = new JTextField();
		makeSalePanel.add(employeeNameField, "cell 2 4,growx");
		employeeNameField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		makeSalePanel.add(separator, "cell 0 5 4 1,growx");
		
		JLabel lblBarCode = new JLabel("NAME:");
		makeSalePanel.add(lblBarCode, "cell 1 6");
		
		nameField = new JTextField();
		makeSalePanel.add(nameField, "cell 2 6,growx");
		nameField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NR. OF PRODUCTS:");
		makeSalePanel.add(lblNewLabel, "cell 1 7");
		
		nrOfProductsField = new JTextField();
		makeSalePanel.add(nrOfProductsField, "cell 2 7,growx");
		nrOfProductsField.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		makeSalePanel.add(separator_1, "cell 0 8 4 1,growx");
		
		JButton btnAddProduct = new JButton("ADD PRODUCT");
		makeSalePanel.add(btnAddProduct, "cell 2 9,growx");
		
		JSeparator separator_2 = new JSeparator();
		makeSalePanel.add(separator_2, "cell 0 10 4 1,growx");
		
		JButton btnPrintTotal = new JButton("PRINT TOTAL");
		
		makeSalePanel.add(btnPrintTotal, "cell 2 11,growx");
		
		final JPanel printTotalPanel = new JPanel();
		printTotalPanel.setVisible(false);
		contentPane.add(printTotalPanel);
		printTotalPanel.setLayout(null);
		
		btnPrintTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				makeSalePanel.setVisible(false);
				printTotalPanel.setVisible(true);
				
			}
		});
		JLabel lblPrintTotal = new JLabel("PRINT TOTAL");
		lblPrintTotal.setBounds(26, 11, 89, 14);
		printTotalPanel.add(lblPrintTotal);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(7, 25, 1, 2);
		printTotalPanel.add(separator_4);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 27, 338, 289);
		printTotalPanel.add(textPane);
		
		JButton btnNewButton = new JButton("CANCEL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(259, 0, 89, 23);
		printTotalPanel.add(btnNewButton);
	}
}
