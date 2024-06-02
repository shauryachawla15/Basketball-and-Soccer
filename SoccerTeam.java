// SHAURYA CHAWLA
// PROJECT-2 (FILE-4)

import java.util.*;
import java.io.*;
public class SoccerTeam
{
    //instance variables
    private ArrayList <SoccerPlayer> team;

    //constructor, it reads the info from a file and creates an object of SoccerPlayer and then stores it in the array called team
    public SoccerTeam() throws IOException
    {
        team = new ArrayList<SoccerPlayer>();
        File f = new File("Soccer Team.txt");
        Scanner input = new Scanner(f);
        int index = 0;
        while(input.hasNextLine())
        {
            String line = input.nextLine();
            Scanner token = new Scanner(line);
            String fName = token.next();
            String lName = token.next();
            String name = fName + " " + lName;
            double salary = token.nextDouble();
            int num = token.nextInt();
            int goals = token.nextInt();
            int fouls = token.nextInt();
            int redCard = token.nextInt();
            int yellowCard = token.nextInt();
            int offside = token.nextInt();
            int assist = token.nextInt();
            String tName1 = token.next();
            String tName2 = token.next();
            SoccerPlayer p = new SoccerPlayer(name, salary, num, goals, fouls, redCard, yellowCard, offside, assist, tName1 + " " + tName2);
            team.add(p);
        }
    }
    //The add method
    public void add(Object o)
    {
        SoccerPlayer s;
        if (o instanceof SoccerPlayer)
        {
            s = (SoccerPlayer) o;
            team.add(s);
        }
    }

    //The add method
    public void add(Object o, int pos)
    {
        SoccerPlayer s;
        if (o instanceof SoccerPlayer)
        {
            s = (SoccerPlayer) o;
            if (pos < 0)
                System.out.print("This position is invalid. No Players added!");
            else
                team.add(pos, s);
        }
    }

    //The remove method
    public void remove(Object o)
    {
        team.remove(o);
    }

    //The remove method
    public void remove(int index)
    {
        team.remove(index);
    }

    // Getter methods, returns the object team of ArrayList type
    public ArrayList<SoccerPlayer> getTeam()
    {
        return team;
    }

    //selectTheBest(),It returns the player with the most goals
    public String selectTheBest()
    {
        int index = 0;
        for (int i = 0; i < team.size(); i++)
        {
            if(team.get(i).getGoals() > team.get(index).getGoals())
            {
                index = i;
            }
        }
        return team.get(index).getName();
    }
    //The selectMostRed,It returns the player with the most red card
    public String selectMostRed()
    {
        int index = 0;
        for (int i = 0; i < team.size(); i++)
        {
            if (team.get(i).getRedCard() > team.get(index).getRedCard())
            {
                index = i;
            }
        }
        return team.get(index).getName();
    }

    //equals(Object other), It returns true if the team is the same as the team other
    public boolean equals(Object other)
    {
        SoccerTeam s;
        if (other instanceof SoccerTeam)
        {
            s = (SoccerTeam) other;
            return this.team.equals(s.team);
        }
        else
            return false;
    }

    //toString, It returns a string representing all the players in the team
    public String toString()
    {
        String s = "";
        for (SoccerPlayer soccerPlayer : team) {
            s += soccerPlayer.toString() + "\n\n";
        }
        return s;
    }
}
