import java.time.LocalDate;


public interface EventInterface {
 public void update(Event Eventname,String Participantname) ;
 public void delete(Event a) throws EventNotFoundException,ParticipantNotFoundException;
 public void insert(Event a);
 public void list();
 public void search(String date);
 public void addparticipants(Event Eventname,String participantname)throws EventNotFoundException,ParticipantNotFoundException;
}
