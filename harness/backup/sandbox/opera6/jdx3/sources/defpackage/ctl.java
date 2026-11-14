package defpackage;

import com.opera.android.settings.SettingsManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ctl {
    public final SettingsManager a;
    public final ikc b;
    public final z7f c;
    public final po7 d;
    public final pde e;
    public boolean f;
    public final atl g;

    public ctl(hjf hjfVar, SettingsManager settingsManager, ikc ikcVar, z7f z7fVar) {
        this.a = settingsManager;
        this.b = ikcVar;
        this.c = z7fVar;
        po7 po7Var = new po7(z7fVar);
        this.d = po7Var;
        this.e = new pde(a());
        atl atlVar = new atl(hjfVar);
        this.g = atlVar;
        aib.A(settingsManager, atlVar.getLifecycle(), new ezg(this, (byte) 8), new p7l(this, (byte) 16));
        final byte b = 0;
        ikcVar.j(atlVar, new t7d(new Function1(this) { // from class: zsl
            public final /* synthetic */ ctl b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b2 = b;
                ctl ctlVar = this.b;
                switch (b2) {
                    case 0:
                        ctlVar.c();
                        break;
                    default:
                        ctlVar.c();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 25));
        final byte b2 = 1;
        po7Var.j(atlVar, new t7d(new Function1(this) { // from class: zsl
            public final /* synthetic */ ctl b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b22 = b2;
                ctl ctlVar = this.b;
                switch (b22) {
                    case 0:
                        ctlVar.c();
                        break;
                    default:
                        ctlVar.c();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 25));
        atlVar.b.g(qcc.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r8 == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.btl a() {
        /*
            r8 = this;
            com.opera.android.settings.SettingsManager r0 = r8.a
            b7j r2 = r0.c()
            e7j r0 = r0.f()
            e7j r1 = defpackage.e7j.d
            r3 = 1
            r4 = 0
            if (r0 != r1) goto L12
            r0 = r3
            goto L14
        L12:
            r0 = r3
            r3 = r4
        L14:
            java.lang.String r1 = "CompactBottomToolbar"
            b7j r5 = defpackage.b7j.d
            if (r2 != r5) goto L61
            if (r3 != 0) goto L61
            ikc r6 = r8.b
            java.lang.Object r6 = r6.g()
            kl5 r6 = (defpackage.kl5) r6
            android.content.res.Configuration r6 = r6.a
            int r6 = r6.screenWidthDp
            r7 = 600(0x258, float:8.41E-43)
            if (r6 >= r7) goto L5f
            boolean r6 = J.N.Mvrw6zZz(r1)
            if (r6 != 0) goto L38
            boolean r8 = J.N.M$PqApPr(r1)
        L36:
            r6 = r1
            goto L63
        L38:
            po7 r8 = r8.d
            java.lang.Object r8 = r8.g()
            y7f r8 = (defpackage.y7f) r8
            boolean r6 = r8 instanceof defpackage.v7f
            if (r6 == 0) goto L49
            v7f r8 = (defpackage.v7f) r8
            boolean r8 = r8.f
            goto L5d
        L49:
            boolean r6 = r8 instanceof defpackage.w7f
            if (r6 != 0) goto L5c
            x7f r6 = defpackage.x7f.a
            boolean r6 = kotlin.jvm.internal.Intrinsics.a(r8, r6)
            if (r6 != 0) goto L5c
            if (r8 == 0) goto L5c
            h9o.p()
            r8 = 0
            return r8
        L5c:
            r8 = r4
        L5d:
            if (r8 != 0) goto L61
        L5f:
            r8 = r0
            goto L36
        L61:
            r6 = r1
            r8 = r4
        L63:
            btl r1 = new btl
            if (r8 == 0) goto L69
            if (r3 == 0) goto L6c
        L69:
            if (r2 != r5) goto L6c
            r4 = r0
        L6c:
            boolean r0 = J.N.Mvrw6zZz(r6)
            if (r0 == 0) goto L77
            op0 r0 = defpackage.op0.b
        L74:
            r5 = r8
            r6 = r0
            goto L7a
        L77:
            op0 r0 = defpackage.op0.d
            goto L74
        L7a:
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctl.a():btl");
    }

    public final void b() {
        this.c.s();
        this.g.b.g(qcc.a);
        this.f = true;
    }

    public final void c() {
        if (this.f) {
            return;
        }
        xf8.F0(this.e, a());
    }
}
