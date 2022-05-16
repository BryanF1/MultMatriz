package proyecto.src.clase1;
import javax.swing.*;

public class MultMatriz 
{
    private int matriz1[][];

    private int matriz2[][];
     
    private int multi[][];

    private int fila;

    private int columna;

    private int valores;


    public MultMatriz()
    {
        
        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Fila para la matriz 1"));

        columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columna para la matriz 1"));

        this.matriz1 = new int[fila][columna];

        
        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingresar Fila para la matriz 2"));

        columna  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columna para la matriz 2"));

        this.matriz2 = new int[fila][columna];

         multi= new int[fila][columna];


    }

    public void incorporarMatriz1()
    {
        for (int fila=0; fila < this.matriz1.length; fila++)
        {
            for (int columna=0; columna < this.matriz1[fila].length; columna++)
            {
                this.valores = Integer.parseInt(JOptionPane.showInputDialog("valores para la matriz 1"));

                this.matriz1[fila][columna] = this.valores;
            }
        }
    }

    public void presentarMatriz1()
    {
        System.out.println("matriz 1");
        for(int fila=0; fila < this.matriz1.length; fila++)
        {
            for(int columna=0; columna < this.matriz1[fila].length; columna++)
            {
                System.out.printf("%d ", this.matriz1[fila][columna]);
            }
            
            System.out.println();
        }
    }

    public void incorporarMatriz2()
    {
        for (int fila=0; fila < this.matriz2.length; fila++)
        {
            for (int columna=0; columna < this.matriz2[fila].length; columna++)
            {
                this.valores = Integer.parseInt(JOptionPane.showInputDialog("valores para la matriz 2"));

                this.matriz2[fila][columna] = this.valores;
            }
        }
    }

    public void presentarMatriz2()
    {
        System.out.println("matriz 2");
        for(int fila=0; fila < this.matriz2.length; fila++)
        {
            for(int columna=0; columna < this.matriz2[fila].length; columna++)
            {
                System.out.printf("%d  ", this.matriz2[fila][columna]);
            }

            System.out.println();
        }
    }

     public void calcularMulti()
    {
        System.out.println("resultado");
        for (int a = 0; a < matriz2[0].length; a++) 
        {

        for (int fila = 0; fila < matriz1.length; fila++) {
            for (int columna = 0; columna < matriz1[0].length; columna++)
        {
            multi[fila][columna]+=matriz1[fila][a] * matriz2[a][columna];
            System.out.printf("%d ", multi[fila][columna]);
        }
          System.out.println();
        }
        }
    }





    public static void main(String args[])
    {
        MultMatriz matriz = new MultMatriz();

        matriz.incorporarMatriz1();

        matriz.presentarMatriz1();

        matriz.incorporarMatriz2();

        matriz.presentarMatriz2();
        matriz.calcularMulti();}

    
    }