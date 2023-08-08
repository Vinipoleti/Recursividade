package Controller;

public class SomaNaturais {

	public SomaNaturais() {
		super ();
		}
	public int soma( int N) {
		if (N<0) {
			return 0;
		} else {
			return N + soma(N-1);
		}
	}

}
