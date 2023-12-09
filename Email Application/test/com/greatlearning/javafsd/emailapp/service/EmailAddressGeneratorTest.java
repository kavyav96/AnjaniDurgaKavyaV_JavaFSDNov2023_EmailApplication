package com.greatlearning.javafsd.emailapp.service;

public class EmailAddressGeneratorTest {

    public static void main(String[] args) {
        
		testEmailAddress01();
        
        testEmailAddress02();
        
    }
    
    static void testEmailAddress01() {
        
        EmailAddressGenerator generator = new EmailAddressGenerator();
        
        String emailAddress = generator.generate("Anjani", "Vinnakota", 1);
        
        System.out.println("Email Address is " + emailAddress);		
    }

    static void testEmailAddress02() {
        
        EmailAddressGenerator generator = new EmailAddressGenerator();
        
        String emailAddress = generator.generate("Bhaskar", "Chenna", 3);
        
        System.out.println("Email Address is " + emailAddress);		
    }

}