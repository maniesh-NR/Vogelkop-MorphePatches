package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class io9 extends k8 implements cuf {
    public final /* synthetic */ lo9 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io9(lo9 lo9Var) {
        super((byte) 9);
        this.o = lo9Var;
    }

    @Override // defpackage.cuf
    public final void x(Object obj) {
        Object obj2;
        ko9 ko9Var;
        ((cd5) ((k8) this).b).j0(new muf(obj));
        lo9 lo9Var = this.o;
        ef2 ef2Var = lo9Var.f;
        do {
            obj2 = ef2Var.a;
            ko9 ko9Var2 = (ko9) obj2;
            int iOrdinal = ko9Var2.ordinal();
            if (iOrdinal == 0) {
                ko9Var = ko9.b;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Unexpected frame state for " + lo9Var + "! State is " + ko9Var2 + ' ');
                }
                ko9Var = ko9.d;
            }
        } while (!ef2Var.a(obj2, ko9Var));
        Iterator it = lo9Var.h.iterator();
        if (it.hasNext()) {
            throw p3p.g(it);
        }
        if (ko9Var == ko9.d) {
            Iterator it2 = lo9Var.h.iterator();
            if (it2.hasNext()) {
                throw p3p.g(it2);
            }
        }
    }
}
