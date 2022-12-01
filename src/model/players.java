package model;

public class players {
String Name;
    int Id;
    int Age;
    int Rating;
    public String getName() {

        return Name;
    }

    public void setName(String name) {
        this.Name = Name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }


    public int getAge() {
        return Age;
    }

    public void setAge(int  Age) {
        this. Age =  Age;
    }

    public players(String Name, int Id, int Age, int Rating) {
        this.Name = Name;
        this.Id = Id;
        this.Age = Age;
        this.Rating= Rating;
    }
    public void printFormat(){
        System.out.println("Name   ID   Age   Rating");
        System.out.println(this.Name+ "   "+this.Id+ "   "+ this.Age+"   "+this.Rating );
    }


}
