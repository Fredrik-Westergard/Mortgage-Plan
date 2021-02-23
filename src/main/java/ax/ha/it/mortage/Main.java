package ax.ha.it.mortage;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadFromFile readfromfile = new ReadFromFile();
        Printer printer = new Printer(readfromfile.readFile());
        System.out.println(printer.toString());
    }
}
