package defpackage;

import java.net.URL;

/* loaded from: classes.dex */
public final class yla {
    public final URL a;
    public final URL b;
    public final int c;
    public final boolean d;
    public final l0c e;

    public yla(URL url, URL url2, int i, l0c l0cVar, boolean z) {
        this.a = url;
        this.b = url2;
        this.c = i;
        this.e = l0cVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yla)) {
            return false;
        }
        yla ylaVar = (yla) obj;
        return this.a.equals(ylaVar.a) && this.b.equals(ylaVar.b) && o18.e(this.c) == o18.e(ylaVar.c);
    }

    public final int hashCode() {
        return o18.e(this.c) + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }
}
