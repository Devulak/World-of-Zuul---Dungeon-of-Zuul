package main.item;

import main.item.Item;

public class Key extends Item
{
	public Key(int amount, int price)
	{
		super("Keys", amount, price);
	}
	
	public Key(int amount)
	{
		this(amount, 0);
	}
}