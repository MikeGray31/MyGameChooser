package com.example.MyGameChooser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WebDataGetter {

    public static String[] metaCriticSystemTags = {"playstation-4", "xbox-one", "switch", "pc", "wii-u", "3ds", "playsation-vita", "ios"};

    public static String getUrlContents(String theUrl) {
        StringBuilder content = new StringBuilder();

        try {
            // create a url object
            URL url = new URL(theUrl);

            // create a urlconnection object
            URLConnection urlConnection = url.openConnection();
            urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
            urlConnection.connect();

            // wrap the urlconnection in a bufferedreader
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            String line;

            // read from the urlconnection via the bufferedreader
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
            bufferedReader.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    public static String getGoogleSearch(String searchTerm) {
        String GOOGLE_SEARCH_URL = "https://www.google.com/search";
        String searchURL = GOOGLE_SEARCH_URL + "?q="+searchTerm.replace(" ","+");
        return searchURL;
    }

    public static String getGoogleScores(String htmlText){
        Document doc = Jsoup.parse(htmlText);
        Elements sources = doc.getElementsByClass("wDgjf");
        Elements scores = doc.getElementsByClass("gsrt IZACzd");

        System.out.println(sources);
        System.out.println("-----------");
        System.out.println(scores);
        return sources.toString() + " ||| " + scores.toString();
    }

    public static String getMetaCriticSearch(String platform, String title){
        String METACRITIC_SEARCH_URL = "https://www.metacritic.com/game/";
        return METACRITIC_SEARCH_URL + platform + "/" + title.replace(" ", "-").toLowerCase();
    }

    public static String getMetaCriticScores(String htmlText){
        Document doc = Jsoup.parse(htmlText);
        Elements sources;
        Elements scores;
        return null;
    }
}
