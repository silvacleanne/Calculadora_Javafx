package calculadora;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**Ações para o botão numérico. Ela simplesmente concatena o número ao final do texto do visor**/ 
public class OperationsPanel extends JPanel implements ActionListener{
	
	private JTextField txtText;
	
	private char op;
	private double valor1;
	private double valor2;
	
	private JButton botSoma;
	private JButton botSub;
	private JButton botMult;
	private JButton botDiv;
	private JButton botIgual;
	private JButton botClear;
	
	
	public OperationsPanel(JTextField txtText ) {
		this.txtText = txtText;
		
		/***Numeros de linhas e colunas***/
		setLayout(new GridLayout(6,1));
		
		/**Associamos os botões as suas respectivas ações**/
		/**Isso só associará a ação ao clique do botão**/
		botSoma = new JButton("+");
		botSoma.addActionListener(this);
		add(botSoma);
		
		botSub = new JButton("-");
		botSub.addActionListener(this);
		add(botSub);
		
		botMult = new JButton("*");
		botMult.addActionListener(this);
		add(botMult);
		
		botDiv = new JButton("/");
		botDiv.addActionListener(this);
		add(botDiv);
		
		botIgual = new JButton("=");
		botIgual.addActionListener(this);
		add(botIgual);
		
		botClear = new JButton("C");
		botClear.addActionListener(this);
		add(botClear);
	}

	
	/***Metodo para implementa as ações referente aos botões***/
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(txtText.getText().isEmpty()) {//verifica se a string esta vazia
			return;
		}
		/**Define qual nobão foi clicado**/
		JButton bot = (JButton) e.getSource();
		
		if(bot == botClear) {
			op = '\u0000';//define o null para o objeto
			txtText.setText("");//vai limpar
		}else if(bot == botIgual) {
			valor2 = Double.parseDouble(txtText.getText());
			double result = 0.0;
			
			if(op == '+') {
				result = valor1 + valor2;
			}else if (op == '-') {
				result = valor1 - valor2;
			}else if (op == '*') {
				result = valor1 * valor2;
			}else if (op == '/') {
				result = valor1 / valor2;
			}
			txtText.setText(String.valueOf(result));//armazenar 
			op = '\u0000';
			valor1= result;
			valor2= 0;
			
			}else {
			op =bot.getText().charAt(0);
			valor1=Double.parseDouble(txtText.getText());
			txtText.setText(" ");
		}
		
	}
}



