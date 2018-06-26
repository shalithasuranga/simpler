/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplerlang;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;


/**
 *
 * @author Shalitha Suranga
 */
public class Simplerlang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            CharStream input = (CharStream) new ANTLRFileStream("test.simpler");
            simplerlangLexer lexer = new simplerlangLexer(input);
            simplerlangParser parser = new simplerlangParser(new CommonTokenStream(lexer));
            parser.addParseListener(new simplerlangCustomListener());
            parser.program();
        } catch (IOException ex) {
            Logger.getLogger(Simplerlang.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
