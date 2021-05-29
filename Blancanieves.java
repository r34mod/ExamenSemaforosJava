package CocainomanaMonitor;

public class Blancanieves extends Thread {
	Monitorenanos me = new Monitorenanos();

	public void run() {
		while (true) {
			try {
				if (me.cocina()) {
					cocinar();

					me.platoListo();
				} else {
					irseDePaseo();
				}

			} catch (InterruptedException e) {
				e.getCause();
			}
		}
	}

	public void cocinar() {
		System.out.println("BLANCANIEVES COCINANDO");
		try {
			sleep((long) (Math.random() * 40));
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	public void irseDePaseo() {
		System.out.println("BLANCANIEVES PASEANDO");
		try {
			sleep(500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}
}
