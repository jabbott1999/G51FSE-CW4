import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class CompanyEmailTest {

    @Ignore
    // Test default constructor with 0 variables. Should pass.
    // Written by James and Charlie.
    public void testDefaultConstructor() {
   	 CompanyEmail email = new CompanyEmail();
   	 assertEquals(null,email.fromAddress());
    }
    
    
    /////////////////////////////////////////////////////
    
    
    @Ignore
    // Test that toAddress returns null when address hasn't been set. Should pass.
    // Written by James and Charlie.
    public void testToAddress() {
    	CompanyEmail email = new CompanyEmail();
    	assertEquals(null, email.toAddress());
    }
    
    @Ignore
    // Test setTo and toAddress with a valid email address. Should pass.
    // Written by James and Charlie.
    public void testSetTo1() {
      	 CompanyEmail email = new CompanyEmail();
      	 email.setTo("sandra.jones@company.com");
      	 assertEquals("sandra.jones@company.com",email.toAddress());
       }

    @Ignore
    // Test setTo and toAddress with an invalid email address. Should fail.
    // Written by James and Charlie.
    public void testSetTo2() {
      	 CompanyEmail email = new CompanyEmail();
      	 email.setTo("sandra.jonescompany.com");
      	 assertEquals("sandra.jonescompany.com",email.toAddress());
       }
    
    @Ignore
    // Test setTo and toAddress with null address. Test that email is not valid (isValid). Should pass.
    // BUG FIX: Was not taking null as a string input, so email couldn't be invalidated.
    // Written by James and Richard.
    public void testSetTo3() {
    	CompanyEmail email = new CompanyEmail();
    	email.setTo(null);
    	assertEquals(false, email.isValid());
    }
    
    
    /////////////////////////////////////////////////////
    
    
    @Ignore
    // Test that fromAddress returns null when address hasn't been set. Should pass.
    // Written by James and Charlie.
    public void testFromAddress() {
    	CompanyEmail email = new CompanyEmail();
    	assertEquals(null, email.fromAddress());
    }
    
    @Ignore
    // Test setFrom and fromAddress with a valid email address. Should pass.
    // Written by James and Charlie.
    public void testSetFrom1() {
      	 CompanyEmail email = new CompanyEmail();
      	 email.setFrom("dave.smith@company.com");
      	 assertEquals("dave.smith@company.com",email.fromAddress());
       }
    
    @Ignore
    // Test setFrom and fromAddress with an invalid email address. Should fail.
	// Written by James and Charlie.
    public void testSetFrom2() {
      	 CompanyEmail email = new CompanyEmail();
      	 email.setFrom("dave.smithcompany.com");
      	 assertEquals("dave.smithcompany.com",email.fromAddress());
       }

    
    @Ignore
    // Test setFrom and fromAddress with null address. Test that email is not valid (isValid). Should pass
    // BUG FIX: Was not taking null as a string input, so email couldn't be invalidated.
    // Written by James and Richard.
    public void testSetFrom3() {
    	CompanyEmail email = new CompanyEmail();
    	email.setFrom(null);
    	assertEquals(false, email.isValid());
    }
    
    
    /////////////////////////////////////////////////////
    
    
    
    @Ignore
    // Test that subjectLine returns null when subject hasn't been set. Should pass.
    // Written by James and Charlie.
    public void testSubjectLine() {
    	CompanyEmail email = new CompanyEmail();
    	assertEquals(null, email.subjectLine());
    }
    
    @Ignore
    // Test setSubject and subjectLine with string of characters. Should pass.
    // Written by James and Charlie.
    public void testSetSubject1() {
    	CompanyEmail email = new CompanyEmail();
    	email.setSubject("Company Newsletter");
    	assertEquals("Company Newsletter", email.subjectLine());
    }
    
    @Ignore
    // Test setSubject and subjectLine with empty string. Should pass.
    // Written by James and Charlie.
    public void testSetSubject2() {
    	CompanyEmail email = new CompanyEmail();
    	email.setSubject("");
    	assertEquals("", email.subjectLine());
    }
    
    @Ignore
    // Test setSubject and subjectLine with null subject. Test that email is not valid (isValid). Should pass.
    // Written by James and Charlie.
    public void testSetSubject3() {
    	CompanyEmail email = new CompanyEmail();
    	email.setSubject(null);
    	assertEquals(false, email.isValid());
    }
    
    
    
    
    /////////////////////////////////////////////////////
    
    
    
    @Ignore
    // Test that emailMessage returns null when message hasn't been set. Should pass.
    // BUG FIX: Was returning emailMessage() function instead of emailMessage variable.
    // Written by James and Charlie.
    public void testEmailMessage() {
    	CompanyEmail email = new CompanyEmail();
    	assertEquals(null, email.emailMessage());
    }
    
    @Ignore
    // Test setMessage and emailMessage with string of characters. Should pass.
    // Written by James and Charlie.
    public void testSetMessage() {
    	CompanyEmail email = new CompanyEmail();
    	email.setMessage("Hi Sandra...");
    	assertEquals("Hi Sandra...", email.emailMessage());
    }
    
    @Ignore
    // Test setMessage and emailMessage with an empty string. Should pass.
    // Written by James and Charlie.
    public void testSetMessage2() {
    	CompanyEmail email = new CompanyEmail();
    	email.setMessage("");
    	assertEquals("", email.emailMessage());
    }
    
    @Ignore
    // Test setSubject and subjectLine with null subject. Test that email is not valid (isValid). Should pass.
    // Written by James and Charlie.
    public void testSetMessage3() {
    	CompanyEmail email = new CompanyEmail();
    	email.setMessage(null);
    	assertEquals(false, email.isValid());
    }
    
    
    /////////////////////////////////////////////////////
    
    
    @Ignore
    // Test that toString returns string of characters when passed string of characters. Should pass.
    // Written by James and Charlie.
    public void testToString1() {
    	CompanyEmail email = new CompanyEmail();
    	email.setSubject("Important Meeting");
    	assertEquals("Important Meeting", email.toString());
    }
    
    @Ignore
    // Test that toString returns placeholder string when passed empty string. Should pass.
    // Written by James and Charlie.
        public void testToString2() {
    	CompanyEmail email = new CompanyEmail();
    	email.setSubject("");
    	assertEquals("[no subject]", email.toString());
    }
    
}


