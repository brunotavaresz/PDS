 package ex2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.Buffer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StorageTXT implements ContactsStorageInterface {
    private String filename;

    public StorageTXT(String filename) {
        this.filename = filename;
    }

    @Override
    public boolean saveContacts(List<Contact> contacts) {
        String content = "";
        for (Contact contact : contacts) {
            content += contact.toString() + "\n";
        }
        try {
            Path path = Paths.get(this.filename);
            BufferedWriter writer = new BufferedWriter(new FileWriter(path.toString()));
            writer.write(content);
            writer.close();
        }
        catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public List<Contact> loadContacts() {
        List<Contact> contacts = new ArrayList<>();
        try {
            File file = new File(this.filename);
            Scanner sc = new Scanner(file);
            String [] contact;
            while (sc.hasNextLine()) {
                contact = sc.nextLine().split(" ");
                contacts.add(new Contact(contact[0], Integer.parseInt(contact[1]), contact[2]));
            }
            sc.close();
        }
        catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
    }
    return contacts;
    }
}