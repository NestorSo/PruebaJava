public class Empleados{
  String nombres, apellidos, cargop;
  double salario;
  

  public Empleados(){nombres=""; apellidos=""; cargop=""; salario=0;}
  public Empleados(String nombres, String apellidos, String cargo, double salario){
    this.nombres=nombres; 
    this.apellidos=apellidos;
    this.cargop=cargop;
    this.salario=salario;
  }

  public void setN(String nombres){this.nombres=nombres;}
  public String getN(){return nombres;}

  public void setA(String apellidos){this.apellidos=apellidos;}
  public String getA(){return apellidos;}

  public void setC(String cargop){this.cargop=cargop;}
  public String getC(){return cargop;}

  public void setS(double salario){this.salario=salario;}
  public double getS(){return salario;}

  public void Mostrardatosempleado(){
    System.out.println("Nombres: "+getN()+"Apellidos: "+getA()+"Cargo del empleado: "+getC()+"Su salario es: "+getS());
  }

}