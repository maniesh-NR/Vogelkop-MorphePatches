package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class jcd extends kk9 {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public jcd(gql gqlVar, Object obj, Object obj2) {
        super(gqlVar);
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.kk9, defpackage.gql
    public final int b(Object obj) {
        Object obj2;
        if (h == obj && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override // defpackage.kk9, defpackage.gql
    public final dql f(int i, dql dqlVar, boolean z) {
        this.e.f(i, dqlVar, z);
        if (Objects.equals(dqlVar.b, this.g) && z) {
            dqlVar.b = h;
        }
        return dqlVar;
    }

    @Override // defpackage.kk9, defpackage.gql
    public final Object l(int i) {
        Object objL = this.e.l(i);
        return Objects.equals(objL, this.g) ? h : objL;
    }

    @Override // defpackage.kk9, defpackage.gql
    public final fql m(int i, fql fqlVar, long j) {
        this.e.m(i, fqlVar, j);
        if (Objects.equals(fqlVar.a, this.f)) {
            fqlVar.a = fql.p;
        }
        return fqlVar;
    }
}
