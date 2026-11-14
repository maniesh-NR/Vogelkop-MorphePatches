package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class u8k implements w6f {
    public final SettingsManager a;
    public final k7k b;
    public final v1 c;
    public final ode d;
    public final p8k e;
    public final p8k f;
    public final i7f g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [mo7, p8k] */
    /* JADX WARN: Type inference failed for: r4v1, types: [mo7, p8k] */
    public u8k(SettingsManager settingsManager, k7k k7kVar, v1 v1Var) {
        this.a = settingsManager;
        this.b = k7kVar;
        this.c = v1Var;
        ode odeVar = new ode();
        this.d = odeVar;
        final byte b = 0;
        ?? r0 = new mo7(this) { // from class: p8k
            public final /* synthetic */ u8k b;

            {
                this.b = this;
            }

            @Override // defpackage.mo7
            public final void o(boolean z) {
                byte b2 = b;
                u8k u8kVar = this.b;
                switch (b2) {
                    case 0:
                        u8kVar.c();
                        break;
                    default:
                        u8kVar.c();
                        break;
                }
            }
        };
        k7kVar.F(r0);
        this.e = r0;
        final byte b2 = 1;
        ?? r4 = new mo7(this) { // from class: p8k
            public final /* synthetic */ u8k b;

            {
                this.b = this;
            }

            @Override // defpackage.mo7
            public final void o(boolean z) {
                byte b22 = b2;
                u8k u8kVar = this.b;
                switch (b22) {
                    case 0:
                        u8kVar.c();
                        break;
                    default:
                        u8kVar.c();
                        break;
                }
            }
        };
        v1Var.F(r4);
        this.f = r4;
        this.g = new i7f();
        odeVar.k(new w4i(new n6k((Object) this, (byte) 5), (byte) 12));
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.g.b((q8k) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.g.c((q8k) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.t8k a() {
        /*
            r8 = this;
            t8k r0 = new t8k
            v1 r1 = r8.c
            r1 r2 = r1.v()
            k7k r3 = r8.b
            if (r2 == 0) goto Lf
            boolean r2 = r2.b
            goto L17
        Lf:
            java.lang.Object r2 = r3.i()
            j7k r2 = (defpackage.j7k) r2
            boolean r2 = r2.e
        L17:
            r1 r4 = r1.v()
            if (r4 == 0) goto L20
            boolean r4 = r4.e
            goto L28
        L20:
            java.lang.Object r4 = r3.i()
            j7k r4 = (defpackage.j7k) r4
            boolean r4 = r4.h
        L28:
            com.opera.android.settings.SettingsManager r8 = r8.a
            e7j r5 = r8.f()
            e7j r6 = defpackage.e7j.d
            if (r5 != r6) goto L35
            s8k r8 = defpackage.s8k.a
            goto L42
        L35:
            b7j r8 = r8.c()
            b7j r5 = defpackage.b7j.c
            if (r8 != r5) goto L40
            s8k r8 = defpackage.s8k.b
            goto L42
        L40:
            s8k r8 = defpackage.s8k.c
        L42:
            r1 r5 = r1.v()
            if (r5 == 0) goto L4b
            boolean r5 = r5.d
            goto L53
        L4b:
            java.lang.Object r5 = r3.i()
            j7k r5 = (defpackage.j7k) r5
            boolean r5 = r5.g
        L53:
            if (r5 == 0) goto L6b
            r1 r5 = r1.v()
            if (r5 == 0) goto L5e
            boolean r5 = r5.c
            goto L66
        L5e:
            java.lang.Object r5 = r3.i()
            j7k r5 = (defpackage.j7k) r5
            boolean r5 = r5.f
        L66:
            if (r5 != 0) goto L6b
            r8k r5 = defpackage.r8k.b
            goto L6d
        L6b:
            r8k r5 = defpackage.r8k.a
        L6d:
            r1 r6 = r1.v()
            if (r6 == 0) goto L76
            boolean r6 = r6.c
            goto L7e
        L76:
            java.lang.Object r6 = r3.i()
            j7k r6 = (defpackage.j7k) r6
            boolean r6 = r6.f
        L7e:
            r1 r1 = r1.v()
            if (r1 == 0) goto L87
            boolean r1 = r1.d
            goto L8f
        L87:
            java.lang.Object r1 = r3.i()
            j7k r1 = (defpackage.j7k) r1
            boolean r1 = r1.i
        L8f:
            java.lang.Object r3 = r3.i()
            j7k r3 = (defpackage.j7k) r3
            boolean r7 = r3.j
            r3 = r6
            r6 = r1
            r1 = r2
            r2 = r4
            r4 = r5
            r5 = r3
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u8k.a():t8k");
    }

    public final t8k b() {
        t8k t8kVar = (t8k) this.d.g();
        return t8kVar == null ? a() : t8kVar;
    }

    public final void c() {
        if (this.b.j() && this.c.j()) {
            if (xf8.E0(this.d, a())) {
                i7f i7fVar = this.g;
                g7f g7fVarC = u35.c(i7fVar, i7fVar);
                while (g7fVarC.hasNext()) {
                    ((q8k) g7fVarC.next()).a();
                }
            }
        }
    }
}
