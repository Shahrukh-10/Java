import java.util.*;
public class PhoneBook
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String,Long> hm = new HashMap<>();
        System.out.println("************ Main Menu ************");
        System.out.println("");
        System.out.println("Operations are : ");
        System.out.println("Press A to Add Contact");
        System.out.println("Press R to Remove Contact");
        System.out.println("Press L to List All Contacts");
        System.out.println("");
        System.out.print("Enter Operation : ");
        String input=sc.next();
        
        if(input.trim().equals("A"))
        {
            System.out.println("Enter Name : ");
            String s= sc.next();
            System.out.println("Enter Phone No : ");
            Long n=sc.nextLong();
            if(!hm.containsValue(n))
            {
                hm.put(s,n);
                System.out.println("Record Added Successfully");
            }
            else
            {
                System.out.println("Mobile No already registered. ");
            }
        }
	else if(input.trim().equals("R"))
	{
	    System.out.println("Enter Name : ");
	    String s= sc.next();
	    if(hm.containsKey(s))
	    {
	    	hm.remove(s);
		System.out.println("Contact Removed Successfully");
	     }
	    else
		{
			System.out.println("NO contacts with this name");
		}
	}
	else if(input.trim().equals("L"))
	{
		TreeMap<String,Long> sorted = new TreeMap<>();
        	sorted.putAll(hm);      
        	for (Map.Entry<String, Long> entry : sorted.entrySet())  
           	{
			 System.out.println("Name : "+ entry.getKey() + "Phone No : " + entry.getValue());   
		}
		
	}
	else
	{
		System.out.println("Invalid Input :Retry");
	}
        
        }
}
