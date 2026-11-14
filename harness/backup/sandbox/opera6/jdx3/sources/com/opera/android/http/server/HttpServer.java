package com.opera.android.http.server;

import J.N;
import androidx.annotation.NonNull;
import com.opera.api.Callback;
import defpackage.su;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class HttpServer {
    public final HashMap a = new HashMap();
    public long b = N.Mrh$3rRC(this);
    public int c;
    public su d;

    public final void a(String str) {
        N.MermPfhq(this.b, str);
        this.a.remove(str);
    }

    public final void onBind(int i) {
        boolean z;
        su suVar = this.d;
        this.d = null;
        if (i > 0) {
            this.c = i;
            z = true;
        } else {
            z = false;
        }
        if (suVar != null) {
            suVar.run(Boolean.valueOf(z));
        }
    }

    public final void onLoaded(@NonNull String str, boolean z) {
        Callback callback = (Callback) this.a.remove(str);
        if (callback != null) {
            callback.run(Boolean.valueOf(z));
        }
    }
}
