package CocainomanaMonitor;

public class Monitorenanos {
	
	private boolean cocina=false;
	MonitorAccionEnanos mae = new MonitorAccionEnanos(4);
	
	public synchronized boolean cocina() throws InterruptedException{
		
		if(mae.getInem()!=0){
			cocina=true;
			System.out.println("Cocina");
			wait();
			
		}else {
			System.out.println("No cocina y se va");
			cocina=false;
		}
		return cocina;
		
		
	}
	
	public synchronized void platoListo() throws InterruptedException{
		System.out.println("Platos listos");
		cocina=false;
		notifyAll();
	}
}
