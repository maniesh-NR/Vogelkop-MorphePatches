package defpackage;

import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class p5p {

    @NotNull
    public static final d4p Companion = new d4p();
    public final String a;
    public final String b;
    public final huo c;
    public final jzo d;
    public final wwo e;
    public final mwo f;

    public p5p(int i, String str, String str2, huo huoVar, jzo jzoVar, wwo wwoVar, mwo mwoVar) {
        if (60 != (i & 60)) {
            x7d.I(i, 60, u3p.b);
            throw null;
        }
        this.a = (i & 1) == 0 ? "2.14.0" : str;
        if ((i & 2) == 0) {
            this.b = fcp.f();
        } else {
            this.b = str2;
        }
        this.c = huoVar;
        this.d = jzoVar;
        this.e = wwoVar;
        this.f = mwoVar;
    }

    public p5p(huo huoVar, jzo jzoVar, wwo wwoVar, mwo mwoVar) {
        String strF = fcp.f();
        this.a = "2.14.0";
        this.b = strF;
        this.c = huoVar;
        this.d = jzoVar;
        this.e = wwoVar;
        this.f = mwoVar;
    }
}
