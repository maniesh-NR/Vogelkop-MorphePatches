package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class p3 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ p3(y3 y3Var, byte b) {
        this.a = b;
        this.b = y3Var;
    }

    public final Object invoke() throws pxb {
        byte b = this.a;
        y3 y3Var = this.b;
        switch (b) {
            case 0:
                g6b g6bVar = (g6b) z4o.N(y3Var, c6b.a);
                if (g6bVar == null) {
                    d8b.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + g6bVar);
                }
                g6b g6bVar2 = y3Var.y;
                y3Var.y = g6bVar;
                if (g6bVar2 != null && !Intrinsics.a(g6bVar, g6bVar2)) {
                    f17 f17Var = y3Var.B;
                    if (f17Var != null) {
                        y3Var.U0(f17Var);
                    } else if (!y3Var.I) {
                    }
                    y3Var.B = null;
                    y3Var.e1();
                }
                return Unit.a;
            default:
                y3Var.i1();
                return Boolean.TRUE;
        }
    }
}
