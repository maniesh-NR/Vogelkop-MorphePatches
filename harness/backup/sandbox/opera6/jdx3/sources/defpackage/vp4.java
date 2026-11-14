package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public final class vp4 implements o5m {
    public final eq6 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final t55 e;
    public final t55 f;

    public vp4(Context context, t55 t55Var, t55 t55Var2) {
        mqb mqbVar = new mqb();
        qii.a.configure(mqbVar);
        mqbVar.d = true;
        this.a = new eq6(mqbVar);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(z54.c);
        this.e = t55Var2;
        this.f = t55Var;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(sko.j("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jn2 a(defpackage.jn2 r8) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp4.a(jn2):jn2");
    }
}
