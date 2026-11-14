package ads_mobile_sdk;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import defpackage.coh;
import defpackage.prb;
import defpackage.vkp;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class cg0 {
    public static final Uri q = Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push");
    public final CoroutineContext a;
    public final nx5 b;
    public final ux2 c;
    public final ah3 d;
    public final g0 e;
    public final qr0 f;
    public final ax0 g;
    public final ek h;
    public final vkp i;
    public final d91 j;
    public String l;
    public String m;
    public prb n;
    public String p;
    public final AtomicBoolean k = new AtomicBoolean(false);
    public kh3 o = coh.e();

    public cg0(CoroutineContext coroutineContext, nx5 nx5Var, ux2 ux2Var, ah3 ah3Var, g0 g0Var, qr0 qr0Var, ax0 ax0Var, ek ekVar, vkp vkpVar, d91 d91Var) {
        this.a = coroutineContext;
        this.b = nx5Var;
        this.c = ux2Var;
        this.d = ah3Var;
        this.e = g0Var;
        this.f = qr0Var;
        this.g = ax0Var;
        this.h = ekVar;
        this.i = vkpVar;
        this.j = d91Var;
    }

    public static /* synthetic */ Object a(cg0 cg0Var, String str, Activity activity, boolean z, nt5 nt5Var, int i) {
        nt5 nt5Var2;
        boolean z2;
        boolean z3 = (i & 1) == 0;
        if ((i & 2) != 0) {
            str = "In-app preview failed to load because of a system error. Please try again later.";
        }
        if ((i & 4) != 0) {
            activity = null;
        }
        if ((i & 8) != 0) {
            nt5Var2 = nt5Var;
            z2 = false;
        } else {
            nt5Var2 = nt5Var;
            z2 = z;
        }
        return cg0Var.a(z3, str, activity, z2, nt5Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017e A[Catch: all -> 0x01a5, TryCatch #1 {all -> 0x01a5, blocks: (B:100:0x0177, B:102:0x017e, B:104:0x0185, B:106:0x0189, B:108:0x018d, B:109:0x018e, B:110:0x0193, B:111:0x0194, B:112:0x019b, B:113:0x019c, B:114:0x01a3, B:115:0x01a4), top: B:123:0x0177 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a4 A[Catch: all -> 0x01a5, TRY_LEAVE, TryCatch #1 {all -> 0x01a5, blocks: (B:100:0x0177, B:102:0x017e, B:104:0x0185, B:106:0x0189, B:108:0x018d, B:109:0x018e, B:110:0x0193, B:111:0x0194, B:112:0x019b, B:113:0x019c, B:114:0x01a3, B:115:0x01a4), top: B:123:0x0177 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9 A[Catch: all -> 0x0110, TryCatch #5 {all -> 0x0110, blocks: (B:53:0x00e2, B:55:0x00e9, B:57:0x00f0, B:59:0x00f4, B:61:0x00f8, B:62:0x00f9, B:63:0x00fe, B:64:0x00ff, B:65:0x0106, B:66:0x0107, B:67:0x010e, B:68:0x010f), top: B:130:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010f A[Catch: all -> 0x0110, TRY_LEAVE, TryCatch #5 {all -> 0x0110, blocks: (B:53:0x00e2, B:55:0x00e9, B:57:0x00f0, B:59:0x00f4, B:61:0x00f8, B:62:0x00f9, B:63:0x00fe, B:64:0x00ff, B:65:0x0106, B:66:0x0107, B:67:0x010e, B:68:0x010f), top: B:130:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r1v17, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r4v9, types: [ads_mobile_sdk.rg3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.cg0 r16, java.lang.String r17, java.lang.String r18, defpackage.prb r19, ads_mobile_sdk.kh3 r20, nt5 r21) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cg0.a(ads_mobile_sdk.cg0, java.lang.String, java.lang.String, prb, ads_mobile_sdk.kh3, nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0202 A[Catch: all -> 0x0229, TryCatch #3 {all -> 0x0229, blocks: (B:105:0x01fb, B:107:0x0202, B:109:0x0209, B:111:0x020d, B:113:0x0211, B:114:0x0212, B:115:0x0217, B:116:0x0218, B:117:0x021f, B:118:0x0220, B:119:0x0227, B:120:0x0228), top: B:208:0x01fb }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0228 A[Catch: all -> 0x0229, TRY_LEAVE, TryCatch #3 {all -> 0x0229, blocks: (B:105:0x01fb, B:107:0x0202, B:109:0x0209, B:111:0x020d, B:113:0x0211, B:114:0x0212, B:115:0x0217, B:116:0x0218, B:117:0x021f, B:118:0x0220, B:119:0x0227, B:120:0x0228), top: B:208:0x01fb }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0305 A[Catch: all -> 0x0310, TRY_LEAVE, TryCatch #8 {all -> 0x0310, blocks: (B:151:0x02f0, B:154:0x02fa, B:156:0x0305), top: B:216:0x02f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0318 A[Catch: all -> 0x0337, TRY_ENTER, TRY_LEAVE, TryCatch #15 {all -> 0x0337, blocks: (B:136:0x0271, B:139:0x028a, B:141:0x028e, B:167:0x0318), top: B:227:0x0271 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0344 A[Catch: all -> 0x036b, TryCatch #5 {all -> 0x036b, blocks: (B:180:0x033d, B:182:0x0344, B:184:0x034b, B:186:0x034f, B:188:0x0353, B:189:0x0354, B:190:0x0359, B:191:0x035a, B:192:0x0361, B:193:0x0362, B:194:0x0369, B:195:0x036a), top: B:211:0x033d }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x036a A[Catch: all -> 0x036b, TRY_LEAVE, TryCatch #5 {all -> 0x036b, blocks: (B:180:0x033d, B:182:0x0344, B:184:0x034b, B:186:0x034f, B:188:0x0353, B:189:0x0354, B:190:0x0359, B:191:0x035a, B:192:0x0361, B:193:0x0362, B:194:0x0369, B:195:0x036a), top: B:211:0x033d }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c6 A[Catch: all -> 0x01d1, TRY_LEAVE, TryCatch #9 {all -> 0x01d1, blocks: (B:77:0x01b2, B:80:0x01bb, B:82:0x01c6), top: B:218:0x01b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d9 A[Catch: all -> 0x01f6, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x01f6, blocks: (B:49:0x00d9, B:62:0x0136, B:65:0x014f, B:67:0x0153, B:93:0x01d9), top: B:225:0x00d9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.cg0 r16, nt5 r17) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cg0.a(ads_mobile_sdk.cg0, nt5):java.lang.Object");
    }

    public static final void a(cg0 cg0Var, String str) {
        cg0Var.g.a(Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
        cg0Var.k.set(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b2, code lost:
    
        if (r1.a(r3, r12, r5) == r0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f7, code lost:
    
        if (r1.a(r3, r12, r5) != r0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d2 A[Catch: all -> 0x01f9, TryCatch #6 {all -> 0x01f9, blocks: (B:114:0x01cb, B:116:0x01d2, B:118:0x01d9, B:120:0x01dd, B:122:0x01e1, B:123:0x01e2, B:124:0x01e7, B:125:0x01e8, B:126:0x01ef, B:127:0x01f0, B:128:0x01f7, B:129:0x01f8), top: B:145:0x01cb }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f8 A[Catch: all -> 0x01f9, TRY_LEAVE, TryCatch #6 {all -> 0x01f9, blocks: (B:114:0x01cb, B:116:0x01d2, B:118:0x01d9, B:120:0x01dd, B:122:0x01e1, B:123:0x01e2, B:124:0x01e7, B:125:0x01e8, B:126:0x01ef, B:127:0x01f0, B:128:0x01f7, B:129:0x01f8), top: B:145:0x01cb }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0 A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:40:0x00ba, B:42:0x00c0, B:44:0x00d8, B:47:0x00de, B:49:0x00e2), top: B:143:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:40:0x00ba, B:42:0x00c0, B:44:0x00d8, B:47:0x00de, B:49:0x00e2), top: B:143:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0116 A[Catch: all -> 0x013d, TryCatch #10 {all -> 0x013d, blocks: (B:61:0x010f, B:63:0x0116, B:65:0x011d, B:67:0x0121, B:69:0x0125, B:70:0x0126, B:71:0x012b, B:72:0x012c, B:73:0x0133, B:74:0x0134, B:75:0x013b, B:76:0x013c), top: B:151:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013c A[Catch: all -> 0x013d, TRY_LEAVE, TryCatch #10 {all -> 0x013d, blocks: (B:61:0x010f, B:63:0x0116, B:65:0x011d, B:67:0x0121, B:69:0x0125, B:70:0x0126, B:71:0x012b, B:72:0x012c, B:73:0x0133, B:74:0x0134, B:75:0x013b, B:76:0x013c), top: B:151:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017d A[Catch: all -> 0x01c2, TryCatch #3 {all -> 0x01c2, blocks: (B:92:0x0177, B:94:0x017d, B:96:0x0195, B:99:0x019a, B:101:0x019e), top: B:142:0x0177 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019a A[Catch: all -> 0x01c2, TryCatch #3 {all -> 0x01c2, blocks: (B:92:0x0177, B:94:0x017d, B:96:0x0195, B:99:0x019a, B:101:0x019e), top: B:142:0x0177 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ads_mobile_sdk.cg0 r11, nt5 r12) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cg0.b(ads_mobile_sdk.cg0, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.app.Activity r8, java.lang.String r9, ads_mobile_sdk.bg0 r10) {
        /*
            r7 = this;
            int r0 = r9.hashCode()
            switch(r0) {
                case 48: goto L42;
                case 49: goto L2b;
                case 50: goto L8;
                default: goto L7;
            }
        L7:
            goto L27
        L8:
            java.lang.String r0 = "2"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L27
            r4 = 1
            r6 = 1
            java.lang.String r2 = "There was no creative pushed from DFP to the device."
            r1 = r7
            r3 = r8
            r5 = r10
            java.lang.Object r7 = a(r1, r2, r3, r4, r5, r6)
            px5 r8 = px5.a
            if (r7 == r8) goto L21
            kotlin.Unit r7 = kotlin.Unit.a
        L21:
            if (r7 != r8) goto L24
            return r7
        L24:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L27:
            r0 = r7
            r2 = r8
            r4 = r10
            goto L4d
        L2b:
            r0 = r7
            r2 = r8
            r4 = r10
            java.lang.String r7 = "1"
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4d
            java.lang.Object r7 = r0.c(r4)
            px5 r8 = px5.a
            if (r7 != r8) goto L3f
            return r7
        L3f:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L42:
            r0 = r7
            r2 = r8
            r4 = r10
            java.lang.String r7 = "0"
            boolean r7 = r9.equals(r7)
            if (r7 != 0) goto L7b
        L4d:
            int r7 = r9.length()
            r8 = 50
            int r7 = java.lang.Math.min(r8, r7)
            r8 = 0
            java.lang.String r7 = r9.substring(r8, r7)
            java.lang.String r8 = "Invalid creative preview status: "
            java.lang.String r7 = r8.concat(r7)
            r8 = 0
            r9 = 6
            ads_mobile_sdk.xh3.a(r7, r8, r9)
            r3 = 0
            r5 = 10
            r1 = 0
            java.lang.Object r7 = a(r0, r1, r2, r3, r4, r5)
            px5 r8 = px5.a
            if (r7 == r8) goto L75
            kotlin.Unit r7 = kotlin.Unit.a
        L75:
            if (r7 != r8) goto L78
            return r7
        L78:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L7b:
            r3 = 0
            r5 = 1
            java.lang.String r1 = "The device is successfully linked for creative preview."
            java.lang.Object r7 = a(r0, r1, r2, r3, r4, r5)
            px5 r8 = px5.a
            if (r7 == r8) goto L89
            kotlin.Unit r7 = kotlin.Unit.a
        L89:
            if (r7 != r8) goto L8c
            return r7
        L8c:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cg0.a(android.app.Activity, java.lang.String, ads_mobile_sdk.bg0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x015b, code lost:
    
        if (defpackage.na2.Z(r1, r4, r2) == r3) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.app.Activity r23, nt5 r24) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cg0.a(android.app.Activity, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01fd A[Catch: all -> 0x01fe, TRY_LEAVE, TryCatch #8 {all -> 0x01fe, blocks: (B:85:0x01d0, B:87:0x01d7, B:89:0x01de, B:91:0x01e2, B:93:0x01e6, B:94:0x01e7, B:95:0x01ec, B:96:0x01ed, B:97:0x01f4, B:98:0x01f5, B:99:0x01fc, B:100:0x01fd), top: B:121:0x01d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0117 A[Catch: all -> 0x01c8, TryCatch #5 {all -> 0x01c8, blocks: (B:74:0x01bd, B:25:0x0070, B:37:0x0111, B:39:0x0117, B:40:0x011b), top: B:115:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011b A[Catch: all -> 0x01c8, TRY_LEAVE, TryCatch #5 {all -> 0x01c8, blocks: (B:74:0x01bd, B:25:0x0070, B:37:0x0111, B:39:0x0117, B:40:0x011b), top: B:115:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d7 A[Catch: all -> 0x01fe, TryCatch #8 {all -> 0x01fe, blocks: (B:85:0x01d0, B:87:0x01d7, B:89:0x01de, B:91:0x01e2, B:93:0x01e6, B:94:0x01e7, B:95:0x01ec, B:96:0x01ed, B:97:0x01f4, B:98:0x01f5, B:99:0x01fc, B:100:0x01fd), top: B:121:0x01d0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r17) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cg0.a(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r7, java.lang.String r8, android.app.Activity r9, boolean r10, nt5 r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof ads_mobile_sdk.yf0
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.yf0 r0 = (ads_mobile_sdk.yf0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.yf0 r0 = new ads_mobile_sdk.yf0
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2c
            ads_mobile_sdk.cg0 r6 = r0.a
            defpackage.ybh.y(r11)     // Catch: java.lang.Throwable -> L92
            goto Lac
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r5
        L32:
            defpackage.ybh.y(r11)
            if (r9 != 0) goto L3d
            ads_mobile_sdk.g0 r9 = r6.e     // Catch: java.lang.Throwable -> L92
            android.app.Activity r9 = r9.b()     // Catch: java.lang.Throwable -> L92
        L3d:
            if (r9 != 0) goto L4d
            java.lang.String r7 = "No Activity context available for showing status dialog."
            r8 = 6
            ads_mobile_sdk.xh3.a(r7, r5, r8)     // Catch: java.lang.Throwable -> L92
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.k     // Catch: java.lang.Throwable -> L92
            r7.set(r4)     // Catch: java.lang.Throwable -> L92
            kotlin.Unit r6 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L92
            return r6
        L4d:
            android.app.AlertDialog$Builder r11 = new android.app.AlertDialog$Builder     // Catch: java.lang.Throwable -> L92
            r2 = 16974374(0x1030226, float:2.4062441E-38)
            r11.<init>(r9, r2)     // Catch: java.lang.Throwable -> L92
            if (r7 == 0) goto L5a
            java.lang.String r7 = "Error"
            goto L5c
        L5a:
            java.lang.String r7 = "Info"
        L5c:
            r11.setTitle(r7)     // Catch: java.lang.Throwable -> L92
            r11.setMessage(r8)     // Catch: java.lang.Throwable -> L92
            mso r7 = new mso     // Catch: java.lang.Throwable -> L92
            r7.<init>(r6, r4)     // Catch: java.lang.Throwable -> L92
            r11.setOnDismissListener(r7)     // Catch: java.lang.Throwable -> L92
            java.lang.String r7 = "Dismiss"
            if (r10 == 0) goto L7c
            r11.setNegativeButton(r7, r5)     // Catch: java.lang.Throwable -> L92
            java.lang.String r7 = "Learn More"
            kso r8 = new kso     // Catch: java.lang.Throwable -> L92
            r8.<init>(r6, r3)     // Catch: java.lang.Throwable -> L92
            r11.setPositiveButton(r7, r8)     // Catch: java.lang.Throwable -> L92
            goto L7f
        L7c:
            r11.setNeutralButton(r7, r5)     // Catch: java.lang.Throwable -> L92
        L7f:
            kotlin.coroutines.CoroutineContext r7 = r6.a     // Catch: java.lang.Throwable -> L92
            ads_mobile_sdk.lf0 r8 = new ads_mobile_sdk.lf0     // Catch: java.lang.Throwable -> L92
            r9 = 3
            r8.<init>(r11, r5, r9)     // Catch: java.lang.Throwable -> L92
            r0.a = r6     // Catch: java.lang.Throwable -> L92
            r0.d = r3     // Catch: java.lang.Throwable -> L92
            java.lang.Object r6 = defpackage.na2.Z(r7, r8, r0)     // Catch: java.lang.Throwable -> L92
            if (r6 != r1) goto Lac
            return r1
        L92:
            r7 = move-exception
            ads_mobile_sdk.rg3 r8 = ads_mobile_sdk.hh3.a()
            ads_mobile_sdk.ub2 r9 = r8.e()
            r9.m = r4
            r8.a(r7)
            java.util.concurrent.atomic.AtomicBoolean r8 = r6.k
            r8.set(r4)
            ads_mobile_sdk.ah3 r6 = r6.d
            java.lang.String r8 = "Failed to show status dialog"
            r6.a(r8, r7)
        Lac:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cg0.a(boolean, java.lang.String, android.app.Activity, boolean, nt5):java.lang.Object");
    }

    public final String a(String str) {
        if (str.length() != 0) {
            String string = StringsKt.l0(CollectionsKt.P(this.g.d(new Uri.Builder().encodedQuery(new Regex("\\+").replace(str, "%20")).build()).entrySet(), "\n\n", (CharSequence) null, (String) null, 0, fo.a$5, 30)).toString();
            if (!StringsKt.N(string)) {
                return string;
            }
        }
        return "No debug information";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(nt5 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.jf0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.jf0 r0 = (ads_mobile_sdk.jf0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.jf0 r0 = new ads_mobile_sdk.jf0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            ads_mobile_sdk.cg0 r7 = r0.c
            ads_mobile_sdk.ax0 r1 = r0.b
            ads_mobile_sdk.cg0 r0 = r0.a
            defpackage.ybh.y(r8)
            goto L62
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r4
        L34:
            defpackage.ybh.y(r8)
            ads_mobile_sdk.qr0 r8 = r7.f
            r8.getClass()
            ads_mobile_sdk.fo r2 = ads_mobile_sdk.fo.a$23
            java.lang.String r5 = "gads:drx_debug:debug_device_linking_url"
            java.lang.String r6 = "https://www.google.com/dfp/linkDevice"
            java.lang.Object r8 = r8.a(r5, r6, r2)
            java.lang.String r8 = (java.lang.String) r8
            r0.a = r7
            ads_mobile_sdk.ax0 r2 = r7.g
            r0.b = r2
            r0.c = r7
            r0.f = r3
            java.lang.String r3 = r7.l
            ads_mobile_sdk.d91 r5 = r7.j
            r5.getClass()
            java.lang.Comparable r8 = ads_mobile_sdk.d91.a(r5, r8, r3, r4, r0)
            if (r8 != r1) goto L60
            return r1
        L60:
            r0 = r7
            r1 = r2
        L62:
            android.net.Uri r8 = (android.net.Uri) r8
            r7.getClass()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.VIEW"
            r2.<init>(r3, r8)
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.String r3 = "android.support.customtabs.extra.SESSION"
            r8.putBinder(r3, r4)
            java.lang.String r7 = r7.p
            if (r7 == 0) goto L7d
            r4 = r7
        L7d:
            java.lang.String r7 = "com.android.browser.application_id"
            r8.putString(r7, r4)
            r2.putExtras(r8)
            r1.a(r2)
            java.util.concurrent.atomic.AtomicBoolean r7 = r0.k
            r8 = 0
            r7.set(r8)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cg0.c(nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01dc A[Catch: all -> 0x0203, TryCatch #2 {all -> 0x0203, blocks: (B:102:0x01d5, B:104:0x01dc, B:106:0x01e3, B:108:0x01e7, B:110:0x01eb, B:111:0x01ec, B:112:0x01f1, B:113:0x01f2, B:114:0x01f9, B:115:0x01fa, B:116:0x0201, B:117:0x0202), top: B:128:0x01d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0202 A[Catch: all -> 0x0203, TRY_LEAVE, TryCatch #2 {all -> 0x0203, blocks: (B:102:0x01d5, B:104:0x01dc, B:106:0x01e3, B:108:0x01e7, B:110:0x01eb, B:111:0x01ec, B:112:0x01f1, B:113:0x01f2, B:114:0x01f9, B:115:0x01fa, B:116:0x0201, B:117:0x0202), top: B:128:0x01d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f A[Catch: all -> 0x0136, TryCatch #10 {all -> 0x0136, blocks: (B:52:0x0108, B:54:0x010f, B:56:0x0116, B:58:0x011a, B:60:0x011e, B:61:0x011f, B:62:0x0124, B:63:0x0125, B:64:0x012c, B:65:0x012d, B:66:0x0134, B:67:0x0135), top: B:142:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0135 A[Catch: all -> 0x0136, TRY_LEAVE, TryCatch #10 {all -> 0x0136, blocks: (B:52:0x0108, B:54:0x010f, B:56:0x0116, B:58:0x011a, B:60:0x011e, B:61:0x011f, B:62:0x0124, B:63:0x0125, B:64:0x012c, B:65:0x012d, B:66:0x0134, B:67:0x0135), top: B:142:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v17, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r3v9, types: [ads_mobile_sdk.rg3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(nt5 r18) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cg0.d(nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0344, code lost:
    
        if (r4.c(r2) != r3) goto L151;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029f A[Catch: all -> 0x02c6, TryCatch #4 {all -> 0x02c6, blocks: (B:111:0x0298, B:113:0x029f, B:115:0x02a6, B:117:0x02aa, B:119:0x02ae, B:120:0x02af, B:121:0x02b4, B:122:0x02b5, B:123:0x02bc, B:124:0x02bd, B:125:0x02c4, B:126:0x02c5), top: B:223:0x0298 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c5 A[Catch: all -> 0x02c6, TRY_LEAVE, TryCatch #4 {all -> 0x02c6, blocks: (B:111:0x0298, B:113:0x029f, B:115:0x02a6, B:117:0x02aa, B:119:0x02ae, B:120:0x02af, B:121:0x02b4, B:122:0x02b5, B:123:0x02bc, B:124:0x02bd, B:125:0x02c4, B:126:0x02c5), top: B:223:0x0298 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0309 A[Catch: all -> 0x0450, TRY_LEAVE, TryCatch #15 {all -> 0x0450, blocks: (B:142:0x0301, B:144:0x0309), top: B:240:0x0301 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0333 A[Catch: all -> 0x044e, TryCatch #14 {all -> 0x044e, blocks: (B:180:0x0441, B:18:0x005d, B:22:0x006e, B:151:0x0346, B:25:0x007d, B:147:0x032b, B:149:0x0333, B:156:0x0355, B:28:0x008c), top: B:219:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x045d A[Catch: all -> 0x0484, TryCatch #3 {all -> 0x0484, blocks: (B:195:0x0456, B:197:0x045d, B:199:0x0464, B:201:0x0468, B:203:0x046c, B:204:0x046d, B:205:0x0472, B:206:0x0473, B:207:0x047a, B:208:0x047b, B:209:0x0482, B:210:0x0483), top: B:222:0x0456 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0483 A[Catch: all -> 0x0484, TRY_LEAVE, TryCatch #3 {all -> 0x0484, blocks: (B:195:0x0456, B:197:0x045d, B:199:0x0464, B:201:0x0468, B:203:0x046c, B:204:0x046d, B:205:0x0472, B:206:0x0473, B:207:0x047a, B:208:0x047b, B:209:0x0482, B:210:0x0483), top: B:222:0x0456 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0148 A[Catch: all -> 0x0291, TRY_LEAVE, TryCatch #16 {all -> 0x0291, blocks: (B:58:0x0140, B:60:0x0148), top: B:242:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0171 A[Catch: all -> 0x028d, TRY_LEAVE, TryCatch #13 {all -> 0x028d, blocks: (B:42:0x00dc, B:63:0x0169, B:65:0x0171, B:73:0x0194, B:45:0x00eb), top: B:219:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0257  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v19, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r5v11, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(nt5 r25) {
        /*
            Method dump skipped, instructions count: 1190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.cg0.e(nt5):java.lang.Object");
    }
}
