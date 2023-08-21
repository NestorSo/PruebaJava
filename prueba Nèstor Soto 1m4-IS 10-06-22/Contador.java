import java.util.Calendar;
public class Contador extends PersonalAdm{
  private Calendar fechaComienzoTrabajo;

  Calendar fechaComienzo=Calendar.getInstance();

  public Contador(Calendar fechaComienzoTrabajo){super(); fechaComienzoTrabajo=fechaComienzoTrabajo;}
  public Contador(String nombres, String apellidos, String cargop, double salario, String fechainicio){
    super(nombres, apellidos, cargop, salario, fechainicio); fechaComienzoTrabajo=fechaComienzoTrabajo;
  }
  public Calendar getfechaComienzoTrabajo(){return fechaComienzoTrabajo;}
   public String toString(){
 return super.toString().concat (" antiguedad del empleado: ").concat (fechaComienzoTrabajo.getTime().toString()); }
  @Override
  public Calendar AntiguedadEmpleado(){return fechaComienzoTrabajo;}
}