package calculadora;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;


public class Calc extends JFrame {
	
	public Calc() {
			/****titulo****/ 
		super("Calculadora");
	
		/*****camando para janela fechar*****/	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*****tamanho da janela*****/	
		setSize(300,300);
		
		/****** Painel superior *********/
		setLayout(new BorderLayout());
		TextPanel textPanel = new TextPanel();
		add(BorderLayout.NORTH, textPanel);//adicionar o painel
		
		/******Painel inferior******/
		JPanel digitoPanel = new JPanel();
		digitoPanel.setLayout(new BorderLayout());
		digitoPanel.add(BorderLayout.CENTER, new NumbersPanel(textPanel.getTxtNumber()));
		digitoPanel.add(BorderLayout.EAST,new OperationsPanel(textPanel.getTxtNumber()));
		add(BorderLayout.CENTER, digitoPanel);
		
		/****visual da janela****/
		setVisible(true);
		
	
	}
	
	public static void main(String[] args) throws Exception{
		new Calc();
	}
	

}
