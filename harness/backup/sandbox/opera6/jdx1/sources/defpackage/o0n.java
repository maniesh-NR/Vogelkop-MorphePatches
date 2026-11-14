package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class o0n implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p0n b;

    public /* synthetic */ o0n(p0n p0nVar, byte b) {
        this.a = b;
        this.b = p0nVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        p0n p0nVar = this.b;
        switch (b) {
            case 0:
                p0nVar.d = true;
                p0nVar.f.invoke();
                return Unit.a;
            default:
                mk7 mk7Var = (mk7) obj;
                y4a y4aVar = p0nVar.b;
                float f = p0nVar.k;
                float f2 = p0nVar.l;
                d5o d5oVarS0 = mk7Var.s0();
                long jD = d5oVarS0.D();
                d5oVarS0.A().j();
                try {
                    ((wth) d5oVarS0.a).N(f, f2, 0L);
                    y4aVar.a(mk7Var);
                    am2.w(d5oVarS0, jD);
                    return Unit.a;
                } catch (Throwable th) {
                    am2.w(d5oVarS0, jD);
                    throw th;
                }
        }
    }
}
