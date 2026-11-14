package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class dij extends s0f {
    public final String c;
    public final cue d;
    public final boolean e;

    public dij(Bundle bundle) {
        super(bundle);
        this.c = bundle.getString("show_news_request_id", "");
        if (!bundle.containsKey("show_news_backend")) {
            throw new djb("show_news_backend");
        }
        boolean zEquals = "newsfeed".equals(bundle.getString("show_news_backend"));
        cue cueVar = cue.None;
        cue cueVar2 = zEquals ? cue.NewsFeed : cueVar;
        this.d = cueVar2;
        if (cueVar2 == cueVar) {
            throw new djb("show_news_backend", null);
        }
        this.e = bundle.getBoolean("show_news_reusable");
    }

    @Override // defpackage.s0f
    public final yhe d(Context context) {
        Intent intentA = a(context);
        return this.e ? yhe.f(context, mdb.b.nextInt(), intentA, 134217728, false) : yhe.f(context, mdb.b.nextInt(), intentA, 1073741824, false);
    }

    @Override // defpackage.s0f
    public final boolean g(Context context) {
        cue cueVar = cue.None;
        cue cueVar2 = this.d;
        return cueVar2 != cueVar && cueVar2 == fue.c(context);
    }
}
