package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class xbl {
    public static final dk7 a = new dk7(3, null, 3);

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.uuk r5, boolean r6, defpackage.gmg r7, z53 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.obl
            if (r0 == 0) goto L13
            r0 = r8
            obl r0 = (defpackage.obl) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            obl r0 = new obl
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.w
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L31
            boolean r5 = r0.v
            gmg r6 = r0.u
            uuk r7 = r0.t
            defpackage.ybh.y(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            r5 = 0
            return r5
        L38:
            defpackage.ybh.y(r8)
        L3b:
            r0.t = r5
            r0.u = r7
            r0.v = r6
            r0.x = r3
            java.lang.Object r8 = r5.a(r7, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            fmg r8 = (defpackage.fmg) r8
            boolean r2 = e(r8, r6)
            if (r2 == 0) goto L3b
            java.util.List r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbl.a(uuk, boolean, gmg, z53):java.lang.Object");
    }

    public static /* synthetic */ Object b(uuk uukVar, z53 z53Var, int i) {
        gmg gmgVar = gmg.a;
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            gmgVar = gmg.b;
        }
        return a(uukVar, z, gmgVar, z53Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[LOOP:0: B:19:0x004d->B:20:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.uuk r8, nt5 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.pbl
            if (r0 == 0) goto L13
            r0 = r9
            pbl r0 = (defpackage.pbl) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            pbl r0 = new pbl
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.u
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            uuk r8 = r0.t
            defpackage.ybh.y(r9)
            goto L40
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            r8 = 0
            return r8
        L30:
            defpackage.ybh.y(r9)
        L33:
            r0.t = r8
            r0.v = r3
            gmg r9 = defpackage.gmg.b
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L40
            return r1
        L40:
            fmg r9 = (defpackage.fmg) r9
            java.util.List r2 = r9.a
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
            r6 = r5
        L4d:
            if (r6 >= r4) goto L5b
            java.lang.Object r7 = r2.get(r6)
            lmg r7 = (defpackage.lmg) r7
            r7.a()
            int r6 = r6 + 1
            goto L4d
        L5b:
            java.util.List r9 = r9.a
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L64:
            if (r5 >= r2) goto L73
            java.lang.Object r4 = r9.get(r5)
            lmg r4 = (defpackage.lmg) r4
            boolean r4 = r4.d
            if (r4 != 0) goto L33
            int r5 = r5 + 1
            goto L64
        L73:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbl.c(uuk, nt5):java.lang.Object");
    }

    public static Object d(pmg pmgVar, Function1 function1, mt5 mt5Var) {
        Object objQ = sgb.q(new bhj((Object) pmgVar, (Serializable) a, (Object) function1, (mt5) null, (byte) 3), mt5Var);
        return objQ == px5.a ? objQ : Unit.a;
    }

    public static boolean e(fmg fmgVar, boolean z) {
        List list = fmgVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            lmg lmgVar = (lmg) list.get(i);
            if (!(z ? wxe.j(lmgVar) : wxe.k(lmgVar))) {
                return false;
            }
        }
        return true;
    }

    public static d3k f(nx5 nx5Var, unb unbVar, Function2 function2) {
        return na2.B(nx5Var, null, rx5.d, new sbl((Object) unbVar, (Object) function2, (mt5) null, (byte) 0), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.uuk r20, nx5 r21, defpackage.lwg r22, defpackage.dk7 r23, kotlin.jvm.functions.Function1 r24, z53 r25) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbl.g(uuk, nx5, lwg, dk7, kotlin.jvm.functions.Function1, z53):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.uuk r8, defpackage.gmg r9, nt5 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.vbl
            if (r0 == 0) goto L13
            r0 = r10
            vbl r0 = (defpackage.vbl) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            vbl r0 = new vbl
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.u
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            pqh r8 = r0.t
            defpackage.ybh.y(r10)     // Catch: defpackage.hmg -> L55
            goto L52
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r3
        L30:
            pqh r10 = sko.f(r10)
            v0d r2 = defpackage.v0d.a
            r10.a = r2
            u5n r2 = r8.f()     // Catch: defpackage.hmg -> L55
            long r5 = r2.b()     // Catch: defpackage.hmg -> L55
            bj9 r2 = new bj9     // Catch: defpackage.hmg -> L55
            r7 = 2
            r2.<init>(r9, r10, r3, r7)     // Catch: defpackage.hmg -> L55
            r0.t = r10     // Catch: defpackage.hmg -> L55
            r0.v = r4     // Catch: defpackage.hmg -> L55
            java.lang.Object r8 = r8.h(r5, r2, r0)     // Catch: defpackage.hmg -> L55
            if (r8 != r1) goto L51
            return r1
        L51:
            r8 = r10
        L52:
            java.lang.Object r8 = r8.a
            return r8
        L55:
            x0d r8 = defpackage.x0d.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbl.h(uuk, gmg, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if (r0 == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ce, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b1 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.uuk r17, defpackage.gmg r18, z53 r19) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbl.i(uuk, gmg, z53):java.lang.Object");
    }
}
