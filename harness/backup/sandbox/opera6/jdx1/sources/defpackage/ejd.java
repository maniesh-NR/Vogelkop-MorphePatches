package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ejd {
    public String a;
    public Uri b;
    public String c;
    public fjd d = new fjd();
    public ijd e = new ijd();
    public List f = Collections.EMPTY_LIST;
    public String g;
    public h1b h;
    public djd i;
    public long j;
    public vjd k;
    public kjd l;
    public njd m;

    public ejd() {
        a1b a1bVar = h1b.b;
        this.h = csh.e;
        this.l = new kjd();
        this.m = njd.d;
        this.j = -9223372036854775807L;
    }

    public final qjd a() {
        mjd mjdVar;
        ijd ijdVar = this.e;
        z4o.H(((Uri) ijdVar.e) == null || ((UUID) ijdVar.d) != null);
        Uri uri = this.b;
        if (uri != null) {
            String str = this.c;
            ijd ijdVar2 = this.e;
            mjdVar = new mjd(uri, str, ((UUID) ijdVar2.d) != null ? new jjd(ijdVar2) : null, this.i, this.f, this.g, this.h, this.j);
        } else {
            mjdVar = null;
        }
        String str2 = this.a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        fjd fjdVar = this.d;
        fjdVar.getClass();
        hjd hjdVar = new hjd(fjdVar);
        kjd kjdVar = this.l;
        kjdVar.getClass();
        ljd ljdVar = new ljd(kjdVar);
        vjd vjdVar = this.k;
        if (vjdVar == null) {
            vjdVar = vjd.K;
        }
        return new qjd(str3, hjdVar, mjdVar, ljdVar, vjdVar, this.m);
    }
}
