import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int rollNo;
	String name;
	String address;
	
	public Student(int rollNo, String name, String address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }
	@Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
    }
	
	
}
public class Launch {
	public static void main(String[] args) {
		
//		Student s1 = new Student(1, "John", "New York");
		String path ="E:\\student.txt";
		try {
			
////			serialization
//			FileOutputStream fos = new FileOutputStream(path);
//			ObjectOutputStream obs = new ObjectOutputStream(fos);
//			obs.writeObject(s1);
//			System.out.println("file created");
			
//			deserialization
			
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s = (Student) ois.readObject();
			System.out.println(s.rollNo);
			System.out.println(s.name);
			System.out.println(s.address);
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
