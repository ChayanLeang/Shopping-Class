package ArrayInput;

public class Sale{
	
	Customer customer;
	String date;
	double serviceExpense;
	double productExpense;
	
	Sale(Customer customer,String date) {
		this.customer=customer;
		this.date=date;
	}
	
	String getDate() {
		return date;
	}
	
	double getServiceExpense() {
		return serviceExpense;
	}
	
	void setServiceExpense() {
		serviceExpense=customer.getServiceMemberDiscount();
	}

	double getProductExpense() {
		return productExpense;
	}
	
	void setProductExpense() {
		productExpense=customer.getProductMemberDiscount();
	}
	
	double getTotalExpense() {
		return productExpense + serviceExpense;
	}
	
	void DisplayInfo() {
		System.out.println("CustomerName : " +customer.getCustomerName());
		System.out.println("CustomerType : " +customer.getCustomerType());
		System.out.println("Date : " + date);
		System.out.println("ServiceExpense : " +serviceExpense);
		System.out.println("ProductExpense : " +productExpense);
		System.out.println("TotalExpense : " +getTotalExpense());
	}
}
