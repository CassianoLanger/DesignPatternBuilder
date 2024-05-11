package br.com.cassiano.application;

import br.com.cassiano.builder.Person;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person.PersonBuilder()
				.firstName("Eloy")
				.middleName("Casagrande")
				.lastname("Lopes")
				.birthdate("1991-01-29")
				.build();
		
		System.out.println(person);
	}

}
