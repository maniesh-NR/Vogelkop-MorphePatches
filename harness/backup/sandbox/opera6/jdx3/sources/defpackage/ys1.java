package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class ys1 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ at1 b;

    public /* synthetic */ ys1(at1 at1Var, byte b) {
        this.a = b;
        this.b = at1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        at1 at1Var = this.b;
        switch (b) {
            case 0:
                it1 it1Var = at1Var.j;
                if (!it1Var.c) {
                    it1Var.c = true;
                    it1Var.b.b(new vx(it1Var, (byte) 4)).c(new bi(it1Var, (byte) 18)).a(null, null);
                }
                break;
            case 1:
                at1Var.k(at1Var.b.e(), false, at1Var.q);
                break;
            case 2:
                at1Var.t = vb0.c;
                at1Var.k(at1Var.b.e(), false, at1Var.q);
                break;
            default:
                at1Var.t = vb0.d;
                at1Var.k(at1Var.b.e(), false, at1Var.q);
                break;
        }
        return Unit.a;
    }
}
