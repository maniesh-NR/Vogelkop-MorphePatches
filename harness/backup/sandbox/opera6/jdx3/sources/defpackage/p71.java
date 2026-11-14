package defpackage;

import android.content.Context;
import androidx.emoji2.emojipicker.EmojiPickerView;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.firebase.OperaFirebaseMessagingService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p71 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public byte u;
    public Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p71(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.w = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p71(fr6 fr6Var, mt5 mt5Var, bd5 bd5Var) {
        super(2, mt5Var);
        this.t = (byte) 2;
        this.v = fr6Var;
        this.w = bd5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p71(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
        this.w = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        if (r7.a(4, cs5.x0(3, un7.e), r11, r12) == r1) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.w
            joc r0 = (defpackage.joc) r0
            px5 r1 = px5.a
            byte r2 = r13.u
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L21
            if (r2 == r6) goto L1c
            if (r2 != r5) goto L16
            ybh.y(r14)
            goto L5d
        L16:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r13)
            return r4
        L1c:
            ybh.y(r14)
            r12 = r13
            goto L41
        L21:
            ybh.y(r14)
            java.lang.Object r14 = r13.v
            r7 = r14
            o0i r7 = (defpackage.o0i) r7
            m0i r11 = new m0i
            r14 = 0
            r11.<init>(r7, r0, r4, r14)
            r13.u = r6
            on7 r14 = pn7.b
            un7 r14 = un7.e
            long r9 = cs5.x0(r3, r14)
            r8 = 4
            r12 = r13
            java.lang.Object r13 = r7.a(r8, r9, r11, r12)
            if (r13 == r1) goto L5c
        L41:
            java.lang.Object r13 = r12.v
            r7 = r13
            o0i r7 = (defpackage.o0i) r7
            m0i r11 = new m0i
            r11.<init>(r7, r0, r4, r6)
            r12.u = r5
            on7 r13 = pn7.b
            un7 r13 = un7.e
            long r9 = cs5.x0(r3, r13)
            r8 = 4
            java.lang.Object r13 = r7.a(r8, r9, r11, r12)
            if (r13 != r1) goto L5d
        L5c:
            return r1
        L5d:
            kotlin.Unit r13 = kotlin.Unit.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p71.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        if (r10.a((java.util.HashMap) r0, r1, r9) == r2) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r10) throws java.lang.NumberFormatException {
        /*
            r9 = this;
            java.lang.Object r0 = r9.v
            rth r0 = (rth) r0
            android.os.Bundle r1 = r0.f
            px5 r2 = px5.a
            byte r3 = r9.u
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L22
            if (r3 == r6) goto L1e
            if (r3 != r5) goto L18
            ybh.y(r10)
            goto L9a
        L18:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r9)
            return r4
        L1e:
            ybh.y(r10)
            goto L3c
        L22:
            ybh.y(r10)
            cv6 r10 = bb7.a
            d7a r10 = s6d.a
            bz1 r3 = new bz1
            java.lang.Object r7 = r9.w
            com.opera.android.firebase.OperaFirebaseMessagingService r7 = (com.opera.android.firebase.OperaFirebaseMessagingService) r7
            r8 = 27
            r3.<init>(r8, r4, r7)
            r9.u = r6
            java.lang.Object r10 = na2.Z(r10, r3, r9)
            if (r10 == r2) goto L99
        L3c:
            y3i r10 = (defpackage.y3i) r10
            java.util.Map r0 = r0.getData()
            ebb r3 = ebb.c
            java.lang.String r3 = "google.sent_time"
            java.lang.Object r3 = r1.get(r3)
            boolean r4 = r3 instanceof java.lang.Long
            if (r4 == 0) goto L55
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            goto L62
        L55:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L60
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> L60
            long r3 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L60
            goto L62
        L60:
            r3 = 0
        L62:
            ebb r3 = j06.m(r3)
            on7 r4 = pn7.b
            java.lang.String r4 = "google.ttl"
            java.lang.Object r1 = r1.get(r4)
            boolean r4 = r1 instanceof java.lang.Integer
            if (r4 == 0) goto L79
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L85
        L79:
            boolean r4 = r1 instanceof java.lang.String
            if (r4 == 0) goto L84
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L84
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L84:
            r1 = 0
        L85:
            un7 r4 = un7.e
            long r6 = cs5.x0(r1, r4)
            ebb r1 = r3.h(r6)
            r9.u = r5
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r9 = r10.a(r0, r1, r9)
            if (r9 != r2) goto L9a
        L99:
            return r2
        L9a:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p71.p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r7 == r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r7 == r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p71.q(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        if (r2.invoke(r7, r6) != r1) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[PHI: r2 r7
      0x0051: PHI (r2v1 r3) = (r2v3 r3), (r2v5 r3) binds: [B:13:0x004f, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r7v6 java.lang.Object) = (r7v13 java.lang.Object), (r7v0 java.lang.Object) binds: [B:13:0x004f, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0059 -> B:17:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.w
            wjj r0 = (defpackage.wjj) r0
            px5 r1 = px5.a
            byte r2 = r6.u
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L23
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            ybh.y(r7)
            goto L5c
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r6)
            return r3
        L1b:
            java.lang.Object r2 = r6.v
            r3 r2 = (r3) r2
            ybh.y(r7)
            goto L51
        L23:
            ybh.y(r7)
            java.lang.Object r7 = r0.d
            eme r7 = (defpackage.eme) r7
            java.lang.Object r7 = r7.a
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L6d
        L34:
            java.lang.Object r7 = r0.a
            nx5 r7 = (nx5) r7
            sgb.w(r7)
            java.lang.Object r7 = r0.b
            r2 = r7
            r3 r2 = (r3) r2
            java.lang.Object r7 = r0.c
            p04 r7 = (p04) r7
            r6.v = r2
            r6.u = r5
            r7.getClass()
            java.lang.Object r7 = p04.O(r7, r6)
            if (r7 == r1) goto L5b
        L51:
            r6.v = r3
            r6.u = r4
            java.lang.Object r7 = r2.invoke(r7, r6)
            if (r7 != r1) goto L5c
        L5b:
            return r1
        L5c:
            java.lang.Object r7 = r0.d
            eme r7 = (defpackage.eme) r7
            java.lang.Object r7 = r7.a
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L34
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L6d:
            java.lang.String r6 = "Check failed."
            defpackage.qp2.n(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p71.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
    
        if (r10 == r3) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f A[Catch: all -> 0x00e1, PHI: r4 r11
      0x006f: PHI (r4v9 h0d) = (r4v8 h0d), (r4v13 h0d) binds: [B:33:0x006d, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r11v6 java.lang.Object) = (r11v5 java.lang.Object), (r11v0 java.lang.Object) binds: [B:33:0x006d, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00e1, blocks: (B:8:0x001b, B:46:0x0093, B:48:0x00a1, B:50:0x00af, B:51:0x00b6, B:52:0x00c9, B:54:0x00cf, B:55:0x00d9, B:13:0x002a, B:34:0x006f, B:36:0x0077, B:38:0x007f, B:40:0x0085, B:41:0x0088, B:43:0x008e, B:16:0x0032, B:32:0x0065, B:17:0x0036, B:22:0x0047, B:24:0x0051, B:26:0x0057, B:27:0x005a, B:29:0x0060, B:20:0x003d), top: B:61:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077 A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:8:0x001b, B:46:0x0093, B:48:0x00a1, B:50:0x00af, B:51:0x00b6, B:52:0x00c9, B:54:0x00cf, B:55:0x00d9, B:13:0x002a, B:34:0x006f, B:36:0x0077, B:38:0x007f, B:40:0x0085, B:41:0x0088, B:43:0x008e, B:16:0x0032, B:32:0x0065, B:17:0x0036, B:22:0x0047, B:24:0x0051, B:26:0x0057, B:27:0x005a, B:29:0x0060, B:20:0x003d), top: B:61:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1 A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:8:0x001b, B:46:0x0093, B:48:0x00a1, B:50:0x00af, B:51:0x00b6, B:52:0x00c9, B:54:0x00cf, B:55:0x00d9, B:13:0x002a, B:34:0x006f, B:36:0x0077, B:38:0x007f, B:40:0x0085, B:41:0x0088, B:43:0x008e, B:16:0x0032, B:32:0x0065, B:17:0x0036, B:22:0x0047, B:24:0x0051, B:26:0x0057, B:27:0x005a, B:29:0x0060, B:20:0x003d), top: B:61:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf A[Catch: all -> 0x00e1, LOOP:0: B:52:0x00c9->B:54:0x00cf, LOOP_END, TryCatch #0 {all -> 0x00e1, blocks: (B:8:0x001b, B:46:0x0093, B:48:0x00a1, B:50:0x00af, B:51:0x00b6, B:52:0x00c9, B:54:0x00cf, B:55:0x00d9, B:13:0x002a, B:34:0x006f, B:36:0x0077, B:38:0x007f, B:40:0x0085, B:41:0x0088, B:43:0x008e, B:16:0x0032, B:32:0x0065, B:17:0x0036, B:22:0x0047, B:24:0x0051, B:26:0x0057, B:27:0x005a, B:29:0x0060, B:20:0x003d), top: B:61:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p71.s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r6 == r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r7 != r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, n1f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [mt5, p71] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2, types: [nt5, p71] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.w
            n1f r0 = (defpackage.n1f) r0
            java.lang.Object r1 = r0.d
            d3k r1 = (d3k) r1
            px5 r2 = px5.a
            byte r3 = r6.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L28
            if (r3 == r5) goto L24
            if (r3 != r4) goto L1d
            java.lang.Object r6 = r6.v
            r0 = r6
            n1f r0 = (defpackage.n1f) r0
            ybh.y(r7)     // Catch: java.lang.Throwable -> L4e
            goto L40
        L1d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r6)
            r6 = 0
            return r6
        L24:
            ybh.y(r7)     // Catch: java.lang.Throwable -> L34
            goto L48
        L28:
            ybh.y(r7)
            r6.u = r5     // Catch: java.lang.Throwable -> L34
            java.lang.Object r6 = r0.f(r6)     // Catch: java.lang.Throwable -> L34
            if (r6 != r2) goto L48
            goto L3f
        L34:
            r7 = move-exception
            r6.v = r0     // Catch: java.lang.Throwable -> L4e
            r6.u = r4     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r7 = r0.d(r7, r6)     // Catch: java.lang.Throwable -> L4e
            if (r7 != r2) goto L40
        L3f:
            return r2
        L40:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L4e
            boolean r6 = r7.booleanValue()     // Catch: java.lang.Throwable -> L4e
            r0.a = r6     // Catch: java.lang.Throwable -> L4e
        L48:
            r1.start()
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L4e:
            r6 = move-exception
            r1.start()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p71.t(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r5.d(r4) == r0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object u(java.lang.Object r5) {
        /*
            r4 = this;
            px5 r0 = px5.a
            byte r1 = r4.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            ybh.y(r5)
            goto L37
        L10:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            r4 = 0
            return r4
        L17:
            ybh.y(r5)
            goto L2a
        L1b:
            ybh.y(r5)
            java.lang.Object r5 = r4.v
            unb r5 = (unb) r5
            r4.u = r3
            java.lang.Object r5 = r5.Z(r4)
            if (r5 == r0) goto L36
        L2a:
            java.lang.Object r5 = r4.w
            lwg r5 = (lwg) r5
            r4.u = r2
            java.lang.Object r4 = r5.d(r4)
            if (r4 != r0) goto L37
        L36:
            return r0
        L37:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p71.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0068 -> B:13:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object v(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.w
            qdl r0 = (qdl) r0
            px5 r1 = px5.a
            byte r2 = r8.u
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L32
            if (r2 == r5) goto L2a
            if (r2 == r4) goto L22
            if (r2 != r3) goto L1b
            java.lang.Object r2 = r8.v
            k04 r2 = (k04) r2
            ybh.y(r9)
            goto L3f
        L1b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r8)
            r8 = 0
            return r8
        L22:
            java.lang.Object r2 = r8.v
            k04 r2 = (k04) r2
            ybh.y(r9)
            goto L5e
        L2a:
            java.lang.Object r2 = r8.v
            k04 r2 = (k04) r2
            ybh.y(r9)
            goto L49
        L32:
            ybh.y(r9)
            p04 r9 = r0.d
            r9.getClass()
            k04 r2 = new k04
            r2.<init>(r9)
        L3f:
            r8.v = r2
            r8.u = r5
            java.lang.Object r9 = r2.b(r8)
            if (r9 == r1) goto L6a
        L49:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L6b
            r2.c()
            r8.v = r2
            r8.u = r4
            java.lang.Object r9 = r0.a(r8)
            if (r9 == r1) goto L6a
        L5e:
            long r6 = rdl.a
            r8.v = r2
            r8.u = r3
            java.lang.Object r9 = nb6.q(r6, r8)
            if (r9 != r1) goto L3f
        L6a:
            return r1
        L6b:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p71.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r8 == r0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object w(java.lang.Object r8) {
        /*
            r7 = this;
            px5 r0 = px5.a
            byte r1 = r7.u
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            ybh.y(r8)     // Catch: android.database.SQLException -> L57
            goto L54
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r7)
            return r2
        L17:
            java.lang.Object r1 = r7.v
            j3g r1 = (j3g) r1
            ybh.y(r8)
            goto L31
        L1f:
            ybh.y(r8)
            java.lang.Object r8 = r7.v
            r1 = r8
            j3g r1 = (j3g) r1
            r7.v = r1
            r7.u = r4
            java.lang.Boolean r8 = r1.c(r7)
            if (r8 == r0) goto L53
        L31:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L3c
            v08 r7 = v08.a
            return r7
        L3c:
            s1m r8 = s1m.b     // Catch: android.database.SQLException -> L57
            r8h r4 = new r8h     // Catch: android.database.SQLException -> L57
            java.lang.Object r5 = r7.w     // Catch: android.database.SQLException -> L57
            g7m r5 = (g7m) r5     // Catch: android.database.SQLException -> L57
            r6 = 28
            r4.<init>(r6, r2, r5)     // Catch: android.database.SQLException -> L57
            r7.v = r2     // Catch: android.database.SQLException -> L57
            r7.u = r3     // Catch: android.database.SQLException -> L57
            java.lang.Object r8 = r1.e(r8, r4, r7)     // Catch: android.database.SQLException -> L57
            if (r8 != r0) goto L54
        L53:
            return r0
        L54:
            java.util.Set r8 = (java.util.Set) r8     // Catch: android.database.SQLException -> L57
            return r8
        L57:
            v08 r7 = v08.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p71.w(java.lang.Object):java.lang.Object");
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                return new p71((t71) this.v, (z8b) obj2, mt5Var, (byte) 0);
            case 1:
                return new p71((OperaApplication) this.v, (BrowserActivity) obj2, mt5Var, (byte) 1);
            case 2:
                return new p71((fr6) this.v, mt5Var, (bd5) obj2);
            case 3:
                return new p71((List) this.v, (tj4) obj2, mt5Var, (byte) 3);
            case 4:
                return new p71((unb) this.v, (p46) obj2, mt5Var, (byte) 4);
            case 5:
                return new p71((ie6) this.v, (dvd) obj2, mt5Var, (byte) 5);
            case 6:
                return new p71((byte) 6, mt5Var, obj2);
            case 7:
                return new p71((ggb) this.v, (String) obj2, mt5Var, (byte) 7);
            case 8:
                return new p71((g47) this.v, (h47) obj2, mt5Var, (byte) 8);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                p71 p71Var = new p71((byte) 9, mt5Var, obj2);
                p71Var.v = obj;
                return p71Var;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new p71((x47) this.v, (by5) obj2, mt5Var, (byte) 10);
            case 11:
                return new p71((Context) this.v, (EmojiPickerView) obj2, mt5Var, (byte) 11);
            case 12:
                p71 p71Var2 = new p71((byte) 12, mt5Var, obj2);
                p71Var2.v = obj;
                return p71Var2;
            case 13:
                return new p71((unb) this.v, (pca) obj2, mt5Var, (byte) 13);
            case 14:
                return new p71((byte) 14, mt5Var, obj2);
            case 15:
                return new p71((d3k) this.v, (acd) obj2, mt5Var, (byte) 15);
            case 16:
                p71 p71Var3 = new p71((byte) 16, mt5Var, obj2);
                p71Var3.v = obj;
                return p71Var3;
            case 17:
                return new p71((ece) this.v, (qfb) obj2, mt5Var, (byte) 17);
            case SizeUtil.textSize0_1 /* 18 */:
                p71 p71Var4 = new p71((byte) 18, mt5Var, obj2);
                p71Var4.v = obj;
                return p71Var4;
            case 19:
                return new p71((ghf) this.v, (kvh) obj2, mt5Var, (byte) 19);
            case SizeUtil.textSize0 /* 20 */:
                return new p71((o0i) this.v, (joc) obj2, mt5Var, (byte) 20);
            case 21:
                return new p71((rth) this.v, (OperaFirebaseMessagingService) obj2, mt5Var, (byte) 21);
            case SizeUtil.textSize1 /* 22 */:
                return new p71((q4i) this.v, (r4i) obj2, mt5Var, (byte) 22);
            case 23:
                return new p71((byte) 23, mt5Var, obj2);
            case SizeUtil.textSize2 /* 24 */:
                return new p71((byte) 24, mt5Var, obj2);
            case 25:
                return new p71((byte) 25, mt5Var, obj2);
            case 26:
                return new p71((unb) this.v, (lwg) obj2, mt5Var, (byte) 26);
            case 27:
                return new p71((byte) 27, mt5Var, obj2);
            case 28:
                p71 p71Var5 = new p71((byte) 28, mt5Var, obj2);
                p71Var5.v = obj;
                return p71Var5;
            default:
                p71 p71Var6 = new p71((byte) 29, mt5Var, obj2);
                p71Var6.v = obj;
                return p71Var6;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.t) {
            case 0:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 3:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 4:
                create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
                return px5.a;
            case 5:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 6:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 7:
                return create((yuk) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 8:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 11:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 12:
                create((z1h) obj, (mt5) obj2).invokeSuspend(Unit.a);
                return px5.a;
            case 13:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 14:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 15:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 16:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 17:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case SizeUtil.textSize0_1 /* 18 */:
                return create((l99) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 19:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case SizeUtil.textSize0 /* 20 */:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 21:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case SizeUtil.textSize1 /* 22 */:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 23:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case SizeUtil.textSize2 /* 24 */:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 25:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 26:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 27:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 28:
                return create((j3g) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((l99) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x02e0, code lost:
    
        if (r1 == r0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0086, code lost:
    
        if (j14.F(r0, r4, r33) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x04a9, code lost:
    
        if (kotlin.Unit.a != r13) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x050c, code lost:
    
        if (r1.w(r33) != r0) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x05d8, code lost:
    
        if (na2.Z(r1, r2, r33) == r0) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x061f, code lost:
    
        if (r0.f(r33) == r1) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0694, code lost:
    
        if (r2 == r1) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0775, code lost:
    
        if (r1.a(r2, r33) == r0) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x07a1, code lost:
    
        if (r1.a(r7, r33) == r0) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x07b6, code lost:
    
        if (r1.a(r2, r33) == r0) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x07f1, code lost:
    
        if (r0.l.W0((java.lang.String) r9, r33) == r1) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x088f, code lost:
    
        if (r0 == r1) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x08dc, code lost:
    
        if (r0 != r1) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x08e3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0954, code lost:
    
        if (nb6.p(500, r33) != r0) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x09b7, code lost:
    
        if (r0.Z(r33) != r1) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0a25, code lost:
    
        if (r1 == r0) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0a84, code lost:
    
        if (r0.j(r33) == r1) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0120, code lost:
    
        if (r0 != r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0197, code lost:
    
        if (j14.F(r0, r5, r33) == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0200, code lost:
    
        if (r0 == r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x021e, code lost:
    
        if (r0 != r1) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0949 A[Catch: all -> 0x095f, TryCatch #4 {all -> 0x095f, blocks: (B:440:0x08fe, B:462:0x0958, B:456:0x0941, B:458:0x0949, B:443:0x0907, B:444:0x090b, B:445:0x0913, B:453:0x0931, B:455:0x093a), top: B:552:0x08f2 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x0294 -> B:118:0x0259). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:459:0x0954 -> B:462:0x0958). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p71.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
