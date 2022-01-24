/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mojinator
 */
public class borjajenkins {
     public static boolean dia_laboral(String dia) {
        switch(dia) {
                    case "Lunes":
                    return true;
                    case "Martes":
                    return true;
                    case "Miercoles":
                    return true;
                    case "Jueves":
                    return true;
                    case "Viernes":
                    return true;
                    case "Sabado":
                    return false;
                    case "Domingo":
                    return false;
                    default:
                    return false;
                    }
    }
}
