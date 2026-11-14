package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class usf implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ usf(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final Object invoke(Object obj) {
        sr0 sr0Var = (sr0) ((ak0) obj).f.getValue();
        sr0Var.a.r(0, 1, this.a);
        qr0 qr0Var = sr0Var.a;
        qr0Var.r(1, 1, this.b);
        qr0Var.r(2, 1, this.c);
        qr0Var.r(3, 1, this.d);
        return Unit.a;
    }
}
