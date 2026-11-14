package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class lw5 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gbc b;

    public /* synthetic */ lw5(gbc gbcVar, byte b) {
        this.a = b;
        this.b = gbcVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        gbc gbcVar = this.b;
        switch (b) {
            case 0:
                b2c b2cVar = (b2c) obj;
                ojl ojlVarD = gbcVar.d();
                if (ojlVarD != null) {
                    ojlVarD.c = b2cVar;
                }
                return Unit.a;
            case 1:
                t0g t0gVar = gbcVar.t;
                mil milVar = (mil) obj;
                String str = milVar.a.b;
                sf1 sf1Var = gbcVar.j;
                if (!Intrinsics.a(str, sf1Var != null ? sf1Var.b : null)) {
                    gbcVar.k.setValue(b7a.a);
                    if (((Boolean) t0gVar.getValue()).booleanValue()) {
                        t0gVar.setValue(Boolean.FALSE);
                    } else {
                        gbcVar.s.setValue(Boolean.FALSE);
                    }
                }
                long j = xjl.b;
                gbcVar.f(j);
                gbcVar.e(j);
                gbcVar.u.invoke(milVar);
                znh znhVar = gbcVar.b;
                fi5 fi5Var = znhVar.a;
                if (fi5Var != null) {
                    fi5Var.s(znhVar, null);
                }
                return Unit.a;
            case 2:
                gbcVar.r.a(((h0b) obj).a);
                return Unit.a;
            case 3:
                return Boolean.valueOf(gbcVar.r.a(((h0b) obj).a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                gbcVar.q.setValue(bool);
                return Unit.a;
        }
    }
}
