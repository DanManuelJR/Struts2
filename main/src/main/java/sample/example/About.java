package sample.example;

public class About extends ExampleSupport{

    public String execute(){

        setDescription("It's Organic.");
        setIntroductionDescription(introduction());

        return SUCCESS;

    }

    private String websiteDescr = "This is the about page.";
    private String description;
    private String introductionDescription;

    public String introduction(){
        return "Don't Panic " + this.description;
    }

    public String getWebsiteDescr() {
        return websiteDescr;
    }

    public void setWebsiteDescr(String websiteDescr) {
        this.websiteDescr = websiteDescr;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIntroductionDescription() {
        return introductionDescription;
    }

    public void setIntroductionDescription(String introductionDescription) {
        this.introductionDescription = introductionDescription;
    }
    
}
