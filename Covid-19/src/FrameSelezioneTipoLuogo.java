import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class FrameSelezioneTipoLuogo extends JFrame {

	private JPanel contentPane;
	private Controller controller;

	public FrameSelezioneTipoLuogo(Controller controller) {
		setTitle("Analisi COVID-19");
		setResizable(false);
		
		this.controller = controller;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnProvincia = new JButton("");
		btnProvincia.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			
				System.out.println("Tipo luogo 'Provincia' selezionato");
				controller.tipoLuogo = luogo.provincia;
				controller.posizioneFinestra = getLocation();
				
				controller.tipoLuogoSelezionato();
			
				setVisible(false);
				dispose();
				
			}
		});
		
		JButton btnRegione = new JButton("");
		btnRegione.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			
				System.out.println("Tipo luogo 'Regione' selezionato");
				controller.tipoLuogo = luogo.regione;
				controller.posizioneFinestra = getLocation();
				
				controller.tipoLuogoSelezionato();
			
				setVisible(false);
				dispose();
				
			}
		});
		
		JButton btnPaese = new JButton("");
		btnPaese.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			
				System.out.println("Tipo luogo 'Paese' selezionato");
				controller.tipoLuogo = luogo.paese;
				controller.posizioneFinestra = getLocation();
				
				controller.tipoLuogoSelezionato();
			
				setVisible(false);
				dispose();
				
			}
		});
		
		JButton btnContinente = new JButton("");
		btnContinente.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			
				System.out.println("Tipo luogo 'Continente' selezionato");
				controller.tipoLuogo = luogo.continente;
				controller.posizioneFinestra = getLocation();
				
				controller.tipoLuogoSelezionato();
				
				setVisible(false);
				dispose();
			
			}
		});
		
		JLabel lblAndamento = new JLabel("Andamento COVID-19 - Analisi Statistica");
		lblAndamento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAndamento.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnProvincia, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAndamento)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnRegione, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnPaese, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnContinente, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(84)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnContinente, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPaese, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnRegione, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnProvincia, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
					.addComponent(lblAndamento)
					.addGap(24))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
