package excepution;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLDataException;

public class ThrowsDemo {
    public void  dosome()throws IOException, AWTException{}
}
class SubClass extends ThrowsDemo{
    //public void dosome()throws IOException,AWTException{}
    //public void dosome()throws IOException{}
    //public void dosome()throws FileNotFoundException {}
    //public void dosome(){}
    //not allow to throws exception the superClass not contain
    //public void dosome()throws SQLDataException{}
    //public void dosome()throws Exception{};
}
