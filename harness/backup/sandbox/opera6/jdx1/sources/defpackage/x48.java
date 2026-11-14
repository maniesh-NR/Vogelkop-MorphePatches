package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class x48 {
    public static final x48 b = new x48(new a3m((co8) null, (ypj) null, (mr4) null, (mli) null, (LinkedHashMap) null, 127));
    public final a3m a;

    public x48(a3m a3mVar) {
        this.a = a3mVar;
    }

    public final x48 a(x48 x48Var) {
        a3m a3mVar = x48Var.a;
        co8 co8Var = a3mVar.a;
        a3m a3mVar2 = this.a;
        if (co8Var == null) {
            co8Var = a3mVar2.a;
        }
        ypj ypjVar = a3mVar.b;
        if (ypjVar == null) {
            ypjVar = a3mVar2.b;
        }
        mr4 mr4Var = a3mVar.c;
        if (mr4Var == null) {
            mr4Var = a3mVar2.c;
        }
        mli mliVar = a3mVar.d;
        if (mliVar == null) {
            mliVar = a3mVar2.d;
        }
        return new x48(new a3m(co8Var, ypjVar, mr4Var, mliVar, rbd.e(a3mVar2.f, a3mVar.f), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x48) && ((x48) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "EnterTransition.None";
        }
        a3m a3mVar = this.a;
        co8 co8Var = a3mVar.a;
        String string = co8Var != null ? co8Var.toString() : null;
        ypj ypjVar = a3mVar.b;
        String string2 = ypjVar != null ? ypjVar.toString() : null;
        mr4 mr4Var = a3mVar.c;
        String string3 = mr4Var != null ? mr4Var.toString() : null;
        mli mliVar = a3mVar.d;
        return sko.n(z1m.n("EnterTransition: Fade - ", string, ", Slide - ", string2, ", Shrink - "), string3, ", Scale - ", mliVar != null ? mliVar.toString() : null, ", Veil - null");
    }
}
