package ex2;

import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        System.out.println("<!------------TXT-TEST------------!>");
        try{
            File f = new File("contacts.txt");
            f.createNewFile();
            FileWriter fw = new FileWriter(f.toString());

            fw.write("John 123456789 john@email.com\n");
            fw.write("Doe 987654321 doe@guugli.yml\n");
            fw.write("Jane 123456789 janinha@yahoo.pt\n");
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        StorageTXT txt = new StorageTXT("contacts.txt");
        Agenda agenda = new Agenda();
        agenda.openAndLoad(txt);
        Contact c = new Contact("maria", 123456789, "maria@ola.com");
        Contact c2 = new Contact("mariana", 123456789, "mn@nm.pt");
        agenda.add(c);
        agenda.add(c2);
        System.out.println("Contact: " + agenda.getByName("maria"));
        System.out.println("Contact: " + agenda.getByName("mariana"));
        agenda.remove(c);
        System.out.println("Maria removed, Maria exists? " + agenda.exist(c));
        agenda.saveAndClose(txt);
        System.out.println("<!------------CSV-TEST------------!>");
        try {
            File f = new File("contacts.csv");
            f.createNewFile();
            FileWriter fw = new FileWriter(f.toString());
            fw.write("John 123456789 john@email.com\n");
            fw.write("Doe 987654321 doe@guugli.yml\n");
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        StorageCSV csv = new StorageCSV("contacts.csv");
        agenda.openAndLoad(csv);
        Contact c3 = new Contact("joao", 111222333, "joao@gmail.com");
        agenda.add(c3);
        System.out.println("Contact: " + agenda.getByName("joao"));
        System.out.println("Joao exists? " + agenda.exist(c3));
        agenda.remove(c3);
        System.out.println("Joao removed, Joao exists? " + agenda.exist(c3));
        Contact c6 = new Contact("mariana", 123456789, "mn@nm.pt");
        agenda.add(c6);
        System.out.println("Contact: " + agenda.getByName("mariana") + " added");
        System.out.println("Mariana exists? " + agenda.exist(c6));
        agenda.saveAndClose();

    System.out.println("<!------------END------------!>");

    }

}
