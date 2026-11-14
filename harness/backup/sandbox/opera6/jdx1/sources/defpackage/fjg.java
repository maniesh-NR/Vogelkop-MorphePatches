package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* loaded from: classes.dex */
public final class fjg {
    public static final fjg c;
    public final String a;
    public final ejg b;

    static {
        new fjg("");
        c = new fjg("preload");
    }

    public fjg(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new ejg() : null;
    }

    public final synchronized LogSessionId a() {
        ejg ejgVar;
        ejgVar = this.b;
        ejgVar.getClass();
        return ejgVar.a;
    }
}
