package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class zzj {
    public final vnj a;
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashSet c = new LinkedHashSet();
    public final wq8 d = new wq8(this, 2);
    public final yzj e = new yzj(this, 0);

    static {
        int i = vnj.j;
    }

    public zzj(vnj vnjVar) {
        this.a = vnjVar;
    }

    public static knj a(hq8 hq8Var) {
        return new knj(z7h.l(hq8Var.i(p6l.a)), new lnj(mnj.c, hq8Var.e()));
    }

    public final void b(tq8 tq8Var) {
        LinkedHashSet linkedHashSet = this.b;
        if (linkedHashSet.contains(tq8Var)) {
            return;
        }
        tq8Var.F(this.d);
        linkedHashSet.add(tq8Var);
        ArrayList arrayList = tq8Var.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hq8 hq8Var = (hq8) obj;
            if (!hq8Var.j() && this.c.add(hq8Var)) {
                hq8Var.b(this.e);
            }
        }
    }
}
