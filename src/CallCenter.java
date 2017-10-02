import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CallCenter extends JFrame {

	private Call atendente1;
	private Call atendente2;
	private Call atendente3;
	private JPanel contentPane;
	private TextArea txtArea;
	private JComboBox listaChamados;
	private JButton btnLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CallCenter frame = new CallCenter();
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
	public CallCenter() {
		setTitle("Call Center");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnCall = new JButton("Call");
		btnCall.setBounds(177, 37, 89, 23);
		contentPane.add(btnCall);

		listaChamados = new JComboBox();
		listaChamados.setBounds(23, 38, 134, 20);
		contentPane.add(listaChamados);

		txtArea = new TextArea();
		txtArea.setBounds(10, 123, 482, 190);
		contentPane.add(txtArea);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(276, 37, 89, 23);
		contentPane.add(btnLimpar);

		atendente1 = new CallCenter1();
		atendente2 = new CallCenter2();
		atendente3 = new CallCenter3();

		atendente1.setSucessor(atendente2);
		atendente2.setSucessor(atendente3);

		preencherCombobox();
		btnCall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chamado call = new Chamado(listaChamados.getSelectedIndex());
				atendente1.requisicao(call);
				txtArea.setText(call.getLogMensagem());
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtArea.setText("");
			}
		});
	}

	private void preencherCombobox() {

		try {
			DefaultComboBoxModel model = new DefaultComboBoxModel();

			model.addElement(Chamado.TiposChamados.SAC);
			model.addElement(Chamado.TiposChamados.SUPORTE);
			model.addElement(Chamado.TiposChamados.COBRANCA);
			model.addElement(Chamado.TiposChamados.CANCELAMENTO);

			listaChamados.setModel(model);

		} catch (Exception e) {
			System.out.println("Erro " + e.getMessage());
		}

	}

}
