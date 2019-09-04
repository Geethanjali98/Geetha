import java.time.LocalDate;
import java.util.*;

public class EventCollection  implements EventInterface
{
	
	List<String> event=new ArrayList<>(); 
	

	public void update(Event Eventname, String Participantname){
		// TODO Auto-generated method stub
      if(event.contains(Eventname))
      {
    	  System.out.println("Participantname");
    	  if(Eventname.getParticipantname().contains(Participantname))
    	  {
    		  event.get(event.indexOf(Eventname)).setWinner(Participantname);}
    	  }
      }
     
	

	@Override
	public void delete(Event a)throws EventNotFoundException,ParticipantNotFoundException {
		// TODO Auto-generated method stub
		if(event.contains(a))
		{
			event.remove(a);
			{
				try {
					throw new EventNotFoundException("Event not present");
				}
				catch(EventNotFoundException ex)
				{
					System.out.println(ex.getMessage());
					
				}
				
				
				
			}
		}
	}

	
	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println(event);
		
	}

	@Override
	public void search(String date) {
	
		// TODO Auto-generated method stub
		LocalDate D1=LocalDate.parse(date);
		for(String e:event)
		{
			if(e.getdate().equals(D1))
			{
				System.out.println(e);
			}
		}
		
	}

	@Override
	public void addparticipants(Event Eventname, String participantname) {
		// TODO Auto-generated method stub
		if(event.contains(Eventname))
		{
			event.get(event.indexOf(Eventname).getParticipantname().add(Participantname));
		}
		else {
			try {
				throw new EventNotFoundException("Event not present");
			}
			catch(EventNotFoundException ex)
			{
				System.out.println(ex.getMessage());
			}
			}
				
			}
		

	@Override
	public void insert(Event a) {
		// TODO Auto-generated method stub
		event.add(a);
	}

}
