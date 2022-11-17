package q1;

public class Sale {
  private String customerCod;
  private String customerName;
  private String itemCod;
  private String itemName;
  private int amount;
  private float total;
  private float unitPrice;
  private String type;

  public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public float getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(float unitPrice) {
    this.unitPrice = unitPrice;
  }

  public float getTotal() {
    return total;
  }

  public void setTotal(float total) {
    this.total = total;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getCustomerCod() {
    return customerCod;
  }

  public void setCustomerCod(String customerCod) {
    this.customerCod = customerCod;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getItemCod() {
    return itemCod;
  }

  public void setItemCod(String itemCod) {
    this.itemCod = itemCod;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }
}
