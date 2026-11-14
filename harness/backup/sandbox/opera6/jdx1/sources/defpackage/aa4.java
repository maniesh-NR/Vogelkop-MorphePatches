package defpackage;

import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class aa4 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fa4 b;

    public /* synthetic */ aa4(fa4 fa4Var, byte b) {
        this.a = b;
        this.b = fa4Var;
    }

    public final Object invoke(Object obj) {
        boolean z;
        byte b = this.a;
        fa4 fa4Var = this.b;
        switch (b) {
            case 0:
                synchronized (fa4Var.p) {
                    fa4Var.r = rc4.x;
                    fa4Var.toString();
                }
                t94 t94Var = fa4Var.n;
                Objects.toString(fa4Var);
                synchronized (t94Var.g) {
                    t94Var.h.remove(fa4Var);
                }
                cd5 cd5Var = fa4Var.w;
                Unit unit = Unit.a;
                cd5Var.j0(unit);
                sgb.k(fa4Var.a, null);
                return unit;
            default:
                synchronized (fa4Var.p) {
                    z = fa4Var.q;
                }
                return Boolean.valueOf(z);
        }
    }
}
