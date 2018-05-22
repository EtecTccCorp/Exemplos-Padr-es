package host.local.prototipagem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.Rectangle;
import java.awt.Cursor;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;

public class Fornecedor {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
           System.err.println(ex);
        }
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fornecedor window = new Fornecedor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Fornecedor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 971, 719);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(300, 14, 46, 14);
		frame.getContentPane().add(lblId);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(356, 11, 80, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(299, 98, 140, 33);
		frame.getContentPane().add(textField_1);
		
		JLabel lblEmpresa = new JLabel("EMPRESA:");
		lblEmpresa.setBounds(300, 73, 85, 14);
		frame.getContentPane().add(lblEmpresa);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setBounds(486, 73, 85, 14);
		frame.getContentPane().add(lblCnpj);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(485, 98, 140, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(299, 182, 180, 30);
		frame.getContentPane().add(textField_3);
		
		JLabel lblRua = new JLabel("RUA:");
		lblRua.setBounds(299, 157, 46, 14);
		frame.getContentPane().add(lblRua);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(486, 182, 120, 30);
		frame.getContentPane().add(textField_4);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(491, 157, 46, 14);
		frame.getContentPane().add(lblCep);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(703, 182, 50, 30);
		frame.getContentPane().add(textField_5);
		
		JLabel lblNumero = new JLabel("NUMERO:");
		lblNumero.setBounds(704, 157, 86, 14);
		frame.getContentPane().add(lblNumero);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(299, 258, 140, 20);
		frame.getContentPane().add(textField_6);
		
		JLabel lblBairro = new JLabel("BAIRRO:");
		lblBairro.setBounds(300, 233, 73, 14);
		frame.getContentPane().add(lblBairro);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(485, 258, 140, 20);
		frame.getContentPane().add(textField_7);
		
		JLabel lblCidade = new JLabel("CIDADE:");
		lblCidade.setBounds(486, 233, 85, 14);
		frame.getContentPane().add(lblCidade);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(704, 258, 140, 20);
		frame.getContentPane().add(textField_8);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setBounds(705, 233, 46, 14);
		frame.getContentPane().add(lblUf);
		
		JLabel lblTelefone = new JLabel("TELEFONE:");
		lblTelefone.setBounds(299, 304, 74, 14);
		frame.getContentPane().add(lblTelefone);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(298, 329, 140, 20);
		frame.getContentPane().add(textField_9);
		
		JLabel lblTelefone_1 = new JLabel("TELEFONE:");
		lblTelefone_1.setBounds(486, 304, 85, 14);
		frame.getContentPane().add(lblTelefone_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(485, 329, 140, 20);
		frame.getContentPane().add(textField_10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "LISTA DE FORNECEDORES CADASTRADOS", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(294, 430, 658, 247);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setBounds(6, 16, 646, 224);
		panel_2.add(table);
		table.setToolTipText("LISTA DE FORNECEDORES");
		table.setSurrendersFocusOnKeystroke(true);
		table.setShowVerticalLines(true);
		table.setShowHorizontalLines(true);
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"ID", "EMPRESA", "CNPJ", "RUA", "CEP", "NUMERO", "BAIRO", "CIDADE", "UF", "TELEFONE", "TELEFONE"},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(62);
		table.getColumnModel().getColumn(3).setPreferredWidth(127);
		table.getColumnModel().getColumn(5).setPreferredWidth(59);
		table.getColumnModel().getColumn(6).setPreferredWidth(100);
		table.getColumnModel().getColumn(8).setPreferredWidth(34);
		
		JPanel panel = new JPanel();
		panel.setIgnoreRepaint(true);
		panel.setFont(new Font("SansSerif", Font.PLAIN, 12));
		panel.setFocusTraversalPolicyProvider(true);
		panel.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		panel.setBackground(new Color(54, 33, 89));
		panel.setToolTipText("");
		panel.setForeground(new Color(72, 61, 139));
		panel.setBounds(0, -6, 274, 681);
		frame.getContentPane().add(panel);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Varej\u00E3o Santos");
		lblNewJgoodiesTitle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		lblNewJgoodiesTitle.setIcon(new ImageIcon("H:\\ETEC\\TCC\\TCC\\src\\imagens\\icons8-p\u00E1gina-inicial-25.png"));
		lblNewJgoodiesTitle.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesTitle.setBackground(new Color(72, 61, 139));
		lblNewJgoodiesTitle.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewJgoodiesTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton = new JButton("CADASTRAR fornecedor");
		btnNewButton.setIcon(new ImageIcon("H:\\ETEC\\TCC\\TCC\\src\\imagens\\icons8-administrador-masculino-25.png"));
		btnNewButton.setFocusable(false);
		btnNewButton.setBorder((new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true)));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnNewButton.setBackground(new Color(54, 33, 89));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton button = new JButton("CADASTRAR CLIENTE");
		button.setIcon(new ImageIcon("H:\\ETEC\\TCC\\TCC\\src\\imagens\\icons8-gest\u00E3o-de-cliente-50.png"));
		button.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		button.setBorder((new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true)));
		button.setForeground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBackground(new Color(54, 33, 89));
		
		JSeparator separator = new JSeparator();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(button, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
				.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(16)
					.addComponent(lblNewJgoodiesTitle)
					.addContainerGap(11, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(14)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(56, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(59)
					.addComponent(lblNewJgoodiesTitle)
					.addGap(45)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(173)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(277, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.setBounds(299, 370, 89, 23);
		frame.getContentPane().add(btnSalvar);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(637, 55, 154, 1);
		frame.getContentPane().add(horizontalStrut);
		
		JButton btnVoltar = new JButton("VOLTAR");
		btnVoltar.setBounds(482, 370, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
		JLabel lblProduto = new JLabel("PRODUTO:");
		lblProduto.setBounds(704, 304, 85, 14);
		frame.getContentPane().add(lblProduto);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(703, 328, 140, 23);
		frame.getContentPane().add(comboBox);
	}
}
