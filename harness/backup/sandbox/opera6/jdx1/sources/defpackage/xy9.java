package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class xy9 implements hub {
    public final w4c b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    public volatile byte[] g;
    public int h;

    public xy9(String str) {
        w4c w4cVar = f9a.a;
        this.c = null;
        if (TextUtils.isEmpty(str)) {
            qp2.o("Must not be null or empty");
            throw null;
        }
        this.d = str;
        qyn.l(w4cVar, "Argument must not be null");
        this.b = w4cVar;
    }

    public xy9(URL url) {
        w4c w4cVar = f9a.a;
        qyn.l(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        qyn.l(w4cVar, "Argument must not be null");
        this.b = w4cVar;
    }

    @Override // defpackage.hub
    public final void b(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(hub.a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        qyn.l(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        URL url = this.f;
        if (url == null) {
            if (TextUtils.isEmpty(this.e)) {
                String string = this.d;
                if (TextUtils.isEmpty(string)) {
                    URL url2 = this.c;
                    qyn.l(url2, "Argument must not be null");
                    string = url2.toString();
                }
                this.e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            url = new URL(this.e);
            this.f = url;
        }
        return url;
    }

    @Override // defpackage.hub
    public final boolean equals(Object obj) {
        if (!(obj instanceof xy9)) {
            return false;
        }
        xy9 xy9Var = (xy9) obj;
        return c().equals(xy9Var.c()) && this.b.equals(xy9Var.b);
    }

    @Override // defpackage.hub
    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int iHashCode = c().hashCode();
        this.h = iHashCode;
        int iHashCode2 = this.b.b.hashCode() + (iHashCode * 31);
        this.h = iHashCode2;
        return iHashCode2;
    }

    public final String toString() {
        return c();
    }
}
