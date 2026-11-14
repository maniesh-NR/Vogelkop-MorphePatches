package ads_mobile_sdk;

import defpackage.mip;
import defpackage.o0g;
import defpackage.y8p;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class xa2 {
    public final nx5 a;
    public final CoroutineContext b;
    public final lu2 c;
    public final mip d;
    public final mt2 e;
    public final y8p f;
    public ArrayList g;
    public n13 h;
    public hv0 j;
    public boolean l;
    public ynb o;
    public ArrayList p;
    public final pfe i = new pfe();
    public int k = Integer.MAX_VALUE;
    public final HashSet m = new HashSet();
    public final ArrayList n = new ArrayList();

    public xa2(nx5 nx5Var, CoroutineContext coroutineContext, lu2 lu2Var, mip mipVar, mt2 mt2Var, y8p y8pVar) {
        this.a = nx5Var;
        this.b = coroutineContext;
        this.c = lu2Var;
        this.d = mipVar;
        this.e = mt2Var;
        this.f = y8pVar;
        ynb ynbVarE = o0g.e();
        ynbVarE.B0();
        this.o = ynbVarE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e3, code lost:
    
        if (r15 == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0136, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Path cross not found for [B:55:0x00fe, B:60:0x0114], limit reached: 88 */
    /* JADX WARN: Path cross not found for [B:60:0x0114, B:55:0x00fe], limit reached: 88 */
    /* JADX WARN: Path cross not found for [B:64:0x011b, B:66:0x0121], limit reached: 88 */
    /* JADX WARN: Path cross not found for [B:66:0x0121, B:64:0x011b], limit reached: 88 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[PHI: r14 r15
      0x005a: PHI (r14v7 ads_mobile_sdk.xa2) = (r14v11 ads_mobile_sdk.xa2), (r14v16 ads_mobile_sdk.xa2) binds: [B:25:0x006d, B:21:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x005a: PHI (r15v19 java.lang.Object) = (r15v21 java.lang.Object), (r15v1 java.lang.Object) binds: [B:25:0x006d, B:21:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2 A[Catch: all -> 0x0153, TryCatch #1 {all -> 0x0153, blocks: (B:15:0x0036, B:49:0x00e6, B:51:0x00ea, B:36:0x009e, B:38:0x00a2, B:39:0x00a7, B:41:0x00bb, B:43:0x00c1, B:45:0x00c5, B:46:0x00ce), top: B:83:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5 A[Catch: all -> 0x0153, TryCatch #1 {all -> 0x0153, blocks: (B:15:0x0036, B:49:0x00e6, B:51:0x00ea, B:36:0x009e, B:38:0x00a2, B:39:0x00a7, B:41:0x00bb, B:43:0x00c1, B:45:0x00c5, B:46:0x00ce), top: B:83:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce A[Catch: all -> 0x0153, TryCatch #1 {all -> 0x0153, blocks: (B:15:0x0036, B:49:0x00e6, B:51:0x00ea, B:36:0x009e, B:38:0x00a2, B:39:0x00a7, B:41:0x00bb, B:43:0x00c1, B:45:0x00c5, B:46:0x00ce), top: B:83:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe A[Catch: all -> 0x0151, TryCatch #0 {all -> 0x0151, blocks: (B:53:0x00f6, B:55:0x00fe, B:57:0x0105, B:73:0x013b, B:60:0x0114, B:64:0x011b, B:66:0x0121, B:68:0x0128), top: B:81:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011b A[Catch: all -> 0x0151, TryCatch #0 {all -> 0x0151, blocks: (B:53:0x00f6, B:55:0x00fe, B:57:0x0105, B:73:0x013b, B:60:0x0114, B:64:0x011b, B:66:0x0121, B:68:0x0128), top: B:81:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0128 A[Catch: all -> 0x0151, TryCatch #0 {all -> 0x0151, blocks: (B:53:0x00f6, B:55:0x00fe, B:57:0x0105, B:73:0x013b, B:60:0x0114, B:64:0x011b, B:66:0x0121, B:68:0x0128), top: B:81:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013b A[Catch: all -> 0x0151, TRY_LEAVE, TryCatch #0 {all -> 0x0151, blocks: (B:53:0x00f6, B:55:0x00fe, B:57:0x0105, B:73:0x013b, B:60:0x0114, B:64:0x011b, B:66:0x0121, B:68:0x0128), top: B:81:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00b9 -> B:52:0x00f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00bf -> B:52:0x00f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c5 -> B:52:0x00f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00e3 -> B:49:0x00e6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.xa2 r14, nt5 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xa2.a(ads_mobile_sdk.xa2, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        r1 = r0.e;
        r5.a = r0;
        r5.b = r2;
        r5.c = r14;
        r5.d = r15;
        r5.h = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cf, code lost:
    
        if (r1.a(r2, r5) == r10) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0171 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f0 A[EXC_TOP_SPLITTER, PHI: r0 r1 r2 r3 r7
      0x00f0: PHI (r0v4 ads_mobile_sdk.xa2) = (r0v3 ads_mobile_sdk.xa2), (r0v15 ads_mobile_sdk.xa2) binds: [B:45:0x00ee, B:26:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r1v11 mip) = (r1v10 mip), (r1v15 mip) binds: [B:45:0x00ee, B:26:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r2v2 ads_mobile_sdk.a2) = (r2v1 ads_mobile_sdk.a2), (r2v7 ads_mobile_sdk.a2) binds: [B:45:0x00ee, B:26:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r3v10 long) = (r3v9 long), (r3v13 long) binds: [B:45:0x00ee, B:26:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x00f0: PHI (r7v3 java.lang.Object) = (r7v2 java.lang.Object), (r7v9 java.lang.Object) binds: [B:45:0x00ee, B:26:0x0069] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.a2 r22, nt5 r23) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xa2.a(ads_mobile_sdk.a2, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c2, code lost:
    
        if (ads_mobile_sdk.lu2.a(r7, r2, r0) != r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2 A[Catch: all -> 0x00ed, TRY_LEAVE, TryCatch #4 {all -> 0x00ed, blocks: (B:14:0x0032, B:37:0x00dc, B:39:0x00e2, B:19:0x0049, B:22:0x0059), top: B:77:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100 A[Catch: all -> 0x0127, TryCatch #2 {all -> 0x0127, blocks: (B:48:0x00f9, B:50:0x0100, B:52:0x0107, B:54:0x010b, B:56:0x010f, B:57:0x0110, B:58:0x0115, B:59:0x0116, B:60:0x011d, B:61:0x011e, B:62:0x0125, B:63:0x0126), top: B:74:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0126 A[Catch: all -> 0x0127, TRY_LEAVE, TryCatch #2 {all -> 0x0127, blocks: (B:48:0x00f9, B:50:0x0100, B:52:0x0107, B:54:0x010b, B:56:0x010f, B:57:0x0110, B:58:0x0115, B:59:0x0116, B:60:0x011d, B:61:0x011e, B:62:0x0125, B:63:0x0126), top: B:74:0x00f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [ads_mobile_sdk.xa2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v5, types: [ads_mobile_sdk.xa2] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v19, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.n13 r11, nt5 r12) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xa2.a(ads_mobile_sdk.n13, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r9 != r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074 A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #1 {all -> 0x00ad, blocks: (B:27:0x006c, B:29:0x0074, B:20:0x004b), top: B:48:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00a5 -> B:24:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.na2
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.na2 r0 = (ads_mobile_sdk.na2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.na2 r0 = new ads_mobile_sdk.na2
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L59
            if (r2 == r6) goto L4f
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L35
            java.lang.Object r8 = r0.a
            ads_mobile_sdk.xa2 r8 = (ads_mobile_sdk.xa2) r8
            defpackage.ybh.y(r9)
            goto L5c
        L35:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r7
        L3b:
            pfe r8 = r0.b
            java.lang.Object r2 = r0.a
            ads_mobile_sdk.xa2 r2 = (ads_mobile_sdk.xa2) r2
            defpackage.ybh.y(r9)
        L44:
            r9 = r8
            r8 = r2
            goto L96
        L47:
            java.lang.Object r8 = r0.a
            pfe r8 = (pfe) r8
            defpackage.ybh.y(r9)     // Catch: java.lang.Throwable -> Lad
            goto L80
        L4f:
            pfe r8 = r0.b
            java.lang.Object r2 = r0.a
            ads_mobile_sdk.xa2 r2 = (ads_mobile_sdk.xa2) r2
            defpackage.ybh.y(r9)
            goto L6c
        L59:
            defpackage.ybh.y(r9)
        L5c:
            pfe r9 = r8.i
            r0.a = r8
            r0.b = r9
            r0.e = r6
            java.lang.Object r2 = r9.i(r0)
            if (r2 == r1) goto La7
            r2 = r8
            r8 = r9
        L6c:
            ynb r9 = r2.o     // Catch: java.lang.Throwable -> Lad
            boolean r9 = r9.h0()     // Catch: java.lang.Throwable -> Lad
            if (r9 == 0) goto L84
            r0.a = r8     // Catch: java.lang.Throwable -> Lad
            r0.b = r7     // Catch: java.lang.Throwable -> Lad
            r0.e = r5     // Catch: java.lang.Throwable -> Lad
            ads_mobile_sdk.a2 r9 = r2.c()     // Catch: java.lang.Throwable -> Lad
            if (r9 == r1) goto La7
        L80:
            r8.l(r7)
            return r9
        L84:
            r8.l(r7)
            pfe r8 = r2.i
            r0.a = r2
            r0.b = r8
            r0.e = r4
            java.lang.Object r9 = r8.i(r0)
            if (r9 != r1) goto L44
            goto La7
        L96:
            ynb r2 = r8.o     // Catch: java.lang.Throwable -> La8
            r9.l(r7)
            r0.a = r8
            r0.b = r7
            r0.e = r3
            java.lang.Object r9 = r2.Z(r0)
            if (r9 != r1) goto L5c
        La7:
            return r1
        La8:
            r8 = move-exception
            r9.l(r7)
            throw r8
        Lad:
            r9 = move-exception
            r8.l(r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xa2.a(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[PHI: r6
      0x0053: PHI (r6v5 'this' ads_mobile_sdk.xa2) = (r6v3 'this' ads_mobile_sdk.xa2), (r6v7 'this' ads_mobile_sdk.xa2) binds: [B:27:0x0097, B:15:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c A[PHI: r6
      0x008c: PHI (r6v3 'this' ads_mobile_sdk.xa2) = (r6v1 'this' ads_mobile_sdk.xa2), (r6v4 'this' ads_mobile_sdk.xa2) binds: [B:25:0x008a, B:17:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf A[EXC_TOP_SPLITTER, PHI: r2 r6 r7
      0x00bf: PHI (r2v6 ads_mobile_sdk.xa2) = (r2v4 ads_mobile_sdk.xa2), (r2v9 ads_mobile_sdk.xa2) binds: [B:33:0x00bd, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r6v12 pfe) = (r6v9 pfe), (r6v18 pfe) binds: [B:33:0x00bd, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r7v17 ads_mobile_sdk.hv0) = (r7v16 ads_mobile_sdk.hv0), (r7v21 ads_mobile_sdk.hv0) binds: [B:33:0x00bd, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a9 A[EXC_TOP_SPLITTER, PHI: r2 r6
      0x00a9: PHI (r2v4 ads_mobile_sdk.xa2) = (r2v3 ads_mobile_sdk.xa2), (r2v5 ads_mobile_sdk.xa2) binds: [B:30:0x00a7, B:14:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x00a9: PHI (r6v8 pfe) = (r6v6 pfe), (r6v11 pfe) binds: [B:30:0x00a7, B:14:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(nt5 r7) throws m2 {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xa2.b(nt5):java.lang.Object");
    }

    public final String b() {
        n13 n13Var = this.h;
        if (n13Var == null) {
            n13Var = null;
        }
        bq bqVar = n13Var.b.b.g;
        if (bqVar != null) {
            return String.valueOf(bqVar);
        }
        zl0[] zl0VarArr = zl0.f;
        return "No fill.";
    }

    public final a2 c() {
        HashSet hashSet;
        Object obj;
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            hashSet = this.m;
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (!CollectionsKt.E(hashSet, ((a2) obj).T)) {
                break;
            }
        }
        a2 a2Var = (a2) obj;
        if (a2Var == null || a2Var.w > this.k) {
            return null;
        }
        this.n.add(a2Var);
        ArrayList arrayList2 = this.p;
        (arrayList2 != null ? arrayList2 : null).remove(a2Var);
        String str = a2Var.T;
        if (str != null && str.length() != 0) {
            hashSet.add(str);
        }
        if (a2Var.b0) {
            this.o = o0g.e();
        }
        return a2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r7.a(r6, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(nt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ads_mobile_sdk.wa2
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.wa2 r0 = (ads_mobile_sdk.wa2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.wa2 r0 = new ads_mobile_sdk.wa2
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.ybh.y(r7)
            goto L73
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r5
        L31:
            pfe r6 = r0.b
            ads_mobile_sdk.xa2 r2 = r0.a
            defpackage.ybh.y(r7)
            r7 = r6
            r6 = r2
            goto L4c
        L3b:
            defpackage.ybh.y(r7)
            r0.a = r6
            pfe r7 = r6.i
            r0.b = r7
            r0.e = r4
            java.lang.Object r2 = r7.i(r0)
            if (r2 == r1) goto L72
        L4c:
            ads_mobile_sdk.n13 r2 = r6.h     // Catch: java.lang.Throwable -> L76
            if (r2 != 0) goto L51
            r2 = r5
        L51:
            ads_mobile_sdk.j13 r2 = r2.b     // Catch: java.lang.Throwable -> L76
            java.util.ArrayList r2 = r2.a     // Catch: java.lang.Throwable -> L76
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L76
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L76
            r6.p = r4     // Catch: java.lang.Throwable -> L76
            r7.l(r5)
            ads_mobile_sdk.mt2 r7 = r6.e
            ads_mobile_sdk.n13 r6 = r6.h
            if (r6 != 0) goto L66
            r6 = r5
        L66:
            r0.a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r6 = r7.a(r6, r0)
            if (r6 != r1) goto L73
        L72:
            return r1
        L73:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L76:
            r6 = move-exception
            r7.l(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.xa2.c(nt5):java.lang.Object");
    }
}
