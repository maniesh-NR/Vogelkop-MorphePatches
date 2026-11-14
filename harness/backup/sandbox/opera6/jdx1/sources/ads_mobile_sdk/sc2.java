package ads_mobile_sdk;

import defpackage.cth;
import defpackage.fjp;
import defpackage.fsg;
import defpackage.p3p;
import defpackage.skp;
import defpackage.snp;
import defpackage.vtp;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class sc2 {
    public final nx5 a;
    public final ae2 b;
    public final fjp c;
    public final Map d;
    public final v5 e;
    public final ux2 f;
    public final skp g;
    public final zm1 h;
    public final tv2 i;
    public final p22 j;
    public final ah3 k;
    public final pfe l = new pfe();
    public final LinkedHashSet m = new LinkedHashSet();

    public sc2(nx5 nx5Var, ae2 ae2Var, fjp fjpVar, Map map, v5 v5Var, ux2 ux2Var, skp skpVar, zm1 zm1Var, tv2 tv2Var, p22 p22Var, ah3 ah3Var) {
        this.a = nx5Var;
        this.b = ae2Var;
        this.c = fjpVar;
        this.d = map;
        this.e = v5Var;
        this.f = ux2Var;
        this.g = skpVar;
        this.h = zm1Var;
        this.i = tv2Var;
        this.j = p22Var;
        this.k = ah3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0118, code lost:
    
        if (r1 != r3) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fa A[PHI: r0 r2 r4 r8 r9 r10 r11
      0x00fa: PHI (r0v2 int) = (r0v3 int), (r0v9 int) binds: [B:28:0x00f8, B:17:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r2v4 ads_mobile_sdk.mc2) = (r2v5 ads_mobile_sdk.mc2), (r2v2 ads_mobile_sdk.mc2) binds: [B:28:0x00f8, B:17:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r4v2 int) = (r4v3 int), (r4v9 int) binds: [B:28:0x00f8, B:17:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r8v5 java.lang.String) = (r8v6 java.lang.String), (r8v12 java.lang.String) binds: [B:28:0x00f8, B:17:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r9v2 ads_mobile_sdk.av2) = (r9v3 ads_mobile_sdk.av2), (r9v9 ads_mobile_sdk.av2) binds: [B:28:0x00f8, B:17:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r10v2 hp) = (r10v3 hp), (r10v9 hp) binds: [B:28:0x00f8, B:17:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00fa: PHI (r11v1 ads_mobile_sdk.sc2) = (r11v2 ads_mobile_sdk.sc2), (r11v9 ads_mobile_sdk.sc2) binds: [B:28:0x00f8, B:17:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0118 -> B:14:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.sc2 r16, defpackage.hp r17, ads_mobile_sdk.av2 r18, java.lang.String r19, int r20, nt5 r21) throws m2 {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sc2.a(ads_mobile_sdk.sc2, hp, ads_mobile_sdk.av2, java.lang.String, int, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:13:0x0032, B:26:0x00b1, B:31:0x00c2, B:30:0x00bd), top: B:40:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.sc2 r9, kotlin.Pair r10, nt5 r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sc2.a(ads_mobile_sdk.sc2, kotlin.Pair, nt5):java.lang.Object");
    }

    public final int a(defpackage.hp hpVar, av2 av2Var) {
        int iA = this.b.a(hpVar, av2Var);
        if (iA == 0) {
            fjp fjpVar = this.c;
            fjpVar.getClass();
            iA = (((Boolean) fjpVar.a("gads:pc:enable_cache_fill_on_cellular", Boolean.TRUE, fo.a)).booleanValue() || this.j.n.get() != 0) ? 0 : 5;
        }
        if (iA == 0) {
            return iA;
        }
        ux2 ux2Var = this.f;
        fw0 fw0Var = fw0.CUI_NAME_PERSISTENT_CACHE_FILL_CHECK;
        l08 l08Var = l08.a;
        kh3 kh3Var = new kh3(new eq2(), new ih1(), new dt2(), new s8());
        if (hh3.b().a != null) {
            rg3 rg3VarA = hh3.a(fw0Var, l08Var, true);
            try {
                rg3 rg3VarA2 = hh3.a();
                ub2 ub2VarE = rg3VarA2.e();
                snp snpVarO = cc2.o();
                snpVarO.b(iA);
                ub2VarE.N = (cc2) snpVarO.a();
                rg3VarA2.a.a.c = av2Var;
                rg3VarA.close();
                return iA;
            } catch (Throwable th) {
                try {
                    rg3VarA.b(th);
                    if (th instanceof iyo) {
                        throw th;
                    }
                    rg3VarA.a(th);
                    if (th instanceof kql) {
                        throw new uw0((kql) th);
                    }
                    if (th instanceof CancellationException) {
                        throw new ou0(th);
                    }
                    if (th instanceof mv0) {
                        throw th;
                    }
                    throw new tu0(th);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        vtp.v(rg3VarA, th2);
                        throw th3;
                    }
                }
            }
        }
        wk2 wk2VarA = ux2.a(ux2Var, fw0Var, l08Var, kh3Var);
        try {
            rg3 rg3VarA3 = hh3.a();
            ub2 ub2VarE2 = rg3VarA3.e();
            snp snpVarO2 = cc2.o();
            snpVarO2.b(iA);
            ub2VarE2.N = (cc2) snpVarO2.a();
            rg3VarA3.a.a.c = av2Var;
            wk2VarA.close();
            return iA;
        } catch (Throwable th4) {
            try {
                wk2VarA.b(th4);
                if (th4 instanceof iyo) {
                    throw th4;
                }
                wk2VarA.a(th4);
                if (th4 instanceof kql) {
                    throw new uw0((kql) th4);
                }
                if (th4 instanceof CancellationException) {
                    throw new ou0(th4);
                }
                if (th4 instanceof mv0) {
                    throw th4;
                }
                throw new tu0(th4);
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02fc, code lost:
    
        if (r25.a(r13, r3, r0, r6, r2) != r5) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0134, code lost:
    
        if (r13.a(r1, (ads_mobile_sdk.j13) null, r0, r6, r2) != r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0171, code lost:
    
        if (r13.a(r1, r3, "Failed to get ad config from server response", r6, r0) != r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01f5, code lost:
    
        if (r10 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0212, code lost:
    
        if (r10 == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0215, code lost:
    
        if (r15 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0284, code lost:
    
        if (r18.a(r6, r2, r0, r22, r1) != r5) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0289  */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [ads_mobile_sdk.sc2, hp, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum a(defpackage.hp r27, ads_mobile_sdk.av2 r28, java.lang.String r29, int r30, ads_mobile_sdk.jc2 r31, nt5 r32) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sc2.a(hp, ads_mobile_sdk.av2, java.lang.String, int, ads_mobile_sdk.jc2, nt5):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02a1 A[Catch: all -> 0x02c8, TryCatch #2 {all -> 0x02c8, blocks: (B:100:0x029a, B:102:0x02a1, B:104:0x02a8, B:106:0x02ac, B:108:0x02b0, B:109:0x02b1, B:110:0x02b6, B:111:0x02b7, B:112:0x02be, B:113:0x02bf, B:114:0x02c6, B:115:0x02c7), top: B:128:0x029a }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c7 A[Catch: all -> 0x02c8, TRY_LEAVE, TryCatch #2 {all -> 0x02c8, blocks: (B:100:0x029a, B:102:0x02a1, B:104:0x02a8, B:106:0x02ac, B:108:0x02b0, B:109:0x02b1, B:110:0x02b6, B:111:0x02b7, B:112:0x02be, B:113:0x02bf, B:114:0x02c6, B:115:0x02c7), top: B:128:0x029a }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0147 A[Catch: all -> 0x016e, TryCatch #6 {all -> 0x016e, blocks: (B:42:0x0140, B:44:0x0147, B:46:0x014e, B:48:0x0152, B:50:0x0156, B:51:0x0157, B:52:0x015c, B:53:0x015d, B:54:0x0164, B:55:0x0165, B:56:0x016c, B:57:0x016d), top: B:135:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016d A[Catch: all -> 0x016e, TRY_LEAVE, TryCatch #6 {all -> 0x016e, blocks: (B:42:0x0140, B:44:0x0147, B:46:0x014e, B:48:0x0152, B:50:0x0156, B:51:0x0157, B:52:0x015c, B:53:0x015d, B:54:0x0164, B:55:0x0165, B:56:0x016c, B:57:0x016d), top: B:135:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0292  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01c9 -> B:90:0x0283). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0271 -> B:89:0x027a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x028a -> B:23:0x00d7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum a(defpackage.hp r23, ads_mobile_sdk.av2 r24, java.lang.String r25, int r26, nt5 r27) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sc2.a(hp, ads_mobile_sdk.av2, java.lang.String, int, nt5):java.lang.Enum");
    }

    public final Unit a(jc2 jc2Var, j13 j13Var, String str, int i, rm0 rm0Var) {
        mt5 mt5Var = null;
        if (j13Var != null) {
            n13 n13Var = new n13(new f13(jc2Var.b), j13Var);
            a2 a2Var = (a2) CollectionsKt.firstOrNull(j13Var.a);
            pn7.b.getClass();
            pc2 pc2Var = new pc2(this, j13Var.b.m, n13Var, null, i, t0h.f(a2Var, rm0Var, 0L, (Integer) null), null);
            defpackage.na2.B(this.a, h.a, null, new fsg(pc2Var, mt5Var, (byte) 3), 2);
        }
        int i2 = jc2Var.d;
        int i3 = jc2Var.a;
        if (i2 < i3) {
            xh3.a(str, null, 6);
        } else {
            xh3.a(p3p.j(i3, "Terminal failure after ", " attempts: ", str), null, 6);
        }
        return Unit.a;
    }

    public final void a(defpackage.hp hpVar, av2 av2Var, int i) {
        if (this.b.b(hpVar, av2Var) && a(hpVar, av2Var) == 0) {
            cth cthVar = new cth(this, av2Var, hpVar, i, (mt5) null);
            defpackage.na2.B(this.a, h.a, null, new fsg(cthVar, null, (byte) 3), 2);
        }
    }
}
