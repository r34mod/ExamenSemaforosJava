package CocainomanaMonitor;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MonitorAccionEnanos m= new MonitorAccionEnanos(4);
		Monitorenanos me = new Monitorenanos();
		Blancanieves blanca=new Blancanieves ();
		
		for (int i = 1; i<=7; i++) {
			Enano en=new Enano(i, m);
			en.start();
		}
		blanca.start();
	}

}
