import javax.swing.JOptionPane;

public class Programa_Fisica {

    public static void main(String[] args) {

        //*Declaracion de variables */
        double alcanceMax, aceleracion, angulo, altura;
        double velInicial, alturaMax; 
        int decision;
        int decision_2;

        //*Mensajes de bienvenida */
        JOptionPane.showMessageDialog(null,"Bienvenido al programa");
        JOptionPane.showMessageDialog(null,"Este programa se ha diseñado para calular la altura maxima y la velocidad inicial en un disparo parabolico.\n Para indicar un decimal utilice (.)");
        decision = Integer.parseInt(JOptionPane.showInputDialog("Presione: \n  1.Para realizar un calculo \n 2. Para cerrar el programa")); 


        
        //*Solicitud de informacion */
            
            //*Condicional para hacer o no el calculo */
            if(decision==1){
                
                //*Ciclo para hacer otro calculo */
                do{
                angulo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el angulo de disparo"));

                altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura inicial"));
                
                aceleracion =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese la aceleracion"));
            
                alcanceMax = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el alcance maximo"));

                                
                //*Conversion a radianes */
                double convRad = Math.toRadians(angulo);

                //*Calculos */
                velInicial = Math.sqrt(((aceleracion/2)*Math.pow(alcanceMax, 2)) / ((Math.pow(Math.cos(convRad),2)) * (altura + (alcanceMax*Math.tan(convRad)))));

                alturaMax = altura + ((Math.pow(velInicial, 2) * Math.pow(Math.sin(convRad), 2)) / (2 * aceleracion));

                JOptionPane.showMessageDialog(null, "La velocidad con la que es disparado es de aproximadamente " + 
                String.format("%.3f", velInicial) + "\nLa altura maxima que alcanza el proyectil es de aprocimadamente : " + 
                String.format("%.3f", alturaMax));
                //*Fin calculos */
                
                //*Variable del ciclo */
                decision_2 = Integer.parseInt(JOptionPane.showInputDialog("Presione: \n  1.Para realizar otro calculo \n 2. Para cerrar el programa")); 

                    
                }

                while(decision_2==1);
                JOptionPane.showMessageDialog(null, "Hasta pronto");
                //*Fin del ciclo */

            }
            else JOptionPane.showMessageDialog(null, "Hasta pronto");
            //*Fin del condicional */

        }
    
}
