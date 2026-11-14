package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class tye implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wye b;

    public /* synthetic */ tye(wye wyeVar, byte b) {
        this.a = b;
        this.b = wyeVar;
    }

    public final Object invoke() {
        byte b = this.a;
        wye wyeVar = this.b;
        switch (b) {
            case 0:
                wyeVar.T0(wyeVar.P, wyeVar.O);
                break;
            default:
                wye wyeVar2 = wyeVar.w;
                if (wyeVar2 != null) {
                    wyeVar2.h1();
                }
                break;
        }
        return Unit.a;
    }
}
