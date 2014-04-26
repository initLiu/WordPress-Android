package org.wordpress.android.ui.reader;

public class ReaderConstants {
    public static final int  READER_MAX_POSTS_TO_REQUEST      = 20;     // max #posts to request when updating posts (should be an even # to avoid "hanging post" in 2-column grid mode)
    public static final int  READER_MAX_POSTS_TO_DISPLAY      = 200;    // max #posts to display in ReaderPostListFragment
    public static final int  READER_MAX_COMMENTS_TO_REQUEST   = 20;     // max #comments to request when updating comments
    public static final int  READER_MAX_USERS_TO_DISPLAY      = 500;    // max #users to show in ReaderUserListActivity
    public static final long READER_AUTO_UPDATE_DELAY_MINUTES = 10;     // 10 minute delay between automatic updates
    public static final int  READER_MAX_RECOMMENDED_BLOGS     = 10;     // max # of recommended blogs to request
}
