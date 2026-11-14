package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import defpackage.cs5;
import defpackage.mip;
import defpackage.prb;
import defpackage.rap;
import defpackage.sbl;
import defpackage.tm;
import defpackage.tso;
import defpackage.um;
import defpackage.vkp;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class d91 extends k61 {
    public static final um N;
    public static final um O;
    public static final um P;
    public static final um Q;
    public static final um R;
    public prb A;
    public prb B;
    public x71 C;
    public final pfe D;
    public long E;
    public final LinkedHashMap F;
    public final LinkedHashMap G;
    public final pfe H;
    public WeakReference I;
    public final AtomicBoolean J;
    public final AtomicBoolean K;
    public final AtomicBoolean L;
    public Boolean M;
    public final Context c;
    public final nx5 d;
    public final String e;
    public final tso f;
    public final tso g;
    public final m5a h;
    public final qr0 i;
    public final mip j;
    public final vkp k;
    public final ka1 l;
    public final ng m;
    public final dk n;
    public final ba1 o;
    public final oo3 p;
    public final ux2 q;
    public final cu2 r;
    public final tso s;
    public final o71 t;
    public final vz u;
    public final yi v;
    public final i41 w;
    public final pfe x;
    public ia1 y;
    public boolean z;

    static {
        tm[] tmVarArr = tm.a;
        N = new um("Ad inspector cannot be opened because it is already open.");
        tm[] tmVarArr2 = tm.a;
        O = new um("Ad inspector failed to load.");
        tm[] tmVarArr3 = tm.a;
        P = new um("Ad inspector had an internal error.");
        tm[] tmVarArr4 = tm.a;
        Q = new um("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
        tm[] tmVarArr5 = tm.a;
        R = new um("Ad inspector cannot be opened because it is disabled in the AndroidManifest.xml.");
    }

    public d91(Context context, nx5 nx5Var, String str, tso tsoVar, tso tsoVar2, m5a m5aVar, qr0 qr0Var, mip mipVar, vkp vkpVar, ka1 ka1Var, ng ngVar, dk dkVar, ba1 ba1Var, oo3 oo3Var, ux2 ux2Var, cu2 cu2Var, tso tsoVar3, o71 o71Var, vz vzVar, yi yiVar, i41 i41Var) {
        super(fw0.CUI_NAME_SDKINIT_INIT_AD_INSPECTOR, false);
        this.c = context;
        this.d = nx5Var;
        this.e = str;
        this.f = tsoVar;
        this.g = tsoVar2;
        this.h = m5aVar;
        this.i = qr0Var;
        this.j = mipVar;
        this.k = vkpVar;
        this.l = ka1Var;
        this.m = ngVar;
        this.n = dkVar;
        this.o = ba1Var;
        this.p = oo3Var;
        this.q = ux2Var;
        this.r = cu2Var;
        this.s = tsoVar3;
        this.t = o71Var;
        this.u = vzVar;
        this.v = yiVar;
        this.w = i41Var;
        this.x = new pfe();
        this.A = new prb();
        this.B = new prb();
        this.C = x71.a;
        this.D = new pfe();
        this.F = new LinkedHashMap();
        this.G = new LinkedHashMap();
        this.H = new pfe();
        this.I = new WeakReference(null);
        this.J = new AtomicBoolean(false);
        this.K = new AtomicBoolean(false);
        this.L = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Comparable a(ads_mobile_sdk.d91 r5, java.lang.String r6, java.lang.String r7, defpackage.prb r8, nt5 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.z71
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.z71 r0 = (ads_mobile_sdk.z71) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            ads_mobile_sdk.z71 r0 = new ads_mobile_sdk.z71
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.h
            px5 r1 = px5.a
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L3a
            android.net.Uri$Builder r5 = r0.g
            java.lang.String r6 = r0.f
            android.net.Uri$Builder r7 = r0.e
            android.net.Uri$Builder r8 = r0.d
            prb r1 = r0.c
            java.lang.String r2 = r0.b
            ads_mobile_sdk.d91 r0 = r0.a
            defpackage.ybh.y(r9)
            r4 = r8
            r8 = r7
            r7 = r2
            r2 = r9
            r9 = r4
            goto L6f
        L3a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            r5 = 0
            return r5
        L41:
            defpackage.ybh.y(r9)
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            r0.a = r5
            r0.b = r7
            r0.c = r8
            r0.d = r6
            r0.e = r6
            java.lang.String r9 = "linkedDeviceId"
            r0.f = r9
            r0.g = r6
            r0.j = r3
            r5.getClass()
            java.lang.Object r0 = b(r5, r0)
            if (r0 != r1) goto L68
            return r1
        L68:
            r1 = r8
            r2 = r0
            r0 = r5
            r5 = r6
            r8 = r5
            r6 = r9
            r9 = r8
        L6f:
            ads_mobile_sdk.ia1 r2 = (ads_mobile_sdk.ia1) r2
            java.lang.String r2 = r2.q()
            r5.appendQueryParameter(r6, r2)
            if (r7 == 0) goto L7f
            java.lang.String r5 = "adSlotPath"
            r8.appendQueryParameter(r5, r7)
        L7f:
            java.lang.String r5 = r0.e
            java.lang.String r6 = "afmaVersion"
            r8.appendQueryParameter(r6, r5)
            if (r1 == 0) goto L91
            java.lang.String r5 = r1.toString()
            java.lang.String r6 = "debugData"
            r8.appendQueryParameter(r6, r5)
        L91:
            android.net.Uri r5 = r9.build()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.a(ads_mobile_sdk.d91, java.lang.String, java.lang.String, prb, nt5):java.lang.Comparable");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #0 {all -> 0x00cc, blocks: (B:14:0x0033, B:38:0x0098, B:40:0x009e, B:43:0x00a4, B:45:0x00aa, B:46:0x00c6), top: B:55:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4 A[Catch: all -> 0x00cc, TRY_ENTER, TryCatch #0 {all -> 0x00cc, blocks: (B:14:0x0033, B:38:0x0098, B:40:0x009e, B:43:0x00a4, B:45:0x00aa, B:46:0x00c6), top: B:55:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.d91 r16, int r17, nt5 r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.a(ads_mobile_sdk.d91, int, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0536, code lost:
    
        if (r3 != r9) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x080e, code lost:
    
        if (r3 == r9) goto L254;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04e6 A[Catch: all -> 0x0556, TRY_LEAVE, TryCatch #24 {all -> 0x0556, blocks: (B:123:0x04e0, B:125:0x04e6, B:129:0x051b, B:112:0x048a, B:116:0x049b), top: B:345:0x048a }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x051b A[Catch: all -> 0x0556, TRY_ENTER, TRY_LEAVE, TryCatch #24 {all -> 0x0556, blocks: (B:123:0x04e0, B:125:0x04e6, B:129:0x051b, B:112:0x048a, B:116:0x049b), top: B:345:0x048a }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0586 A[Catch: all -> 0x05ad, TryCatch #6 {all -> 0x05ad, blocks: (B:168:0x057f, B:170:0x0586, B:172:0x058d, B:174:0x0591, B:176:0x0595, B:177:0x0596, B:178:0x059b, B:179:0x059c, B:180:0x05a3, B:181:0x05a4, B:182:0x05ab, B:183:0x05ac), top: B:322:0x057f }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05ac A[Catch: all -> 0x05ad, TRY_LEAVE, TryCatch #6 {all -> 0x05ad, blocks: (B:168:0x057f, B:170:0x0586, B:172:0x058d, B:174:0x0591, B:176:0x0595, B:177:0x0596, B:178:0x059b, B:179:0x059c, B:180:0x05a3, B:181:0x05a4, B:182:0x05ab, B:183:0x05ac), top: B:322:0x057f }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05ed A[Catch: all -> 0x0851, TRY_LEAVE, TryCatch #22 {all -> 0x0851, blocks: (B:196:0x05e8, B:198:0x05ed, B:201:0x061e, B:286:0x084d, B:287:0x0850, B:194:0x05e1), top: B:341:0x05e1, inners: #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x061e A[Catch: all -> 0x0851, TRY_ENTER, TRY_LEAVE, TryCatch #22 {all -> 0x0851, blocks: (B:196:0x05e8, B:198:0x05ed, B:201:0x061e, B:286:0x084d, B:287:0x0850, B:194:0x05e1), top: B:341:0x05e1, inners: #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0645 A[Catch: all -> 0x0847, TRY_LEAVE, TryCatch #17 {all -> 0x0847, blocks: (B:27:0x00e3, B:30:0x010a, B:221:0x06cf, B:277:0x083d, B:278:0x0840, B:33:0x0132, B:206:0x0640, B:208:0x0645, B:211:0x0676, B:213:0x067e, B:216:0x06af, B:280:0x0842, B:281:0x0846, B:36:0x0161, B:219:0x06cc, B:204:0x063b), top: B:319:0x003f, inners: #14, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0676 A[Catch: all -> 0x0847, TRY_ENTER, TryCatch #17 {all -> 0x0847, blocks: (B:27:0x00e3, B:30:0x010a, B:221:0x06cf, B:277:0x083d, B:278:0x0840, B:33:0x0132, B:206:0x0640, B:208:0x0645, B:211:0x0676, B:213:0x067e, B:216:0x06af, B:280:0x0842, B:281:0x0846, B:36:0x0161, B:219:0x06cc, B:204:0x063b), top: B:319:0x003f, inners: #14, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x07be A[Catch: all -> 0x0830, TRY_LEAVE, TryCatch #8 {all -> 0x0830, blocks: (B:255:0x0811, B:257:0x0819, B:258:0x0820, B:246:0x07b8, B:248:0x07be, B:252:0x07f3, B:237:0x0760, B:240:0x076f), top: B:325:0x0760 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x07f3 A[Catch: all -> 0x0830, TRY_ENTER, TryCatch #8 {all -> 0x0830, blocks: (B:255:0x0811, B:257:0x0819, B:258:0x0820, B:246:0x07b8, B:248:0x07be, B:252:0x07f3, B:237:0x0760, B:240:0x076f), top: B:325:0x0760 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0860 A[Catch: all -> 0x0887, TryCatch #18 {all -> 0x0887, blocks: (B:293:0x0859, B:295:0x0860, B:297:0x0867, B:299:0x086b, B:301:0x086f, B:302:0x0870, B:303:0x0875, B:304:0x0876, B:305:0x087d, B:306:0x087e, B:307:0x0885, B:308:0x0886), top: B:338:0x0859 }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0886 A[Catch: all -> 0x0887, TRY_LEAVE, TryCatch #18 {all -> 0x0887, blocks: (B:293:0x0859, B:295:0x0860, B:297:0x0867, B:299:0x086b, B:301:0x086f, B:302:0x0870, B:303:0x0875, B:304:0x0876, B:305:0x087d, B:306:0x087e, B:307:0x0885, B:308:0x0886), top: B:338:0x0859 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0312 A[Catch: all -> 0x0577, TRY_LEAVE, TryCatch #12 {all -> 0x0577, blocks: (B:70:0x030d, B:72:0x0312, B:76:0x0349, B:161:0x0573, B:162:0x0576, B:68:0x0308), top: B:326:0x0308, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0371 A[Catch: all -> 0x056d, TRY_LEAVE, TryCatch #5 {all -> 0x056d, blocks: (B:51:0x020e, B:54:0x0238, B:96:0x03fa, B:152:0x0563, B:153:0x0566, B:57:0x0263, B:81:0x036c, B:83:0x0371, B:86:0x03a4, B:88:0x03ac, B:91:0x03df, B:155:0x0568, B:156:0x056c, B:60:0x0295, B:94:0x03f7, B:79:0x0367), top: B:319:0x003f, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03a4 A[Catch: all -> 0x056d, TRY_ENTER, TryCatch #5 {all -> 0x056d, blocks: (B:51:0x020e, B:54:0x0238, B:96:0x03fa, B:152:0x0563, B:153:0x0566, B:57:0x0263, B:81:0x036c, B:83:0x0371, B:86:0x03a4, B:88:0x03ac, B:91:0x03df, B:155:0x0568, B:156:0x056c, B:60:0x0295, B:94:0x03f7, B:79:0x0367), top: B:319:0x003f, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0415  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v3, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v100 */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v106 */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v110 */
    /* JADX WARN: Type inference failed for: r1v12, types: [pfe] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52, types: [pfe] */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v74, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r1v93 */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r1v97 */
    /* JADX WARN: Type inference failed for: r1v98 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v97 */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r3v13, types: [ads_mobile_sdk.wk2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [ads_mobile_sdk.rg3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.d91 r27, ads_mobile_sdk.x71 r28, defpackage.zbf r29, nt5 r30) {
        /*
            Method dump skipped, instructions count: 2230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.a(ads_mobile_sdk.d91, ads_mobile_sdk.x71, zbf, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.d91 r8, java.lang.Boolean r9, java.lang.Boolean r10, int r11, java.lang.String r12, java.lang.Long r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Boolean r17, mt5 r18) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.a(ads_mobile_sdk.d91, java.lang.Boolean, java.lang.Boolean, int, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, mt5):java.lang.Object");
    }

    public static Object a(d91 d91Var, Boolean bool, Boolean bool2, int i, String str, Long l, String str2, String str3, String str4, Boolean bool3, mt5 mt5Var, int i2) {
        if ((i2 & 1) != 0) {
            bool = null;
        }
        if ((i2 & 2) != 0) {
            bool2 = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            l = null;
        }
        if ((i2 & 32) != 0) {
            str2 = null;
        }
        if ((i2 & 64) != 0) {
            str3 = null;
        }
        if ((i2 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0) {
            str4 = null;
        }
        if ((i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            bool3 = null;
        }
        d91Var.getClass();
        return a(d91Var, bool, bool2, i, str, l, str2, str3, str4, bool3, mt5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.d91 r16, java.lang.String r17, nt5 r18) throws java.lang.Throwable {
        /*
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof ads_mobile_sdk.v81
            if (r2 == 0) goto L18
            r2 = r1
            ads_mobile_sdk.v81 r2 = (ads_mobile_sdk.v81) r2
            int r3 = r2.f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f = r3
        L16:
            r13 = r2
            goto L1e
        L18:
            ads_mobile_sdk.v81 r2 = new ads_mobile_sdk.v81
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r13.d
            px5 r2 = px5.a
            int r3 = r13.f
            r4 = 2
            r5 = 1
            r15 = 0
            if (r3 == 0) goto L4b
            if (r3 == r5) goto L3c
            if (r3 != r4) goto L36
            java.lang.Object r0 = r13.a
            r2 = r0
            pfe r2 = (pfe) r2
            defpackage.ybh.y(r1)     // Catch: java.lang.Throwable -> L82
            goto L7c
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r0)
            return r15
        L3c:
            pfe r0 = r13.c
            java.lang.String r3 = r13.b
            java.lang.Object r5 = r13.a
            ads_mobile_sdk.d91 r5 = (ads_mobile_sdk.d91) r5
            defpackage.ybh.y(r1)
            r1 = r0
            r10 = r3
            r3 = r5
            goto L62
        L4b:
            defpackage.ybh.y(r1)
            pfe r1 = r0.x
            r13.a = r0
            r3 = r17
            r13.b = r3
            r13.c = r1
            r13.f = r5
            java.lang.Object r5 = r1.i(r13)
            if (r5 == r2) goto L7a
            r10 = r3
            r3 = r0
        L62:
            r13.a = r1     // Catch: java.lang.Throwable -> L85
            r13.b = r15     // Catch: java.lang.Throwable -> L85
            r13.c = r15     // Catch: java.lang.Throwable -> L85
            r13.f = r4     // Catch: java.lang.Throwable -> L85
            r6 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 447(0x1bf, float:6.26E-43)
            java.lang.Object r0 = a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L85
            if (r0 != r2) goto L7b
        L7a:
            return r2
        L7b:
            r2 = r1
        L7c:
            kotlin.Unit r0 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L82
            r2.l(r15)
            return r0
        L82:
            r0 = move-exception
            r1 = r2
            goto L86
        L85:
            r0 = move-exception
        L86:
            r1.l(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.a(ads_mobile_sdk.d91, java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0390, code lost:
    
        if (a(r5, r4, r6) != r7) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0230, code lost:
    
        if (a(r5, r4, r6) == r7) goto L144;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0287 A[Catch: all -> 0x0288, TRY_LEAVE, TryCatch #1 {all -> 0x0288, blocks: (B:87:0x025a, B:89:0x0261, B:91:0x0268, B:93:0x026c, B:95:0x0270, B:96:0x0271, B:97:0x0276, B:98:0x0277, B:99:0x027e, B:100:0x027f, B:101:0x0286, B:102:0x0287), top: B:184:0x025a }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0311 A[Catch: all -> 0x03b2, TRY_LEAVE, TryCatch #7 {all -> 0x03b2, blocks: (B:13:0x004a, B:145:0x0393, B:16:0x005d, B:142:0x037a, B:19:0x006e, B:116:0x030b, B:118:0x0311, B:121:0x031e, B:136:0x0358, B:149:0x039d, B:122:0x0324, B:124:0x0328, B:127:0x0330, B:130:0x033b, B:133:0x034a), top: B:192:0x0037, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x031e A[Catch: all -> 0x03b2, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x03b2, blocks: (B:13:0x004a, B:145:0x0393, B:16:0x005d, B:142:0x037a, B:19:0x006e, B:116:0x030b, B:118:0x0311, B:121:0x031e, B:136:0x0358, B:149:0x039d, B:122:0x0324, B:124:0x0328, B:127:0x0330, B:130:0x033b, B:133:0x034a), top: B:192:0x0037, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c3 A[Catch: all -> 0x03ea, TryCatch #2 {all -> 0x03ea, blocks: (B:158:0x03bc, B:160:0x03c3, B:162:0x03ca, B:164:0x03ce, B:166:0x03d2, B:167:0x03d3, B:168:0x03d8, B:169:0x03d9, B:170:0x03e0, B:171:0x03e1, B:172:0x03e8, B:173:0x03e9), top: B:185:0x03bc }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03e9 A[Catch: all -> 0x03ea, TRY_LEAVE, TryCatch #2 {all -> 0x03ea, blocks: (B:158:0x03bc, B:160:0x03c3, B:162:0x03ca, B:164:0x03ce, B:166:0x03d2, B:167:0x03d3, B:168:0x03d8, B:169:0x03d9, B:170:0x03e0, B:171:0x03e1, B:172:0x03e8, B:173:0x03e9), top: B:185:0x03bc }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b0 A[Catch: all -> 0x0251, TRY_LEAVE, TryCatch #6 {all -> 0x0251, blocks: (B:27:0x00ac, B:74:0x0232, B:30:0x00bf, B:72:0x021b, B:33:0x00d0, B:47:0x01aa, B:49:0x01b0, B:52:0x01bd, B:67:0x01fb, B:78:0x023c, B:53:0x01c3, B:55:0x01c7, B:58:0x01cf, B:61:0x01dc, B:64:0x01ed), top: B:192:0x0037, inners: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bd A[Catch: all -> 0x0251, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x0251, blocks: (B:27:0x00ac, B:74:0x0232, B:30:0x00bf, B:72:0x021b, B:33:0x00d0, B:47:0x01aa, B:49:0x01b0, B:52:0x01bd, B:67:0x01fb, B:78:0x023c, B:53:0x01c3, B:55:0x01c7, B:58:0x01cf, B:61:0x01dc, B:64:0x01ed), top: B:192:0x0037, inners: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0215 A[PHI: r0 r1 r2 r4 r5
      0x0215: PHI (r0v39 boolean) = (r0v31 boolean), (r0v40 boolean) binds: [B:68:0x0213, B:30:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r1v25 ads_mobile_sdk.rg3) = (r1v49 ads_mobile_sdk.rg3), (r1v50 ads_mobile_sdk.rg3) binds: [B:68:0x0213, B:30:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r2v19 ads_mobile_sdk.rg3) = (r2v35 ads_mobile_sdk.rg3), (r2v36 ads_mobile_sdk.rg3) binds: [B:68:0x0213, B:30:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r4v10 java.lang.String) = (r4v4 java.lang.String), (r4v14 java.lang.String) binds: [B:68:0x0213, B:30:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x0215: PHI (r5v20 ads_mobile_sdk.d91) = (r5v17 ads_mobile_sdk.d91), (r5v22 ads_mobile_sdk.d91) binds: [B:68:0x0213, B:30:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0261 A[Catch: all -> 0x0288, TryCatch #1 {all -> 0x0288, blocks: (B:87:0x025a, B:89:0x0261, B:91:0x0268, B:93:0x026c, B:95:0x0270, B:96:0x0271, B:97:0x0276, B:98:0x0277, B:99:0x027e, B:100:0x027f, B:101:0x0286, B:102:0x0287), top: B:184:0x025a }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v23, types: [ads_mobile_sdk.rg3, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v34, types: [ads_mobile_sdk.rg3, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r2v0, types: [prb] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v26, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.d91 r22, java.lang.String r23, defpackage.prb r24, nt5 r25) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.a(ads_mobile_sdk.d91, java.lang.String, prb, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.d91 r5, mt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.b81
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.b81 r0 = (ads_mobile_sdk.b81) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.b81 r0 = new ads_mobile_sdk.b81
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
            ads_mobile_sdk.d91 r0 = r0.a
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
            pfe r6 = r5.x
            r0.a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            boolean r5 = r5.g()     // Catch: java.lang.Throwable -> L52
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L52
            r6.l(r4)
            return r5
        L52:
            r5 = move-exception
            r6.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.a(ads_mobile_sdk.d91, mt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (a(r3, null, null, 0, null, null, null, null, null, r12, r13, 255) == r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, blocks: (B:22:0x0068, B:24:0x006e, B:27:0x0078, B:30:0x007d, B:32:0x0083), top: B:53:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8 A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, blocks: (B:14:0x0034, B:36:0x00a2, B:38:0x00a8, B:40:0x00ac, B:41:0x00af), top: B:51:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.d91 r17, defpackage.prb r18, nt5 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.a(ads_mobile_sdk.d91, prb, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6 A[Catch: all -> 0x00f1, TRY_LEAVE, TryCatch #0 {all -> 0x00f1, blocks: (B:14:0x0033, B:30:0x00a0, B:32:0x00a6, B:35:0x00ac, B:38:0x00b2, B:40:0x00b7, B:43:0x00bc, B:45:0x00c2, B:48:0x00c7, B:52:0x00eb, B:49:0x00cf, B:51:0x00d5), top: B:63:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac A[Catch: all -> 0x00f1, TRY_ENTER, TryCatch #0 {all -> 0x00f1, blocks: (B:14:0x0033, B:30:0x00a0, B:32:0x00a6, B:35:0x00ac, B:38:0x00b2, B:40:0x00b7, B:43:0x00bc, B:45:0x00c2, B:48:0x00c7, B:52:0x00eb, B:49:0x00cf, B:51:0x00d5), top: B:63:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf A[Catch: all -> 0x00f1, TryCatch #0 {all -> 0x00f1, blocks: (B:14:0x0033, B:30:0x00a0, B:32:0x00a6, B:35:0x00ac, B:38:0x00b2, B:40:0x00b7, B:43:0x00bc, B:45:0x00c2, B:48:0x00c7, B:52:0x00eb, B:49:0x00cf, B:51:0x00d5), top: B:63:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.d91 r17, boolean r18, nt5 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.a(ads_mobile_sdk.d91, boolean, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.d91 r16, java.lang.String r17, mt5 r18) throws java.lang.Throwable {
        /*
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof ads_mobile_sdk.a91
            if (r2 == 0) goto L18
            r2 = r1
            ads_mobile_sdk.a91 r2 = (ads_mobile_sdk.a91) r2
            int r3 = r2.f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f = r3
        L16:
            r13 = r2
            goto L1e
        L18:
            ads_mobile_sdk.a91 r2 = new ads_mobile_sdk.a91
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r13.d
            px5 r2 = px5.a
            int r3 = r13.f
            r4 = 2
            r5 = 1
            r15 = 0
            if (r3 == 0) goto L4b
            if (r3 == r5) goto L3c
            if (r3 != r4) goto L36
            java.lang.Object r0 = r13.a
            r2 = r0
            pfe r2 = (pfe) r2
            defpackage.ybh.y(r1)     // Catch: java.lang.Throwable -> L82
            goto L7c
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r0)
            return r15
        L3c:
            pfe r0 = r13.c
            java.lang.String r3 = r13.b
            java.lang.Object r5 = r13.a
            ads_mobile_sdk.d91 r5 = (ads_mobile_sdk.d91) r5
            defpackage.ybh.y(r1)
            r1 = r0
            r11 = r3
            r3 = r5
            goto L62
        L4b:
            defpackage.ybh.y(r1)
            pfe r1 = r0.x
            r13.a = r0
            r3 = r17
            r13.b = r3
            r13.c = r1
            r13.f = r5
            java.lang.Object r5 = r1.i(r13)
            if (r5 == r2) goto L7a
            r11 = r3
            r3 = r0
        L62:
            r13.a = r1     // Catch: java.lang.Throwable -> L85
            r13.b = r15     // Catch: java.lang.Throwable -> L85
            r13.c = r15     // Catch: java.lang.Throwable -> L85
            r13.f = r4     // Catch: java.lang.Throwable -> L85
            r6 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 383(0x17f, float:5.37E-43)
            java.lang.Object r0 = a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L85
            if (r0 != r2) goto L7b
        L7a:
            return r2
        L7b:
            r2 = r1
        L7c:
            kotlin.Unit r0 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L82
            r2.l(r15)
            return r0
        L82:
            r0 = move-exception
            r1 = r2
            goto L86
        L85:
            r0 = move-exception
        L86:
            r1.l(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.b(ads_mobile_sdk.d91, java.lang.String, mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.d91 r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.g81
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.g81 r0 = (ads_mobile_sdk.g81) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.g81 r0 = new ads_mobile_sdk.g81
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
            ads_mobile_sdk.d91 r0 = r0.a
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
            pfe r6 = r5.x
            r0.a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            ads_mobile_sdk.ia1 r5 = r5.y     // Catch: java.lang.Throwable -> L4f
            if (r5 != 0) goto L4b
            r5 = r4
        L4b:
            r6.l(r4)
            return r5
        L4f:
            r5 = move-exception
            r6.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.b(ads_mobile_sdk.d91, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5 A[Catch: all -> 0x00f0, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:14:0x0033, B:38:0x009f, B:40:0x00a5, B:43:0x00ab, B:46:0x00b1, B:48:0x00b6, B:51:0x00bb, B:53:0x00c1, B:56:0x00c6, B:60:0x00ea, B:57:0x00ce, B:59:0x00d4), top: B:69:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab A[Catch: all -> 0x00f0, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:14:0x0033, B:38:0x009f, B:40:0x00a5, B:43:0x00ab, B:46:0x00b1, B:48:0x00b6, B:51:0x00bb, B:53:0x00c1, B:56:0x00c6, B:60:0x00ea, B:57:0x00ce, B:59:0x00d4), top: B:69:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce A[Catch: all -> 0x00f0, TryCatch #0 {all -> 0x00f0, blocks: (B:14:0x0033, B:38:0x009f, B:40:0x00a5, B:43:0x00ab, B:46:0x00b1, B:48:0x00b6, B:51:0x00bb, B:53:0x00c1, B:56:0x00c6, B:60:0x00ea, B:57:0x00ce, B:59:0x00d4), top: B:69:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.d91 r17, boolean r18, nt5 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.b(ads_mobile_sdk.d91, boolean, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(ads_mobile_sdk.d91 r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.h81
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.h81 r0 = (ads_mobile_sdk.h81) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.h81 r0 = new ads_mobile_sdk.h81
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
            ads_mobile_sdk.d91 r0 = r0.a
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
            pfe r6 = r5.x
            r0.a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            boolean r5 = r5.d()     // Catch: java.lang.Throwable -> L52
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L52
            r6.l(r4)
            return r5
        L52:
            r5 = move-exception
            r6.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.c(ads_mobile_sdk.d91, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r7.f(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(ads_mobile_sdk.d91 r7, mt5 r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.k81
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.k81 r0 = (ads_mobile_sdk.k81) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.k81 r0 = new ads_mobile_sdk.k81
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            java.lang.Object r7 = r0.a
            pfe r7 = (pfe) r7
            defpackage.ybh.y(r8)     // Catch: java.lang.Throwable -> L70
            goto L6a
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r5
        L35:
            pfe r7 = r0.b
            java.lang.Object r2 = r0.a
            ads_mobile_sdk.d91 r2 = (ads_mobile_sdk.d91) r2
            defpackage.ybh.y(r8)
            r8 = r7
            r7 = r2
            goto L52
        L41:
            defpackage.ybh.y(r8)
            pfe r8 = r7.H
            r0.a = r7
            r0.b = r8
            r0.e = r4
            java.lang.Object r2 = r8.i(r0)
            if (r2 == r1) goto L68
        L52:
            java.lang.ref.WeakReference r7 = r7.I     // Catch: java.lang.Throwable -> L75
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> L75
            ads_mobile_sdk.z91 r7 = (ads_mobile_sdk.z91) r7     // Catch: java.lang.Throwable -> L75
            if (r7 == 0) goto L69
            r0.a = r8     // Catch: java.lang.Throwable -> L75
            r0.b = r5     // Catch: java.lang.Throwable -> L75
            r0.e = r3     // Catch: java.lang.Throwable -> L75
            java.lang.Object r7 = r7.f(r0)     // Catch: java.lang.Throwable -> L75
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            r7 = r8
        L6a:
            kotlin.Unit r8 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L70
            r7.l(r5)
            return r8
        L70:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
            goto L76
        L75:
            r7 = move-exception
        L76:
            r8.l(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.d(ads_mobile_sdk.d91, mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object e(ads_mobile_sdk.d91 r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.t81
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.t81 r0 = (ads_mobile_sdk.t81) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.t81 r0 = new ads_mobile_sdk.t81
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            ads_mobile_sdk.d91 r5 = r0.a
            defpackage.ybh.y(r6)
            goto L3e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L30:
            defpackage.ybh.y(r6)
            r0.a = r5
            r0.d = r4
            java.lang.Object r6 = r5.v(r0)
            if (r6 != r1) goto L3e
            return r1
        L3e:
            nx5 r6 = r5.d
            rf4 r0 = new rf4
            r1 = 25
            r0.<init>(r1, r3, r5)
            kotlin.coroutines.h r5 = kotlin.coroutines.h.a
            fsg r1 = new fsg
            r2 = 3
            r1.<init>(r0, r3, r2)
            r0 = 2
            defpackage.na2.B(r6, r5, r3, r1, r0)
            ads_mobile_sdk.hv0 r5 = new ads_mobile_sdk.hv0
            kotlin.Unit r6 = kotlin.Unit.a
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.e(ads_mobile_sdk.d91, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r9, nt5 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.b91
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.b91 r0 = (ads_mobile_sdk.b91) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.b91 r0 = new ads_mobile_sdk.b91
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.d
            px5 r1 = px5.a
            int r2 = r0.f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            int r9 = r0.c
            pfe r8 = r0.b
            ads_mobile_sdk.d91 r0 = r0.a
            defpackage.ybh.y(r10)
            r10 = r8
            r8 = r0
            goto L4a
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r4
        L36:
            defpackage.ybh.y(r10)
            r0.a = r8
            pfe r10 = r8.D
            r0.b = r10
            r0.c = r9
            r0.f = r3
            java.lang.Object r0 = r10.i(r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            long r0 = r8.E     // Catch: java.lang.Throwable -> L7d
            long r2 = (long) r9     // Catch: java.lang.Throwable -> L7d
            long r0 = r0 + r2
            ads_mobile_sdk.qr0 r9 = r8.i     // Catch: java.lang.Throwable -> L7d
            r9.getClass()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = "gads:inspector:max_ad_response_logs_bytes"
            r6 = 20971520(0x1400000, double:1.03613076E-316)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L7d
            ads_mobile_sdk.fo r7 = ads_mobile_sdk.fo.a$16     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r9 = r9.a(r5, r6, r7)     // Catch: java.lang.Throwable -> L7d
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Throwable -> L7d
            long r5 = r9.longValue()     // Catch: java.lang.Throwable -> L7d
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 < 0) goto L72
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L7d
            r10.l(r4)
            return r8
        L72:
            long r0 = r8.E     // Catch: java.lang.Throwable -> L7d
            long r0 = r0 + r2
            r8.E = r0     // Catch: java.lang.Throwable -> L7d
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L7d
            r10.l(r4)
            return r8
        L7d:
            r8 = move-exception
            r10.l(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.a(int, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, ads_mobile_sdk.j71 r9, nt5 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.y71
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.y71 r0 = (ads_mobile_sdk.y71) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.y71 r0 = new ads_mobile_sdk.y71
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L32
            pfe r7 = r0.d
            ads_mobile_sdk.j71 r9 = r0.c
            java.lang.String r8 = r0.b
            ads_mobile_sdk.d91 r0 = r0.a
            defpackage.ybh.y(r10)
            r10 = r7
            r7 = r0
            goto L4e
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r4
        L38:
            defpackage.ybh.y(r10)
            r0.a = r7
            r0.b = r8
            r0.c = r9
            pfe r10 = r7.D
            r0.d = r10
            r0.g = r3
            java.lang.Object r0 = r10.i(r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            java.util.LinkedHashMap r0 = r7.F     // Catch: java.lang.Throwable -> L9c
            java.util.LinkedHashMap r1 = r7.G     // Catch: java.lang.Throwable -> L9c
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9c
            ads_mobile_sdk.qr0 r2 = r7.i     // Catch: java.lang.Throwable -> L9c
            r2.getClass()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r3 = "gads:inspector:max_ad_life_cycles"
            r5 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L9c
            ads_mobile_sdk.fo r6 = ads_mobile_sdk.fo.a$11     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r2 = r2.a(r3, r5, r6)     // Catch: java.lang.Throwable -> L9c
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L9c
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L9c
            if (r0 < r2) goto L7c
            java.lang.String r7 = "Maximum number of stored ad requests reached. Dropping the current request."
            ads_mobile_sdk.xu0.c(r7, r4)     // Catch: java.lang.Throwable -> L9c
            kotlin.Unit r7 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L9c
            r10.l(r4)
            return r7
        L7c:
            java.lang.Object r0 = r1.get(r8)     // Catch: java.lang.Throwable -> L9c
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L9c
            if (r0 != 0) goto L8c
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9c
            r0.<init>()     // Catch: java.lang.Throwable -> L9c
            r1.put(r8, r0)     // Catch: java.lang.Throwable -> L9c
        L8c:
            r0.add(r9)     // Catch: java.lang.Throwable -> L9c
            java.util.LinkedHashMap r7 = r7.F     // Catch: java.lang.Throwable -> L9c
            java.lang.String r8 = r9.d     // Catch: java.lang.Throwable -> L9c
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L9c
            kotlin.Unit r7 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L9c
            r10.l(r4)
            return r7
        L9c:
            r7 = move-exception
            r10.l(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.a(java.lang.String, ads_mobile_sdk.j71, nt5):java.lang.Object");
    }

    public final void a(int i) {
        int iA = vep.A(i);
        if (iA != 1) {
            if (iA != 2) {
                return;
            }
            ur0 ur0Var = (ur0) this.g.get();
            synchronized (ur0Var) {
                qr0 qr0Var = ur0Var.b;
                qr0Var.getClass();
                if (((Boolean) qr0Var.a("gads:inspector:flick_enabled", Boolean.TRUE, fo.a)).booleanValue()) {
                    SensorManager sensorManager = (SensorManager) ur0Var.a.getSystemService(SensorManager.class);
                    Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(4) : null;
                    if (!ur0Var.n && sensorManager != null && defaultSensor != null) {
                        ur0Var.e = sensorManager;
                        ur0Var.f = defaultSensor;
                        qr0 qr0Var2 = ur0Var.b;
                        qr0Var2.getClass();
                        on7 on7Var = pn7.b;
                        sensorManager.registerListener(ur0Var, defaultSensor, 3, ((int) pn7.p(((pn7) qr0Var2.a("gads:inspector:flick_reset_time_ms", new pn7(cs5.x0(PathInterpolatorCompat.MAX_NUM_POINTS, un7.d)), fo.a$18)).a, un7.c)) / 100);
                        ur0Var.n = true;
                        xu0.b("Listening for flick gestures.", null);
                    }
                    return;
                }
                return;
            }
        }
        l23 l23Var = (l23) this.f.get();
        synchronized (l23Var) {
            qr0 qr0Var3 = l23Var.b;
            qr0Var3.getClass();
            if (((Boolean) qr0Var3.a("gads:inspector:shake_enabled", Boolean.TRUE, fo.a)).booleanValue()) {
                SensorManager sensorManager2 = (SensorManager) l23Var.a.getSystemService(SensorManager.class);
                Sensor defaultSensor2 = sensorManager2 != null ? sensorManager2.getDefaultSensor(1) : null;
                if (!l23Var.j && sensorManager2 != null && defaultSensor2 != null) {
                    l23Var.e = sensorManager2;
                    l23Var.f = defaultSensor2;
                    qr0 qr0Var4 = l23Var.b;
                    qr0Var4.getClass();
                    on7 on7Var2 = pn7.b;
                    un7 un7Var = un7.d;
                    pn7 pn7Var = new pn7(cs5.x0(500, un7Var));
                    fo foVar = fo.a$18;
                    sensorManager2.registerListener(l23Var, defaultSensor2, 3, ((int) pn7.p(((pn7) qr0Var4.a("gads:inspector:shake_interval", pn7Var, foVar)).a, un7.c)) / 10);
                    l23Var.c.getClass();
                    long jY0 = cs5.y0(SystemClock.elapsedRealtime(), un7Var);
                    qr0 qr0Var5 = l23Var.b;
                    qr0Var5.getClass();
                    l23Var.g = pn7.l(jY0, ((pn7) qr0Var5.a("gads:inspector:shake_interval", new pn7(cs5.x0(500, un7Var)), foVar)).a);
                    l23Var.j = true;
                    xu0.b("Listening for shake gestures.", null);
                }
            }
        }
    }

    public final String b() {
        if (!g()) {
            return "{}";
        }
        ia1 ia1Var = this.y;
        if (ia1Var == null) {
            ia1Var = null;
        }
        if (ia1Var.w() > 0) {
            ia1 ia1Var2 = this.y;
            if (ia1Var2 == null) {
                ia1Var2 = null;
            }
            long jW = ia1Var2.w();
            this.j.getClass();
            if (jW < System.currentTimeMillis() / 1000) {
                defpackage.na2.B(this.d, null, null, new sbl((byte) 12, (mt5) ia1Var, (Object) this), 3);
                return "{}";
            }
        }
        ia1 ia1Var3 = this.y;
        return (ia1Var3 != null ? ia1Var3 : null).v();
    }

    public final void c() {
        rap bv0Var;
        String str;
        Drawable applicationIcon;
        if (this.z) {
            return;
        }
        ((l23) this.f.get()).i = this;
        ur0 ur0Var = (ur0) this.g.get();
        ur0Var.getClass();
        ur0Var.m = this;
        this.z = true;
        ia1 ia1Var = this.y;
        if (ia1Var == null) {
            ia1Var = null;
        }
        a(ia1Var.r$2());
        ng ngVar = this.m;
        ApplicationInfo applicationInfo = ngVar.c;
        AtomicReference atomicReference = ngVar.d;
        Context context = ngVar.a;
        Integer numValueOf = Integer.valueOf(NotificationCompat.FLAG_LOCAL_ONLY);
        prb prbVar = new prb();
        try {
            prbVar.r("name", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(applicationInfo.packageName, 0)).toString());
            prbVar.r("packageName", applicationInfo.packageName);
            x77 x77VarA = ngVar.b.a();
            String strEncodeToString = "";
            if (x77VarA == null || (str = (String) x77VarA.b) == null) {
                str = "";
            }
            prbVar.r("adMobAppId", str);
            CharSequence charSequence = (CharSequence) atomicReference.get();
            if (charSequence == null || StringsKt.N(charSequence)) {
                try {
                    applicationIcon = context.getPackageManager().getApplicationIcon(context.getPackageManager().getApplicationInfo(context.getApplicationInfo().packageName, 0));
                } catch (PackageManager.NameNotFoundException unused) {
                    applicationIcon = null;
                }
                if (applicationIcon != null) {
                    applicationIcon.setBounds(0, 0, NotificationCompat.FLAG_LOCAL_ONLY, NotificationCompat.FLAG_LOCAL_ONLY);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(NotificationCompat.FLAG_LOCAL_ONLY, NotificationCompat.FLAG_LOCAL_ONLY, Bitmap.Config.ARGB_8888);
                    applicationIcon.draw(new Canvas(bitmapCreateBitmap));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                }
                atomicReference.set(strEncodeToString);
            }
            CharSequence charSequence2 = (CharSequence) atomicReference.get();
            if (charSequence2 != null && !StringsKt.N(charSequence2)) {
                prbVar.r("icon", (String) atomicReference.get());
                prbVar.p(numValueOf, "iconWidthPx");
                prbVar.p(numValueOf, "iconHeightPx");
            }
            bv0Var = new hv0(prbVar);
        } catch (PackageManager.NameNotFoundException e) {
            bv0Var = new bv0(e, null, null, 6);
        }
        if (bv0Var instanceof hv0) {
            this.B = (prb) ((hv0) bv0Var).b;
        }
        xu0.a("Ad inspector enabled. Ad inspector can increase memory usage on test devices.", null, 6);
    }

    public final boolean d() {
        boolean zBooleanValue;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        qr0 qr0Var = this.i;
        qr0Var.getClass();
        if (((Boolean) qr0Var.a("gads:inspector:disable_ad_inspector_from_manifest_enabled", Boolean.TRUE, fo.a)).booleanValue()) {
            Boolean bool = this.M;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                try {
                    packageManager = this.c.getPackageManager();
                } catch (PackageManager.NameNotFoundException unused) {
                }
                zBooleanValue = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.c.getPackageName(), NotificationCompat.FLAG_HIGH_PRIORITY)) == null || (bundle = applicationInfo.metaData) == null) ? false : bundle.getBoolean("com.google.android.libraries.ads.mobile.sdk.flag.DISABLE_AD_INSPECTOR", false);
                this.M = Boolean.valueOf(zBooleanValue);
            }
        } else {
            zBooleanValue = false;
        }
        ia1 ia1Var = this.y;
        if (ia1Var == null) {
            ia1Var = null;
        }
        boolean zS = ia1Var.s();
        boolean z = zBooleanValue && !zS;
        if (zBooleanValue) {
            if (zS) {
                if (this.L.compareAndSet(false, true)) {
                    ux2 ux2Var = this.q;
                    fw0 fw0Var = fw0.CUI_NAME_AD_INSPECTOR_GLOBAL_ALLOWLIST_OVERRIDE;
                    l08 l08Var = l08.a;
                    kh3 kh3Var = new kh3(new eq2(), new ih1(), new dt2(), new s8());
                    if (hh3.b().a == null) {
                        ux2.a(ux2Var, fw0Var, l08Var, kh3Var).close();
                    } else {
                        hh3.a(fw0Var, l08Var, true).close();
                    }
                }
            } else if (this.K.compareAndSet(false, true)) {
                ux2 ux2Var2 = this.q;
                fw0 fw0Var2 = fw0.CUI_NAME_AD_INSPECTOR_DISABLED;
                l08 l08Var2 = l08.a;
                kh3 kh3Var2 = new kh3(new eq2(), new ih1(), new dt2(), new s8());
                if (hh3.b().a == null) {
                    ux2.a(ux2Var2, fw0Var2, l08Var2, kh3Var2).close();
                } else {
                    hh3.a(fw0Var2, l08Var2, true).close();
                }
            }
        }
        if (z && this.J.compareAndSet(false, true)) {
            xu0.a("Ad inspector is disabled in the AndroidManifest.xml.", null, 6);
        }
        return z;
    }

    public final boolean g() {
        if (d()) {
            return false;
        }
        ia1 ia1Var = this.y;
        if (ia1Var == null) {
            ia1Var = null;
        }
        if (ia1Var.u()) {
            return true;
        }
        ia1 ia1Var2 = this.y;
        if (!(ia1Var2 != null ? ia1Var2 : null).t()) {
            return false;
        }
        qr0 qr0Var = this.i;
        qr0Var.getClass();
        return ((Boolean) qr0Var.a("gads:inspector:linked_device_enable_inspector", Boolean.TRUE, fo.a)).booleanValue();
    }

    @Override // ads_mobile_sdk.k61
    public final Object h(mt5 mt5Var) {
        return e(this, (nt5) mt5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(nt5 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.d81
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.d81 r0 = (ads_mobile_sdk.d81) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.d81 r0 = new ads_mobile_sdk.d81
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            px5 r1 = px5.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.ybh.y(r5)
            goto L3a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.ybh.y(r5)
            r0.c = r3
            java.lang.String r5 = r4.b()
            if (r5 != r1) goto L3a
            return r1
        L3a:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r4 = "{}"
            boolean r4 = kotlin.jvm.internal.Intrinsics.a(r5, r4)
            if (r4 == 0) goto L47
            java.lang.String r4 = ""
            return r4
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.r(nt5):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(nt5 r20) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.s(nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0200, code lost:
    
        r1 = r2;
        r2 = r4;
        r4 = r5;
        r5 = r7;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0411 A[Catch: all -> 0x04b6, TryCatch #1 {all -> 0x04b6, blocks: (B:13:0x005f, B:105:0x03b6, B:109:0x03c6, B:127:0x042e, B:129:0x0435, B:132:0x043f, B:136:0x044d, B:144:0x0476, B:145:0x047b, B:139:0x0455, B:141:0x0468, B:142:0x0470, B:122:0x03fe, B:124:0x0411, B:125:0x0419, B:18:0x009b, B:96:0x036f, B:98:0x0377, B:100:0x03a0, B:21:0x00cd, B:93:0x033f, B:71:0x02e0, B:74:0x02e9, B:87:0x0304, B:90:0x030a, B:83:0x02fb), top: B:158:0x002a, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x042e A[Catch: all -> 0x04b6, TRY_LEAVE, TryCatch #1 {all -> 0x04b6, blocks: (B:13:0x005f, B:105:0x03b6, B:109:0x03c6, B:127:0x042e, B:129:0x0435, B:132:0x043f, B:136:0x044d, B:144:0x0476, B:145:0x047b, B:139:0x0455, B:141:0x0468, B:142:0x0470, B:122:0x03fe, B:124:0x0411, B:125:0x0419, B:18:0x009b, B:96:0x036f, B:98:0x0377, B:100:0x03a0, B:21:0x00cd, B:93:0x033f, B:71:0x02e0, B:74:0x02e9, B:87:0x0304, B:90:0x030a, B:83:0x02fb), top: B:158:0x002a, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0476 A[Catch: all -> 0x04b6, TryCatch #1 {all -> 0x04b6, blocks: (B:13:0x005f, B:105:0x03b6, B:109:0x03c6, B:127:0x042e, B:129:0x0435, B:132:0x043f, B:136:0x044d, B:144:0x0476, B:145:0x047b, B:139:0x0455, B:141:0x0468, B:142:0x0470, B:122:0x03fe, B:124:0x0411, B:125:0x0419, B:18:0x009b, B:96:0x036f, B:98:0x0377, B:100:0x03a0, B:21:0x00cd, B:93:0x033f, B:71:0x02e0, B:74:0x02e9, B:87:0x0304, B:90:0x030a, B:83:0x02fb), top: B:158:0x002a, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0360  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x023f -> B:61:0x0249). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0271 -> B:66:0x0279). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(mt5 r38) {
        /*
            Method dump skipped, instructions count: 1240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.t(mt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e5, code lost:
    
        if (a(r3, r0, null, 0, null, null, null, null, null, null, r13, 510) == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0121, code lost:
    
        if (a(r3, null, null, 0, null, null, r9, null, null, null, r13, 479) == r2) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7 A[Catch: all -> 0x013a, TryCatch #5 {all -> 0x013a, blocks: (B:28:0x0061, B:37:0x00a3, B:39:0x00a7, B:40:0x00ab, B:43:0x00be, B:45:0x00c4, B:34:0x0086), top: B:90:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4 A[Catch: all -> 0x013a, TRY_LEAVE, TryCatch #5 {all -> 0x013a, blocks: (B:28:0x0061, B:37:0x00a3, B:39:0x00a7, B:40:0x00ab, B:43:0x00be, B:45:0x00c4, B:34:0x0086), top: B:90:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101 A[Catch: all -> 0x0134, TRY_LEAVE, TryCatch #2 {all -> 0x0134, blocks: (B:54:0x00f2, B:57:0x00f7, B:59:0x0101), top: B:84:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v6, types: [pfe] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(nt5 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.u(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #1 {all -> 0x009f, blocks: (B:25:0x006b, B:27:0x006f), top: B:52:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091 A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:36:0x008b, B:38:0x0091, B:39:0x0094), top: B:50:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(nt5 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.j81
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.j81 r0 = (ads_mobile_sdk.j81) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.j81 r0 = new ads_mobile_sdk.j81
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L46
            if (r2 == r5) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L32
            pfe r7 = r0.b
            ads_mobile_sdk.d91 r0 = r0.a
            defpackage.ybh.y(r8)
            goto L8b
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r6
        L38:
            pfe r7 = r0.b
            ads_mobile_sdk.d91 r2 = r0.a
            defpackage.ybh.y(r8)
            goto L6b
        L40:
            ads_mobile_sdk.d91 r7 = r0.a
            defpackage.ybh.y(r8)
            goto L53
        L46:
            defpackage.ybh.y(r8)
            r0.a = r7
            r0.e = r5
            java.lang.Object r8 = r7.u(r0)
            if (r8 == r1) goto L89
        L53:
            ads_mobile_sdk.qr0 r8 = r7.i
            boolean r8 = r8.X()
            if (r8 == 0) goto La4
            pfe r8 = r7.x
            r0.a = r7
            r0.b = r8
            r0.e = r4
            java.lang.Object r2 = r8.i(r0)
            if (r2 == r1) goto L89
            r2 = r7
            r7 = r8
        L6b:
            boolean r8 = r2.z     // Catch: java.lang.Throwable -> L9f
            if (r8 != 0) goto L76
            boolean r8 = r2.d()     // Catch: java.lang.Throwable -> L9f
            if (r8 != 0) goto L76
            r5 = 0
        L76:
            r7.l(r6)
            if (r5 != 0) goto La4
            pfe r7 = r2.x
            r0.a = r2
            r0.b = r7
            r0.e = r3
            java.lang.Object r8 = r7.i(r0)
            if (r8 != r1) goto L8a
        L89:
            return r1
        L8a:
            r0 = r2
        L8b:
            boolean r8 = r0.g()     // Catch: java.lang.Throwable -> L9a
            if (r8 == 0) goto L94
            r0.c()     // Catch: java.lang.Throwable -> L9a
        L94:
            kotlin.Unit r8 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L9a
            r7.l(r6)
            return r8
        L9a:
            r8 = move-exception
            r7.l(r6)
            throw r8
        L9f:
            r8 = move-exception
            r7.l(r6)
            throw r8
        La4:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.d91.v(nt5):java.lang.Object");
    }
}
