/**
 * File for a Song class to be used in the Playlist Project
 * @MiraMavis
 * @1/22/26
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private boolean like;
    private String title;
    private String artist;
    private int minutes;
    private int seconds;



    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */

    public Song (String newTitle, String newArtist, int newMinute, int newSecond){
        like = false;
        title = newTitle;
        artist = newArtist;
        minutes = newMinute;
        seconds = newSecond;

    }



     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */

     public String getName(){
        return "\""+ title + "\"";
     }

     public String getArtist(){
        return artist;
     }

     public boolean isLiked(){
        return like;
     }

     public String time(){
        return minutes+ ":" + seconds;
     }

     public int getMinutes(){
      return minutes;
     }

     public int getSeconds(){
      return seconds;
     }

     public String toString(){
      if (like == false){
        return "\""+ title + "\"" + " by " + artist + " " + "(" + minutes+ ":" + seconds + ")";
      }
      else{
         return "\""+ title + "\"" + " by " + artist + " " + "(" + minutes+ ":" + seconds + ") -- liked";
      }
     }


     public void setTitle(String newTitle){
        title = newTitle;
     }

     public void setArtist(String newArtist){
      artist = newArtist;
     }

     public void setTime(int newMinutes, int newSeconds){
      minutes = newMinutes;
      seconds = newSeconds;
     }

     public void setLiked(boolean isLiked){
      like = isLiked;
     }



}
