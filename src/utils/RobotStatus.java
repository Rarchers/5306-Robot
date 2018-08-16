package utils;


/*
attention please.
this class is made to note robots all the status
more tips: this class is single mode, so it can be only
init by once.if you have init the class,or you havent init it 
just use following command to get its instance

RobotStatus status = RobotStatus.getInstance();

now,we get this class instance,and we can use it as you like
but,never forget the differences between using new and this methods


write by Rarcher in 2018.7.12
*/



/*
 * followings are details
 * 
 * 1.forehead: boolean,    this status shows run forehead when it is false,while true,turn back
 * 
*/
public class RobotStatus {
	// following are robots status
	
	private static RobotStatus instance; 
	
	private RobotStatus () 
	{}
	
	public synchronized static RobotStatus getInstance()
	{
		if(instance == null) 
			instance = new RobotStatus(); 
			return instance; 
	}
	
	
	
	
	
	
	
	
}
