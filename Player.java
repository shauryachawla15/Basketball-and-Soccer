// SHAURYA CHAWLA
// PROJECT-2 (FILE-1)


public class Player
{
    //instance variables
    private String name;
    private double salary;
    private int number;

    //constructor, has to be the same name as the class and it initalizes values for instance variables. It also makes an object
    public Player(String name, double salary, int number)
    {
        this.name = name;
        this.salary = salary;
        this.number = number;
    }

    // Setter methods, re-intializes the values of instance variables
    public void setName(String newName)
    {
        name = newName;
    }

    public void setSalary(double newSal)
    {
        salary = newSal;
    }

    public void setNumber(int newNum)
    {
        number = newNum;
    }

    // Getter methods, returns the instance variables
    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getNumber()
    {
        return number;
    }

    // The equals method, it compares two objects and returns true/false
    public boolean equals(Object other)
    {
        Player p;
        if (other instanceof Player)
        {
            p = (Player) other;
            return this.name.equals(p.name) && this.salary == p.salary && this.number == p.number;
        }
        else
            return false;
    }
    //The toString method, it prints out all the values
    public String toString()
    {
        return "Player Name: " + name + "\nSalary: $" + salary + "\nNumber: " + number;
    }
}