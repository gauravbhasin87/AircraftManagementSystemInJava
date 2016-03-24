
public class Driver {
	
	public static void main(String arg[]){
		//create AC 1 pas and large
		Aircraft ac1 = new Aircraft(Type.PASSENGER,Size.LARGE);
		//create AC 2 pas and large
		Aircraft ac2 = new Aircraft(Type.PASSENGER,Size.LARGE);
		//create AC 3 pas and small
		Aircraft ac3 = new Aircraft(Type.PASSENGER,Size.SMALL);
		//create AC 4 cargo and large
		Aircraft ac4 = new Aircraft(Type.CARGO,Size.LARGE);
		//create AC 5 cargo and large
		Aircraft ac5 = new Aircraft(Type.CARGO,Size.LARGE);
		//create AC 6 cargo and small
		Aircraft ac6 = new Aircraft(Type.CARGO,Size.SMALL);
		//create AC 7 cargo and small
		Aircraft ac7 = new Aircraft(Type.CARGO,Size.SMALL);
		//create AC 8 cargo and small
		Aircraft ac8 = new Aircraft(Type.CARGO,Size.SMALL);
				
		boolean end = true;
		
		ACQ acq = new ACQ();
		acq.aqm_request_process(Request.BOOT);
		acq.aqm_request_process(Request.ENQUEUE,ac6);
		acq.aqm_request_process(Request.ENQUEUE,ac3);
		acq.aqm_request_process(Request.ENQUEUE,ac2);
		acq.aqm_request_process(Request.ENQUEUE,ac5);
		acq.aqm_request_process(Request.ENQUEUE,ac4);
		
		
		//print 
		//acq.aqm_request_process(Request.PRINT);
		
		//remove first
		System.out.println("*******AC at first removal******* ");
		acq.aqm_request_process(Request.DEQUEUE);
		
		System.out.println("*******AC at second removal******* ");
		acq.aqm_request_process(Request.DEQUEUE);
		
		System.out.println("*******AC at third removal******* ");
		acq.aqm_request_process(Request.DEQUEUE);
		
		System.out.println("*******AC at fourth removal******* ");
		acq.aqm_request_process(Request.DEQUEUE);
		
		System.out.println("*******AC at fifth removal******* ");
		acq.aqm_request_process(Request.DEQUEUE);
		
		
		
		
		//add ac1
		System.out.println("*******Queue after adding again******* ");
		acq.aqm_request_process(Request.ENQUEUE,ac1);
		acq.aqm_request_process(Request.ENQUEUE,ac6);
		acq.aqm_request_process(Request.ENQUEUE,ac7);
		acq.aqm_request_process(Request.ENQUEUE,ac8);
		
		acq.aqm_request_process(Request.DEQUEUE);
		acq.aqm_request_process(Request.DEQUEUE);
		acq.aqm_request_process(Request.DEQUEUE);
		acq.aqm_request_process(Request.DEQUEUE);
		acq.aqm_request_process(Request.DEQUEUE);
		acq.aqm_request_process(Request.PRINT);
		
	}

}
