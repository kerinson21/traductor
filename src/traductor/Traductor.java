/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package traductor;

import java.io.File;

/**
 *
 * @author KERINSON GARCÍA
 */
public class Traductor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFlex.Main.generate(new File("D:/Universidad/Septimo Semestre/Compiladores/compilador/traductor/src/traductor/lexer/Lexer.flex"));
        JFPrincipal.main(args);
    }
    
}
