package hw6New;

public class Exchange<E> {
	private E e1 = null, e2 = null;

	public synchronized E give1(E e) {
		this.e1 = e;
		while (e2 == null) {
			try {
				wait();
			} catch (InterruptedException s) {
			}
		}
		notify();
		return e2;
	}

	public synchronized E give2(E e) {
		this.e2 = e;
		while (e1 == null){
			try {
				wait();
			} catch (InterruptedException s) {
			}
		}
		notify();
		return e1;
	}

}
