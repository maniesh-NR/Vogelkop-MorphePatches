package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class voi implements kpi {
    public static final c67 k = new c67(new ali((byte) 5), new bli((byte) 5));
    public final q0g a;
    public float g;
    public final i37 i;
    public final i37 j;
    public final q0g b = new q0g(0);
    public final q0g c = new q0g(0);
    public final t0g d = hyg.k(Boolean.FALSE);
    public final lde e = new lde();
    public final q0g f = new q0g(Integer.MAX_VALUE);
    public final fv6 h = new fv6(new tji(this, (byte) 2));

    public voi(int i) {
        this.a = new q0g(i);
        final byte b = 0;
        this.i = luj.b(new Function0(this) { // from class: uoi
            public final /* synthetic */ voi b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
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
                    voi r3 = r3.b
                    switch(r0) {
                        case 0: goto L12;
                        default: goto L9;
                    }
                L9:
                    q0g r3 = r3.a
                    int r3 = r3.h()
                    if (r3 <= 0) goto L21
                    goto L20
                L12:
                    q0g r0 = r3.a
                    int r0 = r0.h()
                    q0g r3 = r3.f
                    int r3 = r3.h()
                    if (r0 >= r3) goto L21
                L20:
                    r1 = r2
                L21:
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.uoi.invoke():java.lang.Object");
            }
        });
        final byte b2 = 1;
        this.j = luj.b(new Function0(this) { // from class: uoi
            public final /* synthetic */ voi b;

            {
                this.b = this;
            }

            public final Object invoke() {
                /*
                    this = this;
                    byte r0 = r2
                    r1 = 0
                    r2 = 1
                    voi r3 = r3.b
                    switch(r0) {
                        case 0: goto L12;
                        default: goto L9;
                    }
                L9:
                    q0g r3 = r3.a
                    int r3 = r3.h()
                    if (r3 <= 0) goto L21
                    goto L20
                L12:
                    q0g r0 = r3.a
                    int r0 = r0.h()
                    q0g r3 = r3.f
                    int r3 = r3.h()
                    if (r0 >= r3) goto L21
                L20:
                    r1 = r2
                L21:
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.uoi.invoke():java.lang.Object");
            }
        });
    }

    @Override // defpackage.kpi
    public final boolean a() {
        return this.h.a();
    }

    @Override // defpackage.kpi
    public final Object b(gfe gfeVar, Function2 function2, nt5 nt5Var) {
        Object objB = this.h.b(gfeVar, function2, nt5Var);
        return objB == px5.a ? objB : Unit.a;
    }

    @Override // defpackage.kpi
    public final boolean c() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    @Override // defpackage.kpi
    public final boolean d() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // defpackage.kpi
    public final float e(float f) {
        return this.h.e(f);
    }
}
