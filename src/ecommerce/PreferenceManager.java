package ecommerce;

import java.io.*;

public class PreferenceManager {

    public static void savePreferences(UserPreferences prefs) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("userprefs.dat"))) {
            out.writeObject(prefs);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static UserPreferences loadPreferences() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("userprefs.dat"))) {
            return (UserPreferences) in.readObject();
        } catch (Exception e) {
            return null;
        }
    }
}