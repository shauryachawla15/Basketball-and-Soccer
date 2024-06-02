// SHAURYA CHAWLA
// PROJECT-2 (FILE-6)

//The Driver class

import java.util.*;
import java.io.*;
public class TeamsDriver
{
    public static void main (String[] args) throws IOException
    {
        // the Data files for the SoccerTeam and BasketBallTeam
        SoccerTeam bearCats = new SoccerTeam();
        BasketBallTeam kings = new BasketBallTeam();
        
        //Calling all the methods using both files
        System.out.println("15 Players in the Bear Cats Team are as follows: \n");
        listPlayers(bearCats);
        System.out.println("15 Players in the Kings Team are as follows: \n");
        listPlayers(kings);
        array(bearCats);
        listAllRedCards(bearCats.getTeam());
        mostRebound(kings);
        searchPlayer(bearCats, "Luis Suarez");
        searchPlayer(kings, "Blake Griffin");
        bestPlayer(bearCats);
        bestPlayer(kings);
    }

    //This method accepts an array of players and displays the info about all players. It is called two times for kings and bearCat
    public static void listPlayers(Object t)
    {
        System.out.println(t.toString());
    }

    // This method accepts an array of SoccerPlayer and lists all the players with red card
    public static void array(SoccerTeam bCats)
    {
        ArrayList<SoccerPlayer> cats = bCats.getTeam();
        System.out.println("Players with red cards in the Bear Cats: ");
        for (int i = 0; i < cats.size(); i++)
        {
            if(cats.get(i).getRedCard() > 0)
                System.out.println(cats.get(i).getName());
        }
    }

    // This method displays the player with the most rebounds in the BasketBallTeam
    public static void mostRebound(BasketBallTeam king)
    {
        System.out.println("\nThe player with most rebounds in Kings: \n" + king.selectMostRebounds() + "\n");
    }

    /*This method accepts an array of type Object, uses instanceof keyword and name of the player. It seaches the list, and if the player is found
    then it displays the info, otherwise denies by prompting*/
    public static void searchPlayer(Object other, String name)
    {
        int index = 0;
        //checking if it belongs to the SoccerTeam
        if (other instanceof SoccerTeam)
        {
            SoccerTeam s1;
            s1 = (SoccerTeam) other;
            ArrayList<SoccerPlayer> s = s1.getTeam(); //the arrayList of SoccerPlayer Type
            for (int i = 0; i < s.size(); i++)
            {
                if(s.get(i).getName().equalsIgnoreCase(name))
                {
                    System.out.println("The following player exists in the Bear Cats Team:\n" + s.get(i).toString() + "\n");
                    return;
                }
                index++;
                if (index == s.size())
                {
                    System.out.println("The Player " + name + "does not exist in the team");
                    return;
                }
            }
        }
        //checking if it belongs to the BasketBallTeam
        else if (other instanceof BasketBallTeam)
        {
            BasketBallTeam b1;
            b1 = (BasketBallTeam) other;
            ArrayList<BasketBallPlayer> b = b1.getTeam(); //the arrayList of BasketBallPlayer type
            for (int j = 0; j < b.size(); j++)
            {
                if(b.get(j).getName().equalsIgnoreCase(name))
                {
                    System.out.println("The following player exists in the Kings Team:\n" +b.get(j).toString() + "\n");
                    return;
                }
                index++;
                if(index == b.size())
                {
                    System.out.println("This player " + name + "does not exist in the team");
                    return;
                }
            }
        }
    }

    // This method displays the best player with the most goals/points
    public static void bestPlayer(Object other)
    {
        //for the SoccerTeam
        if (other instanceof SoccerTeam)
        {
            SoccerTeam s;
            s = (SoccerTeam) other;
            System.out.println("\nThe player with most goals in the Bear Cats Team is " + s.selectTheBest() + "\n");
        }
        // For the BasketBallTeam
        else if (other instanceof BasketBallTeam)
        {
            BasketBallTeam b;
            b = (BasketBallTeam) other;
            System.out.println("The player with most points in the Kings Team is " + b.selectTheBest());
        }
    }

    // This method that accepts an array of SoccerPlayer and lists all the players with red
    //card.
    public static void listAllRedCards(ArrayList<SoccerPlayer> team) {
        for(int i=0; i<team.size(); ++i) {
            SoccerPlayer currentPlayer = team.get(i);

            if(currentPlayer.getRedCard()>0) {
                System.out.println(currentPlayer.toString());
            }
        }
    }
}
