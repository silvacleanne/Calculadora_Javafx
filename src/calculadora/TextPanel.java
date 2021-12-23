package calculadora;

import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextPanel  extends JPanel{
	
	private JTextField txtNumber;//nome da caixa de texto
	
	/**** Painel ****/
	public TextPanel() {
		setLayout(new FlowLayout());//inseridos lado a lado
		txtNumber = new JTextField(20);//caixa de texto tamanho 20
		txtNumber.setHorizontalAlignment(JTextField.RIGHT);//alinhar os numeros a direita
		txtNumber.setEnabled(false);//desabilitar a edição, usar apenas os botões
		add(txtNumber);//adicionar no painel
	}

	/** Passa esses parametros em outros paineis**/
	public JTextField getTxtNumber() {
		return txtNumber;
	}
	
	
	
}
