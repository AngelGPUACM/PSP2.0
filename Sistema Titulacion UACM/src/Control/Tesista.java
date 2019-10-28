package Control;

public class Tesista
{
	private String Nombre;
	private String apellidoP;
	private String apellidoM; 
	private char sexo;
	private String correoPersonal;
	private String numCel;
	private boolean trabaja;
	private String edoCivil;
	private int numHijos;
	private Empresa empresa;
	private Universidad uni;
	private Hogar casa;
	private boolean beca;
	
	public String getNombre() 
	{
		return Nombre;
	}
	
	public void setNombre(String nombre)
	{
		Nombre = nombre;
	}
	
	public String getApellidoP()
	{
		return apellidoP;
	}
	
	public void setApellidoP(String apellidoP)
	{
		this.apellidoP = apellidoP;
	}
	
	public String getApellidoM()
	{
		return apellidoM;
	}
	
	public void setApellidoM(String apellidoM)
	{
		this.apellidoM = apellidoM;
	}
	
	public char getSexo() 
	{
		return sexo;
	}
	
	public void setSexo(char sexo)
	{
		this.sexo = sexo;
	}
	
	public String getCorreoPersonal() 
	{
		return correoPersonal;
	}
	
	public void setCorreoPersonal(String correoPersonal)
	{
		this.correoPersonal = correoPersonal;
	}
	
	public String getNumCel() 
	{
		return numCel;
	}
	
	public void setNumCel(String numCel)
	{
		this.numCel = numCel;
	}
	
	public boolean isTrabaja()
	{
		return trabaja;
	}
	
	public void setTrabaja(boolean trabaja)
	{
		this.trabaja = trabaja;
	}
	
	public String getEdoCivil()
	{
		return edoCivil;
	}
	
	public void setEdoCivil(String edoCivil) 
	{
		this.edoCivil = edoCivil;
	}
	
	public int getNumHijos()
	{
		return numHijos;
	}
	
	public void setNumHijos(int numHijos)
	{
		this.numHijos = numHijos;
	}
	
	public Empresa getEmpresa()
	{
		return empresa;
	}
	
	public void setEmpresa(Empresa empresa)
	{
		this.empresa = empresa;
	}
	
	public Universidad getUni()
	{
		return uni;
	}
	
	public void setUni(Universidad uni)
	{
		this.uni = uni;
	}
	
	public Hogar getCasa()
	{
		return casa;
	}
	
	public void setCasa(Hogar casa)
	{
		this.casa = casa;
	}
	
	public boolean isBeca()
	{
		return beca;
	}
	
	public void setBeca(boolean beca)
	{
		this.beca = beca;
	}
	
	
}
