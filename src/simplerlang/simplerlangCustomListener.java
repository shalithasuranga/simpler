/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplerlang;

import java.util.HashMap;

/**
 *
 * @author Shalitha Suranga
 */
public class simplerlangCustomListener extends simplerlangBaseListener {
    
    HashMap<String, Integer> variableMap = new HashMap();

    @Override
    public void exitShow(simplerlangParser.ShowContext ctx) {
        if(ctx.INT() != null){
            System.out.println(ctx.INT().getText());
        }
        else if(ctx.VAR() != null){
            System.out.println(this.variableMap.get(ctx.VAR().getText()));
        }
    }

    @Override
    public void exitLet(simplerlangParser.LetContext ctx) {
        this.variableMap.put(ctx.VAR().getText(), Integer.parseInt(ctx.INT().getText()));
    }
    
}
