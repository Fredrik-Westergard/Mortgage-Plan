package ax.ha.it.mortgage;

/**
 * Main class
 * @author Fredrik Westergård
 */
public class Main {
    /**
     * main method
     * @param args command line arguments,unused
     */
    public static void main(String[] args) {
        ReadFromFile readfromfile = new ReadFromFile();         //create read from file object
        Printer printer = new Printer(readfromfile.readFile()); //create printer object with read from file list
        System.out.println(printer);                            //print printer object
    }
}
