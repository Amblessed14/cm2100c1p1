/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.rgu.cm2100;

/**
 *
 * @author Amblessed chukwuka John
 */
public interface IOrder {
    
    public void addItem(IMenuItem item);
    
    public int total();
    
    public void print();
    
    public void writeToFile();
    
}
