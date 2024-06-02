// SHAURYA CHAWLA
// PROJECT-2 (FILE-5)


import java.util.*;
import java.io.*;
public class BasketBallTeam
{
    //instance variables
    private ArrayList <BasketBallPlayer> team;

    //constructor, it reads the info from a file and creates an object of SoccerPlayer and then stores it in the array called team
    public BasketBallTeam() throws IOException
    {
        team = new ArrayList<BasketBallPlayer>();
        File f = new File("Basketball Team.txt");
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
            int number = token.nextInt();
            int threePointer = token.nextInt();
            int turnOvers = token.nextInt();
            int assist = token.nextInt();
            int rebounds = token.nextInt();
            int twoPointers = token.nextInt();
            String tName = token.nextLine();
            BasketBallPlayer p = new BasketBallPlayer(name, salary, number, threePointer, turnOvers, assist, rebounds, twoPointers, tName);
            team.add(p);
        }
    }
    //The add method
    public void add(Object o)
    {
        BasketBallPlayer s;
        if (o instanceof BasketBallPlayer)
        {
            s = (BasketBallPlayer) o;
            team.add(s);
        }
    }

    //The add method
    public void add(Object o, int pos)
    {
        BasketBallPlayer s;
        if (o instanceof BasketBallPlayer)
        {
            s = (BasketBallPlayer) o;
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

    //The getter methods, It returns the object team of ArrayList type
    public ArrayList<BasketBallPlayer> getTeam()
    {
        return team;
    }

    //selectTheBest(), returns the player with the most goals
    public String selectTheBest()
    {
        int index = 0;
        for (int i = 0; i < team.size(); i++)
        {
            if(team.get(i).getTotalPoints() > team.get(index).getTotalPoints())
            {
                index = i;
            }
        }
        return team.get(index).getName();
    }
    //selectMostRebounds, It returns the player with the most rebounds
    public String selectMostRebounds()
    {
        int index = 0;
        for (int i = 0; i < team.size(); i++)
        {
            if (team.get(i).getRebounds() > team.get(index).getRebounds())
            {
                index = i;
            }
        }
        return team.get(index).getName();
    }

    //equals(Object other),It returns true if the team is the same as the team other
    public boolean equals(Object other)
    {
        BasketBallTeam b;
        if (other instanceof BasketBallTeam)
        {
            b = (BasketBallTeam) other;
            return this.team.equals(b.team);
        }
        else
            return false;
    }

    //toString,It returns a string representing all the players in the team
    public String toString()
    {
        String s = "";
        for (int i = 0; i < team.size(); i++)
        {
            s += team.get(i).toString() + "\n\n";
        }
        return s;
    }
}
