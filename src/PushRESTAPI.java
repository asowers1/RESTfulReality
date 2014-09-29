/**
 * Created by andrew on 9/29/14.
 */

import java.io.IOException;
import java.lang.String;

public class PushRESTAPI {

    private network data;

    PushRESTAPI(){


    }

    public void getAllListings()throws Exception{

        try {
            data.sendGet("http://experiencepush.com/?PUSH_ID=123&call=getAllListings");
        } catch(IOException ioe){
            System.out.println("I/O error occured: "+ioe);
        }
    }

   public static void main(String[] args) throws Exception{
       //PushRESTAPI api = new PushRESTAPI();
       System.out.println("test");
       //api.getAllListings();
   }
}
