package q1.panels.registers;

import q1.ClienteFuncionario;
import q1.ClientePessoaFisica;
import q1.ClientePessoaJuridica;
import q1.Item;
import q1.Sale;
import q1.panels.ClientTypeMenu;

public class SaleRegister {
	public Sale render(ClienteFuncionario[] arrF, ClientePessoaFisica[] arrPF, ClientePessoaJuridica[] arrPJ,
			Item[] arrItem, Sale[] arrSale) {
		int[] data = { 0, 0, 0 };
		Sale sale = new Sale();
		int selection = ClientTypeMenu.render();
		switch (selection) {
		case 0:
			SaleEmployeeRegister saleEmployeeRegister = new SaleEmployeeRegister();
			data = saleEmployeeRegister.render(arrF, arrItem);
			sale.setCustomerCod(arrF[data[0]].getCtps());
			sale.setCustomerName(arrF[data[0]].getName());
			sale.setItemCod(arrItem[data[1]].getCod());
			sale.setItemName(arrItem[data[1]].getName());
			sale.setAmount(data[2]);
			sale.setTotal(arrF[data[0]].returnOff(((float) sale.getAmount() * arrItem[data[1]].getValue())));
			sale.setUnitPrice(arrItem[data[0]].getValue());
			sale.setType("Funcionário");
			return sale;
		case 1:
			SalePFRegister salePFRegister = new SalePFRegister();
			data = salePFRegister.render(arrPF, arrItem);
			sale.setCustomerCod(arrPF[data[0]].getCpf());
			sale.setCustomerName(arrPF[data[0]].getName());
			sale.setItemCod(arrItem[data[1]].getCod());
			sale.setItemName(arrItem[data[1]].getName());
			sale.setAmount(data[2]);
			sale.setType("Pessoa Física");
			return sale;
		case 2:
			SalePJRegister salePJRegister = new SalePJRegister();
			data = salePJRegister.render(arrPJ, arrItem);
			sale.setCustomerCod(arrPJ[data[0]].getCnpj());
			sale.setCustomerName(arrPJ[data[0]].getName());
			sale.setItemCod(arrItem[data[1]].getCod());
			sale.setItemName(arrItem[data[1]].getName());
			sale.setAmount(data[2]);
			sale.setType("Pessoa Jurídica");
			return sale;
		default:
			break;
		}

		return sale;
	}
}
