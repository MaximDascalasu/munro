import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MunroController {
    //object

    String file = "\"C:\\Users\\Maxim\\Desktop\\MODS\\src\\main\\java\\data\\munro_data.csv";
   BufferedReader br=null;
    String line = "";
    String cvsSplitby= ",";


        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }

            // use comma as separator
            String[] country = line.split(cvsSplitby);

            System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

        }
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }












    //run shit
    public void menu() {
        boolean finished = false;
        do {
            System.out.println("");
            char choice = displayMenu();
            switch (choice) {
                case '1':
                    heightAscending();
                    break;
                case '2':
                    heightDescending();
                    break;
                case '3':
                    nameAscending();
                    break;
                case '4':
                    nameDescending();
                    break;
                case '5':
                    categoryOrder();
                    break;
                case '6':
                    filterHeight();
                    break;
                case '7':
                    finished = true;
            }
        } while (!finished);
    }

    private char displayMenu() {
        InputHelper inputHelper = new InputHelper();
        System.out.println("\n1. Ascending Height Order");
        System.out.println("\n2. Descending Height Order");
        System.out.println("\n3. Ascending Name Order");
        System.out.println("\n4. Descending Name Order");
        System.out.println("\n5. Filter Category");
        System.out.println("\n6. Filter Height");
        System.out.println("\n7. Finish");
        return inputHelper.readCharacter("Enter choice", "1234567");
    }

    private void heightAscending() {
        munros.sort(Comparator.comparing(Munro::getHeightFT));
    }


private void heightDescending(){

}
private void nameAscending(){

}
private void nameDescending(){

}
private  void categoryOrder(){

}
private void filterHeight(){

}


}





