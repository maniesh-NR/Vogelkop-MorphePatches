package defpackage;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class x2p extends p8p {

    @NotNull
    public static final e2p Companion = new e2p();
    public static final KSerializer[] r = {null, null, null, fuo.Companion.serializer(), null, null, null, null, null, null, null};
    public final String g;
    public final String h;
    public final String i;
    public final fuo j;
    public final String k;
    public final Boolean l;
    public final long m;
    public final int n;
    public final long o;
    public final long p;
    public final long q;

    public x2p(int i, String str, String str2, String str3, fuo fuoVar, String str4, Boolean bool, long j, int i2, long j2, long j3, long j4) {
        if (1999 != (i & 1999)) {
            x7d.I(i, 1999, b2p.b);
            throw null;
        }
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = fuoVar;
        if ((i & 16) == 0) {
            this.k = null;
        } else {
            this.k = str4;
        }
        if ((i & 32) == 0) {
            this.l = null;
        } else {
            this.l = bool;
        }
        this.m = j;
        this.n = i2;
        this.o = j2;
        this.p = j3;
        this.q = j4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2p(String str, String str2, String str3, fuo fuoVar, String str4, Boolean bool, long j, int i, long j2, long j3, long j4) {
        super("close");
        urj urjVar = wlp.b;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = fuoVar;
        this.k = str4;
        this.l = bool;
        this.m = j;
        this.n = i;
        this.o = j2;
        this.p = j3;
        this.q = j4;
    }
}
