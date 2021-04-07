package main;

import java.util.Date;

import javax.swing.JOptionPane;

import list.List;
import models.Client;
import models.Rent;
import models.Theme;

public final class Main {

	static List<Client> clientList = new List<Client>();
	static List<Rent> rentList = new List<Rent>();
	static List<Theme> themeList = new List<Theme>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clientOptions = "1 - Adicionar cliente \n2 - Excluir cliente \n4 - Adicionar tema \n7 - Adicionar aluguel \n8 - Excluir aluguel \n10 - Sair";
		int option = Integer.parseInt(JOptionPane.showInputDialog(clientOptions));

		while (option != 9) {
			switch (option) {
			case 1:
				addNewClient();
				break;
			case 2:
				removeClient();
				break;
			case 3:
				// alterar
				break;
			case 4:
				addNewTheme();
				break;
			case 5:
				removeTheme();
				break;
			case 6:
				// alterar
				break;
			case 7:
				addNewRent();
				break;
			case 8:
				removeRent();
				break;
			case 10:
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Valor inv�lido");
			}
			option = Integer.parseInt(JOptionPane.showInputDialog(clientOptions));
		}

	}

	private static void addNewClient() {
		Client client = new Client();
		client.setName(JOptionPane.showInputDialog("Informe o nome do cliente"));
		client.setTel(JOptionPane.showInputDialog("Informe o telefone do cliente"));
		client.setRegisteredAt(new Date());
		clientList.addAtBeginning(client);
	}

	private static void removeClient() {
		int position = Integer.parseInt(JOptionPane
				.showInputDialog(clientList.showListValues() + "\n Digite a posi��o do cliente que deseja remover"));
		clientList.removeInAnyPosition(position);
	}

	private static void addNewTheme() {
		Theme theme = new Theme();
		theme.setName(JOptionPane.showInputDialog("Informe o nome do tema"));
		themeList.addAtBeginning(theme);
	}

	private static void removeTheme() {
		int position = Integer.parseInt(JOptionPane
				.showInputDialog(themeList.showListValues() + "\n Digite a posi��o do tema que deseja remover"));
		themeList.removeInAnyPosition(position);
	}

	private static void addNewRent() {
		Rent rent = new Rent();
		rent.setDate(JOptionPane.showInputDialog("Informe a data"));
		rent.setAddress(JOptionPane.showInputDialog("Informe o endere�o"));
		rent.setTheme(null);
		rentList.addAtBeginning(rent);
	}

	private static void removeRent() {
		int position = Integer.parseInt(JOptionPane
				.showInputDialog(rentList.showListValues() + "\n Digite a posi��o do cliente que deseja remover"));
		rentList.removeInAnyPosition(position);
	}

}
