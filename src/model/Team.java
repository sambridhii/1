package model;

public class Team {
    String Name;
    String Jersey_color;
  String fifa_position;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getJersey_color() {
        return Jersey_color;
    }

    public void setJersey_color(String Jersey_color) {
        this.Jersey_color = Jersey_color;
    }
    public String getfifa_position() {
        return fifa_position;
    }

    public void setfifa_position(String fifa_position) {
        this.fifa_position = fifa_position;
    }


    public Team (String Name, String jersey_color, String fifa_position){
            this.Name = Name;
            this.Jersey_color= Jersey_color;
            this.fifa_position= fifa_position;
        }
    public void printFormat() {
        System.out.println("Team Name     Jersey colour    Fifa position     ");
        System.out.println(this.Name + "         " + this.Jersey_color + "          " + this.fifa_position);
    }
    }









