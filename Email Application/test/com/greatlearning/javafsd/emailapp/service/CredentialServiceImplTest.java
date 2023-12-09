package com.greatlearning.javafsd.emailapp.service;
import com.greatlearning.javafsd.emailapp.model.Employee;


public class CredentialServiceImplTest {

    
    public static void main(String[] args) {
        
          	testEmailAddressGeneration01();
          	testPasswordGeneration();
          	testDisplayCredentials01();

    }
    
    static void testPasswordGeneration() {
    
        
        testPasswordGeneration01();
    }
    
    static void testPasswordGeneration01() {
        
        
        ICredentialService credentialService 
            = new CredentialServiceImpl();		
        String password = credentialService.generatePassword();		
        System.out.println("Generated Password is -> " + password);
    }
    
    static void testEmailAddressGeneration() {
    	
    	testEmailAddressGeneration01();
    }

    static void testEmailAddressGeneration01() {
    	
    	ICredentialService credentialService 
    		= new CredentialServiceImpl();		
    	String emailAddress = credentialService.generateEmailAddress(
    		"Anjani", "Kavya", 2);		
    	System.out.println("Generated Email Address is -> " + emailAddress);
    	
    }
    
    static void testDisplayCredentials() {
    	
    	testDisplayCredentials01();
    	
    }

    static void testDisplayCredentials01() {
    	
    	ICredentialService credentialService 
    		= new CredentialServiceImpl();		

    	String firstName = "Anjani";
    	String lastName =  "Vinnakota";
    	int departmentCode = 1;
    	
    	Employee anjani = new Employee(firstName, lastName);

    	
    	String emailAddress = credentialService.generateEmailAddress(
    		firstName, lastName, departmentCode);		
    	
    	// For Email Address
    	anjani.setEmailAddress(emailAddress);


    	// For Password
    	
    	String password = credentialService.generatePassword();				
    	anjani.setPassword(password);
    	
    	credentialService.displayCredentials(anjani);		
    }

}