import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrameTipoQuerySingolo extends JFrame {

	private JPanel contentPane;
	private Controller controller;
	private luogo tipoLuogo;

	public FrameTipoQuerySingolo(Controller controller) {
		
		this.controller = controller;
		tipoLuogo = controller.tipoLuogo;
		
		setTitle("Analisi COVID-19 " + tipoLuogo);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(controller.posizioneFinestra.x, controller.posizioneFinestra.y, 600, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblSeleziona = new JLabel("Seleziona " + tipoLuogo);
		lblSeleziona.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JComboBox comboBoxPrimaSelezione = new JComboBox();
		riempiBoxSelezione(comboBoxPrimaSelezione);
		
		JButton btnQuery1 = new JButton("Query 1");
		btnQuery1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			
				Query query = new Query();
				
				System.out.println(query.queryEsempio());
				
			}
		});
		
		JButton btnQuery2 = new JButton("Query 2");
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(comboBoxPrimaSelezione, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblSeleziona, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(26)
							.addComponent(btnQuery1)
							.addGap(37)
							.addComponent(btnQuery2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(379, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addComponent(lblSeleziona)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(comboBoxPrimaSelezione, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(86)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnQuery1)
						.addComponent(btnQuery2))
					.addContainerGap(104, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void riempiBoxSelezione(JComboBox box) {
		
		switch(tipoLuogo) {
		case provincia:{
			box.addItem("Napoli"); //Aggiungi qui le provincie
			box.addItem("Salerno");
		}break;
		case regione:{
			box.addItem("Campania"); //Aggiungi qui le regioni
			box.addItem("Molise");
		}break;
		case paese:{
			box.addItem("Italia"); //Aggiungi qui i paese
			box.addItem("Germania");
		}break;
		case continente:{
			box.addItem("Europa"); //Aggiungi qui i continenti
			box.addItem("Asia");
		}break;
		}
		
	}
	
}
