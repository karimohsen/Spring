package utility;


import javax.validation.constraints.Size;

/**
 * Created by Karim on 4/9/2015.
 */
public class User {

    @Size(min = 1 , max = 45 , message = "The string size should be between 1 and 45")
    String fname;
    @Size(min = 1 , max = 15 , message = "The phone number max length is 15")
    String num;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
