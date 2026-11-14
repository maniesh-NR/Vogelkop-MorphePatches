package defpackage;

import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class r5p extends p8p {

    @NotNull
    public static final b4p Companion = new b4p();
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Boolean k;
    public final int l;
    public final String m;
    public final String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5p(int i, Boolean bool, String str, String str2, String str3, String str4, String str5) {
        super("error");
        urj urjVar = wlp.b;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = bool;
        this.l = i;
        this.m = str5;
        this.n = str5 != null ? pik.D(1024, str5) : null;
    }

    public r5p(int i, String str, String str2, String str3, String str4, Boolean bool, int i2, String str5) {
        if (39 != (i & 39)) {
            x7d.I(i, 39, v3p.b);
            throw null;
        }
        this.g = str;
        this.h = str2;
        this.i = str3;
        if ((i & 8) == 0) {
            this.j = null;
        } else {
            this.j = str4;
        }
        if ((i & 16) == 0) {
            this.k = null;
        } else {
            this.k = bool;
        }
        this.l = i2;
        this.m = null;
        if ((i & 64) == 0) {
            this.n = null;
        } else {
            this.n = str5;
        }
    }
}
