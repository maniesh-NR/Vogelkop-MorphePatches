package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class xhj extends dij {
    public final String f;
    public final boolean g;

    public xhj(Bundle bundle) {
        super(bundle);
        String string = bundle.getString("news_category");
        this.f = TextUtils.isEmpty(string) ? "topnews" : string;
        this.g = bundle.getBoolean("news_forced_category");
    }

    @Override // defpackage.s0f
    public final Intent a(Context context) {
        return b(context, "com.opera.android.action.SHOW_NEWS");
    }

    @Override // defpackage.s0f
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putString("show_news_request_id", this.c);
        bundle.putString("show_news_backend", "newsfeed");
        bundle.putBoolean("show_news_reusable", this.e);
        bundle.putString("news_category", this.f);
        bundle.putBoolean("news_forced_category", this.g);
        return bundle;
    }
}
