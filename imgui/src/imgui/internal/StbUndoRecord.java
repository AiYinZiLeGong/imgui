/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imgui.internal;

/**
 *
 * @author GBarbieri
 */
public class StbUndoRecord {
 
    int where;
    
    short insertLength;
    
    short deleteLength;
    
    short charStorage;
}