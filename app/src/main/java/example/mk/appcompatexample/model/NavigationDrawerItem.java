package example.mk.appcompatexample.model;

/**
 * Created by kentma on 15-08-06.
 */
public class NavigationDrawerItem {

    private boolean mShowNotify;
    private String mTitle;

    private String title;

    public NavigationDrawerItem(){

    }

    public NavigationDrawerItem (boolean showNotify, String title){
        mShowNotify = showNotify;
        mTitle = title;

    }

}
