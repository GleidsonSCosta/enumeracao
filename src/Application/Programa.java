package Application;

import java.util.Date;

import classes.Pedido;
import classes.enums.StatusPedido;

public class Programa {

	public static void main(String[] args) {
		//Declarar um objeto Pedido
		Pedido pedido = new Pedido(1000, new Date(), StatusPedido.AGURADANDO_PAGAMENTO);
		
		
		//na impressão o enum é retornado como string
		System.out.println(pedido);
		
		
		StatusPedido pedido1 = StatusPedido.PROCESSANDO;
		
		//como  transformar uma String em "enum"
		StatusPedido pedido2 = StatusPedido.valueOf("ENTREGUE");
		
		System.out.println(pedido1);
		System.out.println(pedido2);
	}
}