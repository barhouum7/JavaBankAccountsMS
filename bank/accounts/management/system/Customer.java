package bank.accounts.management.system;

public class Customer {

	private String firstName;
	private String lastName;
	private String address;

	public Customer(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "\nCustomer's Full Info is:  FirstName= " + firstName + " | LastName= " + lastName + " | Address= "
				+ address;
	}

}
