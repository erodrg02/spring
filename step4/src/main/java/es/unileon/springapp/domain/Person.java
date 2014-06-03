/* Application developed for AW subject, belonging to passive operations
 group.*/

package es.unileon.springapp.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Gonzalo
 */

@Entity
@Table(name = "clients")
public class Person  implements Serializable{

	/**
	 * Name of the person
	 */
	private String name;

	 @Id
	 @Column(name = "id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	/**
	 * DNI
	 */
	private String dni;

	/**
	 * surnames of the person
	 */
	private String surnames;

	/**
	 * address of the person
	 */
	private Address address;

	/**
	 * marritage state of the person
	 */
	private String civilState;

	/**
	 * phone numbers of the person
	 */
	private int[] phoneNumbers;

	/**
	 * proffesion of the person
	 */
	private String profession;

	/**
	 * birth date of the person
	 */
	private Date birthDate;

	/**
	 * Creates a new Person with all the data
	 * 
	 * @param name
	 * @param surnames
	 * @param address
	 * @param civilState
	 * @param phoneNumber1
	 * @param phoneNumber2
	 * @param profession
	 * @param dniNumber
	 * @param dniLetter
	 * @param birthDate
	 * @throws MalformedHandlerException
	 */

	public Person(String name, String surnames, Address address,
			String civilState, int phoneNumber1, int phoneNumber2,
			String profession, int dniNumber, char dniLetter, Date birthDate) {
		this.name = name;
		this.surnames = surnames;
		this.address = address;
		this.civilState = civilState;
		this.phoneNumbers = new int[2];
		this.phoneNumbers[0] = phoneNumber1;
		this.phoneNumbers[1] = phoneNumber2;
		this.profession = profession;
		this.birthDate = birthDate;
	}

	public Person(String name, String surnames, Address address, String dni) {
		this.name = name;
		this.surnames = surnames;
		this.address = address;
		this.dni = dni;
	}

	public Person() {

	}

	/**
	 *
	 * @param name
	 * @param surnames
	 * @param address
	 * @param civilState
	 * @param phoneNumber1
	 * @param phoneNumber2
	 * @param profession
	 * @param birthDate
	 * @param foreingLetter
	 * @param dniNumber
	 * @param dniLetter
	 * @throws MalformedHandlerException
	 */
	public Person(String name, String surnames, Address address,
			String civilState, int phoneNumber1, int phoneNumber2,
			String profession, Date birthDate, char foreingLetter,
			int dniNumber, char dniLetter) {
		this.name = name;
		this.surnames = surnames;
		this.address = address;
		this.civilState = civilState;
		this.phoneNumbers = new int[2];
		this.phoneNumbers[0] = phoneNumber1;
		this.phoneNumbers[1] = phoneNumber2;
		this.profession = profession;
		this.birthDate = birthDate;
	}

	/**
	 *
	 * @return the name of the person
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the person
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return the surnames of the person
	 */
	public String getSurnames() {
		return surnames;
	}

	/**
	 * Sets the surnames of the person
	 * 
	 * @param surnames
	 */
	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}

	/**
	 * 
	 * @return the address of the person
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Sets the address of the person
	 * 
	 * @param address
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * 
	 * @return the marital status of the person
	 */
	public String getCivilState() {
		return civilState;
	}

	/**
	 * Sets the marital status of the person
	 * 
	 * @param civilState
	 */
	public void setCivilState(String civilState) {
		this.civilState = civilState;
	}

	/**
	 * 
	 * @param pos
	 * @return the phone number of the person in pos
	 */
	public int getPhoneNumber(int pos) {
		if (pos <= 1 && pos >= 0)
			return phoneNumbers[pos];
		else
			return 0;
	}

	/**
	 * Sets a phone number of the person in pos
	 * 
	 * @param pos
	 * @param phoneNumbers
	 */
	public void replacePhoneNumber(int pos, int phoneNumbers) {
		if (pos <= 1 && pos >= 0)
			this.phoneNumbers[pos] = phoneNumbers;
		// else
		// TODO Exception
	}

	/**
	 * Remove a phone number in pos
	 * 
	 * @param pos
	 */
	public void removePhoneNumber(int pos) {
		// TODO
	}

	/**
	 * 
	 * @return the profession of the person
	 */
	public String getProfession() {
		return profession;
	}

	/**
	 * Sets the profession of the person
	 * 
	 * @param profession
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}

	/**
	 * 
	 * @return the birth date of the person
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * Sets the birth date of the person
	 * 
	 * @param birthDate
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public int[] getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(int[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

}
