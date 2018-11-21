import java.util.Scanner;


public class Ejerci3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// este programa calcula el numero verificador de un run
		String RUN,res;
		int run=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese un Run sin numero verificador");
		RUN=sc.nextLine();
		//evaluar si el dato ingresado es un numero
		try{run=Integer.parseInt(RUN);}
		catch(NumberFormatException ex){
			System.out.println("Favor de ingresar un Run valido");
		}sc.close();  //cierro scanner
		//si el dato es un numero que no coincide a un run
		if (run<=1000000 || run>=99999999){
			System.out.println("Run inexistente");
		}else{
			//si no se ejecuta
			int cifras;
			int aux,aux2;
			String resul=null;
			int mul=8;
			double dis;
			dis=10000000;
			int suma=0;
			//este ciclo separa los digitos y los multiplica segun corresponda de izquierda a derecha
			for(int i=0;i<8;i++){
				//los multiplicadores en orden de izq a der son 7,6,5,4,3,2; una vez llega a 2 se devuelve al 3
				if(mul<=7){
					if(mul>2){
						mul=mul-1;
					}else{
						mul=7;
					}
				}else{
					mul=3;
				}
				cifras=(int) Math.floor(run/dis);           //numero por separado, ignorando todo lo que esta despues del punto
				run=(int) (run-(dis*cifras));                //se altera en run quitando el dato que ya no sirve
				cifras=cifras*mul;                          //se multiplica segun corresponde
				dis=dis/10;                                 //se reduce la variable para separar el dato
				suma=suma+cifras;                           //acumula el resultado anterior
			}aux=(int)Math.floor(suma/11);                  //el acumulado se divide en 11, ignorando todo lo que esta despues del punto
			aux2=aux*11;                                     //el resultado se multiplica en 11
			aux=suma-aux2;                                  //a la sumatoria, que salio en el for, se le resta el resultado aunterior
			aux2=11-aux;                                    //al numero 11 se resta el resultado ant
			resul=Integer.toString((int) aux2);             //el resultado se convierte en String para comparar condiciones
			if(resul=="11"){                                //si el resultado es 11 se transforma en K
				resul=("K");
			}if(resul=="10"){                               //si el resultado es 10 se tranforma en 0
				resul="0";
			}
			System.out.println("su numero verificador es: "+resul);
		}

	}
  }


