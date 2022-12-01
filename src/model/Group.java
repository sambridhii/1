package model;

public class Group {
    String Name;

    public String getName() {

        return Name;
    }

    public void setName(String name) {
        this.Name = Name;
    }

    public Group(String Name) {
        this.Name = Name;
    }
    public void printFormat() {
        System.out.println("Group");
        System.out.println(this.Name );
    }
}