package principal;

import entidade.cachorro;
 import entidade.Gato;
import entidade.Vaca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		cachorro M = new cachorro();
		System.out.print(M.emitirSom());
		
		
		Gato B = new Gato();
		System.out.print(B.emitirSom());
		
		Vaca C = new Vaca();
		System.out.print(C.emitirSom());
	}

}
