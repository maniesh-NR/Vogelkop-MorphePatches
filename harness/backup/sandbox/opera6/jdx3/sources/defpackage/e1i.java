package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class e1i implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d1i b;

    public /* synthetic */ e1i(d1i d1iVar, byte b) {
        this.a = b;
        this.b = d1iVar;
    }

    public final Object invoke() {
        byte b = this.a;
        d1i d1iVar = this.b;
        switch (b) {
            case 0:
                vtp.A(d1iVar.a);
                return Unit.a;
            case 1:
                vtp.X(d1iVar.a);
                return Unit.a;
            case 2:
                vtp.T(d1iVar.a);
                return Unit.a;
            default:
                return d1iVar.b.c();
        }
    }
}
