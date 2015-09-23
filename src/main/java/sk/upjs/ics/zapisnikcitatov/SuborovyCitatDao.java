package sk.upjs.ics.zapisnikcitatov;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SuborovyCitatDao {
    public Citat dajNahodnyCitat() {
        Set<Citat> vsetkyCitaty = dajVsetkyCitaty();
        ArrayList<Citat> zoznamCitatov = new ArrayList<Citat>(vsetkyCitaty);
        
        Collections.shuffle(zoznamCitatov);
        
        return zoznamCitatov.get(0);
    }
    
    public Set<Citat> dajVsetkyCitaty() { 
        Set<Citat> citaty = new HashSet<Citat>();

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("citaty.txt"));
            while (scanner.hasNextLine()) {
                String riadok = scanner.nextLine();
                String[] polozky = riadok.split("\\|");
                
                Citat citat = new Citat();
                citat.setText(polozky[0]);
                citat.setAutor(polozky[1]);
                
                citaty.add(citat);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Chyba pri nacitavani citatov");
            e.printStackTrace();
        } finally {
            if(scanner != null) {
                scanner.close();
            }
            return citaty;
        }
    }
}

