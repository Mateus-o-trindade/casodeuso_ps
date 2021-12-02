package  pratica.domain ;

import  javax.persistence.Entity ;

import  pratica.domain.enums.EstadoPagamento ;
@Entidade
public  class  PagamentoComCartao  extends  Pagamento {
	private  static  final  long serialVersionUID =  1L ;
	
	private  Integer numeroDeParcelas;

	public  PagamentoComCartao () {
	}

	public  PagamentoComCartao ( inteiro  id , EstadoPagamento  estado , Pedido  pedido , Integer  numeroDeParcelas ) {
		super (id, estado, pedido);
		isso . numeroDeParcelas = numeroDeParcelas;
	}

	public  Integer  getNumeroDeParcelas () {
		return numeroDeParcelas;
	}

	public  void  setNumeroDeParcelas ( Integer  numeroDeParcelas ) {
		isso . numeroDeParcelas = numeroDeParcelas;
	}
	
	
}