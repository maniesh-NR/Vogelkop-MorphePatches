package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class uhl implements kpi {
    public final /* synthetic */ kpi a;
    public final i37 b;
    public final i37 c;

    public uhl(kpi kpiVar, final vhl vhlVar) {
        this.a = kpiVar;
        final byte b = 0;
        this.b = luj.b(new Function0() { // from class: thl
            /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    r3 = this;
                    byte r0 = r2
                    r1 = 0
                    r2 = 1
                    vhl r3 = r1
                    switch(r0) {
                        case 0: goto L15;
                        default: goto L9;
                    }
                L9:
                    p0g r3 = r3.a
                    float r3 = r3.h()
                    r0 = 0
                    int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                    if (r3 <= 0) goto L26
                    goto L25
                L15:
                    p0g r0 = r3.a
                    float r0 = r0.h()
                    p0g r3 = r3.b
                    float r3 = r3.h()
                    int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                    if (r3 >= 0) goto L26
                L25:
                    r1 = r2
                L26:
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.thl.invoke():java.lang.Object");
            }
        });
        final byte b2 = 1;
        this.c = luj.b(new Function0() { // from class: thl
            public final Object invoke() {
                /*
                    this = this;
                    byte r0 = r2
                    r1 = 0
                    r2 = 1
                    vhl r3 = r1
                    switch(r0) {
                        case 0: goto L15;
                        default: goto L9;
                    }
                L9:
                    p0g r3 = r3.a
                    float r3 = r3.h()
                    r0 = 0
                    int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                    if (r3 <= 0) goto L26
                    goto L25
                L15:
                    p0g r0 = r3.a
                    float r0 = r0.h()
                    p0g r3 = r3.b
                    float r3 = r3.h()
                    int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                    if (r3 >= 0) goto L26
                L25:
                    r1 = r2
                L26:
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.thl.invoke():java.lang.Object");
            }
        });
    }

    @Override // defpackage.kpi
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.kpi
    public final Object b(gfe gfeVar, Function2 function2, nt5 nt5Var) {
        return this.a.b(gfeVar, function2, nt5Var);
    }

    @Override // defpackage.kpi
    public final boolean c() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.kpi
    public final boolean d() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.kpi
    public final float e(float f) {
        return this.a.e(f);
    }
}
