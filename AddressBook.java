package com.bl;

public class AddressBook 
{
	/*
	 * Creating contact in AddressBook
	 */

		private String firstName;
		private String lastName;
		private String address;
		private String city;
		private String state;
		private int zip;
		private String phoneNumber;
		private String email;

		/*
		 * taking parameterized constructor to pass the values of contacts
		 */
		public AddressBook(String firstName, String lastName, String address, String city, String state, int zipcode,
				String phoneNumber, String email) 
		{
			super();

			/*
			 * this keyword is pointing to the class variables
			 */
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.city = city;
			this.state = state;
			this.zip = zipcode;
			this.phoneNumber = phoneNumber;
			this.email = email;
		}

		/*
		 * getter setter method is used to getting and setting the values The get method
		 * returns the variable value, and the set method sets the value.
		 */
		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public int getZip() {
			return zip;
		}

		public void setZip(int zip) {
			this.zip = zip;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

	}


