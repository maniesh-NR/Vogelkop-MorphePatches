package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.BaseColumns;
import com.opera.android.news.newsfeed.internal.cache.NewsfeedContentProvider;

/* loaded from: classes.dex */
public abstract class are implements BaseColumns {
    public static Uri a(Context context) {
        return NewsfeedContentProvider.b(context).buildUpon().appendPath("cities").build();
    }

    public static Uri b(Context context) {
        return NewsfeedContentProvider.b(context).buildUpon().appendPath("city_registrations").build();
    }

    public static Uri c(Context context) {
        return NewsfeedContentProvider.b(context).buildUpon().appendPath("newsfeedimgs").build();
    }

    public static Uri d(Context context) {
        return NewsfeedContentProvider.b(context).buildUpon().appendPath("newsfeed").build();
    }

    public static Uri e(Context context) {
        return NewsfeedContentProvider.b(context).buildUpon().appendPath("categories").build();
    }

    public static Uri f(Context context) {
        return NewsfeedContentProvider.b(context).buildUpon().appendPath("feedback_reasons").build();
    }
}
