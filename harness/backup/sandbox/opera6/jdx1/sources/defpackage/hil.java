package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class hil implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n27 b;
    public final /* synthetic */ afe c;

    public /* synthetic */ hil(n27 n27Var, afe afeVar, byte b) {
        this.a = b;
        this.b = n27Var;
        this.c = afeVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        afe afeVar = this.c;
        n27 n27Var = this.b;
        switch (b) {
            case 0:
                psp pspVar = psp.h;
                p01 p01Var = new p01((Function0) obj, (byte) 15);
                hil hilVar = new hil(n27Var, afeVar, (byte) 1);
                p0j p0jVar = n5d.a;
                return new k5d(p01Var, hilVar, pspVar);
            default:
                kh7 kh7Var = (kh7) obj;
                afeVar.setValue(new gcb((n27Var.M(kh7.b(kh7Var.a)) << 32) | (n27Var.M(kh7.a(kh7Var.a)) & 4294967295L)));
                return Unit.a;
        }
    }
}
