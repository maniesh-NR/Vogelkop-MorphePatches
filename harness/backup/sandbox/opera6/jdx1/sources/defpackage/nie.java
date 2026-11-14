package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class nie extends l43 {
    public final List j;
    public List k;
    public boolean l;
    public she m;
    public zk n;
    public ukh o;
    public boolean p;
    public final l08 q;

    public nie(String str, List list) {
        super(str);
        this.j = list;
        l08 l08Var = l08.a;
        this.k = l08Var;
        this.m = she.a;
        this.n = zk.TOP_RIGHT;
        this.q = l08Var;
    }

    @Override // defpackage.s83
    public final s83 b() {
        return this;
    }

    public final oie e() {
        String str = this.a;
        if (str == null) {
            qp2.o("Ad unit ID cannot be null.");
            return null;
        }
        return new oie(str, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, CollectionsKt.k0(this.j), this.k, this.l, this.m, this.n, this.o, null, false, this.p, null, this.q, false, false);
    }
}
