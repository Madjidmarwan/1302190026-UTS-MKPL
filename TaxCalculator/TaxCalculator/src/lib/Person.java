package lib;
import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Person extends Employee{
    private String firstName;
    private String lastName;
	private String idNumber;
    private String address;
    private boolean isForeigner;
    private enum gender {PRIA, WANITA;}

    public Person(String firstName, String lastName, String idNumber, String address, boolean isForeigner)
    {
        super();
        this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;
        this.isForeigner = isForeigner;
    }

    public Person getPerson(){
        return this.firstName; 
        return this.lastName;
        return this.idNumber;
        return this.address;
        return this.isForeigner;
    }

    public boolean getForeigner(){
        return this.isForeigner;
    }

    public Person(){
        super();
    }
}
 

