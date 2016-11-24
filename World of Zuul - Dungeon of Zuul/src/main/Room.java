package main;

import main.creature.Creature;
import main.creature.Inventory;
import main.creature.LevelAbleCreature;
import java.util.*;
import main.item.*;


public class Room
{
    private final String description;
	private List<Room> exits = new ArrayList<>();
    private LevelAbleCreature monster; // The monster in the room, if there's any!
    private Inventory inventory = new Inventory(true); // Inventory full of stuff (or not)!
    private boolean locked = false;
	private Room teleporter;

    public Room(String description)
    {
        this.description = description;
    }

    public void setMonster(LevelAbleCreature creature) 
    {
        monster = creature;
    }

    public boolean hasMonster() 
    {
        if(monster == null)
		{
			return false;
		}
		else
		{
			return true;
		}
    }
	
	public void setMonsterToNull() 
	{
		monster = null;
	}
	
    public LevelAbleCreature getMonster() 
    {
		return monster;
    }
	
	public Item addItemToMonster(Item item) 
	{
		return getMonster().inventory.add(item);
	}
	
	public Inventory getInventory()
	{
		return inventory;
	}
	
	protected void locked(boolean lock)
	{
		locked = lock;
	}
	
	public boolean getLocked()
	{
		return locked;
	}
    
	protected void setTeleporter(Room teleportTo)
	{
		teleporter = teleportTo;
	}
	
    public Room getTeleporter() 
    {
		return teleporter;
    }
	
    public Room useTeleporter() 
    {
		Room tempRoom = teleporter; // Keep the teleporter point in a seperate variable while deleting the teleporter
		teleporter = null;
		return tempRoom;
    }
	
    public void setExit(Room exit) 
    {
        exits.add(exit);
    }

    public String getShortDescription()
    {
        return description;
    }

	// find out if the exit pointing at can be accessed
    public boolean hasExit(Room exitLookingFor)
    {
		for (Room exit : exits)
		{
			if(exitLookingFor == exit)
			{
				return true;
			}
		}
		return false;
    }
	
    protected List<Room> getExits() 
    {
        return exits;
    }
}

