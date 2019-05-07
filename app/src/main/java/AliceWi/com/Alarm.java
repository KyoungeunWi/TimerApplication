package AliceWi.com;

import android.net.Uri;

import java.net.URI;

public class Alarm {
    public int time ;
    public Uri soundUri ;
    public String webUrl ;

    public Alarm(int time, Uri soundUri) {
        this.time = time;
        this.soundUri = soundUri;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Uri getSoundUri() {
        return soundUri;
    }

    public void setSoundUri(Uri soundUri) {
        this.soundUri = soundUri;
    }
}
