package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal._UtilJvmKt;

/* loaded from: classes.dex */
public final /* synthetic */ class ry1 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ii b;

    public /* synthetic */ ry1(ii iiVar, byte b) {
        this.a = b;
        this.b = iiVar;
    }

    public final Object invoke() {
        byte b = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ii iiVar = this.b;
        switch (b) {
            case 0:
                s9f s9fVarB = ((t9f) iiVar.get()).b();
                long j = dz1.h;
                s9fVarB.a(pn7.f(j), timeUnit);
                s9fVarB.b(pn7.f(j), timeUnit);
                s9fVarB.A = _UtilJvmKt.checkDuration("timeout", pn7.f(j), timeUnit);
                s9fVarB.i = true;
                return new t9f(s9fVarB);
            default:
                s9f s9fVarB2 = ((t9f) iiVar.get()).b();
                long j2 = ehj.i;
                s9fVarB2.a(pn7.f(j2), timeUnit);
                s9fVarB2.b(pn7.f(j2), timeUnit);
                s9fVarB2.i = true;
                return new t9f(s9fVarB2);
        }
    }
}
