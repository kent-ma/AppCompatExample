package example.mk.appcompatexample.model;

/**
 * Created by kentma on 15-08-06.
 */
public class NavigationDrawerItem {

    private boolean showNotify;
    private String title;

    public NavigationDrawerItem(){

    }

    public NavigationDrawerItem (boolean showNotify, String title){
        this.showNotify = showNotify;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isShowNotify() {
        return showNotify;
    }

    public void setShowNotify(boolean showNotify) {
        this.showNotify = showNotify;
    }
}
