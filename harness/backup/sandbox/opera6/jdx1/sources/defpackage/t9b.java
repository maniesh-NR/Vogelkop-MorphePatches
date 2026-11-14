package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class t9b implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u9b b;

    public /* synthetic */ t9b(u9b u9bVar, byte b) {
        this.a = b;
        this.b = u9bVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        u9b u9bVar = this.b;
        u5m u5mVar = (u5m) obj;
        switch (b) {
            case 0:
                u9b u9bVar2 = (u9b) u5mVar;
                g2o g2oVar = u9bVar.p;
                if (!Intrinsics.a(u9bVar2.o, g2oVar)) {
                    u9bVar2.o = g2oVar;
                    u9bVar2.U0();
                }
                return t5m.b;
            default:
                u9bVar.o = ((u9b) u5mVar).p;
                return Boolean.FALSE;
        }
    }
}
