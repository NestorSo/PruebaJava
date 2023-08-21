import java.util.Calendar;
public class Secretario extends PersonalAdm{
 
  private Calendar fechaComienzoTrabajo;
  public Secretario(String cargo){super(); fechaComienzoTrabajo=fechaComienzoTrabajo;
  }
  public Secretario(String nombres, String apellidos, String cargop, double salario, int fechainicio){
    super(nombres, apellidos, cargop, salario, fechainicio); fechaComienzoTrabajo=fechaComienzoTrabajo;
  }
  public Calendar getfechaComienzoTrabajo(){return fechaComienzoTrabajo;}

 
  @Override
  public int AntiguedadEmpleado(){

  }
}
