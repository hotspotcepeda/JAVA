package vehiculo;

public class Vehiculo {
    protected String matricula;
    protected String color;
    protected String marca;
    protected String modelo;

    public Vehiculo() {
        this.matricula = "xxx 1234";
        this.color = "color X";
        this.marca = "marca X";
        this.modelo = "modelo X";
        
    }

    public Vehiculo(String matricula, String color, String marca, String modelo) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    protected Vehiculo(Vehiculo v) {
        this.matricula = v.matricula;
        this.color = v.color;
        this.marca = v.marca;
        this.modelo = v.modelo;
    }

    // geter and seter
    
    
    protected String getMatricula() {
        return matricula;
    }

    protected void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }
        
    public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
    public String toString() {
        return "Matricula: " + matricula + "\nColor: " + color + "\nMarca: " + marca + "\nModelo: " + modelo;
    }
}