package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class cdf extends b8e implements xfd {
    public Function1 o;
    public long p;

    @Override // defpackage.b8e
    public final boolean I0() {
        return true;
    }

    @Override // defpackage.xfd
    public final void a(long j) {
        if (gcb.a(this.p, j)) {
            return;
        }
        this.o.invoke(new gcb(j));
        this.p = j;
    }
}
