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
}
