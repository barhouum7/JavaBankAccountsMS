package bank.accounts.management.system;

public class Customer {

	private static int customerId = 0;
	private String firstName;
	private String lastName;
	private String address;

	public Customer(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		customerId++;
	}

	@Override
	public String toString() {
		return "\nCustomer's Full Info with ID= " + customerId + " are:  FirstName= " + firstName + " | LastName= "
				+ lastName + " | Address= " + address;
	}

}
