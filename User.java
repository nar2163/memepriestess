import java.util.ArrayList;
import java.util.Scanner;

public class User{
    private String name;
    private ArrayList<Reading> r;

    public User(String name){
        this.name = name;
        this.r = new ArrayList<Reading>();
    }

    public Reading getR(int index) {
        return r.get(index);
    }

    public void storeReading(Reading r){
        this.r.add(r);
    }

    public ArrayList<Reading> getAllReadings() {
        return r;
    }
}