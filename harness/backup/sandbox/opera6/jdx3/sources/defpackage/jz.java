package defpackage;

import android.net.Uri;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class jz {
    public final b59 a;
    public final t9f b;
    public final sy c;
    public final HashMap d = new HashMap();

    public jz(b59 b59Var, t9f t9fVar, sy syVar) {
        this.a = b59Var;
        this.b = t9fVar;
        this.c = syVar;
    }

    public static void a(t9f t9fVar, Uri uri, String str, String str2, String str3, String str4, String str5, String str6, ez ezVar) {
        new hy(t9fVar, uri.buildUpon().appendQueryParameter("originalPid", str).appendQueryParameter("pid", str2).appendQueryParameter("accessID", str3).appendQueryParameter("actionUnit", str4).appendQueryParameter("deliveryID", str5).appendQueryParameter("opid", str6).build().toString(), ezVar, (byte) 1).g();
    }
}
