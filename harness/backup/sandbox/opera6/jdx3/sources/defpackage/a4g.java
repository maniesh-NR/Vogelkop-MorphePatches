package defpackage;

import J.N;
import java.util.List;

/* loaded from: classes.dex */
public final class a4g {
    public final List a;
    public long b;

    public a4g(long j, List list) {
        this.b = j;
        this.a = list;
    }

    public final void a() {
        long j = this.b;
        if (j == 0) {
            return;
        }
        N.MkPeAFAg(j);
        this.b = 0L;
    }

    public final w3g b(int i) {
        return (w3g) this.a.stream().filter(new z3g((byte) 0, i)).findFirst().orElse(null);
    }

    public final String c(w3g w3gVar) {
        return (String) N.M8Y4ibSv(this.b, w3g.a(this.a, w3gVar));
    }
}
