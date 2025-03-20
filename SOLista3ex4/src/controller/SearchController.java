package controller;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;

public class SearchController {

	private JTextField textField;
	private JButton btnProcurar;

	public SearchController(JTextField textField, JButton btnProcurar) {

		this.textField = textField;
		this.btnProcurar = btnProcurar;

		// Adicionando o listener ao botão

		this.btnProcurar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				buscarArquivo();

			}

		});

	}

}
