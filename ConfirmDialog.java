package Button1;
// Nama : Vani Aulia Pramesti
// NIM : 32602000068

//Pada codingan ini meliputi Message Dialog, Confirm Dialog, Input Dialog di masing button dan kasusnya
//

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ConfirmDialog extends JFrame {

	private JPanel contentPane;
	private JTextField InputPanjang;
	private JTextField HasilOutput;
	private JTextField InputLebar;
	private JButton InputDialog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmDialog frame = new ConfirmDialog();
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
	public ConfirmDialog() {
		setFont(new Font("Times New Roman", Font.BOLD, 12));
		setTitle("Luas Persegi Panjang");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Masukan Panjang :");
		lblNewLabel.setBounds(56, 46, 121, 20);
		contentPane.add(lblNewLabel);
		
		InputPanjang = new JTextField();
		InputPanjang.setHorizontalAlignment(SwingConstants.CENTER);
		InputPanjang.setBounds(180, 46, 96, 20);
		contentPane.add(InputPanjang);
		InputPanjang.setColumns(10);
		
		JButton Proses = new JButton("Process");
		Proses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int Panjang, Lebar, Luas;
				Panjang = Integer.parseInt(InputPanjang.getText());
				Lebar = Integer.parseInt(InputLebar.getText());
				Luas = Panjang*Lebar;
				HasilOutput.setText(String.valueOf(Luas));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Error; Silahkan Masukan Angka Yang Benar");
				}
				
			}
		});
		Proses.setBounds(187, 142, 89, 23);
		contentPane.add(Proses);
		
		HasilOutput = new JTextField();
		HasilOutput.setHorizontalAlignment(SwingConstants.CENTER);
		HasilOutput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		HasilOutput.setBounds(149, 187, 160, 40);
		contentPane.add(HasilOutput);
		HasilOutput.setColumns(10);
		
		InputLebar = new JTextField();
		InputLebar.setHorizontalAlignment(SwingConstants.CENTER);
		InputLebar.setColumns(10);
		InputLebar.setBounds(180, 89, 96, 20);
		contentPane.add(InputLebar);
		
		JLabel lblNewLabel_1 = new JLabel("Masukan Lebar    :");
		lblNewLabel_1.setBounds(58, 92, 112, 17);
		contentPane.add(lblNewLabel_1);
		
		JButton ResetButton = new JButton("Reset");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "Are You Sure ?", " Warning !", DO_NOTHING_ON_CLOSE);
					InputPanjang.setText(null);
					InputLebar.setText(null);
					HasilOutput.setText(null);
				
			}
		});
		ResetButton.setBounds(285, 142, 89, 23);
		contentPane.add(ResetButton);
		
		InputDialog = new JButton("Input");
		InputDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInputDialog(null, "Masukan Angka Apa Saja", "Input", DO_NOTHING_ON_CLOSE);
			}
		});
		InputDialog.setBounds(88, 142, 89, 23);
		contentPane.add(InputDialog);
	}
}
