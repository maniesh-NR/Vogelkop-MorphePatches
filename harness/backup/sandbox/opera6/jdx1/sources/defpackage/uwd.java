package defpackage;

/* loaded from: classes.dex */
public final class uwd implements bni {
    public final hv9 a;
    public final hmm b;
    public final fl8 c;

    public uwd(hmm hmmVar, fl8 fl8Var, hv9 hv9Var) {
        this.b = hmmVar;
        fl8Var.getClass();
        this.c = fl8Var;
        this.a = hv9Var;
    }

    @Override // defpackage.bni
    public final void a(Object obj, r05 r05Var, zk8 zk8Var) {
        this.b.getClass();
        hmm.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.bni
    public final void b(Object obj, eme emeVar) {
        this.c.getClass();
        sko.s(obj);
        throw null;
    }

    @Override // defpackage.bni
    public final boolean c(hv9 hv9Var, hv9 hv9Var2) {
        this.b.getClass();
        return hv9Var.unknownFields.equals(hv9Var2.unknownFields);
    }

    @Override // defpackage.bni
    public final int d(hv9 hv9Var) {
        this.b.getClass();
        return hv9Var.unknownFields.hashCode();
    }

    @Override // defpackage.bni
    public final int e(hv9 hv9Var) {
        this.b.getClass();
        emm emmVar = hv9Var.unknownFields;
        int i = emmVar.d;
        if (i != -1) {
            return i;
        }
        int iH = 0;
        for (int i2 = 0; i2 < emmVar.a; i2++) {
            int i3 = emmVar.b[i2] >>> 3;
            d54 d54Var = (d54) emmVar.c[i2];
            int iH2 = x75.h(i3) + x75.g(2) + (x75.g(1) << 1);
            int iG = x75.g(3);
            int size = d54Var.size();
            iH += x75.h(size) + size + iG + iH2;
        }
        emmVar.d = iH;
        return iH;
    }

    @Override // defpackage.bni
    public final boolean isInitialized(Object obj) {
        this.c.getClass();
        sko.s(obj);
        throw null;
    }

    @Override // defpackage.bni
    public final void makeImmutable(Object obj) {
        this.b.getClass();
        emm emmVar = ((hv9) obj).unknownFields;
        if (emmVar.e) {
            emmVar.e = false;
        }
        this.c.getClass();
        sko.s(obj);
        throw null;
    }

    @Override // defpackage.bni
    public final void mergeFrom(Object obj, Object obj2) {
        gni.k(this.b, obj, obj2);
    }

    @Override // defpackage.bni
    public final hv9 newInstance() {
        hv9 hv9Var = this.a;
        return hv9Var != null ? hv9Var.i() : ((bv9) hv9Var.c(5)).c();
    }
}
