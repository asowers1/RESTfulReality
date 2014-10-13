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

            System.out.println("I/O error occurred: "+ioe);
        }
        JSONArray JSON = new JSONArray(getData);

        return  JSON;
    }

    public JSONArray getUserFavorites(String uuid)throws Exception{
        String getData = null;
        try {
            getData = data.sendGet("http://experiencepush.com/csp_portal/rest/?PUSH_ID=123&call=getUserFavorites&uuid="+uuid);
        }catch(IOException ioe){
            System.out.println("I/O error occurred: "+ioe);
        }
        JSONArray JSON = new JSONArray(getData);

        return JSON;
    }


   public static void main(String[] args) throws Exception{
       PushRESTAPI api = new PushRESTAPI();
       //System.out.println(api.getAllListings());
       //System.out.println(api.getUserFavorites("901292DF-C96A-4F19-AF3A-5A1893C41DF3"));

   }
}
