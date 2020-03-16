package Strategy;

public class Gstrategy implements ISMediastrategy {
	 
    public void connectTo(String friendName) 
    {
        System.out.println("Connecting with " + friendName + " through GooglePlus");
    }
}