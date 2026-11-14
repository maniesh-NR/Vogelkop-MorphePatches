package defpackage;

import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class fnp extends p8p {

    @NotNull
    public static final cnp Companion = new cnp();
    public final String g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Long k;
    public final Boolean l;
    public final String m;
    public final long n;
    public final String o;

    public fnp(int i, String str, Long l, Long l2, Long l3, Long l4, Boolean bool, String str2, long j, String str3) {
        if (511 != (i & 511)) {
            x7d.I(i, 511, bnp.b);
            throw null;
        }
        this.g = str;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = l4;
        this.l = bool;
        this.m = str2;
        this.n = j;
        this.o = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnp(String str, Long l, Long l2, Long l3, Long l4, Boolean bool, String str2, long j, String str3) {
        super("ir");
        urj urjVar = wlp.b;
        this.g = str;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = l4;
        this.l = bool;
        this.m = str2;
        this.n = j;
        this.o = str3;
    }
}
