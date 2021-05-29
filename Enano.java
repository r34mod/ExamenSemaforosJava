package CocainomanaMonitor;


public class Enano extends Thread{
	
	private int i;
	private MonitorAccionEnanos m;
	
	public Enano(int i,MonitorAccionEnanos m) {
		this.i=i;
		this.m=m;
	}
	
	
	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	public void run() {
		while(true) {
			picarEnMina();
			try {
				if(m.haysillas()==true) {
					System.out.println("Se sienta "+getI());
					m.sentarse();
					System.out.println("El enano "+getI()+ " avisa");
					m.avisar();
					System.out.println("El enano "+getI()+ " come");
					sleep(10);
					m.comen();
					System.out.println("Termina de comer");
					
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	
	public void picarEnMina() {
		System.out.println("Enano: "+this.i+" Picando....");
		try {
			sleep((long) (Math.random()*400));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
