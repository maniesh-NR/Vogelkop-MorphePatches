package defpackage;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class kd7 extends ldk {
    public final k32 j;
    public final ld7 k;
    public final HashMap l;
    public boolean m;
    public final long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd7(umi umiVar, k32 k32Var, du3 du3Var, kw3 kw3Var) {
        super(umiVar);
        r16 r16Var = ngh.a;
        this.l = new HashMap();
        this.j = k32Var;
        this.n = ((Long) kw3Var.get()).longValue();
        ld7 ld7Var = (ld7) du3Var.get();
        this.k = ld7Var;
        if (ld7Var == null) {
            return;
        }
        ((i7f) ld7Var.c).b(this);
    }

    @Override // defpackage.ldk
    public final Object a() {
        return (List) kfo.Y(((apk) this.j.get()).a, true, false, new r4k((byte) 11));
    }

    @Override // defpackage.ldk
    public final void b(Object obj) {
        List list = (List) obj;
        if (list != null) {
            apk apkVar = (apk) this.j.get();
            kfo.Y(apkVar.a, false, true, new yok(apkVar, list, (byte) 1));
        }
    }

    @Override // defpackage.ldk
    public final void d(Object obj) {
        List<hd7> list = (List) obj;
        HashMap map = this.l;
        map.clear();
        if (list == null) {
            this.m = true;
            return;
        }
        boolean z = false;
        for (hd7 hd7Var : list) {
            if (hd7Var.c >= this.n) {
                map.put(hd7Var.a, hd7Var);
            } else {
                z = true;
            }
        }
        if (z) {
            g(nb6.J(map.values()));
        }
        this.m = true;
    }
}
