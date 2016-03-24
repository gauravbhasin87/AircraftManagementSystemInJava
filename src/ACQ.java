import java.util.concurrent.PriorityBlockingQueue;

class ACQ{
	private static int sequence=0;
	private PriorityBlockingQueue<Aircraft> pq;
	
	public void aqm_request_process(Request re){
		if(re == Request.DEQUEUE){
			try{
			Aircraft ac = (Aircraft)pq.take();
			System.out.println("AC Removed : SeqID "+ ac.getSeq()+" Type "+ ac.getType()+" Size "+ ac.getSize());
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			
		}
		else if(re == Request.BOOT)	
		pq = new PriorityBlockingQueue<>();
		else if(re == Request.PRINT){
			System.out.println("Current Priority Sequence of ACs in queue ");
			for(Aircraft a: pq){
				
				System.out.println("         SeqID "+ a.getSeq()+" Type "+ a.getType()+" Size "+ a.getSize());
			}
		}
	}
	
	public void aqm_request_process(Request req, Aircraft ac){
		if(req == Request.ENQUEUE){
			sequence++;
			ac.setSeq(sequence);
			pq.add(ac);
			System.out.println("AC Added : SeqID "+ ac.getSeq()+" Type "+ ac.getType()+" Size "+ ac.getSize());
		}
	}
	
}
