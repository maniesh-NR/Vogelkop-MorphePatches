package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ae1 extends ozb implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ ce1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae1(ce1 ce1Var, byte b) {
        super(1);
        this.i = b;
        this.j = ce1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae1(ce1 ce1Var, long j) {
        super(1);
        this.i = (byte) 2;
        this.j = ce1Var;
    }

    public final Object invoke(Object obj) {
        iak iakVar;
        byte b = this.i;
        ce1 ce1Var = this.j;
        switch (b) {
            case 0:
                p1d.g((p1d) obj, ce1Var.t, ce1Var.r.b.a((r0.b & 4294967295L) | (r0.a << 32), ce1Var.v, d2c.a));
                return Unit.a;
            case 1:
                p1d.g((p1d) obj, ce1Var.s, ce1Var.r.b.a((r0.b & 4294967295L) | (r0.a << 32), ce1Var.u, d2c.a));
                return Unit.a;
            default:
                u2m u2mVar = (u2m) obj;
                if (!Intrinsics.a(u2mVar.b(), ce1Var.r.b()) && (iakVar = (iak) ce1Var.r.d.g(u2mVar.b())) != null) {
                    long j = ((gcb) iakVar.getValue()).a;
                }
                iak iakVar2 = (iak) ce1Var.r.d.g(u2mVar.a());
                if (iakVar2 != null) {
                    long j2 = ((gcb) iakVar2.getValue()).a;
                }
                if (((ppj) ce1Var.q.getValue()) == null) {
                    return rm5.R(0.0f, 400.0f, null, 5);
                }
                Map map = tan.a;
                return rm5.R(0.0f, 400.0f, new gcb(4294967297L), 1);
        }
    }
}
