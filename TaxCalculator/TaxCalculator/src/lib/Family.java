package lib;
import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Family extends Person{
    private String spouseName;
	private String spouseIdNumber;
	private List<String> childNames;
	private List<String> childIdNumbers;

	public Family(){
		super();
		childNames = new LinkedList<String>();
		childIdNumbers = new LinkedList<String>();
	}

    public void setSpouse(String spouseName, String spouseIdNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = spouseIdNumber;
	}

	public String getSpouseIdNumber(){
		return this.spouseIdNumber;
	}

	public String getSpouseName(){
		return this.spouseName;
	}

    public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}

	public List<String>getChildIdNumber(){
		return this.childIdNumbers;
	}
}
