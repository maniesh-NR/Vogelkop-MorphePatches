package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class af5 implements hr9 {
    @Override // defpackage.hr9
    public final Object n(String str, Boolean bool, is5 is5Var, Object obj, Object obj2, vt9 vt9Var, Integer num) {
        int i;
        boolean zBooleanValue = bool.booleanValue();
        cr9 cr9Var = (cr9) obj;
        Function0 function0 = (Function0) obj2;
        int iIntValue = num.intValue();
        int i2 = iIntValue & 6;
        z7e z7eVar = z7e.b;
        if (i2 == 0) {
            i = (vt9Var.f(z7eVar) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= vt9Var.f(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= vt9Var.g(zBooleanValue) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((iIntValue & 3072) == 0) {
            i |= vt9Var.f(is5Var) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= vt9Var.h(cr9Var) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= vt9Var.h(function0) ? 131072 : 65536;
        }
        if (vt9Var.N(i & 1, (599187 & i) != 599186)) {
            et5.c(str, zBooleanValue, is5Var, z7eVar, cr9Var, function0, vt9Var, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
