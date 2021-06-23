
package test;
import dominio.Estudiante;
import java.util.Scanner;

public class TestEstudiante {
     
           datos del Scanner estático =  nuevo  Scanner ( System . in);
    public  static  void  main ( String [] args ) {
        int nroHombres, ne;      
        Sistema . fuera . println ( " Cuantos estudiantes desea ingresar " );
        int n = datos . nextInt ();
        Estudiante [] estudiantes =  new  Estudiante [n];
        llenaEstudiante (estudiantes);
        Sistema . fuera . println ( " Listado de Estudiantes ordenados de mayor a menor nota " );
        // llamar al metodo para ordenar
        ord1 (estudiantes);
        para ( Estudiante est : estudiantes) {
            Sistema . fuera . println (est);
        }
         
        nroHombres = porcentajegenero (estudiantes);
        Sistema . fuera . println ( " El% de hombres X encima del promedio: " + porcentajePromedio (estudiantes, nroHombres, ' m ' ));
        Sistema . fuera . println ( " El% de mujeres X encima del promedio: " + porcentajePromedio (estudiantes, nroHombres, ' f ' ));
        ne = notaAlta (estudiantes);
        Sistema . fuera . println ( " El estudiante con la mas alta nota es: " +
                estudiantes [ne] . getNombre ());
        
    }
     
    public  static  void  ord1 ( Estudiante  est []) {
        String nom;
        char sex;
        no doble ;

        para ( int n =  0 ; n < longitud est . -  1 ; n ++ ) {
            para ( int j =  0 ; j < longitud est . -  1 ; j ++ ) {
                if (est [j] . getNota () < est [j +  1 ] . getNota ()) {
                    nom = est [j +  1 ] . getNombre ();
                    sexo = est [j +  1 ] . getSexo ();
                    no = est [j +  1 ] . getNota ();
                    est [j +  1 ] = est [j];
                    est [j] =  nuevo  Estudiante (nom, sex, not);
                }
              
            }
             
        }
    }
     
    public  static  void  llenaEstudiante ( Estudiante  est []) {
        String nombre;
        char sexo;
        nota doble ;
        para ( int i = 0 ; i < est . de longitud; i ++ ) {
            datos . Proxima linea();
            Sistema . fuera . println ( " Estudiante No " + (i + 1 ));
            Sistema . fuera . print ( " Nombre: " );
            nombre = datos . Proxima linea();
            Sistema . fuera . println ( " Sexo: <<m>> <<f>> " );
            sexo = datos . siguiente () . charAt ( 0 );
            Sistema . fuera . imprimir ( " Nota: " );
            nota = datos . nextDouble ();
            est [i] =  nuevo  Estudiante (nombre, sexo, nota);            
        }
         
    }
     
    public   static  int   porcentajegenero ( Estudiante  est []) {
        int cuentahombres = 0 , cuentamujeres = 0 ;
        doble porc;
        para ( int i = 0 ; i < est . de longitud; i ++ ) {
            if (est [i] . getSexo () == ' m ' ) {
                cuentahombres ++ ;
            }
        }
         
        cuentamujeres = est . longitud - cuentahombres;
        Sistema . fuera . println ( " Porcentaje hombres = " + (cuentahombres * 100 / longitud est . ));
        Sistema . fuera . println ( " Porcentaje mujeres = " + (cuentamujeres * 100 / longitud est . ));
        porc = cuentahombres * 100 / est . largo;
        volver cuentahombres;
    }
     
    public  static  double  porcentajePromedio ( Estudiante  est [], int  homb , char  sex ) {
        int muj = est . longitud - hombre;
        int cuenta = 0 ;
        doble promedio = 0 , porche, porcm;
        para ( int i = 0 ; i < est . de longitud; i ++ ) {
            promedio + = est [i] . getNota ();
        }
        promedio = promedio / est . largo;
        
        para ( int i = 0 ; i < est . de longitud; i ++ ) {
            if (est [i] . getNota () > promedio && est [i] . getSexo () == sexo) {
                cuenta ++ ;
            }
        }        
        porche = hombre * 100 / est . largo;
        porcm = muj * 100 / est . largo;
        si (sexo == ' m '  && hombre > 0 ) {
            porche = cuenta * porche / hombre;
            porche de regreso ;
        }
        más  si (muj > 0 ) {
            porcm = cuenta * porcm / muj;
            return porcm;
           }
         
        else {
             
            return  0 ;
        }
    }
     
    public  static  int  notaAlta ( Estudiante  est []) {
        doble alcalde;
        int indice = 0 ;
        mayor = est [ 0 ] . getNota ();
        para ( int i = 1 ; i < est . de longitud; i ++ ) {
            if (est [i] . getNota () > alcalde) {
                mayor = est [i] . getNota ();
                índice = i;
            }
        }        
        indice de retorno ;
    }
}
    
    
        
       
