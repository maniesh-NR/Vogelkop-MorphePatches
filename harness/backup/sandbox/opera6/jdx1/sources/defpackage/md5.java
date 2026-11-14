package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class md5 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xd5 b;

    public /* synthetic */ md5(xd5 xd5Var, byte b) {
        this.a = b;
        this.b = xd5Var;
    }

    public final Object invoke() {
        byte b = this.a;
        xd5 xd5Var = this.b;
        switch (b) {
            case 0:
                xd5Var.reportFullyDrawn();
                return Unit.a;
            case 1:
                return xd5.p(xd5Var);
            case 2:
                o97 o97Var = new o97();
                xd5Var.getNavigationEventDispatcher().b(o97Var);
                return o97Var;
            case 3:
                return new ski(xd5Var.getApplication(), xd5Var, xd5Var.getIntent() != null ? xd5Var.getIntent().getExtras() : null);
            default:
                kcf kcfVar = new kcf(new ld5(xd5Var, (byte) 1), null);
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
                        xd5Var.getLifecycle().a(new nd5(kcfVar, xd5Var, (byte) 0));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new fh4((Object) xd5Var, (Object) kcfVar, (byte) 9));
                    }
                }
                return kcfVar;
        }
    }
}
