package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import defpackage.ato;
import defpackage.gpe;
import defpackage.prb;
import defpackage.tso;
import defpackage.x66;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class f92 implements ato {
    public final Context a;
    public final qr0 b;
    public final ax0 c;
    public final k8 d;
    public final z2 e;
    public final g0 f;
    public final fp2 g;
    public final tso h;
    public final rr1 i;
    public final dl j;
    public final av2 k;
    public final b90 l;
    public final gn0 m;
    public final a2 n;
    public final jz2 o;
    public final o42 p;
    public final qf2 q;
    public final s01 r;
    public final ah3 s;
    public final xv t;

    public f92(Context context, qr0 qr0Var, ax0 ax0Var, k8 k8Var, z2 z2Var, g0 g0Var, fp2 fp2Var, tso tsoVar, rr1 rr1Var, dl dlVar, av2 av2Var, b90 b90Var, gn0 gn0Var, a2 a2Var, jz2 jz2Var, o42 o42Var, qf2 qf2Var, s01 s01Var, ah3 ah3Var, xv xvVar) {
        this.a = context;
        this.b = qr0Var;
        this.c = ax0Var;
        this.d = k8Var;
        this.e = z2Var;
        this.f = g0Var;
        this.g = fp2Var;
        this.h = tsoVar;
        this.i = rr1Var;
        this.j = dlVar;
        this.k = av2Var;
        this.l = b90Var;
        this.m = gn0Var;
        this.n = a2Var;
        this.o = jz2Var;
        this.p = o42Var;
        this.q = qf2Var;
        this.r = s01Var;
        this.s = ah3Var;
        this.t = xvVar;
    }

    public static int b(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        int iHashCode = str.hashCode();
        return iHashCode != 99 ? iHashCode != 108 ? (iHashCode == 112 && str.equals("p")) ? 7 : -1 : str.equals("l") ? 6 : -1 : str.equals("c") ? 14 : -1;
    }

    public final ResolveInfo a(Intent intent, List list) {
        Object next;
        ResolveInfo resolveInfoResolveActivity = this.a.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.a(((ResolveInfo) next).activityInfo.name, resolveInfoResolveActivity.activityInfo.name)) {
                    break;
                }
            }
            if (next != null) {
                return resolveInfoResolveActivity;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02b2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r19.a.getPackageName(), r0) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0354, code lost:
    
        if (a(r2, r15, r4, r9, r20, r6) != r12) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0563, code lost:
    
        if (ads_mobile_sdk.jz2.a(r4, r0, r11) == r12) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0246, code lost:
    
        if (r0 != r12) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0262, code lost:
    
        if (b(r2, r11, r9, r20, r6) != r12) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // defpackage.ato
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.cy0 r20, java.util.Map r21, mt5 r22) throws java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 1706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.f92.a(ads_mobile_sdk.cy0, java.util.Map, mt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0144, code lost:
    
        if (r0.n(r12) == r6) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f4 A[Catch: all -> 0x0251, TryCatch #7 {all -> 0x0251, blocks: (B:15:0x0041, B:121:0x01ec, B:123:0x01f4, B:126:0x01fc, B:129:0x020b, B:130:0x021d, B:132:0x0242, B:133:0x0248, B:23:0x0060), top: B:169:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01fc A[Catch: all -> 0x0251, TryCatch #7 {all -> 0x0251, blocks: (B:15:0x0041, B:121:0x01ec, B:123:0x01f4, B:126:0x01fc, B:129:0x020b, B:130:0x021d, B:132:0x0242, B:133:0x0248, B:23:0x0060), top: B:169:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0242 A[Catch: all -> 0x0251, TryCatch #7 {all -> 0x0251, blocks: (B:15:0x0041, B:121:0x01ec, B:123:0x01f4, B:126:0x01fc, B:129:0x020b, B:130:0x021d, B:132:0x0242, B:133:0x0248, B:23:0x0060), top: B:169:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0248 A[Catch: all -> 0x0251, TRY_LEAVE, TryCatch #7 {all -> 0x0251, blocks: (B:15:0x0041, B:121:0x01ec, B:123:0x01f4, B:126:0x01fc, B:129:0x020b, B:130:0x021d, B:132:0x0242, B:133:0x0248, B:23:0x0060), top: B:169:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0259 A[Catch: all -> 0x0280, TryCatch #0 {all -> 0x0280, blocks: (B:137:0x0252, B:139:0x0259, B:141:0x0260, B:143:0x0264, B:145:0x0268, B:146:0x0269, B:147:0x026e, B:148:0x026f, B:149:0x0276, B:150:0x0277, B:151:0x027e, B:152:0x027f), top: B:160:0x0252 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x027f A[Catch: all -> 0x0280, TRY_LEAVE, TryCatch #0 {all -> 0x0280, blocks: (B:137:0x0252, B:139:0x0259, B:141:0x0260, B:143:0x0264, B:145:0x0268, B:146:0x0269, B:147:0x026e, B:148:0x026f, B:149:0x0276, B:150:0x0277, B:151:0x027e, B:152:0x027f), top: B:160:0x0252 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014a A[Catch: all -> 0x0163, Exception -> 0x0165, TRY_ENTER, TryCatch #3 {all -> 0x0163, blocks: (B:78:0x016b, B:80:0x0173, B:87:0x018d, B:84:0x017d, B:86:0x0182, B:66:0x014a, B:68:0x014e, B:55:0x011e, B:58:0x0132, B:59:0x0134, B:60:0x0136, B:61:0x0138, B:62:0x013c), top: B:163:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0173 A[Catch: all -> 0x0163, Exception -> 0x0198, TryCatch #3 {all -> 0x0163, blocks: (B:78:0x016b, B:80:0x0173, B:87:0x018d, B:84:0x017d, B:86:0x0182, B:66:0x014a, B:68:0x014e, B:55:0x011e, B:58:0x0132, B:59:0x0134, B:60:0x0136, B:61:0x0138, B:62:0x013c), top: B:163:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017d A[Catch: all -> 0x0163, Exception -> 0x0198, TRY_LEAVE, TryCatch #3 {all -> 0x0163, blocks: (B:78:0x016b, B:80:0x0173, B:87:0x018d, B:84:0x017d, B:86:0x0182, B:66:0x014a, B:68:0x014e, B:55:0x011e, B:58:0x0132, B:59:0x0134, B:60:0x0136, B:61:0x0138, B:62:0x013c), top: B:163:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [ads_mobile_sdk.ub2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ads_mobile_sdk.f92] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r4v10, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v6, types: [ads_mobile_sdk.s01] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Map r17, boolean r18, boolean r19, ads_mobile_sdk.cy0 r20, nt5 r21) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.f92.a(java.util.Map, boolean, boolean, ads_mobile_sdk.cy0, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f4, code lost:
    
        if (r4.a(r6, true, r7, r8, r9, r10, r11) == r3) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0252, code lost:
    
        if (r4.a(r6, true, r7, r8, r9, r10, r11) != r3) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v19, types: [ads_mobile_sdk.cy0, ads_mobile_sdk.f92, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Map r18, boolean r19, boolean r20, boolean r21, ads_mobile_sdk.cy0 r22, nt5 r23) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.f92.a(java.util.Map, boolean, boolean, boolean, ads_mobile_sdk.cy0, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r7.a(r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        if (r9.a(r7, "openIntentAsync", r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Map r8, boolean r9, boolean r10, boolean r11, boolean r12, ads_mobile_sdk.cy0 r13, nt5 r14) {
        /*
            r7 = this;
            boolean r0 = r14 instanceof ads_mobile_sdk.d92
            if (r0 == 0) goto L13
            r0 = r14
            ads_mobile_sdk.d92 r0 = (ads_mobile_sdk.d92) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ads_mobile_sdk.d92 r0 = new ads_mobile_sdk.d92
            r0.<init>(r7, r14)
        L18:
            java.lang.Object r14 = r0.f
            px5 r1 = px5.a
            int r2 = r0.h
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4f
            if (r2 == r6) goto L41
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            defpackage.ybh.y(r14)
            goto Lab
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r3
        L35:
            boolean r7 = r0.d
            boolean r8 = r0.c
            ads_mobile_sdk.cy0 r9 = r0.b
            java.util.Map r10 = r0.a
            defpackage.ybh.y(r14)
            goto L86
        L41:
            boolean r12 = r0.e
            boolean r10 = r0.d
            boolean r9 = r0.c
            ads_mobile_sdk.cy0 r13 = r0.b
            java.util.Map r8 = r0.a
            defpackage.ybh.y(r14)
            goto L6a
        L4f:
            defpackage.ybh.y(r14)
            if (r9 == 0) goto L6a
            if (r11 == 0) goto L6a
            r0.a = r8
            r0.b = r13
            r0.c = r9
            r0.d = r10
            r0.e = r12
            r0.h = r6
            ads_mobile_sdk.z2 r7 = r7.e
            java.lang.Object r7 = r7.n(r0)
            if (r7 == r1) goto Laa
        L6a:
            if (r9 == 0) goto L82
            if (r12 == 0) goto L82
            ads_mobile_sdk.mt0 r7 = r13.o
            if (r7 == 0) goto L82
            r0.a = r8
            r0.b = r13
            r0.c = r9
            r0.d = r10
            r0.h = r5
            kotlin.Unit r7 = r7.a(r0)
            if (r7 == r1) goto Laa
        L82:
            r7 = r10
            r10 = r8
            r8 = r9
            r9 = r13
        L86:
            if (r7 == 0) goto Lab
            prb r7 = new prb
            r7.<init>()
            java.lang.String r11 = "event_id"
            java.lang.Object r10 = r10.get(r11)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r7.q(r10, r8)
            r0.a = r3
            r0.b = r3
            r0.h = r4
            java.lang.String r8 = "openIntentAsync"
            java.lang.Object r7 = r9.a(r7, r8, r0)
            if (r7 != r1) goto Lab
        Laa:
            return r1
        Lab:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.f92.a(java.util.Map, boolean, boolean, boolean, boolean, ads_mobile_sdk.cy0, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r5, nt5 r6) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.f92.a(java.lang.String, nt5):void");
    }

    public final void a(qb7 qb7Var, Activity activity, Uri uri, String str, Map map) throws NumberFormatException {
        gpe gpeVar = new gpe(qb7Var);
        Intent intent = (Intent) gpeVar.c;
        qr0 qr0Var = this.b;
        qr0Var.getClass();
        if (((Boolean) qr0Var.a("gads:cct_v2_partial_custom_tab_config:enabled", Boolean.TRUE, fo.a)).booleanValue()) {
            String str2 = (String) map.get("cct_init_h");
            String str3 = (String) map.get("cct_bp");
            if (str2 != null && !StringsKt.N(str2) && Integer.parseInt(str2) > 0) {
                int i = Integer.parseInt(str2);
                if (i <= 0) {
                    qp2.o("Invalid value for the initialHeightPx argument");
                    return;
                } else {
                    intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i);
                    intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", 0);
                }
            }
            if (str3 != null && !StringsKt.N(str3) && Integer.parseInt(str3) >= 0 && Integer.parseInt(str3) <= 2) {
                int i2 = Integer.parseInt(str3);
                if (i2 < 0 || i2 > 2) {
                    qp2.o("Invalid value for the position argument");
                    return;
                }
                intent.putExtra("androidx.browser.customtabs.extra.CLOSE_BUTTON_POSITION", i2);
            }
        }
        x66 x66VarA = gpeVar.a();
        Intent intent2 = x66VarA.a;
        intent2.setPackage(str);
        intent2.setData(uri);
        activity.startActivity(intent2, x66VarA.b);
    }

    @Override // defpackage.ato
    public final int b() {
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ads_mobile_sdk.cy0 r11, java.util.Map r12, nt5 r13) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.f92.b(ads_mobile_sdk.cy0, java.util.Map, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00de, code lost:
    
        if (ads_mobile_sdk.jz2.a(r0, r12, r14) == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0102, code lost:
    
        if (r9.a(r4, r6, r5, r8, r0, r10, r11, r12, r13, r14) == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0104, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.Map r17, boolean r18, boolean r19, ads_mobile_sdk.cy0 r20, nt5 r21) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.f92.b(java.util.Map, boolean, boolean, ads_mobile_sdk.cy0, nt5):java.lang.Object");
    }

    public final Map b(String str) {
        if (str.length() == 0) {
            return n08.a;
        }
        try {
            prb prbVar = (prb) new m5a().b(prb.class, str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            egc it = prbVar.a.entrySet().iterator();
            while (it.hasNext()) {
                ggc ggcVarA = it.a();
                linkedHashMap.put((String) ggcVarA.getKey(), ((pqb) ggcVarA.getValue()).n());
            }
            return linkedHashMap;
        } catch (Exception e) {
            xu0.b("Failed to parse extra query params", e);
            this.s.a("OpenGmsgHandler.parseHsdpExtraQueryParams", (Throwable) e);
            return n08.a;
        }
    }
}
