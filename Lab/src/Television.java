/** The purpose of today's class is to model a television
 * 
 * @author sedina
 *
 */
public class Television {
	//fields
	private String MANUFACTURER;  //kind of television or brand
	private int SCREEN_SIZE;  //how big the screen is
	private boolean powerOn;  //turns the tv on
	private int volume;  //decrease or increase volume
	private int channel;  //changes channel
	//constructor
	/**
	 * the constructor creates a television with
	 * the given brand and size
	 * @param brand the manufacturer of the television
	 * @param size the size of the screen
	 */
	public Television(String brand, int size)
	{
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		powerOn = false;
		volume = 20;
		channel = 2;
	}
	// accessor methods
	public String toString()
	{
		return "TV type: " + MANUFACTURER + " size: " + SCREEN_SIZE + " channel on: " + channel;
	}
	public int getVolume()
	{
		return volume;
	}
	public int getChannel()
	{
		return channel;
	}
	public String getManufacturer()
	{
		return MANUFACTURER;
	}
	public int getScreenSize()
	{
		return SCREEN_SIZE;
	}
	
	//mutator methods
	public void setChannel(int station)
	{
		channel = station;
	}
	public String getPowerStatus()
	{
		if(powerOn) return "ON";
		else return "OFF";
	}
	public void power()
	{
		powerOn =!powerOn;
	}
	public void increaseVolume()
	{
		volume++;
	}
	public void decreaseVolume()
	{
		volume--;
	}
}
