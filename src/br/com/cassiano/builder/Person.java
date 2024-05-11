package br.com.cassiano.builder;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	private String firstName;
	private String middleName;
	private String lastname;
	private LocalDate birthdate;
	private final LocalDate currentDate = LocalDate.now();

	private Person(PersonBuilder personBuilder) {
		this.firstName = personBuilder.firstName;
		this.middleName = personBuilder.middleName;
		this.lastname = personBuilder.lastname;
		this.birthdate = LocalDate.parse(personBuilder.birthdate);
	}
	
	public static final class PersonBuilder{
		private String firstName;
		private String middleName;
		private String lastname;
		private String birthdate;
		
		public PersonBuilder() {	
		}

		public PersonBuilder firstName(String firstName) {
			this.firstName =firstName;
			return this;
		}
		
		public PersonBuilder middleName(String middleName) {
			this.middleName =middleName;
			return this;
		}
		
		public PersonBuilder lastname(String lastname) {
			this.lastname =lastname;
			return this;
		}
		
		public PersonBuilder birthdate(String birthdate) {
			this.birthdate =birthdate;
			return this;
		}
		
		public Person build() {
			return new Person (this);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(firstName + " ")
		.append(middleName+ " ")
		.append(lastname+ " ")
		.append(Period.between(birthdate , currentDate).getYears())
		.append(" anos");
		return sb.toString();
	}
	
}
