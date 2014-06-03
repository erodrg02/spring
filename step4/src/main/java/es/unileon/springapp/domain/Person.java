/* Application developed for AW subject, belonging to passive operations
 group.*/

package es.unileon.springapp.domain;

import java.io.Serializable;
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
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	 @Column(name = "id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	 
	 /**
	 * Name of the person
	*/
	private String personName;

	 
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
	//private Address address;

	/**
	 * marritage state of the person
	 */
	private String civilState;

	/**
	 * phone numbers of the person
	 */
	private int phoneNumber1;
	public int getPhoneNumber1() {
		return phoneNumber1;
	}

	public void setPhoneNumber1(int phoneNumber1) {
		this.phoneNumber1 = phoneNumber1;
	}

	public int getPhoneNumber2() {
		return phoneNumber2;
	}

	public void setPhoneNumber2(int phoneNumber2) {
		this.phoneNumber2 = phoneNumber2;
	}


	private int phoneNumber2;

	/**
	 * proffesion of the person
	 */
	private String profession;


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

	public Person(String name, String surnames, String address,
			String civilState, int phoneNumber1, int phoneNumber2,
			String profession,String dni) {
		this.personName = name;
		this.surnames = surnames;
		//this.address = address;
		this.civilState = civilState;
		this.phoneNumber1=phoneNumber1;
		this.phoneNumber2=phoneNumber2;
		this.profession = profession;
		this.dni=dni;
	}


	public Person() {

	}


	/**
	 *
	 * @return the name of the person
	 */
	public String getPersonName() {
		return personName;
	}

	/**
	 * Sets the name of the person
	 * 
	 * @param name
	 */
	public void setPersonName(String name) {
		this.personName = name;
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
//	public Address getAddress() {
//		return address;
//	}

	/**
	 * Sets the address of the person
	 * 
	 * @param address
	 */
//	public void setAddress(Address address) {
//		this.address = address;
//	}

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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	
//	////////////////////////////////////////////////////////////////////////////////////
//    
//	 /**
//     * Street
//     */
//    private String street;
//   
//    /**
//     * Block in the street
//     */
//    //private int blockNumber;
//    
//    /**
//     * Floor in the block
//     */
//    private int floor;
//    
//    /**
//     * Door in the floor
//     */
//    private char door;
//    
//    /**
//     * Locality
//     */
//    private String locality;
//    
//    /**
//     * Province
//     */
//    private String province;
//    
//    /**
//     * 
//     */
//    private int zipCode;
//    
//	/**
//     * 
//     * @return street
//     */
//    public String getStreet() {
//        return street;
//    }
//
//    /**
//     * Sets the street
//     * @param street 
//     */
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
////    /**
////     * 
////     * @return the block number
////     */
////    public int getBlockNumber() {
////        return blockNumber;
////    }
////
////    /**
////     * Sets the block number
////     * @param blockNumber 
////     */
////    public void setBlockNumber(int blockNumber) {
////        this.blockNumber = blockNumber;
////    }
//
//    /**
//     * 
//     * @return the floor
//     */
//    public int getFloor() {
//        return floor;
//    }
//
//    /**
//     * Sets the floor
//     * @param floor 
//     */
//    public void setFloor(int floor) {
//        this.floor = floor;
//    }
//
//    /**
//     * 
//     * @return the door
//     */
//    public char getDoor() {
//        return door;
//    }
//
//    /**
//     * Sets the door
//     * @param door 
//     */
//    public void setDoor(char door) {
//        this.door = door;
//    }
//
//    /**
//     * 
//     * @return the locality
//     */
//    public String getLocality() {
//        return locality;
//    }
//    
//    /**
//     * Sets the locality
//     * @param locality 
//     */
//    public void setLocality(String locality) {
//        this.locality = locality;
//    }
//
//    /**
//     * 
//     * @return the province
//     */
//    public String getProvince() {
//        return province;
//    }
//
//    /**
//     * Sets the province
//     * @param province 
//     */
//    public void setProvince(String province) {
//        this.province = province;
//    }
//
//    /**
//     * 
//     * @return the zip code
//     */
//    public int getZipCode() {
//        return zipCode;
//    }
//
//    /**
//     * Sets the zip code
//     * @param zipCode 
//     */
//    public void setZipCode(int zipCode) {
//        this.zipCode = zipCode;
//    }

}
