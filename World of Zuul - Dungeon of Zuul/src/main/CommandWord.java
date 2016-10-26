package main;

public enum CommandWord
{
    GO("go"), QUIT("quit"), HELP("help"), MAP("map"), UNKNOWN("?"), LOOK("look"), STATUS("status");
    
    private String commandString;
    
    CommandWord(String commandString)
    {
        this.commandString = commandString;
    }
    
    public String toString()
    {
        return commandString;
    }
}
