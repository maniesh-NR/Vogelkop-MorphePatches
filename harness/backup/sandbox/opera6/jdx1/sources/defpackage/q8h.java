package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class q8h {
    public final k1i a;
    public final ab4 b;
    public final db4 c;
    public final nx5 d;
    public final x79 e;
    public final LinkedHashSet f;
    public final ArrayList g;

    public q8h(k1i k1iVar, ab4 ab4Var, db4 db4Var, hnl hnlVar) {
        this.a = k1iVar;
        this.b = ab4Var;
        this.c = db4Var;
        nx5 nx5Var = hnlVar.a;
        this.d = nx5Var;
        s2e s2eVar = new s2e(1, this, q8h.class, "prune", "prune$camera_camera2_pipe(Ljava/util/List;)V", 0, (byte) 29);
        qmb qmbVar = new qmb((byte) 29, null, this);
        x79 x79Var = new x79();
        x79Var.a = s2eVar;
        x79Var.b = qmbVar;
        x79Var.c = c26.i(false);
        x79Var.d = xf8.h(Integer.MAX_VALUE, null, new rmg(x79Var, (byte) 7), 2);
        x79Var.e = new i72();
        if (!((af2) x79Var.c).a()) {
            qp2.n("PruningProcessingQueue cannot be re-started!");
            throw null;
        }
        if (na2.B(nx5Var, null, null, new agb((byte) 16, (mt5) null, x79Var), 3).isCancelled()) {
            x79Var.o((Throwable) null);
        }
        this.e = x79Var;
        this.f = new LinkedHashSet();
        this.g = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
    
        qp2.n("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00dd -> B:41:0x00e0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Set r14, nt5 r15) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8h.a(java.util.Set, nt5):java.lang.Object");
    }

    public final Unit b(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            f8h f8hVar = (f8h) obj;
            f8hVar.c.b();
            this.g.remove(f8hVar);
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, java.util.List r6, defpackage.aa4 r7, nx5 r8, nt5 r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.k8h
            if (r0 == 0) goto L13
            r0 = r9
            k8h r0 = (defpackage.k8h) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            k8h r0 = new k8h
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.w
            px5 r1 = px5.a
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L33
            nx5 r5 = r0.v
            r8 = r5
            nx5 r8 = (nx5) r8
            java.util.List r5 = r0.u
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            java.lang.String r5 = r0.t
            defpackage.ybh.y(r9)
            goto L59
        L33:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L3a:
            defpackage.ybh.y(r9)
            defpackage.sd4.b(r5)
            r0.t = r5
            r9 = r6
            java.util.List r9 = (java.util.List) r9
            r0.u = r9
            r9 = r8
            nx5 r9 = (nx5) r9
            r0.v = r9
            r0.y = r3
            k1i r9 = r4.a
            ab4 r2 = r4.b
            java.lang.Object r9 = r9.a(r5, r2, r7, r0)
            if (r9 != r1) goto L59
            return r1
        L59:
            agf r9 = (defpackage.agf) r9
            z21 r7 = r9.a
            if (r7 != 0) goto L67
            c8h r4 = new c8h
            yc4 r5 = r9.b
            r4.<init>(r5)
            return r4
        L67:
            d8h r9 = new d8h
            zf r0 = new zf
            java.util.Collection r6 = (java.util.Collection) r6
            sd4 r1 = new sd4
            r1.<init>(r5)
            java.util.ArrayList r5 = kotlin.collections.CollectionsKt.W(r1, r6)
            java.util.Set r5 = kotlin.collections.CollectionsKt.n0(r5)
            rmg r6 = new rmg
            r1 = 6
            r6.<init>(r4, r1)
            r0.<init>(r7, r5, r8, r6)
            r9.<init>(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8h.c(java.lang.String, java.util.List, aa4, nx5, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (r11.b(r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.vvh r12, nt5 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.l8h
            if (r0 == 0) goto L13
            r0 = r13
            l8h r0 = (defpackage.l8h) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            l8h r0 = new l8h
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.ybh.y(r13)
            goto L89
        L2b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r11)
            return r3
        L31:
            vvh r12 = r0.t
            defpackage.ybh.y(r13)
            goto L77
        L37:
            defpackage.ybh.y(r13)
            zf r13 = r12.a
            z21 r2 = r13.a
            java.lang.String r2 = r2.a
            defpackage.sd4.b(r2)
            java.util.LinkedHashSet r2 = r11.f
            boolean r6 = r2.contains(r13)
            if (r6 == 0) goto L4e
            r2.remove(r13)
        L4e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r6 = r11.g
            int r7 = r6.size()
            r8 = 0
        L5a:
            if (r8 >= r7) goto L6d
            java.lang.Object r9 = r6.get(r8)
            int r8 = r8 + 1
            r10 = r9
            f8h r10 = (defpackage.f8h) r10
            zf r10 = r10.b
            if (r10 != r13) goto L5a
            r2.add(r9)
            goto L5a
        L6d:
            r0.t = r12
            r0.w = r5
            kotlin.Unit r11 = r11.b(r2)
            if (r11 == r1) goto L88
        L77:
            zf r11 = r12.a
            r11.c()
            zf r11 = r12.a
            r0.t = r3
            r0.w = r4
            java.lang.Object r11 = r11.b(r0)
            if (r11 != r1) goto L89
        L88:
            return r1
        L89:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8h.d(vvh, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (b(r6.g) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(wvh r7, nt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.m8h
            if (r0 == 0) goto L13
            r0 = r8
            m8h r0 = (defpackage.m8h) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            m8h r0 = new m8h
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 2
            r4 = 1
            java.util.LinkedHashSet r5 = r6.f
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L30
            java.util.Iterator r6 = r0.u
            wvh r7 = r0.t
            defpackage.ybh.y(r8)
            goto L64
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            r6 = 0
            return r6
        L37:
            wvh r7 = r0.t
            defpackage.ybh.y(r8)
            goto L4c
        L3d:
            defpackage.ybh.y(r8)
            r0.t = r7
            r0.x = r4
            java.util.ArrayList r8 = r6.g
            kotlin.Unit r6 = r6.b(r8)
            if (r6 == r1) goto L7c
        L4c:
            java.util.Iterator r6 = r5.iterator()
        L50:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L60
            java.lang.Object r8 = r6.next()
            zf r8 = (defpackage.zf) r8
            r8.c()
            goto L50
        L60:
            java.util.Iterator r6 = r5.iterator()
        L64:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L7d
            java.lang.Object r8 = r6.next()
            zf r8 = (defpackage.zf) r8
            r0.t = r7
            r0.u = r6
            r0.x = r3
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L64
        L7c:
            return r1
        L7d:
            r5.clear()
            cd5 r6 = r7.a
            kotlin.Unit r7 = kotlin.Unit.a
            r6.j0(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8h.e(wvh, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.xvh r12, nt5 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.n8h
            if (r0 == 0) goto L13
            r0 = r13
            n8h r0 = (defpackage.n8h) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            n8h r0 = new n8h
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            xvh r11 = r0.t
            defpackage.ybh.y(r13)
            goto Lb0
        L2e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r11)
            return r3
        L34:
            java.lang.String r12 = r0.u
            xvh r2 = r0.t
            defpackage.ybh.y(r13)
            goto L79
        L3c:
            defpackage.ybh.y(r13)
            java.lang.String r13 = r12.a
            defpackage.sd4.b(r13)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r6 = r11.g
            int r7 = r6.size()
            r8 = 0
        L50:
            if (r8 >= r7) goto L6b
            java.lang.Object r9 = r6.get(r8)
            int r8 = r8 + 1
            r10 = r9
            f8h r10 = (defpackage.f8h) r10
            qwh r10 = r10.a
            man r10 = r10.a
            java.lang.String r10 = r10.a
            boolean r10 = kotlin.jvm.internal.Intrinsics.a(r10, r13)
            if (r10 == 0) goto L50
            r2.add(r9)
            goto L50
        L6b:
            r0.t = r12
            r0.u = r13
            r0.x = r5
            kotlin.Unit r2 = r11.b(r2)
            if (r2 == r1) goto Lae
            r2 = r12
            r12 = r13
        L79:
            java.util.LinkedHashSet r11 = r11.f
            java.util.Iterator r13 = r11.iterator()
        L7f:
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto L97
            java.lang.Object r5 = r13.next()
            r6 = r5
            zf r6 = (defpackage.zf) r6
            z21 r6 = r6.a
            java.lang.String r6 = r6.a
            boolean r6 = kotlin.jvm.internal.Intrinsics.a(r6, r12)
            if (r6 == 0) goto L7f
            goto L98
        L97:
            r5 = r3
        L98:
            zf r5 = (defpackage.zf) r5
            if (r5 == 0) goto Lb1
            r11.remove(r5)
            r5.c()
            r0.t = r2
            r0.u = r3
            r0.x = r4
            java.lang.Object r11 = r5.b(r0)
            if (r11 != r1) goto Laf
        Lae:
            return r1
        Laf:
            r11 = r2
        Lb0:
            r2 = r11
        Lb1:
            cd5 r11 = r2.b
            kotlin.Unit r12 = kotlin.Unit.a
            r11.j0(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8h.f(xvh, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0215, code lost:
    
        if (a(r13, r0) != r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0225, code lost:
    
        if (r14.d(r12, r0) == r1) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119 A[LOOP:3: B:43:0x0113->B:45:0x0119, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.qwh r13, nt5 r14) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8h.g(qwh, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        r11 = r10.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r11 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r10.c();
        r2.t = r1;
        r2.u = r9;
        r2.v = r3;
        r2.w = r10;
        r2.z = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (r10.b(r2) == r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        r12 = r9;
        r9 = r3;
        r3 = r10;
        r10 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0080 -> B:26:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r14, defpackage.qwh r15, nt5 r16) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8h.h(java.lang.String, qwh, nt5):java.lang.Object");
    }
}
