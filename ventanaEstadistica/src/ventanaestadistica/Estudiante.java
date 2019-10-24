
package ventanaestadistica;

import javax.swing.JOptionPane;


public class Estudiante 
{
    private String[] nombre;
    private String[] apellido;
    private String[] Matricula;
    String[] sexo={"h","h","m"};
    //los datos ingresados a mano solo es para probar que si sirve la interface grafica
    
    


    public Estudiante() {
        
    }
    
    //ATRIBUTO
    
    public void imprimirDatosPorSexo()
    {
        int pos=3;
        for(int i=0;i<pos;i++)
        {
        JOptionPane.showMessageDialog(null, "por sexo  "+sexo[i],"Mensaje",JOptionPane.PLAIN_MESSAGE);
        }
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public String[] getApellido() {
        return apellido;
    }

    public void setApellido(String[] apellido) {
        this.apellido = apellido;
    }

    public String[] getMatricula() {
        return Matricula;
    }

    public void setMatricula(String[] Matricula) {
        this.Matricula = Matricula;
    }
    
    

    
}
