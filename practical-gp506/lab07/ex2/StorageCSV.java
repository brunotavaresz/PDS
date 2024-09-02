package ex2;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StorageCSV implements ContactsStorageInterface {
    private String filename;

    public StorageCSV(String filename) {
        this.filename = filename;
    }

    @Override
    public boolean saveContacts(List<Contact> contacts) {
        try {
            Path path = Paths.get(filename);
            BufferedWriter writer = new BufferedWriter(new FileWriter(path.toString()));
            for (Contact contact : contacts) {
                writer.write(contact.getName() + "," + contact.getNumber() + "," + contact.getEmail() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public List<Contact> loadContacts() {
        List<Contact> contacts = new ArrayList<>();
        try {
            Path path = Paths.get(filename);
            BufferedReader reader = new BufferedReader(new FileReader(path.toString()));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length != 3) {
                    System.out.println("Invalid line: " + line);
                    continue;
                }
                String name = parts[0];
                int number = Integer.parseInt(parts[1]);
                String email = parts[2];
                contacts.add(new Contact(name, number, email));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contacts;
    }
}
