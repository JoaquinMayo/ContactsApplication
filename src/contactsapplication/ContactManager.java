/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsapplication;

/**
 *
 * @author asus
 */
public class ContactManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContactApp app = new ContactApp();
        
        MainForm mf = new MainForm(app);
        mf.setVisible(true);
    }
    
}
