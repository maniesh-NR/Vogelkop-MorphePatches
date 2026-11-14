package ads_mobile_sdk;

import defpackage.hlo;
import defpackage.tso;

/* loaded from: classes.dex */
public final class h93 implements tso {
    public static final Object c = new Object();
    public volatile hlo a;
    public volatile Object b;

    public static tso a(hlo hloVar) {
        if ((hloVar instanceof h93) || (hloVar instanceof nj0)) {
            return hloVar;
        }
        h93 h93Var = new h93();
        h93Var.b = c;
        h93Var.a = hloVar;
        return h93Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        hlo hloVar = this.a;
        if (hloVar == null) {
            return this.b;
        }
        Object obj2 = hloVar.get();
        this.b = obj2;
        this.a = null;
        return obj2;
    }
}
