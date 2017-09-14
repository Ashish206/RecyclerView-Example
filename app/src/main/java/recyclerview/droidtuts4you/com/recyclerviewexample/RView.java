package recyclerview.droidtuts4you.com.recyclerviewexample;

/**
 * Created by ashish on 15-09-2017.
 */

public class RView {

    private String androidName, androidVersion;
    private int androidLogo;


    public RView(String androidName, String androidVersion, int androidLogo) {
        this.androidName = androidName;
        this.androidVersion = androidVersion;
        this.androidLogo = androidLogo;
    }

    public String getAndroidName() {
        return androidName;
    }

    public void setAndroidName(String androidName) {
        this.androidName = androidName;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    public int getAndroidLogo() {
        return androidLogo;
    }

    public void setAndroidLogo(int androidLogo) {
        this.androidLogo = androidLogo;
    }

}
