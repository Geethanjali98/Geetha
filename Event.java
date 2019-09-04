import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Event {

	
		// TODO Auto-generated constructor stub
        private String Eventname;
	    private LocalDate date;
		private String Prize;
		private String winner;
		private String Coordinatorname;
		private String C_contactinfo;
		private List<String> Participantname;
		private String Eventfees;
		 
		
		
		
		public String getEventname() {
			return Eventname;
		}
		public void setEventname(String eventname) {
			this.Eventname = eventname;
		}
		
		public LocalDate getDate() {
			return date;
		}
		public void setDate(LocalDate date) {
			this.date = date;
		}
		public String getPrize() {
			return Prize;
		}
		public void setPrize(String prize) {
			this.Prize = prize;
		}
		public String getWinner() {
			return winner;
		}
		public void setWinner(String winner) {
			this.winner = winner;
		}
		public String getCoordinatorname() {
			return Coordinatorname;
		}
		public void setCoordinatorname(String coordinatorname) {
			this.Coordinatorname = coordinatorname;
		}
		public String getC_contactinfo() {

			return C_contactinfo;
		}
		public void setC_contactinfo(String c_contactinfo) {
			this.C_contactinfo = c_contactinfo;
		}
		public List<String> getParticipantname() {
			return Participantname;
		}
		public void setParticipantname(List<String> participantname) {
			this.Participantname = participantname;
		}
		public String getEventfees() {
			return Eventfees;
		}
		public void setEventfees(String eventfees) {
			Eventfees = eventfees;
		}
		@Override
		public String toString() {
			return "Event [Eventname=" + Eventname + ", date=" + date + ", Prize=" + Prize + ", winner=" + winner
					+ ", Coordinatorname=" + Coordinatorname + ", C_contactinfo=" + C_contactinfo  + ", Eventfees=" + Eventfees + "]";
		}
	    Event(String Eventname, LocalDate date, String Prize, String winner, String Coordinatorname, String C_contactinfo, String Participantname, String Eventfees)
		{
		this.Eventname=Eventname;
		this.date=date;
		this.Prize=Prize;
		this.winner=winner;
		this.Coordinatorname=Coordinatorname;
		this.C_contactinfo=C_contactinfo;
		
		this.Eventfees=Eventfees;
		}
	    public static void main(String[] args)
	    {
	    	Scanner scanner=new Scanner(System.in);
	    	System.out.println("Enter eventname");
	    	String Eventname=scanner.nextLine();
	    	System.out.println("Enter date");
	    	String date=scanner.nextLine();
	    	System.out.println("Enter prize");
	    	String prize=scanner.nextLine();
	    	System.out.println("Enter winner");
	    	String winner=scanner.nextLine();
	    	System.out.println("Enter Coordinatorname");
	    	String Coordinatorname=scanner.nextLine();
	    	System.out.println("Enter C_contactinfo");
	    	String C_contactinfo=scanner.nextLine();
	    	System.out.println("Enter Participantname");
	    	String Participantname=scanner.nextLine();
	    	System.out.println("Enter Eventfees");
	    	String Eventfees=scanner.nextLine();
	    	LocalDate d=LocalDate.parse(date);
	    	Event e=new Event(Eventname,d,prize,winner,Coordinatorname,C_contactinfo,Participantname,Eventfees);

	    	System.out.println(e);
	    }
}
	    	
	    	
	    	
	    	
		
		
		
	
