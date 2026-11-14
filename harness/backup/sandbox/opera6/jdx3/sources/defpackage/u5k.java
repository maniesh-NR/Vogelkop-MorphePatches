package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class u5k extends ba2 {
    public final ijc b;

    public u5k(Class cls, ijc ijcVar, e6k e6kVar) {
        super(cls);
        this.b = ijcVar;
        new pde(null);
    }

    public final void A() {
        this.b.h();
    }

    public final void a() {
        A();
    }

    @Override // defpackage.aa2
    public final void d(int i, ArrayList arrayList) {
        A();
    }

    public final void o(boolean z) {
        A();
    }

    public ja2 t() {
        return new qs8((byte) 0);
    }

    public abstract k6k u();

    public boolean w() {
        return z();
    }

    public boolean y(ja2 ja2Var) {
        return this instanceof ncd;
    }

    public boolean z() {
        throw null;
    }
}
