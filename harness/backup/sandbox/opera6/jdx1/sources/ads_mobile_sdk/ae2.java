package ads_mobile_sdk;

import android.content.Context;
import defpackage.cs5;
import defpackage.dvj;
import defpackage.fjp;
import defpackage.flp;
import defpackage.hzo;
import defpackage.kta;
import defpackage.mip;
import defpackage.oie;
import defpackage.r1p;
import defpackage.tso;
import defpackage.w7p;
import defpackage.yso;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class ae2 {
    public final k1 a;
    public final d6 b;
    public final fjp c;
    public final mip d;
    public final Context e;
    public final w7p f;
    public final ux2 g;
    public final tso h;
    public volatile boolean j;
    public final pfe i = new pfe();
    public final ConcurrentHashMap k = new ConcurrentHashMap();

    public ae2(k1 k1Var, d6 d6Var, fjp fjpVar, mip mipVar, Context context, w7p w7pVar, ux2 ux2Var, tso tsoVar) {
        this.a = k1Var;
        this.b = d6Var;
        this.c = fjpVar;
        this.d = mipVar;
        this.e = context;
        this.f = w7pVar;
        this.g = ux2Var;
        this.h = tsoVar;
    }

    public static h1 a(h1 h1Var, String str, String str2, String str3) {
        h6 h6Var;
        ds0 ds0Var = (ds0) h1Var.u().get(str);
        if (ds0Var == null || (h6Var = (h6) ds0Var.o().get(str2)) == null) {
            return h1Var;
        }
        flp flpVarR = h6Var.r();
        ArrayList arrayList = new ArrayList();
        for (Object obj : flpVarR) {
            if (!Intrinsics.a(((c6) obj).q(), str3)) {
                arrayList.add(obj);
            }
        }
        hzo hzoVar = (hzo) h1Var.n();
        if (arrayList.isEmpty()) {
            yso ysoVar = (yso) ds0Var.n();
            ysoVar.e();
            ysoVar.b(str2);
            ds0 ds0Var2 = (ds0) ysoVar.a();
            if (ds0Var2.o().isEmpty()) {
                hzoVar.e();
                hzoVar.b(str);
            } else {
                hzoVar.e();
                hzoVar.c(str, ds0Var2);
            }
        } else {
            hzoVar.e();
            yso ysoVar2 = (yso) ds0Var.n();
            ysoVar2.e();
            r1p r1pVar = (r1p) h6Var.n();
            r1pVar.f();
            r1pVar.e();
            r1pVar.f();
            r1pVar.c(arrayList);
            ysoVar2.c(str2, (h6) r1pVar.a());
            hzoVar.c(str, (ds0) ysoVar2.a());
        }
        return (h1) hzoVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x010f, code lost:
    
        if (r1 == r3) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef A[Catch: all -> 0x012b, TryCatch #2 {all -> 0x012b, blocks: (B:14:0x003c, B:42:0x0112, B:37:0x00e9, B:39:0x00ef, B:43:0x0115, B:44:0x011c, B:46:0x0120, B:19:0x0055, B:36:0x00e1), top: B:80:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115 A[Catch: all -> 0x012b, TryCatch #2 {all -> 0x012b, blocks: (B:14:0x003c, B:42:0x0112, B:37:0x00e9, B:39:0x00ef, B:43:0x0115, B:44:0x011c, B:46:0x0120, B:19:0x0055, B:36:0x00e1), top: B:80:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120 A[Catch: all -> 0x012b, TRY_LEAVE, TryCatch #2 {all -> 0x012b, blocks: (B:14:0x003c, B:42:0x0112, B:37:0x00e9, B:39:0x00ef, B:43:0x0115, B:44:0x011c, B:46:0x0120, B:19:0x0055, B:36:0x00e1), top: B:80:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x010f -> B:42:0x0112). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.ae2 r20, ads_mobile_sdk.av2 r21, java.lang.String r22, java.lang.String r23, nt5 r24) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ae2.a(ads_mobile_sdk.ae2, ads_mobile_sdk.av2, java.lang.String, java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b2 A[Catch: all -> 0x02c3, LOOP:0: B:113:0x02ac->B:115:0x02b2, LOOP_END, TryCatch #3 {all -> 0x02c3, blocks: (B:16:0x0042, B:112:0x02a2, B:113:0x02ac, B:115:0x02b2, B:116:0x02bc), top: B:151:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02cf A[Catch: all -> 0x02f6, TryCatch #6 {all -> 0x02f6, blocks: (B:123:0x02c8, B:125:0x02cf, B:127:0x02d6, B:129:0x02da, B:131:0x02de, B:132:0x02df, B:133:0x02e4, B:134:0x02e5, B:135:0x02ec, B:136:0x02ed, B:137:0x02f4, B:138:0x02f5), top: B:158:0x02c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f5 A[Catch: all -> 0x02f6, TRY_LEAVE, TryCatch #6 {all -> 0x02f6, blocks: (B:123:0x02c8, B:125:0x02cf, B:127:0x02d6, B:129:0x02da, B:131:0x02de, B:132:0x02df, B:133:0x02e4, B:134:0x02e5, B:135:0x02ec, B:136:0x02ed, B:137:0x02f4, B:138:0x02f5), top: B:158:0x02c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01cf A[Catch: all -> 0x01e0, LOOP:1: B:65:0x01c9->B:67:0x01cf, LOOP_END, TryCatch #0 {all -> 0x01e0, blocks: (B:25:0x0067, B:64:0x01bf, B:65:0x01c9, B:67:0x01cf, B:68:0x01d9), top: B:145:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ec A[Catch: all -> 0x0213, TryCatch #2 {all -> 0x0213, blocks: (B:75:0x01e5, B:77:0x01ec, B:79:0x01f3, B:81:0x01f7, B:83:0x01fb, B:84:0x01fc, B:85:0x0201, B:86:0x0202, B:87:0x0209, B:88:0x020a, B:89:0x0211, B:90:0x0212), top: B:150:0x01e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0212 A[Catch: all -> 0x0213, TRY_LEAVE, TryCatch #2 {all -> 0x0213, blocks: (B:75:0x01e5, B:77:0x01ec, B:79:0x01f3, B:81:0x01f7, B:83:0x01fb, B:84:0x01fc, B:85:0x0201, B:86:0x0202, B:87:0x0209, B:88:0x020a, B:89:0x0211, B:90:0x0212), top: B:150:0x01e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021b  */
    /* JADX WARN: Type inference failed for: r2v10, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r2v8, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v33, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r7v11, types: [ads_mobile_sdk.k1] */
    /* JADX WARN: Type inference failed for: r7v6, types: [ads_mobile_sdk.k1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.ae2 r17, ads_mobile_sdk.bc2 r18, boolean r19, nt5 r20) throws m2 {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ae2.a(ads_mobile_sdk.ae2, ads_mobile_sdk.bc2, boolean, nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5 A[Catch: all -> 0x00b0, TRY_LEAVE, TryCatch #2 {all -> 0x00b0, blocks: (B:18:0x0042, B:26:0x008b, B:35:0x00a1, B:37:0x00a5, B:34:0x009b), top: B:107:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011d A[Catch: all -> 0x0127, TRY_LEAVE, TryCatch #7 {all -> 0x0127, blocks: (B:13:0x0033, B:68:0x0103, B:77:0x0119, B:79:0x011d, B:76:0x0113), top: B:111:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0130 A[Catch: all -> 0x0157, TryCatch #6 {all -> 0x0157, blocks: (B:84:0x0129, B:86:0x0130, B:88:0x0137, B:90:0x013b, B:92:0x013f, B:93:0x0140, B:94:0x0145, B:95:0x0146, B:96:0x014d, B:97:0x014e, B:98:0x0155, B:99:0x0156), top: B:113:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0156 A[Catch: all -> 0x0157, TRY_LEAVE, TryCatch #6 {all -> 0x0157, blocks: (B:84:0x0129, B:86:0x0130, B:88:0x0137, B:90:0x013b, B:92:0x013f, B:93:0x0140, B:94:0x0145, B:95:0x0146, B:96:0x014d, B:97:0x014e, B:98:0x0155, B:99:0x0156), top: B:113:0x0129 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r2v13, types: [ads_mobile_sdk.rg3, ads_mobile_sdk.wk2] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.ae2 r16, ads_mobile_sdk.fe2 r17, nt5 r18) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ae2.a(ads_mobile_sdk.ae2, ads_mobile_sdk.fe2, nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #4 {all -> 0x00a9, blocks: (B:18:0x0042, B:26:0x0084, B:35:0x009a, B:37:0x009e, B:34:0x0094), top: B:108:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2 A[Catch: all -> 0x00d9, TryCatch #3 {all -> 0x00d9, blocks: (B:41:0x00ab, B:43:0x00b2, B:45:0x00b9, B:47:0x00bd, B:49:0x00c1, B:50:0x00c2, B:51:0x00c7, B:52:0x00c8, B:53:0x00cf, B:54:0x00d0, B:55:0x00d7, B:56:0x00d8), top: B:110:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d8 A[Catch: all -> 0x00d9, TRY_LEAVE, TryCatch #3 {all -> 0x00d9, blocks: (B:41:0x00ab, B:43:0x00b2, B:45:0x00b9, B:47:0x00bd, B:49:0x00c1, B:50:0x00c2, B:51:0x00c7, B:52:0x00c8, B:53:0x00cf, B:54:0x00d0, B:55:0x00d7, B:56:0x00d8), top: B:110:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0111 A[Catch: all -> 0x011b, TRY_LEAVE, TryCatch #6 {all -> 0x011b, blocks: (B:13:0x0033, B:68:0x00f7, B:77:0x010d, B:79:0x0111, B:76:0x0107), top: B:106:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0124 A[Catch: all -> 0x014b, TryCatch #5 {all -> 0x014b, blocks: (B:84:0x011d, B:86:0x0124, B:88:0x012b, B:90:0x012f, B:92:0x0133, B:93:0x0134, B:94:0x0139, B:95:0x013a, B:96:0x0141, B:97:0x0142, B:98:0x0149, B:99:0x014a), top: B:112:0x011d }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014a A[Catch: all -> 0x014b, TRY_LEAVE, TryCatch #5 {all -> 0x014b, blocks: (B:84:0x011d, B:86:0x0124, B:88:0x012b, B:90:0x012f, B:92:0x0133, B:93:0x0134, B:94:0x0139, B:95:0x013a, B:96:0x0141, B:97:0x0142, B:98:0x0149, B:99:0x014a), top: B:112:0x011d }] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.ae2 r16, nt5 r17) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ae2.a(ads_mobile_sdk.ae2, nt5):java.lang.Object");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static java.lang.Object b(ads_mobile_sdk.ae2 r16, ads_mobile_sdk.fe2 r17, nt5 r18) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ae2.b(ads_mobile_sdk.ae2, ads_mobile_sdk.fe2, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        if (a(r0, ads_mobile_sdk.bc2.CLEAR_REASON_CONSENT_DENIED, false, (nt5) r3) != r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0185, code lost:
    
        if (a(r15, r0, false, (nt5) r3) == r4) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.ae2 r18, nt5 r19) throws m2, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ae2.b(ads_mobile_sdk.ae2, nt5):java.lang.Object");
    }

    public final int a(av2 av2Var) {
        fo foVar = fo.a$11;
        int iOrdinal = av2Var.ordinal();
        fjp fjpVar = this.c;
        switch (iOrdinal) {
            case 1:
                fjpVar.getClass();
                return ((Number) fjpVar.a("gads:pc:max_app_open_ads", (Object) 2, (Function1) foVar)).intValue();
            case 2:
                fjpVar.getClass();
                return ((Number) fjpVar.a("gads:pc:max_banner_ads", (Object) 0, (Function1) foVar)).intValue();
            case 3:
                fjpVar.getClass();
                return ((Number) fjpVar.a("gads:pc:max_icon_ads", (Object) 2, (Function1) foVar)).intValue();
            case 4:
                fjpVar.getClass();
                return ((Number) fjpVar.a("gads:pc:max_interstitial_ads", (Object) 0, (Function1) foVar)).intValue();
            case 5:
                fjpVar.getClass();
                return ((Number) fjpVar.a("gads:pc:max_native_ads", (Object) 2, (Function1) foVar)).intValue();
            case 6:
                fjpVar.getClass();
                return ((Number) fjpVar.a("gads:pc:max_rewarded_ads", (Object) 0, (Function1) foVar)).intValue();
            case 7:
                fjpVar.getClass();
                return ((Number) fjpVar.a("gads:pc:max_rewarded_interstitial_ads", (Object) 0, (Function1) foVar)).intValue();
            case 8:
                fjpVar.getClass();
                return ((Number) fjpVar.a("gads:pc:max_swipeable_interstitial_ads", (Object) 0, (Function1) foVar)).intValue();
            default:
                return 0;
        }
    }

    public final int a(defpackage.hp hpVar, av2 av2Var) {
        MatchGroup matchGroupG;
        dvj dvjVar = ax0.f;
        ucd ucdVarD = Regex.d(ax0.i, hpVar.i);
        String str = (ucdVarD == null || (matchGroupG = ucdVarD.c.g(1)) == null) ? null : matchGroupG.a;
        if (str == null) {
            str = hpVar.i;
        }
        if (Intrinsics.a(this.k.get(str), Boolean.FALSE)) {
            return 4;
        }
        if (!((yz) ((eo) this.f).k.get()).p().p().contains(ox.API_PERSISTENT_CACHE)) {
            return 3;
        }
        if (a(av2Var) > 0) {
            fjp fjpVar = this.c;
            fjpVar.getClass();
            fo foVar = fo.a$11;
            if (((Number) fjpVar.a("gads:pc:max_total_cached_ads", (Object) 10, (Function1) foVar)).intValue() > 0 && ((Number) fjpVar.a("gads:pc:cache_fill_count_per_request", (Object) 2, (Function1) foVar)).intValue() > 0) {
                return 0;
            }
        }
        return 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b6, code lost:
    
        if (r0 == r11) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b6 -> B:26:0x00b9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(ads_mobile_sdk.av2 r16, java.lang.String r17, boolean r18, nt5 r19) {
        /*
            r15 = this;
            r0 = r19
            boolean r1 = r0 instanceof ads_mobile_sdk.dd2
            if (r1 == 0) goto L16
            r1 = r0
            ads_mobile_sdk.dd2 r1 = (ads_mobile_sdk.dd2) r1
            int r2 = r1.g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.g = r2
        L14:
            r10 = r1
            goto L1c
        L16:
            ads_mobile_sdk.dd2 r1 = new ads_mobile_sdk.dd2
            r1.<init>(r15, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r10.e
            px5 r11 = px5.a
            int r1 = r10.g
            r12 = 0
            r13 = 2
            r14 = 1
            if (r1 == 0) goto L4e
            if (r1 == r14) goto L40
            if (r1 != r13) goto L3a
            java.lang.Object r1 = r10.d
            java.util.Iterator r1 = (java.util.Iterator) r1
            pqh r2 = r10.c
            pqh r3 = r10.b
            ads_mobile_sdk.ae2 r4 = r10.a
            defpackage.ybh.y(r0)
            goto Lb9
        L3a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r0)
            return r12
        L40:
            java.lang.Object r1 = r10.d
            java.util.List r1 = (java.util.List) r1
            pqh r2 = r10.c
            pqh r3 = r10.b
            ads_mobile_sdk.ae2 r4 = r10.a
            defpackage.ybh.y(r0)
            goto L87
        L4e:
            pqh r2 = sko.f(r0)
            pqh r3 = new pqh
            r3.<init>()
            mip r0 = r15.d
            r0.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ads_mobile_sdk.fd2 r0 = new ads_mobile_sdk.fd2
            r6 = r15
            r4 = r16
            r5 = r17
            r9 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9)
            r10.a = r15
            r10.b = r2
            r10.c = r3
            r10.d = r1
            r10.g = r14
            ads_mobile_sdk.k1 r4 = r15.a
            java.lang.Object r0 = r4.a(r0, r10)
            if (r0 == r11) goto Lb8
            r4 = r3
            r3 = r2
            r2 = r4
            r4 = r15
        L87:
            java.util.List r0 = kotlin.collections.CollectionsKt.F(r1)
            java.util.Iterator r0 = r0.iterator()
            r1 = r0
        L90:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lbc
            java.lang.Object r0 = r1.next()
            java.lang.String r0 = (java.lang.String) r0
            r10.a = r4
            r10.b = r3
            r10.c = r2
            r10.d = r1
            r10.g = r13
            r4.getClass()
            dze r5 = dze.b
            udj r6 = new udj
            r7 = 25
            r6.<init>(r4, r0, r12, r7)
            java.lang.Object r0 = defpackage.na2.Z(r5, r6, r10)
            if (r0 != r11) goto Lb9
        Lb8:
            return r11
        Lb9:
            rap r0 = (defpackage.rap) r0
            goto L90
        Lbc:
            kotlin.Pair r0 = new kotlin.Pair
            java.lang.Object r1 = r3.a
            java.lang.Object r2 = r2.a
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ae2.a(ads_mobile_sdk.av2, java.lang.String, boolean, nt5):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.av2 r6, java.lang.String r7, nt5 r8) throws m2 {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ae2.a(ads_mobile_sdk.av2, java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r6.a(r2, r0) == r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.dl0 r7, nt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.xd2
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.xd2 r0 = (ads_mobile_sdk.xd2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.xd2 r0 = new ads_mobile_sdk.xd2
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.ybh.y(r8)
            goto L60
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L31:
            ads_mobile_sdk.dl0 r7 = r0.b
            ads_mobile_sdk.ae2 r6 = r0.a
            defpackage.ybh.y(r8)
            goto L48
        L39:
            defpackage.ybh.y(r8)
            r0.a = r6
            r0.b = r7
            r0.e = r5
            java.lang.Object r8 = r6.a(r0)
            if (r8 == r1) goto L5f
        L48:
            java.lang.String r8 = (java.lang.String) r8
            ads_mobile_sdk.k1 r6 = r6.a
            of3 r2 = new of3
            r5 = 17
            r2.<init>(r7, r8, r5)
            r0.a = r3
            r0.b = r3
            r0.e = r4
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L60
        L5f:
            return r1
        L60:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ae2.a(ads_mobile_sdk.dl0, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r9 == r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.kd2
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.kd2 r0 = (ads_mobile_sdk.kd2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.kd2 r0 = new ads_mobile_sdk.kd2
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            ads_mobile_sdk.ae2 r8 = r0.a
            defpackage.ybh.y(r9)
            goto L66
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            r8 = 0
            return r8
        L33:
            ads_mobile_sdk.ae2 r8 = r0.a
            defpackage.ybh.y(r9)
            goto L50
        L39:
            defpackage.ybh.y(r9)
            tso r9 = r8.h
            java.lang.Object r9 = r9.get()
            ads_mobile_sdk.vz r9 = (ads_mobile_sdk.vz) r9
            ynb r9 = r9.D
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = r9.Z(r0)
            if (r9 == r1) goto L65
        L50:
            tso r9 = r8.h
            java.lang.Object r9 = r9.get()
            ads_mobile_sdk.vz r9 = (ads_mobile_sdk.vz) r9
            r0.a = r8
            r0.d = r3
            r9.getClass()
            java.lang.Object r9 = ads_mobile_sdk.vz.d(r9, r0)
            if (r9 != r1) goto L66
        L65:
            return r1
        L66:
            prb r9 = (defpackage.prb) r9
            r8.getClass()
            hgc r8 = r9.a
            java.util.Set r8 = r8.entrySet()
            w8l r9 = new w8l
            r0 = 13
            r9.<init>(r0)
            java.util.List r1 = kotlin.collections.CollectionsKt.c0(r9, r8)
            ads_mobile_sdk.fo r6 = ads_mobile_sdk.fo.a$2
            r5 = 0
            r7 = 30
            java.lang.String r2 = ","
            r3 = 0
            r4 = 0
            java.lang.String r8 = kotlin.collections.CollectionsKt.P(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = "SHA-256"
            java.security.MessageDigest r9 = java.security.MessageDigest.getInstance(r9)
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            byte[] r8 = r8.getBytes(r0)
            byte[] r8 = r9.digest(r8)
            ads_mobile_sdk.fo r9 = ads_mobile_sdk.fo.a$1
            java.lang.String r0 = ""
            r1 = 30
            java.lang.String r8 = e82.w(r8, r0, r9, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ae2.a(nt5):java.lang.Object");
    }

    public final LinkedHashMap a(Map map, long j, ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            h6 h6Var = (h6) entry.getValue();
            Pair pairA = a(h6Var, j);
            List list = (List) pairA.a;
            for (c6 c6Var : (List) pairA.b) {
                WeakHashMap weakHashMap = hh3.a;
                rg3 rg3VarA = hh3.a(fw0.CUI_NAME_PERSISTENT_CACHE_EXPIRE, l08.a, true);
                try {
                    arrayList.add(c6Var.q());
                    rg3VarA.close();
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
                    } finally {
                    }
                }
            }
            if (!list.isEmpty()) {
                r1p r1pVar = (r1p) h6Var.n();
                r1pVar.f();
                r1pVar.e();
                r1pVar.f();
                r1pVar.c(list);
                linkedHashMap.put(str, (h6) r1pVar.a());
            }
        }
        return linkedHashMap;
    }

    public final Pair a(h6 h6Var, long j) {
        fjp fjpVar = this.c;
        fjpVar.getClass();
        on7 on7Var = pn7.b;
        long j2 = ((pn7) fjpVar.a("gads:pc:ad_ttl_ms", u0h.b(24, un7.g), fo.a$18)).a;
        long jY0 = cs5.y0(j, un7.d);
        flp flpVarR = h6Var.r();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : flpVarR) {
            on7 on7Var2 = pn7.b;
            if (pn7.c(pn7.l(jY0, cs5.y0(((c6) obj).p(), un7.d)), j2) <= 0) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return new Pair(arrayList, arrayList2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        if (r0.b(r2) != r3) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0241 A[Catch: all -> 0x0242, TRY_LEAVE, TryCatch #2 {all -> 0x0242, blocks: (B:96:0x0214, B:98:0x021b, B:100:0x0222, B:102:0x0226, B:104:0x022a, B:105:0x022b, B:106:0x0230, B:107:0x0231, B:108:0x0238, B:109:0x0239, B:110:0x0240, B:111:0x0241), top: B:125:0x0214, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011e A[Catch: all -> 0x020d, TryCatch #8 {all -> 0x020d, blocks: (B:43:0x00fd, B:47:0x010d, B:49:0x0111, B:50:0x011e, B:54:0x013d, B:63:0x0168, B:67:0x0173, B:79:0x01d8, B:83:0x01e3, B:55:0x0148, B:57:0x015a, B:60:0x0160, B:62:0x0166), top: B:135:0x00fd, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b4 A[Catch: all -> 0x0210, TRY_LEAVE, TryCatch #0 {all -> 0x0210, blocks: (B:20:0x0064, B:70:0x01b0, B:72:0x01b4, B:75:0x01ce, B:40:0x00db), top: B:121:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ce A[Catch: all -> 0x0210, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0210, blocks: (B:20:0x0064, B:70:0x01b0, B:72:0x01b4, B:75:0x01ce, B:40:0x00db), top: B:121:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021b A[Catch: all -> 0x0242, TryCatch #2 {all -> 0x0242, blocks: (B:96:0x0214, B:98:0x021b, B:100:0x0222, B:102:0x0226, B:104:0x022a, B:105:0x022b, B:106:0x0230, B:107:0x0231, B:108:0x0238, B:109:0x0239, B:110:0x0240, B:111:0x0241), top: B:125:0x0214, outer: #6 }] */
    /* JADX WARN: Type inference failed for: r10v1, types: [ads_mobile_sdk.bm1] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01a3 -> B:22:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ads_mobile_sdk.av2 r25, java.lang.String r26, nt5 r27) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ae2.b(ads_mobile_sdk.av2, java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(nt5 r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof ads_mobile_sdk.md2
            if (r0 == 0) goto L13
            r0 = r12
            ads_mobile_sdk.md2 r0 = (ads_mobile_sdk.md2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.md2 r0 = new ads_mobile_sdk.md2
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L33
            pfe r11 = r0.b
            ads_mobile_sdk.ae2 r0 = r0.a
            defpackage.ybh.y(r12)     // Catch: java.lang.Throwable -> Lab
            goto La1
        L33:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r11)
            return r6
        L39:
            pfe r11 = r0.b
            ads_mobile_sdk.ae2 r2 = r0.a
            defpackage.ybh.y(r12)     // Catch: java.lang.Throwable -> Lab
            goto L75
        L41:
            pfe r11 = r0.b
            ads_mobile_sdk.ae2 r2 = r0.a
            defpackage.ybh.y(r12)
            r12 = r11
            r11 = r2
            goto L63
        L4b:
            defpackage.ybh.y(r12)
            boolean r12 = r11.j
            if (r12 == 0) goto L55
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        L55:
            pfe r12 = r11.i
            r0.a = r11
            r0.b = r12
            r0.e = r5
            java.lang.Object r2 = r12.i(r0)
            if (r2 == r1) goto L9f
        L63:
            boolean r2 = r11.j     // Catch: java.lang.Throwable -> Lb0
            if (r2 != 0) goto La4
            r0.a = r11     // Catch: java.lang.Throwable -> Lb0
            r0.b = r12     // Catch: java.lang.Throwable -> Lb0
            r0.e = r4     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r2 = b(r11, r0)     // Catch: java.lang.Throwable -> Lb0
            if (r2 == r1) goto L9f
            r2 = r11
            r11 = r12
        L75:
            r0.a = r2     // Catch: java.lang.Throwable -> Lab
            r0.b = r11     // Catch: java.lang.Throwable -> Lab
            r0.e = r3     // Catch: java.lang.Throwable -> Lab
            android.content.Context r12 = r2.e     // Catch: java.lang.Throwable -> Lab
            java.lang.String r12 = r12.getPackageName()     // Catch: java.lang.Throwable -> Lab
            android.content.Context r3 = r2.e     // Catch: java.lang.Throwable -> Lab
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> Lab
            r4 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r12, r4)     // Catch: java.lang.Throwable -> Lab
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lab
            long r7 = r3.getLongVersionCode()     // Catch: java.lang.Throwable -> Lab
            ads_mobile_sdk.dl0 r3 = new ads_mobile_sdk.dl0     // Catch: java.lang.Throwable -> Lab
            java.lang.String r9 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> Lab
            r3.<init>(r4, r7, r12)     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r12 = r2.a(r3, r0)     // Catch: java.lang.Throwable -> Lab
            if (r12 != r1) goto La0
        L9f:
            return r1
        La0:
            r0 = r2
        La1:
            r0.j = r5     // Catch: java.lang.Throwable -> Lab
            goto La5
        La4:
            r11 = r12
        La5:
            kotlin.Unit r12 = kotlin.Unit.a     // Catch: java.lang.Throwable -> Lab
            r11.l(r6)
            return r12
        Lab:
            r12 = move-exception
            r10 = r12
            r12 = r11
            r11 = r10
            goto Lb1
        Lb0:
            r11 = move-exception
        Lb1:
            r12.l(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ae2.b(nt5):java.lang.Object");
    }

    public final boolean b(defpackage.hp hpVar, av2 av2Var) {
        int iOrdinal;
        boolean z;
        fjp fjpVar = this.c;
        fjpVar.getClass();
        if (!((Boolean) fjpVar.a("gads:pc:enabled", Boolean.TRUE, fo.a)).booleanValue() || (iOrdinal = av2Var.ordinal()) == 1) {
            return false;
        }
        if (iOrdinal == 3) {
            if ((hpVar instanceof kta ? (kta) hpVar : null) == null) {
                return false;
            }
            z = true;
        } else {
            if (iOrdinal != 5) {
                return false;
            }
            oie oieVar = hpVar instanceof oie ? (oie) hpVar : null;
            if (oieVar == null) {
                return false;
            }
            z = oieVar.v;
        }
        return z;
    }
}
