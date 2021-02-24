package ax.ha.it.mortgage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Class used to read a list of Prospects from a file
 * @author Fredrik Westergård
 */
public class ReadFromFile {
    /**
     * method to read a list of Prospects from a file
     * @return a list of Prospects
     */
    public List<Prospects> readFile(){
        File file = new File(getClass().getClassLoader().getResource("prospects.txt").getFile());

        List<Prospects> list = new ArrayList<>();

        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(file));
            String str = reader.readLine();                                    //discard first line
            str = reader.readLine();
            while(str != null){
                if(str.length() > 2) {                                         //if there are any content in the file
                    String[] split = str.split(",");                     //split the read string into substrings
                    int years = Integer.parseInt(split[split.length - 1]);      //get years from last substring
                    double interest = Double.parseDouble(split[split.length - 2]); //get interest from second to last substring
                    double totalLoan = Double.parseDouble(split[split.length - 3]);//get total loan from third to last substring
                    StringBuilder customers = new StringBuilder();              //get customer name from the rest
                    for (int i = 0; i < split.length - 3; i++) {                //if there are more than 1 customer name
                        customers.append(split[i]);                             //append them
                        customers.append(",");                                  //and separate them by a comma
                    }
                    customers.deleteCharAt(customers.length()-1);               //remove the last comma
                    Prospects p = new Prospects(customers.toString(), totalLoan, interest, years);
                    list.add(p);
                }
                str = reader.readLine();
            }
        }catch(IOException e){
            e.printStackTrace();    //if prospects.txt file does not exist print stack trace
            System.exit(0);   //and exit the program
        }
        return list;
    }
}
