package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class tsf implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kl0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ gl0 d;
    public final /* synthetic */ long e;

    public /* synthetic */ tsf(kl0 kl0Var, long j, gl0 gl0Var, long j2, byte b) {
        this.a = b;
        this.b = kl0Var;
        this.c = j;
        this.d = gl0Var;
        this.e = j2;
    }

    public final Object invoke(Object obj) {
        hf0 hf0Var;
        switch (this.a) {
            case 0:
                sd0 sd0Var = (sd0) ((ak0) obj).h.getValue();
                tsf tsfVar = new tsf(this.b, this.c, this.d, this.e, (byte) 1);
                qs7 qs7Var = sd0Var.a;
                il0 il0VarV = qs7.v();
                pd0 pd0Var = sd0Var.b;
                List list = (List) pd0Var.n(0);
                if (list == null || list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    pd0Var.q(0, 1, arrayList);
                    hf0Var = new hf0(pd0Var, 0, arrayList);
                } else {
                    hf0Var = new hf0(pd0Var, 0, list);
                }
                hf0Var.add(il0VarV);
                tsfVar.invoke(new jl0(il0VarV));
                break;
            default:
                jl0 jl0Var = (jl0) obj;
                kl0 kl0Var = this.b;
                if (kl0Var != null) {
                    jl0Var.a.q(0, 1, kl0Var);
                }
                il0 il0Var = jl0Var.a;
                il0Var.p(1, 1, this.c);
                il0Var.q(2, 1, this.d);
                il0Var.p(3, 1, this.e);
                break;
        }
        return Unit.a;
    }
}
