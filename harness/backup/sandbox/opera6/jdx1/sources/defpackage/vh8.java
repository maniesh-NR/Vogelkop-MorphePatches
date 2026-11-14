package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class vh8 {
    public static final vh8 b = new vh8(new a3m((co8) null, (ypj) null, (mr4) null, (mli) null, (LinkedHashMap) null, 127));
    public static final vh8 c = new vh8(new a3m((co8) null, (ypj) null, (mr4) null, (mli) null, (LinkedHashMap) null, 95));
    public final a3m a;

    public vh8(a3m a3mVar) {
        this.a = a3mVar;
    }

    public final vh8 a(vh8 vh8Var) {
        a3m a3mVar = vh8Var.a;
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
        return new vh8(new a3m(co8Var, ypjVar, mr4Var, mliVar, a3mVar.e || a3mVar2.e, rbd.e(a3mVar2.f, a3mVar.f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vh8) && ((vh8) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        a3m a3mVar = this.a;
        co8 co8Var = a3mVar.a;
        String string = co8Var != null ? co8Var.toString() : null;
        ypj ypjVar = a3mVar.b;
        String string2 = ypjVar != null ? ypjVar.toString() : null;
        mr4 mr4Var = a3mVar.c;
        String string3 = mr4Var != null ? mr4Var.toString() : null;
        mli mliVar = a3mVar.d;
        String string4 = mliVar != null ? mliVar.toString() : null;
        boolean z = a3mVar.e;
        StringBuilder sbN = z1m.n("ExitTransition:  Fade - ", string, ",  Slide - ", string2, ",  Shrink - ");
        z1m.t(sbN, string3, ",  Scale - ", string4, ",  Veil - null,  KeepUntilTransitionsFinished - ");
        sbN.append(z);
        return sbN.toString();
    }
}
