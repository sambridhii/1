
import model.Group;
import model.players;
import model.Team;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<players> playerList=new ArrayList<players>();
        players p1=new players("Mbappe",12,31,10);
        players p2=new players("Di Maria",10,40,9);
        players p3=new players("Messi",10,36,10);

        playerList.add(p1);
        playerList.add(p2);
        playerList.add(p3);


        ArrayList<Group> groupList=new ArrayList<Group>();
        Group g1=new Group("Korea");
        Group g2=new Group("Argentina");
        Group g3=new Group("France");
        groupList.add(g1);
        groupList.add(g2);
        groupList.add(g3);


        ArrayList<Team> teamList=new ArrayList<Team>();
        Team t1=new Team("Korea","white","third");
        Team t2=new Team("Argentina","Blue","first");
        Team t3=new Team("France","red","second");
        teamList.add(t1);
        teamList.add(t2);
        teamList.add(t3);
        System.out.println(playerList);
        System.out.println(groupList);
        System.out.println(teamList);

        players player1= new players("Pele",4,80,4);
        Team team1 = new Team("Brazil","yellow","ninth");
        Group group = new Group("E");

        player1.printFormat();;
        team1.printFormat();
        group.printFormat();


    }
}
