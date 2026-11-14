package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class mfn implements f7f {
    public final x5f a;
    public final jfn b;
    public nfn c;
    public boolean d;
    public int e;
    public int f;

    public mfn(x5f x5fVar, jfn jfnVar) {
        this.a = x5fVar;
        this.b = jfnVar;
    }

    public final void a() {
        nfn nfnVar;
        String string;
        if0 if0Var;
        if (this.d && (nfnVar = this.c) != null) {
            axc axcVar = nfnVar.d;
            if (axcVar == null || (string = axcVar.toString()) == null) {
                string = "giveaway_v1";
            }
            int i = this.e;
            int i2 = this.f;
            x5f x5fVar = this.a;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                wt0 wt0Var = new wt0(2443, -1, 3);
                wt0Var.p(2, 1, 1L);
                wt0Var.p(0, 1, i);
                wt0Var.p(1, 1, i2);
                fi0 fi0VarE = x56VarF.E(zpaVar);
                Map map = (Map) fi0VarE.n(34);
                if (map == null || map.isEmpty()) {
                    HashMap map2 = new HashMap();
                    fi0VarE.q(34, 1, map2);
                    if0Var = new if0(fi0VarE, 34, map2);
                } else {
                    if0Var = new if0(fi0VarE, 34, map);
                }
                if0Var.put(string, wt0Var);
                x5fVar.U0(x56VarF);
            }
            this.b.run(axcVar);
        }
        this.d = false;
        this.e = 0;
        this.f = 0;
    }

    public final void d0(Object obj) {
        nfn nfnVar = (nfn) obj;
        if (nfnVar == null || !nfnVar.equals(this.c)) {
            a();
            this.c = nfnVar;
        }
    }
}
