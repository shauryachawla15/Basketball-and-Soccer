# Basketball-and-Soccer
This is my shopping cart project, done in Java language. I built this when I was in my freshman year, in CSUS. It was a part of CSC-20 class( Programming Concepts and Methodology II).
Note: make sure that your methods accept parameters of type object   where applicable
Use instanceof to check the data type of the object
Use type casting to cast the object into the appropriate data type if needed

Create the following hierarchy of classes

1.	Create a class called Player with the following UML diagram
                                                Player
-String name
-double salary
-int number
+Player(String name, double salary, int number)
setter methods
getter methods
equals method
tostring method


2.	Create a class called BasketBallPlayer that extends the player class. 
                                  BasketBallPlayer
-int threePointer
-int turnOvers
-int assist
-int rebounds
-int twoPointers
-String teamName
+constructor
+setter methods
+getter methods
+equals
+toString
+getTotalPoints(): int// returns the total points made by the player


Starter Code for BasketBall Player

public class BasketballPlayer extends Player implements Comparable{
    private int threePointer;
    private int turnover;
    private int assist;
    private int rebound;
    private int twoPointer;
    private String team;
    
    public BasketballPlayer(String name, double salary, int number, int three, int turnover, int assist, int   rebound, int two, String team) ;



3.	Create a class called SoccerPlayer that extends the player class.
                                   Soccer
-int goals
-int fouls
-int redCard
-int yellowCard
-Int offside
-int assist
-String teamName


+constructor
+getter methods
+setter methods
+toString method
+equalsMethod// accepts an object as its parameter
+pullOutPlayer(): Boolean// if the player has more than three fouls or two yellow card then the player cannot play and this method should return false

Starter Code for Soccer Player:

public class SoccerPlayer extends Player implements Comparable{
    private int goals;
    private int fouls;
    private int red;
    private int yellow;
    private int offside;
    private int assist;
    private String team;
    
    public SoccerPlayer (String name, double salary, int number, int goals, int fouls, int red, int yellow, int offside, int assist, String team)
 
4.	Create a class called SoccerTeam. This class has an arraylist of 15 players
-ArrayList<SoccerPlayer>  team	An array list of SoccerPlayer
+constructor()	Reads the info for the players from a file and creates an object of SoccerPlayer and then stores it in the  arrayList called team
+add(Object o)
+add(Object o, int pos)	Adds the object 
Adds the object at the given position
+getter method	Returns the object team of ArrayList type
+selectTheBest()	Return the player with the most goals
+selectMostRed	Returns the player with the most red card
+toString	Returns a string representing all the players in the team. A for loop is needed
+equals(Object other)	Returns true if the team this is the same as the team other. Need a loop to compare all the players. 
Remove(Object o)
Remove(int index)	Removes the object(Player) from the list
Removes the object(player at the given index
 
5.	Create a class called BasketBallTeam that has the same/similar features as step 4
6.	Create a driver class that does the following:
a.	Create a main method
i.	Create two data files for the basketball team and the soccer team. These two files will be used by the constructors in the Soccer class and Basketball class. 
ii.	Create an object of SoccerTeam call it bearCat
iii.	Create an object of BasketBallTeam call it kings
iv.	Call the methods in step 6 (b)
b.	Create the following methods
i.	Create a method called listPlayers, this methods accepts an arraylist of players and displays the info about all the players. Call this method two times using the object kings and bearCat. You must use the same method
ii.	Write a method that accepts an array of SoccerPlayer and lists all the players with red card.
iii.	Write a method called mostRebound that displays the player with the most rebound
iv.	Write a method called searchPlayer that accepts an arraylist of type Player and a name of a player. This method searches the list, if the player is found display the info, otherwise print a message that the player does not exist. 
v.	Write a method that display the best player with the most goals/points
vi.	Write a method that takes the team name as parameter and simulates series of 10 games and each game is a random play. For each game, you need to generate a random number, if the random number is bigger than 0.5.its a win; otherwise the team loses a game. This method prints the number of wins and losses of each team. Call this method twice, once by passing in “Bear Cat” as team name and other for passing in “Kings” as the team name from the main method.

  Programming Guidance

7.	Note: make sure that your methods accept parameters of type Object  where applicable
8.	Use instanceof to check the data type of the object
9.	Use type casting to cast the Object into the appropriate data type if needed
10.	The equals method for each class only compares the names of the players



Grading policies

1.	Comments/ JavaDoc is necessary for each class
2.	Indentation and good programming style
3.	Data validation/reading from a file using try catch exception handling
4.	Follow the assignment specifications as given


