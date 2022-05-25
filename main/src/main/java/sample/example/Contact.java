package sample.example;

public class Contact extends ExampleSupport {

    public String execute(){

        setContact(95845847);
        setIntroductionContact(introduction());
        
        return SUCCESS;

    }
    private String contactPage ="This is the contact page.";
    private int contact;
    private String introductionContact;

    public String introduction(){
        return "Contact us to this phone number " + this.contact;
    }
  


    public String getContactPage() {
        return contactPage;
    }
    public void setContactPage(String contactPage) {
        this.contactPage = contactPage;
    }



    public int getContact() {
        return contact;
    }



    public void setContact(int contact) {
        this.contact = contact;
    }



    public String getIntroductionContact() {
        return introductionContact;
    }



    public void setIntroductionContact(String introductionContact) {
        this.introductionContact = introductionContact;
    }

}
    

