// SHAURYA CHAWLA
// PROJECT-2 (FILE-3)


public class SoccerPlayer extends Player
{
    //instance variables
    private int goals;
    private int fouls;
    private int redCard;
    private int yellowCard;
    private int offside;
    private int assist;
    private String teamName;

    //constructor
    public SoccerPlayer(String name, double salary, int number, int goals, int fouls, int redCard, int yellowCard, int offside, int assist, String teamName)
    {
        //It uses the keyword super to use the instance variables from the player class
        super(name, salary, number);
        this.goals = goals;
        this.fouls = fouls;
        this.redCard = redCard;
        this.yellowCard = yellowCard;
        this.offside = offside;
        this.assist = assist;
        this.teamName = teamName;
    }

    //The Getter methods
    public int getGoals()
    {
        return goals;
    }

    public int getFouls()
    {
        return fouls;
    }

    public int getRedCard()
    {
        return redCard;
    }

    public int getYellowCard()
    {
        return yellowCard;
    }

    public int getOffside()
    {
        return offside;
    }

    public int getAssist()
    {
        return assist;
    }

    public String getTName()
    {
        return teamName;
    }

    //The Setter methods
    public void setGoals(int goal)
    {
        goals = goal;
    }

    public void setFouls(int foul)
    {
        fouls = foul;
    }

    public void setRedCard(int rCard)
    {
        redCard = rCard;
    }

    public void setYellowCard(int yCard)
    {
        yellowCard = yCard;
    }

    public void setOffside(int offside)
    {
        this.offside = offside;
    }

    public void setAssist(int a)
    {
        assist = a;
    }

    public void setTName(String name)
    {
        teamName = name;
    }

    //The toString method
    public String toString()
    {
        return super.toString() + "\nGoals: " + goals + "\nFouls: " + fouls + "\nRed Card: " + redCard + "\nYellow Card: " + yellowCard + "\nOffside: " + offside + "\nAssist: " + assist + "\nTeam Name: " + teamName;
    }

    //The equals method
    public boolean equals(Object other)
    {
        SoccerPlayer s;
        if (other instanceof SoccerPlayer)
        {
            s = (SoccerPlayer) other;
            return this.goals == s.goals && this.fouls == s.fouls && this.redCard == s.redCard && this.yellowCard == s.yellowCard && this.offside == s.offside && this.assist == s.assist && this.teamName.equals(s.teamName);
        }
        else
            return false;
    }

    //The pullOutPlayer method, and if there are 3 fouls or 2 yellow cards then the player cannot play
    public boolean pullOutPlayer()
    {
        if (fouls > 3 || yellowCard >= 2 || redCard >= 1)
            return false;
        else
            return true;
    }
}