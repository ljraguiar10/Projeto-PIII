package ModeloBarbearia;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Agendamento {
	
	private int id;
	private Cliente cliente;
	private Serviço serviço;
	private float valor;
	private Date data;
	private String observação;
	
	public Agendamento(int id, Cliente cliente, Serviço serviço, float valor, String data) {
		
		this.id = id;
		this.cliente = cliente;
		this.serviço = serviço;
		this.valor = valor;
		try {
			this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Serviço getServiço() {
		return serviço;
	}

	public void setServiço(Serviço serviço) {
		this.serviço = serviço;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getObservação() {
		return observação;
	}

	public void setObservação(String observação) {
		this.observação = observação;
	}
	
	
}