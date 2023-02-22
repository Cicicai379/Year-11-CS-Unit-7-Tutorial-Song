import java.util.ArrayList;
import java.util.Locale;

public class Song {
    private String title;
    private String artist;
    private ArrayList<String> names = new ArrayList<String>();
    public Song(String s, String a){
        title=s;
        artist=a;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int howMany(ArrayList<String> arr) {
        int ans=0;
        for(String e: arr){
            int flag=1;
            e= e.toLowerCase();
            for(String i:  names) {
                i= i.toLowerCase();
                if (i.equals(e)) {
                    flag = 0;
                }
            }
            if (flag == 1){
                names.add(e);
                ans+=1;
            }
        }
       return ans;
    }
}
