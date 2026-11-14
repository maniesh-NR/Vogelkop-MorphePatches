package defpackage;

import android.content.Context;
import com.opera.android.aiassistant.db.TopAiActivityDatabase;

/* loaded from: classes.dex */
public final class kul implements w6f {
    public final long a;
    public final dx5 b;
    public final a64 c;
    public final mul d;
    public final i7f e;

    public kul(Context context, wjh wjhVar) {
        TopAiActivityDatabase topAiActivityDatabase = (TopAiActivityDatabase) xih.f(context.getApplicationContext(), TopAiActivityDatabase.class, "ai_top_activity").b();
        on7 on7Var = pn7.b;
        long jX0 = cs5.x0(30, un7.h);
        d7a d7aVar = (d7a) wjhVar.b;
        a64 a64VarB = sgb.b((jg8) wjhVar.d);
        this.a = jX0;
        this.b = d7aVar;
        this.c = a64VarB;
        this.d = topAiActivityDatabase.x();
        this.e = new i7f();
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.e.b((dul) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.e.c((dul) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (r11 != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri r12, nt5 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.eul
            if (r0 == 0) goto L13
            r0 = r13
            eul r0 = (defpackage.eul) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            eul r0 = new eul
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 3
            r4 = 2
            r5 = 0
            mul r6 = r11.d
            r7 = 1
            if (r2 == 0) goto L43
            if (r2 == r7) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L30
            ybh.y(r13)
            goto L9f
        L30:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r11)
            r11 = 0
            return r11
        L37:
            long r11 = r0.t
            ybh.y(r13)
            goto L89
        L3d:
            long r8 = r0.t
            ybh.y(r13)
            goto L69
        L43:
            ybh.y(r13)
            long r8 = java.lang.System.currentTimeMillis()
            ih r13 = new ih
            java.lang.String r12 = r12.toString()
            r13.<init>(r12, r8)
            r0.t = r8
            r0.w = r7
            y5i r12 = r6.a
            gil r2 = new gil
            r10 = 4
            r2.<init>(r6, r13, r10)
            java.lang.Object r12 = kfo.a0(r0, r12, r5, r7, r2)
            if (r12 == r1) goto L67
            kotlin.Unit r12 = kotlin.Unit.a
        L67:
            if (r12 == r1) goto L9e
        L69:
            long r11 = r11.a
            long r11 = pn7.f(r11)
            long r11 = r8 - r11
            r0.t = r8
            r0.w = r4
            y5i r13 = r6.a
            x41 r2 = new x41
            r4 = 20
            r2.<init>(r11, r4)
            java.lang.Object r11 = kfo.a0(r0, r13, r5, r7, r2)
            if (r11 == r1) goto L86
            kotlin.Unit r11 = kotlin.Unit.a
        L86:
            if (r11 == r1) goto L9e
            r11 = r8
        L89:
            r0.t = r11
            r0.w = r3
            y5i r11 = r6.a
            qjl r12 = new qjl
            r12.<init>(r3)
            java.lang.Object r11 = kfo.a0(r0, r11, r5, r7, r12)
            if (r11 == r1) goto L9c
            kotlin.Unit r11 = kotlin.Unit.a
        L9c:
            if (r11 != r1) goto L9f
        L9e:
            return r1
        L9f:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kul.a(android.net.Uri, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r9 != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(nt5 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.gul
            if (r0 == 0) goto L13
            r0 = r10
            gul r0 = (defpackage.gul) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            gul r0 = new gul
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 0
            dx5 r5 = r9.b
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L3f
            if (r2 == r8) goto L3b
            if (r2 == r7) goto L37
            if (r2 != r6) goto L31
            ybh.y(r10)
            goto L7a
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r9)
            return r4
        L37:
            ybh.y(r10)
            goto L68
        L3b:
            ybh.y(r10)
            goto L53
        L3f:
            ybh.y(r10)
            r0.v = r8
            jul r10 = new jul
            r10.<init>(r9, r4, r8)
            java.lang.Object r10 = na2.Z(r5, r10, r0)
            if (r10 == r1) goto L51
            kotlin.Unit r10 = kotlin.Unit.a
        L51:
            if (r10 == r1) goto L79
        L53:
            r0.v = r7
            mul r10 = r9.d
            y5i r10 = r10.a
            qjl r2 = new qjl
            r2.<init>(r7)
            java.lang.Object r10 = kfo.a0(r0, r10, r3, r8, r2)
            if (r10 == r1) goto L66
            kotlin.Unit r10 = kotlin.Unit.a
        L66:
            if (r10 == r1) goto L79
        L68:
            r0.v = r6
            jul r10 = new jul
            r10.<init>(r9, r4, r3)
            java.lang.Object r9 = na2.Z(r5, r10, r0)
            if (r9 == r1) goto L77
            kotlin.Unit r9 = kotlin.Unit.a
        L77:
            if (r9 != r1) goto L7a
        L79:
            return r1
        L7a:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kul.b(nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        if (r9 != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.net.Uri r10, nt5 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.hul
            if (r0 == 0) goto L13
            r0 = r11
            hul r0 = (defpackage.hul) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            hul r0 = new hul
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            dx5 r3 = r9.b
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L42
            if (r2 == r7) goto L3c
            if (r2 == r6) goto L36
            if (r2 != r5) goto L30
            ybh.y(r11)
            goto L8b
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r9)
            return r4
        L36:
            android.net.Uri r10 = r0.t
            ybh.y(r11)
            goto L76
        L3c:
            android.net.Uri r10 = r0.t
            ybh.y(r11)
            goto L58
        L42:
            ybh.y(r11)
            r0.t = r10
            r0.w = r7
            jul r11 = new jul
            r11.<init>(r9, r4, r7)
            java.lang.Object r11 = na2.Z(r3, r11, r0)
            if (r11 == r1) goto L56
            kotlin.Unit r11 = kotlin.Unit.a
        L56:
            if (r11 == r1) goto L8a
        L58:
            java.lang.String r11 = r10.toString()
            r0.t = r10
            r0.w = r6
            mul r2 = r9.d
            y5i r2 = r2.a
            u5f r6 = new u5f
            r8 = 14
            r6.<init>(r11, r8)
            r11 = 0
            java.lang.Object r11 = kfo.a0(r0, r2, r11, r7, r6)
            if (r11 == r1) goto L74
            kotlin.Unit r11 = kotlin.Unit.a
        L74:
            if (r11 == r1) goto L8a
        L76:
            r0.t = r4
            r0.w = r5
            cek r11 = new cek
            r2 = 5
            r11.<init>(r9, r10, r4, r2)
            java.lang.Object r9 = na2.Z(r3, r11, r0)
            if (r9 == r1) goto L88
            kotlin.Unit r9 = kotlin.Unit.a
        L88:
            if (r9 != r1) goto L8b
        L8a:
            return r1
        L8b:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kul.c(android.net.Uri, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(long r7, final int r9, nt5 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.iul
            if (r0 == 0) goto L13
            r0 = r10
            iul r0 = (defpackage.iul) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            iul r0 = new iul
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ybh.y(r10)
            goto L4d
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r6)
            r6 = 0
            return r6
        L2e:
            ybh.y(r10)
            long r4 = java.lang.System.currentTimeMillis()
            long r7 = pn7.f(r7)
            long r4 = r4 - r7
            r0.v = r3
            mul r6 = r6.d
            y5i r6 = r6.a
            lul r7 = new lul
            r7.<init>()
            r8 = 0
            java.lang.Object r10 = kfo.a0(r0, r6, r3, r8, r7)
            if (r10 != r1) goto L4d
            return r1
        L4d:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = k95.o(r10, r7)
            r6.<init>(r7)
            java.util.Iterator r7 = r10.iterator()
        L5e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L74
            java.lang.Object r8 = r7.next()
            ih r8 = (defpackage.ih) r8
            java.lang.String r8 = r8.a
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r6.add(r8)
            goto L5e
        L74:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kul.e(long, int, nt5):java.io.Serializable");
    }
}
