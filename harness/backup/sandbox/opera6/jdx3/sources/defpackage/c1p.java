package defpackage;

import com.opera.ads.mediation.admob.OperaMediationAdapter;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class c1p extends p8p {

    @NotNull
    public static final a1p Companion = new a1p();
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1p(int i, int i2, int i3) {
        String str;
        super("initialize");
        urj urjVar = wlp.b;
        this.g = i;
        this.h = i2;
        this.i = i3;
        if (fcp.c != null) {
            kn[] knVarArr = kn.a;
            str = "admob";
        } else {
            str = null;
        }
        this.j = str;
        c30 c30Var = fcp.c;
        this.k = c30Var != null ? c30Var.b : null;
        this.l = fcp.c != null ? OperaMediationAdapter.class.getName() : null;
        this.m = fcp.c != null ? "2.14.0.0" : null;
    }

    public c1p(String str, int i, int i2, String str2, int i3, String str3, int i4, String str4) {
        if (7 != (i & 7)) {
            x7d.I(i, 7, z0p.b);
            throw null;
        }
        this.g = i2;
        this.h = i3;
        this.i = i4;
        if ((i & 8) == 0) {
            if (fcp.c != null) {
                kn[] knVarArr = kn.a;
                str = "admob";
            } else {
                str = null;
            }
        }
        this.j = str;
        if ((i & 16) == 0) {
            c30 c30Var = fcp.c;
            this.k = c30Var != null ? c30Var.b : null;
        } else {
            this.k = str2;
        }
        if ((i & 32) == 0) {
            this.l = fcp.c != null ? OperaMediationAdapter.class.getName() : null;
        } else {
            this.l = str3;
        }
        if ((i & 64) == 0) {
            this.m = fcp.c != null ? "2.14.0.0" : null;
        } else {
            this.m = str4;
        }
    }
}
