import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import decorator.io.LowerCaseInputStream;
import decorator.starbuzz.*;

import java.io.*;

public class DecoratorPatternDriver {

    /***
     * Extends functionality by attaching additional responsibilities to an object dynamically.
     * Provides a flexible alternative to subclassing.
     */

    public static void starbuzzDriver() {
        Beverage beverage = new Epresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }

    public static void ioDriver() throws IOException {

        int c;
        StringBuilder builder = new StringBuilder();

        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("resources/test.txt")));
            while ((c = in.read()) >= 0) {
                builder.append((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(builder.toString());
    }

    public static void main(String[] args) throws IOException {
        starbuzzDriver();
        ioDriver();
    }
}
