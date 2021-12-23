package calculadora;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumbersPanel extends JPanel implements ActionListener{
	private JTextField txtText;

	
	public NumbersPanel(JTextField txtText) {
		this.txtText = txtText;
		
		/***Numeros de linhas e colunas***/
		setLayout(new GridLayout(4,4));
		
		
		/**Associamos os botões as suas respectivas ações**/
		/**Isso só associará a ação ao clique do botão**/
		JButton bot7 = new JButton("7");
		bot7.addActionListener(this);
		add(bot7);
		
		JButton bot8 = new JButton("8");
		bot8.addActionListener(this);
		add(bot8);
		
		JButton bot9 = new JButton("9");
		bot9.addActionListener(this);
		add(bot9);
		
		JButton bot4 = new JButton("4");
		bot4.addActionListener(this);
		add(bot4);
		
		JButton bot5 = new JButton("5");
		bot5.addActionListener(this);
		add(bot5);
		
		JButton bot6 = new JButton("6");
		bot6.addActionListener(this);
		add(bot6);
		
		JButton bot1 = new JButton("1");
		bot1.addActionListener(this);
		add(bot1);
		
		JButton bot2 = new JButton("2");
		bot2.addActionListener(this);
		add(bot2);
		
		JButton bot3 = new JButton("3");
		bot3.addActionListener(this);
		add(bot3);
		
		JButton bot0 = new JButton("0");
		bot0.addActionListener(this);
		add(bot0);
		
		JButton bot00 = new JButton("00");
		bot00.addActionListener(this);
		add(bot00);
		
		JButton botPonto = new JButton(".");
		botPonto.addActionListener(this);
		add(botPonto);
		
	}

	/***Metodo para implementa as ações referente aos botões***/
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(txtText.getText().length()==10) {
			return;
		}
		
		JButton bot = (JButton) e.getSource();
		String numero = bot.getText();
		txtText.setText(txtText.getText()+ numero);
	}

}
