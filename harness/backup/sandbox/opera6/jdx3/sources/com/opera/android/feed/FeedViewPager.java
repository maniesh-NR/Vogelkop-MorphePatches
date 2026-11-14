package com.opera.android.feed;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import com.opera.android.custom_views.LayoutDirectionViewPager;

/* loaded from: classes.dex */
public class FeedViewPager extends LayoutDirectionViewPager {
    public boolean c;

    public FeedViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = this.b.b();
        this.b.d(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final IBinder getWindowToken() {
        IBinder windowToken = super/*android.view.View*/.getWindowToken();
        return windowToken != null ? windowToken : mx8.a;
    }
}
