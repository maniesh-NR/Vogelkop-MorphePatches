package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class w31 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b41 b;

    public /* synthetic */ w31(b41 b41Var, byte b) {
        this.a = b;
        this.b = b41Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        b41 b41Var = this.b;
        switch (b) {
            case 0:
                View view = b41Var.d;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                soi soiVar = (soi) obj;
                if (soiVar.b.contains(soiVar)) {
                    p12 p12Var = b41Var.d.K;
                    ((tuj) p12Var.a).e(soiVar, b41Var.M, new x2(soiVar, b41Var, (byte) 10));
                }
                return Unit.a;
        }
    }
}
