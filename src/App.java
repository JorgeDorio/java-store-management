package q1;

import javax.swing.JOptionPane;

import q1.panels.ClientTypeMenu;
import q1.panels.MainMenu;
import q1.panels.ShowClients;
import q1.panels.registers.EmployeeRegister;
import q1.panels.registers.ItemRegister;
import q1.panels.registers.PFRegister;
import q1.panels.registers.PJRegister;
import q1.panels.registers.SaleRegister;

public class App {
	public static void main(String[] args) {
		ClienteFuncionario[] arrF = new ClienteFuncionario[3];
		ClientePessoaFisica[] arrPF = new ClientePessoaFisica[3];
		ClientePessoaJuridica[] arrPJ = new ClientePessoaJuridica[3];
		Item[] arrItem = new Item[3];
		Sale[] arrSale = new Sale[3];
		int[] counter = { 0, 0, 0, 0, 0 };
		Boolean repeat = true;
		Sale lastSale = new Sale();

		while (repeat) {
			MainMenu mainMenu = new MainMenu();
			int action = mainMenu.render();

			switch (action) {
			case 0:
				int type = ClientTypeMenu.render();
				switch (type) {
				case 0:
					EmployeeRegister employeeRegister = new EmployeeRegister();
					arrF[counter[0]] = employeeRegister.render();
					counter[0]++;
					break;
				case 1:
					PFRegister pfRegister = new PFRegister();
					arrPF[counter[1]] = pfRegister.render();
					counter[1]++;
					break;
				case 2:
					PJRegister pjRegister = new PJRegister();
					arrPJ[counter[2]] = pjRegister.render();
					counter[2]++;
					break;
				default:
					break;
				}
				break;
			case 1:
				ShowClients showClients = new ShowClients();
				showClients.render(arrF, arrPF, arrPJ, counter);
				break;
			case 2:
				ItemRegister itemRegister = new ItemRegister();
				arrItem[counter[3]] = itemRegister.render();
				counter[3]++;
				break;
			case 3:
				SaleRegister saleRegister = new SaleRegister();
				lastSale = saleRegister.render(arrF, arrPF, arrPJ, arrItem, arrSale);
				counter[4]++;
				arrSale[counter[4]] = lastSale;
				JOptionPane.showMessageDialog(null,
						"Cliente: " + lastSale.getCustomerName() + "\nTipo: " + lastSale.getType() + "\nItem: "
								+ lastSale.getItemName() + "\nValor unitário: " + lastSale.getUnitPrice()
								+ "\nQuantidade: " + lastSale.getAmount() + "\nValor Total com Desconto: "
								+ lastSale.getTotal());
				break;
			case 4:
				repeat = false;
				break;

			default:
				break;
			}
		}

	}

}
