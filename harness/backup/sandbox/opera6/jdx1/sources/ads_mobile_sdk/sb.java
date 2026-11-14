package ads_mobile_sdk;

import android.content.Context;
import android.os.SystemClock;
import defpackage.coh;
import defpackage.cs5;
import defpackage.mip;
import defpackage.nap;
import defpackage.o0g;
import defpackage.zjp;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class sb {
    public static final List A = Arrays.asList("com.google.ads.mediation.admob.AdMobAdapter", "com.google.ads.mediation.admob.AdMobCustomTabsAdapter");
    public final nx5 a;
    public final CoroutineContext b;
    public final Context c;
    public final nap d;
    public final zjp e;
    public final g0 f;
    public final dk g;
    public final mip h;
    public final qr0 i;
    public final ux2 j;
    public final i41 k;
    public final pfe l = new pfe();
    public final LinkedHashMap m = new LinkedHashMap();
    public final LinkedHashMap n = new LinkedHashMap();
    public long o;
    public jl6 p;
    public long q;
    public long r;
    public int s;
    public long t;
    public final pfe u;
    public final LinkedHashSet v;
    public final LinkedHashSet w;
    public LinkedHashSet x;
    public final AtomicBoolean y;
    public final ynb z;

    public sb(nx5 nx5Var, CoroutineContext coroutineContext, Context context, nap napVar, zjp zjpVar, g0 g0Var, dk dkVar, mip mipVar, qr0 qr0Var, ux2 ux2Var, i41 i41Var) {
        this.a = nx5Var;
        this.b = coroutineContext;
        this.c = context;
        this.d = napVar;
        this.e = zjpVar;
        this.f = g0Var;
        this.g = dkVar;
        this.h = mipVar;
        this.i = qr0Var;
        this.j = ux2Var;
        this.k = i41Var;
        pn7.b.getClass();
        this.o = 0L;
        this.p = coh.f(null, null, 7);
        this.q = 0L;
        this.r = 0L;
        this.t = 0L;
        this.u = new pfe();
        this.v = new LinkedHashSet();
        this.w = new LinkedHashSet();
        this.y = new AtomicBoolean(false);
        this.z = o0g.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0268 A[Catch: all -> 0x0273, TRY_LEAVE, TryCatch #1 {all -> 0x0273, blocks: (B:16:0x0044, B:101:0x025a, B:105:0x0264, B:107:0x0268, B:103:0x0260, B:104:0x0263, B:21:0x0059, B:87:0x01f2, B:89:0x01f8, B:90:0x01ff, B:92:0x0203, B:96:0x0222, B:98:0x022c, B:100:0x0230), top: B:136:0x002e, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fa A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:24:0x006e, B:48:0x015a, B:52:0x0164, B:54:0x0168, B:50:0x0160, B:51:0x0163, B:27:0x007c, B:35:0x00f4, B:37:0x00fa, B:38:0x0101, B:40:0x0105, B:43:0x0122, B:45:0x012c, B:47:0x0130), top: B:136:0x002e, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0105 A[Catch: all -> 0x0173, TRY_LEAVE, TryCatch #0 {all -> 0x0173, blocks: (B:24:0x006e, B:48:0x015a, B:52:0x0164, B:54:0x0168, B:50:0x0160, B:51:0x0163, B:27:0x007c, B:35:0x00f4, B:37:0x00fa, B:38:0x0101, B:40:0x0105, B:43:0x0122, B:45:0x012c, B:47:0x0130), top: B:136:0x002e, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c A[Catch: all -> 0x015f, TryCatch #8 {all -> 0x015f, blocks: (B:43:0x0122, B:45:0x012c, B:47:0x0130), top: B:147:0x0122, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0168 A[Catch: all -> 0x0173, TRY_LEAVE, TryCatch #0 {all -> 0x0173, blocks: (B:24:0x006e, B:48:0x015a, B:52:0x0164, B:54:0x0168, B:50:0x0160, B:51:0x0163, B:27:0x007c, B:35:0x00f4, B:37:0x00fa, B:38:0x0101, B:40:0x0105, B:43:0x0122, B:45:0x012c, B:47:0x0130), top: B:136:0x002e, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f8 A[Catch: all -> 0x0273, TryCatch #1 {all -> 0x0273, blocks: (B:16:0x0044, B:101:0x025a, B:105:0x0264, B:107:0x0268, B:103:0x0260, B:104:0x0263, B:21:0x0059, B:87:0x01f2, B:89:0x01f8, B:90:0x01ff, B:92:0x0203, B:96:0x0222, B:98:0x022c, B:100:0x0230), top: B:136:0x002e, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0203 A[Catch: all -> 0x0273, TRY_LEAVE, TryCatch #1 {all -> 0x0273, blocks: (B:16:0x0044, B:101:0x025a, B:105:0x0264, B:107:0x0268, B:103:0x0260, B:104:0x0263, B:21:0x0059, B:87:0x01f2, B:89:0x01f8, B:90:0x01ff, B:92:0x0203, B:96:0x0222, B:98:0x022c, B:100:0x0230), top: B:136:0x002e, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022c A[Catch: all -> 0x025f, TryCatch #9 {all -> 0x025f, blocks: (B:96:0x0222, B:98:0x022c, B:100:0x0230), top: B:149:0x0222, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022f  */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v20, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v23, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v27, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r3v29, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.sb r16, java.lang.String r17, ads_mobile_sdk.oa r18, long r19, nt5 r21) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.a(ads_mobile_sdk.sb, java.lang.String, ads_mobile_sdk.oa, long, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c4, code lost:
    
        if (r5.b(r3) == r4) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.sb r18, java.lang.String r19, ads_mobile_sdk.oa r20, nt5 r21) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.a(ads_mobile_sdk.sb, java.lang.String, ads_mobile_sdk.oa, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ba, code lost:
    
        if (defpackage.cs5.b0((java.util.List) r0, r2) == r3) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016d A[Catch: all -> 0x019c, TRY_LEAVE, TryCatch #0 {all -> 0x019c, blocks: (B:53:0x015f, B:55:0x016d), top: B:72:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x015b -> B:72:0x015f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.sb r17, java.util.LinkedHashSet r18, nt5 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.a(ads_mobile_sdk.sb, java.util.LinkedHashSet, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.sb r8, java.util.Set r9, nt5 r10) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.a(ads_mobile_sdk.sb, java.util.Set, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.sb r5, jl6 r6, nt5 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.pb
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.pb r0 = (ads_mobile_sdk.pb) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.pb r0 = new ads_mobile_sdk.pb
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            pfe r5 = r0.c
            jl6 r6 = r0.b
            ads_mobile_sdk.sb r0 = r0.a
            defpackage.ybh.y(r7)
            r7 = r5
            r5 = r0
            goto L4a
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L36:
            defpackage.ybh.y(r7)
            pfe r7 = r5.l
            r0.a = r5
            r0.b = r6
            r0.c = r7
            r0.f = r3
            java.lang.Object r0 = r7.i(r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r5.p = r6     // Catch: java.lang.Throwable -> L6b
            on7 r6 = pn7.b     // Catch: java.lang.Throwable -> L6b
            mip r6 = r5.h     // Catch: java.lang.Throwable -> L6b
            r6.getClass()     // Catch: java.lang.Throwable -> L6b
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L6b
            un7 r6 = un7.d     // Catch: java.lang.Throwable -> L6b
            long r0 = defpackage.cs5.y0(r0, r6)     // Catch: java.lang.Throwable -> L6b
            long r2 = r5.o     // Catch: java.lang.Throwable -> L6b
            long r0 = pn7.l(r0, r2)     // Catch: java.lang.Throwable -> L6b
            r5.q = r0     // Catch: java.lang.Throwable -> L6b
            kotlin.Unit r5 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L6b
            r7.l(r4)
            return r5
        L6b:
            r5 = move-exception
            r7.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.a(ads_mobile_sdk.sb, jl6, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.sb r5, mt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.ya
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.ya r0 = (ads_mobile_sdk.ya) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.ya r0 = new ads_mobile_sdk.ya
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            pfe r5 = r0.b
            ads_mobile_sdk.sb r0 = r0.a
            defpackage.ybh.y(r6)
            r6 = r5
            r5 = r0
            goto L46
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L34:
            defpackage.ybh.y(r6)
            pfe r6 = r5.l
            r0.a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            java.util.LinkedHashMap r5 = r5.m     // Catch: java.lang.Throwable -> L50
            java.util.Map r5 = rbd.i(r5)     // Catch: java.lang.Throwable -> L50
            r6.l(r4)
            return r5
        L50:
            r5 = move-exception
            r6.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.a(ads_mobile_sdk.sb, mt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:307:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x026f A[Catch: all -> 0x03e1, TRY_LEAVE, TryCatch #1 {all -> 0x03e1, blocks: (B:100:0x0260, B:102:0x026f), top: B:259:0x0260, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x028b A[Catch: all -> 0x03e7, TryCatch #5 {all -> 0x03e7, blocks: (B:55:0x0140, B:131:0x0379, B:133:0x03a4, B:141:0x03dd, B:142:0x03e0, B:58:0x0164, B:117:0x0301, B:74:0x01c2, B:76:0x01cb, B:78:0x01d0, B:108:0x0291, B:110:0x02b0, B:111:0x02b5, B:113:0x02d0, B:114:0x02d6, B:81:0x01d8, B:82:0x01db, B:104:0x0284, B:106:0x028b, B:144:0x03e2, B:145:0x03e6, B:100:0x0260, B:102:0x026f, B:75:0x01c5, B:120:0x031d, B:121:0x0321, B:123:0x0327, B:125:0x0337, B:127:0x034f), top: B:266:0x002f, inners: #1, #14, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b0 A[Catch: all -> 0x03e7, TryCatch #5 {all -> 0x03e7, blocks: (B:55:0x0140, B:131:0x0379, B:133:0x03a4, B:141:0x03dd, B:142:0x03e0, B:58:0x0164, B:117:0x0301, B:74:0x01c2, B:76:0x01cb, B:78:0x01d0, B:108:0x0291, B:110:0x02b0, B:111:0x02b5, B:113:0x02d0, B:114:0x02d6, B:81:0x01d8, B:82:0x01db, B:104:0x0284, B:106:0x028b, B:144:0x03e2, B:145:0x03e6, B:100:0x0260, B:102:0x026f, B:75:0x01c5, B:120:0x031d, B:121:0x0321, B:123:0x0327, B:125:0x0337, B:127:0x034f), top: B:266:0x002f, inners: #1, #14, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d0 A[Catch: all -> 0x03e7, TryCatch #5 {all -> 0x03e7, blocks: (B:55:0x0140, B:131:0x0379, B:133:0x03a4, B:141:0x03dd, B:142:0x03e0, B:58:0x0164, B:117:0x0301, B:74:0x01c2, B:76:0x01cb, B:78:0x01d0, B:108:0x0291, B:110:0x02b0, B:111:0x02b5, B:113:0x02d0, B:114:0x02d6, B:81:0x01d8, B:82:0x01db, B:104:0x0284, B:106:0x028b, B:144:0x03e2, B:145:0x03e6, B:100:0x0260, B:102:0x026f, B:75:0x01c5, B:120:0x031d, B:121:0x0321, B:123:0x0327, B:125:0x0337, B:127:0x034f), top: B:266:0x002f, inners: #1, #14, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0327 A[Catch: all -> 0x03db, TryCatch #16 {all -> 0x03db, blocks: (B:120:0x031d, B:121:0x0321, B:123:0x0327, B:125:0x0337, B:127:0x034f), top: B:282:0x031d, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03a4 A[Catch: all -> 0x03e7, TRY_LEAVE, TryCatch #5 {all -> 0x03e7, blocks: (B:55:0x0140, B:131:0x0379, B:133:0x03a4, B:141:0x03dd, B:142:0x03e0, B:58:0x0164, B:117:0x0301, B:74:0x01c2, B:76:0x01cb, B:78:0x01d0, B:108:0x0291, B:110:0x02b0, B:111:0x02b5, B:113:0x02d0, B:114:0x02d6, B:81:0x01d8, B:82:0x01db, B:104:0x0284, B:106:0x028b, B:144:0x03e2, B:145:0x03e6, B:100:0x0260, B:102:0x026f, B:75:0x01c5, B:120:0x031d, B:121:0x0321, B:123:0x0327, B:125:0x0337, B:127:0x034f), top: B:266:0x002f, inners: #1, #14, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03f5 A[Catch: all -> 0x041c, TryCatch #17 {all -> 0x041c, blocks: (B:150:0x03ee, B:152:0x03f5, B:154:0x03fc, B:156:0x0400, B:158:0x0404, B:159:0x0405, B:160:0x040a, B:161:0x040b, B:162:0x0412, B:163:0x0413, B:164:0x041a, B:165:0x041b), top: B:284:0x03ee }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x041b A[Catch: all -> 0x041c, TRY_LEAVE, TryCatch #17 {all -> 0x041c, blocks: (B:150:0x03ee, B:152:0x03f5, B:154:0x03fc, B:156:0x0400, B:158:0x0404, B:159:0x0405, B:160:0x040a, B:161:0x040b, B:162:0x0412, B:163:0x0413, B:164:0x041a, B:165:0x041b), top: B:284:0x03ee }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x045e A[Catch: all -> 0x05dc, TRY_LEAVE, TryCatch #18 {all -> 0x05dc, blocks: (B:178:0x0458, B:180:0x045e), top: B:285:0x0458 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x047a A[Catch: all -> 0x05e7, TRY_LEAVE, TryCatch #6 {all -> 0x05e7, blocks: (B:182:0x0473, B:184:0x047a, B:229:0x05e3, B:230:0x05e6), top: B:267:0x044d }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04a1 A[Catch: all -> 0x05d8, TryCatch #15 {all -> 0x05d8, blocks: (B:13:0x0052, B:210:0x0570, B:212:0x059b, B:220:0x05d4, B:221:0x05d7, B:16:0x0076, B:195:0x04f6, B:186:0x0482, B:188:0x04a1, B:189:0x04a6, B:191:0x04c2, B:192:0x04c8, B:199:0x0514, B:200:0x0518, B:202:0x051e, B:204:0x052e, B:206:0x0546), top: B:266:0x002f, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04c2 A[Catch: all -> 0x05d8, TryCatch #15 {all -> 0x05d8, blocks: (B:13:0x0052, B:210:0x0570, B:212:0x059b, B:220:0x05d4, B:221:0x05d7, B:16:0x0076, B:195:0x04f6, B:186:0x0482, B:188:0x04a1, B:189:0x04a6, B:191:0x04c2, B:192:0x04c8, B:199:0x0514, B:200:0x0518, B:202:0x051e, B:204:0x052e, B:206:0x0546), top: B:266:0x002f, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x051e A[Catch: all -> 0x05d2, TryCatch #11 {all -> 0x05d2, blocks: (B:199:0x0514, B:200:0x0518, B:202:0x051e, B:204:0x052e, B:206:0x0546), top: B:275:0x0514, outer: #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x059b A[Catch: all -> 0x05d8, TRY_LEAVE, TryCatch #15 {all -> 0x05d8, blocks: (B:13:0x0052, B:210:0x0570, B:212:0x059b, B:220:0x05d4, B:221:0x05d7, B:16:0x0076, B:195:0x04f6, B:186:0x0482, B:188:0x04a1, B:189:0x04a6, B:191:0x04c2, B:192:0x04c8, B:199:0x0514, B:200:0x0518, B:202:0x051e, B:204:0x052e, B:206:0x0546), top: B:266:0x002f, inners: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05f6 A[Catch: all -> 0x061d, TryCatch #20 {all -> 0x061d, blocks: (B:235:0x05ef, B:237:0x05f6, B:239:0x05fd, B:241:0x0601, B:243:0x0605, B:244:0x0606, B:245:0x060b, B:246:0x060c, B:247:0x0613, B:248:0x0614, B:249:0x061b, B:250:0x061c), top: B:289:0x05ef }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x061c A[Catch: all -> 0x061d, TRY_LEAVE, TryCatch #20 {all -> 0x061d, blocks: (B:235:0x05ef, B:237:0x05f6, B:239:0x05fd, B:241:0x0601, B:243:0x0605, B:244:0x0606, B:245:0x060b, B:246:0x060c, B:247:0x0613, B:248:0x0614, B:249:0x061b, B:250:0x061c), top: B:289:0x05ef }] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v17, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v4, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r3v45, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v38, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v52 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.sb r27, defpackage.on r28, nt5 r29) {
        /*
            Method dump skipped, instructions count: 1600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.a(ads_mobile_sdk.sb, on, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.sb r4, defpackage.r83 r5, java.lang.String r6, nt5 r7) {
        /*
            boolean r6 = r7 instanceof ads_mobile_sdk.mb
            if (r6 == 0) goto L13
            r6 = r7
            ads_mobile_sdk.mb r6 = (ads_mobile_sdk.mb) r6
            int r0 = r6.g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.g = r0
            goto L18
        L13:
            ads_mobile_sdk.mb r6 = new ads_mobile_sdk.mb
            r6.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r6.e
            px5 r0 = px5.a
            int r1 = r6.g
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            pfe r4 = r6.d
            r83 r5 = r6.b
            defpackage.ybh.y(r7)
            goto L44
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            return r3
        L32:
            defpackage.ybh.y(r7)
            pfe r4 = r4.u
            r6.b = r5
            r6.d = r4
            r6.g = r2
            java.lang.Object r6 = r4.i(r6)
            if (r6 != r0) goto L44
            return r0
        L44:
            r5.getClass()     // Catch: java.lang.Throwable -> L4d
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4d
            r4.l(r3)
            return r5
        L4d:
            r5 = move-exception
            r4.l(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.a(ads_mobile_sdk.sb, r83, java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074 A[Catch: all -> 0x00d7, TryCatch #1 {all -> 0x00d7, blocks: (B:23:0x0070, B:25:0x0074, B:26:0x0079), top: B:52:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:34:0x00a0, B:35:0x00a6, B:37:0x00ac, B:39:0x00b2, B:40:0x00c6, B:41:0x00cb, B:42:0x00cc), top: B:51:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.sb r8, nt5 r9) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.b(ads_mobile_sdk.sb, nt5):java.lang.Object");
    }

    public final long a() {
        int i = this.s;
        long jM = this.r;
        if (i != 0) {
            on7 on7Var = pn7.b;
            this.h.getClass();
            jM = pn7.m(jM, pn7.l(cs5.y0(SystemClock.elapsedRealtime(), un7.d), this.t));
        }
        return pn7.f(jM);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0237 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ejp r22, java.lang.String r23, ads_mobile_sdk.oa r24, nt5 r25) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.a(ejp, java.lang.String, ads_mobile_sdk.oa, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.qb
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.qb r0 = (ads_mobile_sdk.qb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.qb r0 = new ads_mobile_sdk.qb
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            pfe r7 = r0.b
            ads_mobile_sdk.sb r0 = r0.a
            defpackage.ybh.y(r8)
            r8 = r7
            r7 = r0
            goto L46
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r4
        L34:
            defpackage.ybh.y(r8)
            r0.a = r7
            pfe r8 = r7.l
            r0.b = r8
            r0.e = r3
            java.lang.Object r0 = r8.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            int r0 = r7.s     // Catch: java.lang.Throwable -> L7a
            if (r0 != 0) goto L6f
            long r0 = r7.t     // Catch: java.lang.Throwable -> L7a
            on7 r2 = pn7.b     // Catch: java.lang.Throwable -> L7a
            r2.getClass()     // Catch: java.lang.Throwable -> L7a
            r5 = 0
            boolean r0 = pn7.e(r0, r5)     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L5e
            long r0 = r7.o     // Catch: java.lang.Throwable -> L7a
            r7.t = r0     // Catch: java.lang.Throwable -> L7a
            goto L6f
        L5e:
            mip r0 = r7.h     // Catch: java.lang.Throwable -> L7a
            r0.getClass()     // Catch: java.lang.Throwable -> L7a
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L7a
            un7 r2 = un7.d     // Catch: java.lang.Throwable -> L7a
            long r0 = defpackage.cs5.y0(r0, r2)     // Catch: java.lang.Throwable -> L7a
            r7.t = r0     // Catch: java.lang.Throwable -> L7a
        L6f:
            int r0 = r7.s     // Catch: java.lang.Throwable -> L7a
            int r0 = r0 + r3
            r7.s = r0     // Catch: java.lang.Throwable -> L7a
            r8.l(r4)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L7a:
            r7 = move-exception
            r8.l(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.a(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(nt5 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.rb
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.rb r0 = (ads_mobile_sdk.rb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.rb r0 = new ads_mobile_sdk.rb
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            pfe r7 = r0.b
            ads_mobile_sdk.sb r0 = r0.a
            defpackage.ybh.y(r8)
            r8 = r7
            r7 = r0
            goto L46
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r4
        L34:
            defpackage.ybh.y(r8)
            r0.a = r7
            pfe r8 = r7.l
            r0.b = r8
            r0.e = r3
            java.lang.Object r0 = r8.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            int r0 = r7.s     // Catch: java.lang.Throwable -> L75
            if (r0 != r3) goto L69
            long r0 = r7.r     // Catch: java.lang.Throwable -> L75
            on7 r2 = pn7.b     // Catch: java.lang.Throwable -> L75
            mip r2 = r7.h     // Catch: java.lang.Throwable -> L75
            r2.getClass()     // Catch: java.lang.Throwable -> L75
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L75
            un7 r5 = un7.d     // Catch: java.lang.Throwable -> L75
            long r2 = defpackage.cs5.y0(r2, r5)     // Catch: java.lang.Throwable -> L75
            long r5 = r7.t     // Catch: java.lang.Throwable -> L75
            long r2 = pn7.l(r2, r5)     // Catch: java.lang.Throwable -> L75
            long r0 = pn7.m(r0, r2)     // Catch: java.lang.Throwable -> L75
            r7.r = r0     // Catch: java.lang.Throwable -> L75
        L69:
            int r0 = r7.s     // Catch: java.lang.Throwable -> L75
            int r0 = r0 + (-1)
            r7.s = r0     // Catch: java.lang.Throwable -> L75
            r8.l(r4)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L75:
            r7 = move-exception
            r8.l(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.sb.b(nt5):java.lang.Object");
    }
}
