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
public class State {
    
    
    private String folderName;
    private static State status;
    public static State getState(){
        if(status == null){
            status = new State();
        }
        return status;
    }
    
    public void setFolderName(String folerName){
        this.folderName = folerName;
    }
    
    public String getFolderName(){
        return this.folderName;
    }
    
    State(){
        
    }
}
