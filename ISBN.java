/*
 * @author OTIM WILLIAM GERISON
 * REG NO S19B23/421
 * ACCESS NUMBER A87886
 */
package otimwork;

public class ISBN
{

 private int englishSpeaking;
 private int publisherIdentifier;
 private int titleNumber;
 private int checkDigit;
 
 public ISBN()
 { 
 englishSpeaking = 0;
 publisherIdentifier = 0;
 titleNumber = 0;
 checkDigit = 0;
 }

 public static void main(String[] args)
{
    ISBN isbn = new ISBN();
    isbn.setEnglishSpeaking(0);
    isbn.setPublisherIdentifier(941831);
    isbn.setTitleNumber(39);
    isbn.setCheckDigit(6);
      
System.out.println("THE ISBN NUMBER IS: "+ isbn.getEnglishSpeaking() +" "+ isbn.getPublisherIdentifier() +" " + isbn.getTitleNumber() + " "+isbn.getCheckDigit() );
    
}

    public int getEnglishSpeaking() 
     {
        return englishSpeaking;
     }

    public void setEnglishSpeaking(int englishSpeaking) 
    {
	this.englishSpeaking = englishSpeaking;
    }

    public int getPublisherIdentifier() 
    {
	return publisherIdentifier;
    }

    public void setPublisherIdentifier(int publisherIdentifier)
    {
	this.publisherIdentifier = publisherIdentifier;
    }

    public int getTitleNumber()
    {
	return titleNumber;
    }

    public void setTitleNumber(int titleNumber)
    {
	this.titleNumber = titleNumber;
    }

    public int getCheckDigit()
    {
	return checkDigit;
    }

    public void setCheckDigit(int checkDigit) {
	this.checkDigit = checkDigit;
    }
 }

