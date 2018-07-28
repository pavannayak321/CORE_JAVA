package serialization;
 
import java.io.*;
import java.util.logging.Logger;
  
public class Serialversion_uid implements java.io.Serializable {
  
    private static final long serialVersionUID = 4L;            //Default serial version uid
    private static final String fileName = "Serialversion_uidBytes.ser"; //Any random name
    private static final Logger logger = Logger.getLogger("");
    //Few data fields
    //Able to serialize
    private static String staticVariable;
    private int intVariable;
     
    //Not able to serialize
    transient private String transientVariable = "this is a transient instance field";
    private Thread threadClass;
      
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        //Serialization
     
        Serialversion_uid test = new Serialversion_uid();
        test.intVariable = 1;
        staticVariable = "this is a static variable";
        writeOut(test);
        System.out.println("Serialversion_uid to be saved: " + test);
     
        //De-serialization
         
        System.out.println("Serialversion_uid deserialized: " + readIn());
    }
      
    private static Object readIn() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(fileName)));
        return ois.readObject();
    }
      
    private static void writeOut(java.io.Serializable obj) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
        oos.writeObject(obj);
        oos.close();
    }
      
    @Override public String toString() {
        return "Serialversion_uid: final static fileName=" + fileName + ", final static logger=" + logger
                + ", non-final static staticVariable=" + staticVariable + ", instance intVariable=" + intVariable
                + ", transient instance transientVariable=" + transientVariable + ", non-serializable instance field threadClass:=" + threadClass;
    }
}
