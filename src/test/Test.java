/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Machine;
import entities.Salle;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.MachineService;
import service.SalleService;

/**
 *
 * @author Lachgar
 */
public class Test {
    
    public static void main(String[] args) {
        try {      
            SalleService ss = new SalleService();
            MachineService ms = new MachineService();
            ms.create(new Machine("RE44", "HP", 2000,ss.findById(1)));
      Salle salleP = ss.findById(1);
            
            for (Machine m : ms.findAll()) {
            System.out.println(m);
            }
       
           // ss.create(new Salle("Cd512"));
            
           /*     for(Salle s : ss.findAll())
           System.out.println(s.getMachines());
           for(Machine m : ms.findAll())
           System.out.println(m);
           */
        } catch (RemoteException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
