import java.util.ArrayList;
import java.util.Iterator;

public class  ListaDelPersonal{

    private ArrayList<PersonalAdm>ListaDelPersonal;   

    public ListaDelPersonal(){ListaDelPersonal = new ArrayList<PersonalAdm>();} 

    public void addEmpleados (PersonalAdm Empleados) {  ListaDelPersonal.add(Empleados);} 

    public void MostrarLista(){

        String temp1 = "";

        System.out.println ("Se procede a mostrar los datos de los profesores existentes en el listín \n");

        for (PersonalAdm tmp: ListaDelPersonal) {System.out.println (tmp.toString () );

                                   if (tmp instanceof PersonalAdm) { temp1 = "Secretario";} else { temp1 = "Contador"; }

         System.out.println("el cargo del empleado :"+temp1+" La antiguedad del empleado es : "+(tmp.AntiguedadEmpleado())+ "\n");}

    } 

   

} 