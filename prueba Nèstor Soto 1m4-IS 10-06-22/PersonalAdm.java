import java.util.Calendar;
import java.util.Date;
public abstract class PersonalAdm extends Empleados{
  private String fechainicio;

  public PersonalAdm(){super(); fechainicio="";  }
  public PersonalAdm(String nombres, String apellidos, String cargop, double salario, String fechainicio){
    super(nombres, apellidos, cargop, salario);fechainicio=fechainicio;
  }

  public void setfecha(String fechainicio){this.fechainicio=fechainicio;}
  public String getfecha(){return fechainicio;}  

  public void MostrarDatos(){
    System.out.println("Datos de empleado: "+getN()+" "+getA()+" "+getC()+" "+getS());
  }
 
 
  abstract public int  AntiguedadEmpleado();
}