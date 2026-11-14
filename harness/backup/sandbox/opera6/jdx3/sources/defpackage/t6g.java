package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class t6g extends l7n {
    public final ot2 b;
    public final yu2 c;
    public final x5g d;
    public final zg7 e;
    public final ru9 f;
    public final cq5 g;
    public final db h;
    public final zwk i;
    public final hxk j;
    public final orm k;
    public final umi l;
    public oml n;
    public final kze p;
    public boolean q;
    public final kze r;
    public final tsd s;
    public final fn3 t;
    public final t77 u;
    public sl6 m = new sl6(t8.a);
    public final jk o = new jk();

    public t6g(ot2 ot2Var, yu2 yu2Var, x5g x5gVar, zg7 zg7Var, ru9 ru9Var, cq5 cq5Var, xb xbVar, db dbVar, zwk zwkVar, hxk hxkVar, orm ormVar, umi umiVar) {
        this.b = ot2Var;
        this.c = yu2Var;
        this.d = x5gVar;
        this.e = zg7Var;
        this.f = ru9Var;
        this.g = cq5Var;
        this.h = dbVar;
        this.i = zwkVar;
        this.j = hxkVar;
        this.k = ormVar;
        this.l = umiVar;
        this.p = xbVar.d;
        kze kzeVar = new kze(Boolean.FALSE);
        this.r = kzeVar;
        tsd tsdVar = new tsd(o6g.h);
        this.s = tsdVar;
        this.t = new fn3(this, (byte) 1);
        this.u = new t77((Object) this, (byte) 8);
        List listAsList = Arrays.asList((kze) zg7Var.e, (h42) zg7Var.f, kzeVar);
        s4f s4fVar = new s4f(listAsList, this, (byte) 6);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            tsdVar.s((ekc) it.next(), new ug(new nna(s4fVar, (byte) 28), (byte) 25));
        }
    }

    public final void e() {
        zg7 zg7Var = this.e;
        zg7Var.i(null);
        zg7Var.m();
        this.i.H(this.t);
        this.p.p(this.u);
        this.q = false;
    }

    public final boolean f() {
        return (((f8f) this.g.getValue()).g() || this.e.e() || ((Boolean) this.r.g()).booleanValue() || this.m.b()) ? false : true;
    }

    public final boolean g() {
        yu2 yu2Var = this.c;
        if (yu2Var.b() && !yu2Var.a()) {
            zg7 zg7Var = this.e;
            if (!zg7Var.e() && !((Boolean) this.r.g()).booleanValue() && ((xgh.a || !xgh.s(this.h, this.i)) && !this.f.a.getBoolean("has_dismissed_password_autofill_banner", false))) {
                if (this.m.b()) {
                    return true;
                }
                Collection collection = (Collection) ((h42) zg7Var.f).g();
                if (collection != null && !collection.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void h() {
        oml omlVar = this.n;
        final byte b = 1;
        if (omlVar != null) {
            omlVar.cancel(true);
        }
        final byte b2 = 0;
        this.n = new rml(((h42) this.e.f).g(), this.l).a(new Function1(this) { // from class: r6g
            public final /* synthetic */ t6g b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r18) {
                /*
                    r17 = this;
                    r0 = r17
                    byte r1 = r2
                    t6g r0 = r0.b
                    switch(r1) {
                        case 0: goto Lba;
                        default: goto L9;
                    }
                L9:
                    r3 = r18
                    java.util.List r3 = (java.util.List) r3
                    tsd r1 = r0.s
                    zg7 r2 = r0.e
                    boolean r11 = r0.f()
                    yu2 r4 = r0.c
                    r4.getClass()
                    int r4 = android.os.Build.VERSION.SDK_INT
                    r5 = 0
                    r6 = 1
                    r7 = 30
                    if (r4 < r7) goto L2c
                    if (r11 == 0) goto L2c
                    boolean r8 = r3.isEmpty()
                    if (r8 == 0) goto L2c
                    r9 = r6
                    goto L2d
                L2c:
                    r9 = r5
                L2d:
                    r13 = 0
                    if (r11 == 0) goto L57
                    kze r8 = r0.p
                    java.lang.Object r8 = r8.g()
                    ipf r8 = (defpackage.ipf) r8
                    epf r10 = defpackage.epf.a
                    boolean r10 = kotlin.jvm.internal.Intrinsics.a(r8, r10)
                    if (r10 != 0) goto L57
                    gpf r10 = defpackage.gpf.a
                    boolean r10 = kotlin.jvm.internal.Intrinsics.a(r8, r10)
                    if (r10 == 0) goto L4a
                    r12 = r6
                    goto L58
                L4a:
                    boolean r10 = r8 instanceof defpackage.cpf
                    if (r10 != 0) goto L57
                    boolean r8 = r8 instanceof defpackage.fpf
                    if (r8 != 0) goto L57
                    h9o.p()
                    goto Lb9
                L57:
                    r12 = r5
                L58:
                    boolean r8 = r2.e()
                    if (r8 == 0) goto L61
                    u3g r8 = defpackage.u3g.e
                    goto L74
                L61:
                    kze r8 = r0.r
                    java.lang.Object r8 = r8.g()
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 == 0) goto L72
                    u3g r8 = defpackage.u3g.f
                    goto L74
                L72:
                    u3g r8 = defpackage.u3g.d
                L74:
                    if (r4 < r7) goto L79
                    r3.size()
                L79:
                    r5g r5 = new r5g
                    r5.<init>()
                    r14 = r6
                    boolean r6 = r0.g()
                    db r15 = r0.h
                    zwk r10 = r0.i
                    boolean r16 = xgh.a
                    if (r16 != 0) goto L93
                    boolean r10 = xgh.s(r15, r10)
                    if (r10 == 0) goto L93
                    r10 = r14
                    goto L94
                L93:
                    r10 = 0
                L94:
                    if (r4 < r7) goto La0
                    if (r9 != 0) goto La0
                    boolean r2 = r2.e()
                    if (r2 != 0) goto La0
                    r2 = r14
                    goto La1
                La0:
                    r2 = 0
                La1:
                    r4 = r3
                    java.util.Collection r4 = (java.util.Collection) r4
                    boolean r4 = r4.isEmpty()
                    r4 = r4 ^ r14
                    r7 = r10
                    r10 = r4
                    r4 = r8
                    r8 = r2
                    p6g r2 = new p6g
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                    r1.r(r2)
                    r0.n = r13
                    kotlin.Unit r13 = kotlin.Unit.a
                Lb9:
                    return r13
                Lba:
                    r1 = r18
                    java.util.List r1 = (java.util.List) r1
                    if (r1 != 0) goto Lc2
                    l08 r1 = l08.a
                Lc2:
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    jk r0 = r0.o
                    java.util.List r0 = kotlin.collections.CollectionsKt.c0(r0, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r6g.invoke(java.lang.Object):java.lang.Object");
            }
        }).t(new Function1(this) { // from class: r6g
            public final /* synthetic */ t6g b;

            {
                this.b = this;
            }

            public final Object invoke(Object v) {
                /*
                    this = this;
                    r0 = r17
                    byte r1 = r2
                    t6g r0 = r0.b
                    switch(r1) {
                        case 0: goto Lba;
                        default: goto L9;
                    }
                L9:
                    r3 = r18
                    java.util.List r3 = (java.util.List) r3
                    tsd r1 = r0.s
                    zg7 r2 = r0.e
                    boolean r11 = r0.f()
                    yu2 r4 = r0.c
                    r4.getClass()
                    int r4 = android.os.Build.VERSION.SDK_INT
                    r5 = 0
                    r6 = 1
                    r7 = 30
                    if (r4 < r7) goto L2c
                    if (r11 == 0) goto L2c
                    boolean r8 = r3.isEmpty()
                    if (r8 == 0) goto L2c
                    r9 = r6
                    goto L2d
                L2c:
                    r9 = r5
                L2d:
                    r13 = 0
                    if (r11 == 0) goto L57
                    kze r8 = r0.p
                    java.lang.Object r8 = r8.g()
                    ipf r8 = (defpackage.ipf) r8
                    epf r10 = defpackage.epf.a
                    boolean r10 = kotlin.jvm.internal.Intrinsics.a(r8, r10)
                    if (r10 != 0) goto L57
                    gpf r10 = defpackage.gpf.a
                    boolean r10 = kotlin.jvm.internal.Intrinsics.a(r8, r10)
                    if (r10 == 0) goto L4a
                    r12 = r6
                    goto L58
                L4a:
                    boolean r10 = r8 instanceof defpackage.cpf
                    if (r10 != 0) goto L57
                    boolean r8 = r8 instanceof defpackage.fpf
                    if (r8 != 0) goto L57
                    h9o.p()
                    goto Lb9
                L57:
                    r12 = r5
                L58:
                    boolean r8 = r2.e()
                    if (r8 == 0) goto L61
                    u3g r8 = defpackage.u3g.e
                    goto L74
                L61:
                    kze r8 = r0.r
                    java.lang.Object r8 = r8.g()
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 == 0) goto L72
                    u3g r8 = defpackage.u3g.f
                    goto L74
                L72:
                    u3g r8 = defpackage.u3g.d
                L74:
                    if (r4 < r7) goto L79
                    r3.size()
                L79:
                    r5g r5 = new r5g
                    r5.<init>()
                    r14 = r6
                    boolean r6 = r0.g()
                    db r15 = r0.h
                    zwk r10 = r0.i
                    boolean r16 = xgh.a
                    if (r16 != 0) goto L93
                    boolean r10 = xgh.s(r15, r10)
                    if (r10 == 0) goto L93
                    r10 = r14
                    goto L94
                L93:
                    r10 = 0
                L94:
                    if (r4 < r7) goto La0
                    if (r9 != 0) goto La0
                    boolean r2 = r2.e()
                    if (r2 != 0) goto La0
                    r2 = r14
                    goto La1
                La0:
                    r2 = 0
                La1:
                    r4 = r3
                    java.util.Collection r4 = (java.util.Collection) r4
                    boolean r4 = r4.isEmpty()
                    r4 = r4 ^ r14
                    r7 = r10
                    r10 = r4
                    r4 = r8
                    r8 = r2
                    p6g r2 = new p6g
                    r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                    r1.r(r2)
                    r0.n = r13
                    kotlin.Unit r13 = kotlin.Unit.a
                Lb9:
                    return r13
                Lba:
                    r1 = r18
                    java.util.List r1 = (java.util.List) r1
                    if (r1 != 0) goto Lc2
                    l08 r1 = l08.a
                Lc2:
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    jk r0 = r0.o
                    java.util.List r0 = kotlin.collections.CollectionsKt.c0(r0, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r6g.invoke(java.lang.Object):java.lang.Object");
            }
        }).l();
    }
}
