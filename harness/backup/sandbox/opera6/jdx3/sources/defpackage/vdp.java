package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class vdp extends ejo {
    public final pro b;
    public Integer c;
    public ArrayList d;
    public ArrayList e;

    public vdp(pro proVar) {
        this.b = proVar;
    }

    public final void h(int i) {
        long j;
        pro proVar = this.b;
        String str = proVar.e;
        Integer num = this.c;
        int iIntValue = num != null ? num.intValue() : -1;
        w9p w9pVar = (w9p) this.a;
        synchronized (w9pVar) {
            j = w9pVar.c - w9pVar.b;
        }
        int i2 = (int) j;
        String strA = d1p.e().a();
        Boolean boolValueOf = Boolean.valueOf(d1p.e().c);
        String str2 = proVar.a;
        l08 l08Var = this.d;
        if (l08Var == null) {
            l08Var = l08.a;
        }
        l08 l08Var2 = this.e;
        if (l08Var2 == null) {
            l08Var2 = l08.a;
        }
        p8p.a(new bdp(str, iIntValue, i2, strA, boolValueOf, str2, l08Var, l08Var2, i));
    }
}
