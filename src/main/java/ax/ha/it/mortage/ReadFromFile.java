package ax.ha.it.mortage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFile {
    public List<Prospects> readFile(){
        File file = new File(getClass().getClassLoader().getResource("prospects.txt").getFile());

        List<Prospects> list = new ArrayList<>();

        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(file));
            String str = reader.readLine(); //discard first line
            str = reader.readLine();
            while(str != null){
                if(str.length() > 2) {
                    String[] split = str.split(",");
                    int years = Integer.parseInt(split[split.length - 1]);
                    double interest = Double.parseDouble(split[split.length - 2]);
                    double totalLoan = Double.parseDouble(split[split.length - 3]);
                    StringBuilder customers = new StringBuilder();
                    for (int i = 0; i < split.length - 3; i++) {
                        customers.append(split[i]);
                        customers.append(",");
                    }
                    customers.deleteCharAt(customers.length()-1);
                    Prospects p = new Prospects(customers.toString(), totalLoan, interest, years);
                    list.add(p);
                }
                str = reader.readLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return list;
    }
}
