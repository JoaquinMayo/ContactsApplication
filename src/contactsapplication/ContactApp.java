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
public class ContactApp {
    Contact[] contacts = new Contact[100];
    String[] tempList = new String[100];
    int contactCount = 0;
    
    void addContact(String firstName, String lastName, String phone, String email) {
        Contact contact = new Contact(app);
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setPhone(phone);
        contact.setEmail(email);
        
        tempList[contactCount++] = firstName;
        contacts[contactCount++] = contact;
        
    }
    String[] getContactsList(){
        return tempList;
    }
}
