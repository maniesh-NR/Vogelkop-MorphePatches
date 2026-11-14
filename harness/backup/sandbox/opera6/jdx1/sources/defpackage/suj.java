package defpackage;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class suj {
    public final Function1 a;
    public Object b;
    public zde c;
    public boolean j;
    public int k;
    public int d = -1;
    public final see e = n6h.e();
    public final see f = new see();
    public final tee g = new tee();
    public final dfe h = new dfe(new i37[16]);
    public final ut9 i = new ut9(this, (byte) 1);
    public final see l = n6h.e();
    public final HashMap m = new HashMap();

    public suj(Function1 function1) {
        this.a = function1;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean a(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.suj.a(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r21, int r22, java.lang.Object r23, defpackage.zde r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r0.k
            if (r4 > 0) goto La2
            int r4 = r3.c(r1)
            if (r4 >= 0) goto L15
            int r4 = ~r4
            r6 = -1
            goto L19
        L15:
            int[] r6 = r3.c
            r6 = r6[r4]
        L19:
            java.lang.Object[] r7 = r3.b
            r7[r4] = r1
            int[] r3 = r3.c
            r3[r4] = r2
            boolean r3 = r1 instanceof defpackage.i37
            r4 = 2
            if (r3 == 0) goto L8e
            if (r6 == r2) goto L8e
            r2 = r1
            i37 r2 = (defpackage.i37) r2
            h37 r2 = r2.i()
            java.util.HashMap r3 = r0.m
            java.lang.Object r7 = r2.f
            r3.put(r1, r7)
            zde r2 = r2.e
            see r3 = r0.l
            n6h.n(r3, r1)
            java.lang.Object[] r7 = r2.b
            long[] r2 = r2.a
            int r8 = r2.length
            int r8 = r8 - r4
            if (r8 < 0) goto L8e
            r10 = 0
        L46:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L89
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L60:
            if (r15 >= r13) goto L87
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L83
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r7[r16]
            r9 = r16
            vak r9 = (defpackage.vak) r9
            boolean r5 = r9 instanceof defpackage.wak
            if (r5 == 0) goto L80
            r5 = r9
            wak r5 = (defpackage.wak) r5
            r5.g(r4)
        L80:
            n6h.c(r3, r9, r1)
        L83:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L60
        L87:
            if (r13 != r14) goto L8e
        L89:
            if (r10 == r8) goto L8e
            int r10 = r10 + 1
            goto L46
        L8e:
            r2 = -1
            if (r6 != r2) goto La2
            boolean r2 = r1 instanceof defpackage.wak
            if (r2 == 0) goto L9b
            r2 = r1
            wak r2 = (defpackage.wak) r2
            r2.g(r4)
        L9b:
            see r0 = r0.e
            r2 = r23
            n6h.c(r0, r1, r2)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.suj.b(java.lang.Object, int, java.lang.Object, zde):void");
    }

    public final void c(Object obj, Object obj2) {
        see seeVar = this.e;
        n6h.l(seeVar, obj2, obj);
        if (!(obj2 instanceof i37) || seeVar.c(obj2)) {
            return;
        }
        n6h.n(this.l, obj2);
        this.m.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(w5f r34) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.suj.d(w5f):void");
    }
}
