package defpackage;

import java.net.URL;

/* loaded from: classes.dex */
public final class tsi {
    public final String a;
    public final boolean b;
    public final tn c;
    public final URL d;

    public tsi(String str, boolean z, tn tnVar, URL url) {
        this.a = str;
        this.b = z;
        this.c = tnVar;
        this.d = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsi)) {
            return false;
        }
        tsi tsiVar = (tsi) obj;
        return this.a.equals(tsiVar.a) && this.b == tsiVar.b && this.c == tsiVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((Boolean.valueOf(this.b).hashCode() + z1m.f(527, 31, this.a)) * 31);
    }
}
