/**
 * Created by andrew on 9/29/14.
 */

import java.io.IOException;
import java.lang.String;

public class PushRESTAPI {

    private network data;

    PushRESTAPI(){
        data = new network();

    }

    public JSONArray getAllListings()throws Exception{
        String getData = null;
        try {
            getData = data.sendGet("http://experiencepush.com/csp_portal/rest/?PUSH_ID=123&call=getAllListings");
        } catch(IOException ioe){

            System.out.println("I/O error occured: "+ioe);
        }
        JSONArray JSON = new JSONArray(getData);

        return  JSON;
    }

   public static void main(String[] args) throws Exception{
       PushRESTAPI api = new PushRESTAPI();
       System.out.println(api.getAllListings());
   }
}
