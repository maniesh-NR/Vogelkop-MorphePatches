package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class fme implements hz8 {
    public final String a;
    public final vrf b;
    public final zyk c;
    public final zyk d;
    public final zyk e;
    public final u7b f;
    public final zyk g;

    public fme(String str, vrf vrfVar, zyk zykVar, zyk zykVar2, zyk zykVar3, u7b u7bVar, zyk zykVar4) {
        this.a = str;
        this.b = vrfVar;
        this.c = zykVar;
        this.d = zykVar2;
        this.e = zykVar3;
        this.f = u7bVar;
        this.g = zykVar4;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r4 == 0) goto Lc
            java.lang.String r1 = "text/plain"
            r2 = 0
            boolean r1 = kotlin.text.c.q(r4, r1, r2)
            if (r1 == 0) goto L4f
        Lc:
            boolean r1 = kotlin.text.StringsKt.N(r3)
            if (r1 != 0) goto L32
            r1 = 35
            java.lang.String r3 = kotlin.text.StringsKt.i0(r3, r1)
            r1 = 63
            java.lang.String r3 = kotlin.text.StringsKt.i0(r3, r1)
            r1 = 47
            java.lang.String r3 = kotlin.text.StringsKt.f0(r1, r3, r3)
            r1 = 46
            java.lang.String r2 = ""
            java.lang.String r3 = kotlin.text.StringsKt.f0(r1, r3, r2)
            boolean r1 = kotlin.text.StringsKt.N(r3)
            if (r1 == 0) goto L34
        L32:
            r1 = r0
            goto L4c
        L34:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r1)
            u9d r1 = defpackage.ezd.a
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L4c
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = r1.getMimeTypeFromExtension(r3)
        L4c:
            if (r1 == 0) goto L4f
            return r1
        L4f:
            if (r4 == 0) goto L58
            r3 = 59
            java.lang.String r3 = kotlin.text.StringsKt.g0(r4, r3)
            return r3
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fme.d(java.lang.String, java.lang.String):java.lang.String");
    }

    public static void f(poe poeVar) {
        int i = poeVar.a;
        if ((200 > i || i >= 300) && i != 304) {
            throw new e22(sko.i(i, "HTTP "));
        }
    }

    @Override // defpackage.hz8
    public final Object a(l38 l38Var) {
        gkm gkmVar = (gkm) this.g.getValue();
        this.b.getClass();
        s2e s2eVar = new s2e(1, this, fme.class, "doFetch", "doFetch(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 7);
        gkmVar.getClass();
        return s2eVar.invoke(l38Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01cc, code lost:
    
        if (r0 == r8) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0 A[Catch: Exception -> 0x01d2, TryCatch #3 {Exception -> 0x01d2, blocks: (B:15:0x003c, B:75:0x01cf, B:20:0x004d, B:70:0x01aa, B:72:0x01ae, B:54:0x0140, B:56:0x0146, B:62:0x0170, B:64:0x0176, B:66:0x0184, B:67:0x0189, B:68:0x018a, B:39:0x00c9, B:41:0x00d0, B:43:0x00de, B:45:0x00f0, B:47:0x00fa, B:49:0x010e, B:51:0x011a, B:59:0x0167, B:60:0x016e), top: B:88:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0176 A[Catch: Exception -> 0x01d2, TryCatch #3 {Exception -> 0x01d2, blocks: (B:15:0x003c, B:75:0x01cf, B:20:0x004d, B:70:0x01aa, B:72:0x01ae, B:54:0x0140, B:56:0x0146, B:62:0x0170, B:64:0x0176, B:66:0x0184, B:67:0x0189, B:68:0x018a, B:39:0x00c9, B:41:0x00d0, B:43:0x00de, B:45:0x00f0, B:47:0x00fa, B:49:0x010e, B:51:0x011a, B:59:0x0167, B:60:0x016e), top: B:88:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01aa A[Catch: Exception -> 0x01d2, PHI: r0 r1
      0x01aa: PHI (r0v30 java.lang.Object) = (r0v20 java.lang.Object), (r0v1 java.lang.Object) binds: [B:69:0x01a8, B:20:0x004d] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r1v10 pqh) = (r1v8 pqh), (r1v16 pqh) binds: [B:69:0x01a8, B:20:0x004d] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {Exception -> 0x01d2, blocks: (B:15:0x003c, B:75:0x01cf, B:20:0x004d, B:70:0x01aa, B:72:0x01ae, B:54:0x0140, B:56:0x0146, B:62:0x0170, B:64:0x0176, B:66:0x0184, B:67:0x0189, B:68:0x018a, B:39:0x00c9, B:41:0x00d0, B:43:0x00de, B:45:0x00f0, B:47:0x00fa, B:49:0x010e, B:51:0x011a, B:59:0x0167, B:60:0x016e), top: B:88:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ae A[Catch: Exception -> 0x01d2, TryCatch #3 {Exception -> 0x01d2, blocks: (B:15:0x003c, B:75:0x01cf, B:20:0x004d, B:70:0x01aa, B:72:0x01ae, B:54:0x0140, B:56:0x0146, B:62:0x0170, B:64:0x0176, B:66:0x0184, B:67:0x0189, B:68:0x018a, B:39:0x00c9, B:41:0x00d0, B:43:0x00de, B:45:0x00f0, B:47:0x00fa, B:49:0x010e, B:51:0x011a, B:59:0x0167, B:60:0x016e), top: B:88:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(mt5 r23) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fme.b(mt5):java.lang.Object");
    }

    public final g29 c() {
        g29 g29Var;
        vlh vlhVar = (vlh) this.d.getValue();
        return (vlhVar == null || (g29Var = vlhVar.a) == null) ? this.b.e : g29Var;
    }

    public final joe e() {
        xm5 xm5Var = cza.b;
        vrf vrfVar = this.b;
        Object objK = xf8.K(vrfVar, xm5Var);
        j74 j74Var = vrfVar.g;
        one oneVar = (one) objK;
        oneVar.getClass();
        Map map = oneVar.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        boolean z = j74Var.a;
        if (vrfVar.h.a && ((pm5) this.f.a).a()) {
            if (!z) {
                if (j74Var.b) {
                    linkedHashMap.put("Cache-Control".toLowerCase(Locale.ROOT), j95.j(new String[]{"no-cache"}));
                } else {
                    linkedHashMap.put("Cache-Control".toLowerCase(Locale.ROOT), j95.j(new String[]{"no-cache, no-store"}));
                }
            }
        } else if (z) {
            linkedHashMap.put("Cache-Control".toLowerCase(Locale.ROOT), j95.j(new String[]{"only-if-cached, max-stale=2147483647"}));
        } else if (!z) {
            linkedHashMap.put("Cache-Control".toLowerCase(Locale.ROOT), j95.j(new String[]{"no-cache, only-if-cached"}));
        }
        String str = (String) xf8.K(vrfVar, cza.a);
        one oneVar2 = new one(rbd.i(linkedHashMap));
        if (xf8.K(vrfVar, cza.c) == null) {
            return new joe(this.a, str, oneVar2, vrfVar.i);
        }
        h9o.t();
        return null;
    }

    public final j19 g(ulh ulhVar) {
        ca7 ca7Var = ulhVar.a;
        if (ca7Var.b) {
            qp2.n("snapshot is closed");
            return null;
        }
        w6g w6gVar = (w6g) ca7Var.a.c.get(1);
        g29 g29VarC = c();
        this.b.getClass();
        return qbe.c(w6gVar, g29VarC, this.a, ulhVar, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(iyb r6, nt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cme
            if (r0 == 0) goto L13
            r0 = r7
            cme r0 = (defpackage.cme) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            cme r0 = new cme
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            d04 r6 = r0.t
            defpackage.ybh.y(r7)
            goto L46
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L30:
            defpackage.ybh.y(r7)
            d04 r7 = new d04
            r7.<init>()
            r0.t = r7
            r0.w = r4
            d44 r6 = r6.a
            java.lang.Object r6 = dyg.s(r6, r7, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r6 = r7
        L46:
            g29 r5 = r5.c()
            jwj r7 = new jwj
            r7.<init>(r6, r5, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fme.h(iyb, nt5):java.lang.Object");
    }

    public final poe i(ulh ulhVar) throws Throwable {
        Throwable th;
        poe poeVarX0;
        try {
            g29 g29VarC = c();
            ca7 ca7Var = ulhVar.a;
            if (ca7Var.b) {
                throw new IllegalStateException("snapshot is closed");
            }
            tlh tlhVar = new tlh(g29VarC.source((w6g) ca7Var.a.c.get(0)));
            try {
                poeVarX0 = o0g.x0(tlhVar);
                try {
                    tlhVar.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    tlhVar.close();
                } catch (Throwable th4) {
                    wf8.a(th3, th4);
                }
                th = th3;
                poeVarX0 = null;
            }
            if (th == null) {
                return poeVarX0;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0221 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x024c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0256 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.ulh r24, defpackage.poe r25, defpackage.poe r26, nt5 r27) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fme.j(ulh, poe, poe, nt5):java.lang.Object");
    }
}
