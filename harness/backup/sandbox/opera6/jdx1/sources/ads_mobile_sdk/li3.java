package ads_mobile_sdk;

import android.net.Uri;
import android.os.SystemClock;
import defpackage.d2i;
import defpackage.mip;
import defpackage.tso;
import defpackage.z2j;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class li3 implements rko, fkp {
    public final ux2 a;
    public final zm1 b;
    public final k8 c;
    public final uv2 d;
    public final Optional e;
    public final n13 f;
    public final a2 g;
    public final kh3 h;
    public final int i;
    public final mip j;
    public final k13 k;
    public final gn0 l;
    public final ve2 m;
    public final tso n;
    public final jk o;
    public final Set p;
    public final qr0 q;
    public final v31 r;
    public final ft1 s = new ft1(null);

    public li3(ux2 ux2Var, zm1 zm1Var, k8 k8Var, uv2 uv2Var, Optional optional, n13 n13Var, a2 a2Var, kh3 kh3Var, int i, mip mipVar, k13 k13Var, gn0 gn0Var, ve2 ve2Var, tso tsoVar, jk jkVar, Set set, qr0 qr0Var, v31 v31Var) {
        this.a = ux2Var;
        this.b = zm1Var;
        this.c = k8Var;
        this.d = uv2Var;
        this.e = optional;
        this.f = n13Var;
        this.g = a2Var;
        this.h = kh3Var;
        this.i = i;
        this.j = mipVar;
        this.k = k13Var;
        this.l = gn0Var;
        this.m = ve2Var;
        this.n = tsoVar;
        this.o = jkVar;
        this.p = set;
        this.q = qr0Var;
        this.r = v31Var;
    }

    public static void a(li3 li3Var, List list) {
        Boolean bool = Boolean.FALSE;
        uv2 uv2Var = li3Var.d;
        uv2Var.getClass();
        tv2.a(uv2Var.c, list, uv2Var.a, uv2Var.b, null, bool, 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.xp9 r18, mt5 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof ads_mobile_sdk.fi3
            if (r3 == 0) goto L1a
            r3 = r2
            ads_mobile_sdk.fi3 r3 = (ads_mobile_sdk.fi3) r3
            int r4 = r3.d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.d = r4
        L18:
            r15 = r3
            goto L22
        L1a:
            ads_mobile_sdk.fi3 r3 = new ads_mobile_sdk.fi3
            nt5 r2 = (nt5) r2
            r3.<init>(r0, r2)
            goto L18
        L22:
            java.lang.Object r2 = r15.b
            px5 r3 = px5.a
            int r4 = r15.d
            r5 = 1
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L34
            ads_mobile_sdk.li3 r0 = r15.a
            defpackage.ybh.y(r2)
            goto Lae
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r0)
            r0 = 0
            return r0
        L3b:
            defpackage.ybh.y(r2)
            nsd r2 = r1.Y
            if (r2 == 0) goto L4b
            java.lang.Integer r1 = r2.E()
            int r1 = r1.intValue()
            goto L4f
        L4b:
            wp9 r1 = r1.W
            byte r1 = r1.a
        L4f:
            ads_mobile_sdk.a2 r2 = r0.g
            java.util.ArrayList r2 = r2.W
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r6 = k95.o(r2, r6)
            r4.<init>(r6)
            int r6 = r2.size()
            r7 = 0
        L63:
            if (r7 >= r6) goto L8d
            java.lang.Object r8 = r2.get(r7)
            int r7 = r7 + 1
            android.net.Uri r8 = (android.net.Uri) r8
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "2."
            r9.<init>(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "@gw_mpe@"
            java.lang.String r8 = kotlin.text.c.o(r8, r10, r9)
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r4.add(r8)
            goto L63
        L8d:
            java.lang.Integer r8 = new java.lang.Integer
            int r1 = r0.i
            r8.<init>(r1)
            r15.a = r0
            r15.d = r5
            r14 = 0
            r16 = 1008(0x3f0, float:1.413E-42)
            r5 = r4
            ads_mobile_sdk.zm1 r4 = r0.b
            ads_mobile_sdk.n13 r6 = r0.f
            ads_mobile_sdk.a2 r7 = r0.g
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            java.lang.Object r2 = ads_mobile_sdk.zm1.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r2 != r3) goto Lae
            return r3
        Lae:
            java.util.List r2 = (java.util.List) r2
            a(r0, r2)
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.li3.a(xp9, mt5):java.lang.Object");
    }

    public final Unit a(d2i d2iVar, mt5 mt5Var) {
        ArrayList arrayList = this.g.f0;
        this.j.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        k13 k13Var = this.k;
        ji jiVar = k13Var.a;
        xtb[] xtbVarArr = k13.b;
        int i = 0;
        xtb xtbVar = xtbVarArr[0];
        z2j z2jVar = (z2j) jiVar.getValue(k13Var);
        String str = z2jVar != null ? z2jVar.a : null;
        ji jiVar2 = k13Var.a;
        xtb xtbVar2 = xtbVarArr[0];
        z2j z2jVar2 = (z2j) jiVar2.getValue(k13Var);
        String str2 = z2jVar2 != null ? z2jVar2.b : null;
        zm1 zm1Var = this.b;
        zm1Var.getClass();
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str3 = "";
            String strO = kotlin.text.c.o(((Uri) obj).toString(), "@gw_rwd_userid@", Uri.encode(str == null ? "" : str));
            if (str2 != null) {
                str3 = str2;
            }
            arrayList2.add(Uri.parse(kotlin.text.c.o(kotlin.text.c.o(kotlin.text.c.o(kotlin.text.c.o(kotlin.text.c.o(strO, "@gw_rwd_custom_data@", Uri.encode(str3)), "@gw_tmstmp@", String.valueOf(jElapsedRealtime)), "@gw_rwd_itm@", Uri.encode(d2iVar.getType())), "@gw_rwd_amt@", String.valueOf(d2iVar.getAmount())), "@gw_sdkver@", zm1Var.b)));
        }
        a(this, arrayList2);
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(mt5 r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof ads_mobile_sdk.ji3
            if (r0 == 0) goto L14
            r0 = r15
            ads_mobile_sdk.ji3 r0 = (ads_mobile_sdk.ji3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r12 = r0
            goto L1c
        L14:
            ads_mobile_sdk.ji3 r0 = new ads_mobile_sdk.ji3
            nt5 r15 = (nt5) r15
            r0.<init>(r14, r15)
            goto L12
        L1c:
            java.lang.Object r15 = r12.b
            px5 r0 = px5.a
            int r1 = r12.d
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            ads_mobile_sdk.li3 r14 = r12.a
            defpackage.ybh.y(r15)
            goto L5a
        L2d:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r14)
            r14 = 0
            return r14
        L34:
            defpackage.ybh.y(r15)
            ads_mobile_sdk.a2 r4 = r14.g
            r15 = r2
            java.util.ArrayList r2 = r4.i0
            java.lang.Integer r5 = new java.lang.Integer
            int r1 = r14.i
            r5.<init>(r1)
            r12.a = r14
            r12.d = r15
            r11 = 0
            r13 = 1008(0x3f0, float:1.413E-42)
            ads_mobile_sdk.zm1 r1 = r14.b
            ads_mobile_sdk.n13 r3 = r14.f
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.Object r15 = ads_mobile_sdk.zm1.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r15 != r0) goto L5a
            return r0
        L5a:
            java.util.List r15 = (java.util.List) r15
            a(r14, r15)
            kotlin.Unit r14 = kotlin.Unit.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.li3.f(mt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1 A[Catch: all -> 0x00e8, TryCatch #6 {all -> 0x00e8, blocks: (B:44:0x00ba, B:46:0x00c1, B:48:0x00c8, B:50:0x00cc, B:52:0x00d0, B:53:0x00d1, B:54:0x00d6, B:55:0x00d7, B:56:0x00de, B:57:0x00df, B:58:0x00e6, B:59:0x00e7), top: B:117:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7 A[Catch: all -> 0x00e8, TRY_LEAVE, TryCatch #6 {all -> 0x00e8, blocks: (B:44:0x00ba, B:46:0x00c1, B:48:0x00c8, B:50:0x00cc, B:52:0x00d0, B:53:0x00d1, B:54:0x00d6, B:55:0x00d7, B:56:0x00de, B:57:0x00df, B:58:0x00e6, B:59:0x00e7), top: B:117:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0146 A[Catch: all -> 0x016d, TryCatch #9 {all -> 0x016d, blocks: (B:83:0x013f, B:85:0x0146, B:87:0x014d, B:89:0x0151, B:91:0x0155, B:92:0x0156, B:93:0x015b, B:94:0x015c, B:95:0x0163, B:96:0x0164, B:97:0x016b, B:98:0x016c), top: B:122:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016c A[Catch: all -> 0x016d, TRY_LEAVE, TryCatch #9 {all -> 0x016d, blocks: (B:83:0x013f, B:85:0x0146, B:87:0x014d, B:89:0x0151, B:91:0x0155, B:92:0x0156, B:93:0x015b, B:94:0x015c, B:95:0x0163, B:96:0x0164, B:97:0x016b, B:98:0x016c), top: B:122:0x013f }] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v17, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(mt5 r18) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.li3.j(mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(mt5 r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof ads_mobile_sdk.ki3
            if (r0 == 0) goto L14
            r0 = r15
            ads_mobile_sdk.ki3 r0 = (ads_mobile_sdk.ki3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r12 = r0
            goto L1c
        L14:
            ads_mobile_sdk.ki3 r0 = new ads_mobile_sdk.ki3
            nt5 r15 = (nt5) r15
            r0.<init>(r14, r15)
            goto L12
        L1c:
            java.lang.Object r15 = r12.b
            px5 r0 = px5.a
            int r1 = r12.d
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            ads_mobile_sdk.li3 r14 = r12.a
            defpackage.ybh.y(r15)
            goto L5a
        L2d:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r14)
            r14 = 0
            return r14
        L34:
            defpackage.ybh.y(r15)
            ads_mobile_sdk.a2 r4 = r14.g
            r15 = r2
            java.util.ArrayList r2 = r4.j0
            java.lang.Integer r5 = new java.lang.Integer
            int r1 = r14.i
            r5.<init>(r1)
            r12.a = r14
            r12.d = r15
            r11 = 0
            r13 = 1008(0x3f0, float:1.413E-42)
            ads_mobile_sdk.zm1 r1 = r14.b
            ads_mobile_sdk.n13 r3 = r14.f
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.Object r15 = ads_mobile_sdk.zm1.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r15 != r0) goto L5a
            return r0
        L5a:
            java.util.List r15 = (java.util.List) r15
            a(r14, r15)
            kotlin.Unit r14 = kotlin.Unit.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.li3.k(mt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0136, code lost:
    
        if (r1 == r3) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0104 -> B:53:0x0106). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(mt5 r22) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.li3.n(mt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c3, code lost:
    
        if (r1 != r3) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0137 -> B:56:0x013c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(mt5 r24) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.li3.q(mt5):java.lang.Object");
    }
}
