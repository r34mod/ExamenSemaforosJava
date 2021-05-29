package CocainomanaMonitor;



public class MonitorAccionEnanos {
	
	private int silla = 4;
	private int inem=0;
	private boolean chairs=true;
	public MonitorAccionEnanos(int silla) {
			this.silla=silla;
	}

	public int getSilla() {
		return silla;
	}

	public void setSilla(int silla) {
		this.silla = silla;
	}
	
	
	public int getInem() {
		return inem;
	}

	public void setInem(int inem) {
		this.inem = inem;
	}
	

	public synchronized void sentarse() throws InterruptedException{
		while(getSilla()==0) {
			try {
				wait();
			}catch(InterruptedException	e) {
				e.getCause();
			}
		}
		setSilla(getSilla()-1);
	}
	
	public synchronized boolean haysillas() throws InterruptedException{
		if(getSilla()>0) {
			chairs=true;
		}else {
			chairs=false;
		}
		return chairs;
	}
	public synchronized void avisar() {
		System.out.println("Avisa a la blanca");
		setInem(getInem()+1);
		notifyAll();
		
		
	}
	
	public synchronized void esperanComer() {
		System.out.println("Estan sentados esperando comer");
		try {
			if(inem==0) {
				System.out.println("Esperan");
			}
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public synchronized void comen() {
		System.out.println("Estan comiendo");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inem--;
		setSilla(getSilla()+1);
		chairs=false;
	}

	
}
