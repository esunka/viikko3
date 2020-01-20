package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://nhlstatisticsforohtu.herokuapp.com/players";
        
        String bodyText = Request.Get(url).execute().returnContent().asString();
                
        System.out.println("json-muotoinen data:");
        //System.out.println( bodyText );

        Gson mapper = new Gson();
        Player[] players = mapper.fromJson(bodyText, Player[].class);
        
        System.out.println("Oliot:");


        List<Player> unsorted = new ArrayList<>();

        for( Player player: players) {
            unsorted.add(player);
        }
        unsorted.sort((Player p1, Player p2)->p2.total().compareTo(p1.total()));

        for(Player player:unsorted) {
            if(player.nationality().equals("FIN")){
                System.out.println(player);
            }
        } 
    }
  
}
