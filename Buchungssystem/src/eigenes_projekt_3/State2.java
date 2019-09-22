/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eigenes_projekt_3;

/**
 *
 * @author Florian
 */
public class State2 {
    
    
    private String completePath;
    private static State2 status2;
    public static State2 getState2(){
        if(status2 == null){
            status2 = new State2();
        }
        return status2;
    }
    
    public void setPath(String completePath){
        this.completePath = completePath;
    }
    
    public String getPath(){
        return this.completePath;
    }
    
    private State2(){
        
    }
}