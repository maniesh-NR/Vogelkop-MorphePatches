package defpackage;

import ads_mobile_sdk.e7;
import ads_mobile_sdk.sk;
import ads_mobile_sdk.sm0;
import ads_mobile_sdk.tm0;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.vpn.VpnReceiver;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Map;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public abstract class cgh implements wpj {
    public static String c(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static void d(Context context, String str, e7 e7Var) {
        if (context == null || str == null) {
            return;
        }
        try {
            if (str.trim().isEmpty()) {
                return;
            }
            sk.a(context).getClass();
            tm0 tm0Var = (tm0) sk.d.get(str);
            if (tm0Var == null || !tm0Var.a()) {
                return;
            }
            sm0 sm0Var = null;
            try {
                if ("FireTVFOSDAT".equals(str)) {
                    sm0Var = new sm0(context);
                }
            } catch (Exception unused) {
                "Error creating attestation mechanism: ".concat(str);
            }
            if (sm0Var != null) {
                sm0Var.a(e7Var);
            }
        } catch (Exception unused2) {
            "Error during attestation with mechanism: ".concat(str);
        }
    }

    public static final syi e(eyi eyiVar, dr3 dr3Var) {
        n26 n26VarG = eyiVar.g();
        r05 r05Var = (r05) eyiVar.d;
        boolean z = n26VarG == n26.a;
        return new syi(f(r05Var, z, true, dr3Var), f(r05Var, z, false, dr3Var), z);
    }

    public static final nyi f(r05 r05Var, boolean z, boolean z2, dr3 dr3Var) {
        long jO = dr3Var.o(r05Var, z2 ? r05Var.b : r05Var.c);
        boolean z3 = z2 ^ z;
        int i = xjl.c;
        return r05Var.r((int) (z3 ? jO >> 32 : jO & 4294967295L));
    }

    public static float g(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static final void h(View view, dxh dxhVar, dxh dxhVar2) {
        kkf kkfVar = new kkf(new ghf(view, new eck(view, dxhVar, view, dxhVar2)), (byte) 27);
        dll dllVarV = hjf.v(view.getContext());
        if (dllVarV == null) {
            return;
        }
        u8n.b(dllVarV, view, kkfVar);
    }

    public static final Object i(cg8 cg8Var, kuk kukVar) {
        return cg8Var.f(new agh(cg8Var, (byte) 0)).a(kukVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.cg8 r4, nt5 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.bgh
            if (r0 == 0) goto L13
            r0 = r5
            bgh r0 = (defpackage.bgh) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            bgh r0 = new bgh
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.u
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            cg8 r4 = r0.t
            defpackage.ybh.y(r5)
            goto L3e
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.ybh.y(r5)
            r0.t = r4
            r0.v = r3
            java.lang.Object r5 = k(r4, r0)
            if (r5 != r1) goto L3e
            return r1
        L3e:
            if (r5 == 0) goto L41
            return r5
        L41:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ResultSet returned null for "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgh.j(cg8, nt5):java.lang.Object");
    }

    public static final Object k(cg8 cg8Var, nt5 nt5Var) {
        return cg8Var.f(new agh(cg8Var, (byte) 1)).a(nt5Var);
    }

    public static Notification l(int i, Context context) {
        boolean z;
        int i2;
        String strF;
        String strF2;
        l1f l1fVar = new l1f(context, "8787");
        Resources resources = context.getResources();
        String[] strArr = OperaApplication.K;
        ydn ydnVarR = context.getApplicationContext().R();
        pxh qxhVar = new qxh("");
        int i3 = 2132021067;
        if (i != 0) {
            byte b = 4;
            if (i == 1) {
                if (vml.b()) {
                    strF = ydnVarR.c.f(ydnVarR.s.a((Map) null));
                } else {
                    Objects.requireNonNull(ydnVarR);
                    strF = (String) ioh.k(new m2n(ydnVarR, b));
                }
                qxhVar = strF == null ? new rxh(2132022229) : new sxh(2132022228, new Object[]{strF});
            } else if (i == 2) {
                int i4 = VpnReceiver.a;
                Intent intentPutExtra = new Intent("com.opera.android.VPN_PAUSE_5_MIN").setClass(context, VpnReceiver.class).setPackage(context.getPackageName()).putExtra("com.opera.android.EXTRA_VPN_EVENT_ORIGIN", 0);
                if (vml.b()) {
                    strF2 = ydnVarR.c.f(ydnVarR.s.a((Map) null));
                } else {
                    Objects.requireNonNull(ydnVarR);
                    strF2 = (String) ioh.k(new m2n(ydnVarR, b));
                }
                qxhVar = strF2 == null ? new rxh(2132022227) : new sxh(2132022226, new Object[]{strF2});
                l1fVar.a(0, resources.getString(2132022184, resources.getQuantityString(2131886129, 5, 5)), PendingIntent.getBroadcast(context, 0, intentPutExtra, 201326592));
            }
            z = true;
        } else {
            if (!ydnVarR.f.g()) {
                qxhVar = new rxh(2132022202);
                int i5 = VpnReceiver.a;
                l1fVar.a(0, resources.getString(2132021985), PendingIntent.getBroadcast(context, 0, new Intent("com.opera.android.VPN_RETRY").setClass(context, VpnReceiver.class).setPackage(context.getPackageName()).putExtra("com.opera.android.EXTRA_VPN_EVENT_ORIGIN", 0), 201326592));
                i3 = 2132022130;
                z = false;
                i2 = 1;
                l1fVar.f(qxhVar.a(resources));
                l1fVar.G.icon = 2131231939;
                Intent intent = new Intent("com.opera.android.action.VPN_PRO_NOTIFICATION_OPEN_OFA");
                intent.setFlags(268435456);
                intent.setClass(context, BrowserActivity.class);
                intent.putExtra("com.opera.android.action.EXTRA_FORCE_SHOW_FRAGMENT_IMMEDIATELY", "");
                l1fVar.g = PendingIntent.getActivity(context, 0, intent, 201326592);
                l1fVar.w = NotificationCompat.CATEGORY_SERVICE;
                l1fVar.j = i2;
                l1fVar.h(8, true);
                l1fVar.t = true;
                l1fVar.h(2, z);
                int i6 = VpnReceiver.a;
                l1fVar.a(0, resources.getString(i3), PendingIntent.getBroadcast(context, 0, new Intent("com.opera.android.VPN_DISCONNECT").setClass(context, VpnReceiver.class).setPackage(context.getPackageName()).putExtra("com.opera.android.EXTRA_VPN_EVENT_ORIGIN", 0), 201326592));
                return l1fVar.b();
            }
            Intent intentA = VpnReceiver.a(context);
            qxhVar = ydnVarR.f.f(context);
            l1fVar.a(0, resources.getString(2132022262), PendingIntent.getBroadcast(context, 0, intentA, 201326592));
            z = false;
        }
        i2 = -1;
        l1fVar.f(qxhVar.a(resources));
        l1fVar.G.icon = 2131231939;
        Intent intent2 = new Intent("com.opera.android.action.VPN_PRO_NOTIFICATION_OPEN_OFA");
        intent2.setFlags(268435456);
        intent2.setClass(context, BrowserActivity.class);
        intent2.putExtra("com.opera.android.action.EXTRA_FORCE_SHOW_FRAGMENT_IMMEDIATELY", "");
        l1fVar.g = PendingIntent.getActivity(context, 0, intent2, 201326592);
        l1fVar.w = NotificationCompat.CATEGORY_SERVICE;
        l1fVar.j = i2;
        l1fVar.h(8, true);
        l1fVar.t = true;
        l1fVar.h(2, z);
        int i62 = VpnReceiver.a;
        l1fVar.a(0, resources.getString(i3), PendingIntent.getBroadcast(context, 0, new Intent("com.opera.android.VPN_DISCONNECT").setClass(context, VpnReceiver.class).setPackage(context.getPackageName()).putExtra("com.opera.android.EXTRA_VPN_EVENT_ORIGIN", 0), 201326592));
        return l1fVar.b();
    }

    public static final nyi m(nyi nyiVar, r05 r05Var, int i) {
        hyh hyhVarA = ((njl) r05Var.e).a(i);
        nyiVar.getClass();
        return new nyi(i, hyhVarA);
    }

    public static long n(g1g g1gVar, int i, int i2) {
        g1gVar.N(i);
        if (g1gVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iM = g1gVar.m();
        if ((8388608 & iM) != 0 || ((2096896 & iM) >> 8) != i2 || (iM & 32) == 0 || g1gVar.A() < 7 || g1gVar.a() < 7 || (g1gVar.A() & 16) != 16) {
            return -9223372036854775807L;
        }
        g1gVar.k(new byte[6], 0, 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(kotlin.jvm.functions.Function1 r4, mt5 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.uym
            if (r0 == 0) goto L13
            r0 = r5
            uym r0 = (defpackage.uym) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            uym r0 = new uym
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.t
            px5 r1 = px5.a
            int r2 = r0.u
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.ybh.y(r5)     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L48
            goto L3c
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.ybh.y(r5)
            p0i r5 = t0i.b     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L48
            r0.u = r3     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L48
            java.lang.Object r5 = r4.invoke(r0)     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L48
            if (r5 != r1) goto L3c
            return r1
        L3c:
            p0i r4 = t0i.b     // Catch: java.lang.Throwable -> L3f java.util.concurrent.CancellationException -> L48
            return r5
        L3f:
            r4 = move-exception
            p0i r5 = t0i.b
            q0i r5 = new q0i
            r5.<init>(r4)
            return r5
        L48:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgh.o(kotlin.jvm.functions.Function1, mt5):java.lang.Object");
    }

    public static final void p(File file, File file2) throws IOException {
        if (!file.exists()) {
            return;
        }
        try {
            String str = file2.getCanonicalPath() + "/";
            ZipFile zipFile = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    String name = zipEntryNextElement.getName();
                    if (name != null && !StringsKt.N(name)) {
                        File file3 = new File(file2, name);
                        if (!c.q(file3.getCanonicalPath(), str, false)) {
                            continue;
                        } else if (zipEntryNextElement.isDirectory()) {
                            file3.mkdirs();
                        } else {
                            File parentFile = file3.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                try {
                                    xvg.n(inputStream, fileOutputStream);
                                    fileOutputStream.close();
                                    inputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        vtp.v(fileOutputStream, th);
                                        throw th2;
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                }
                zipFile.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static final nyi q(final eyi eyiVar, final r05 r05Var, nyi nyiVar) {
        int i = r05Var.c;
        int i2 = r05Var.b;
        boolean z = eyiVar.b;
        final int i3 = z ? i2 : i;
        njl njlVar = (njl) r05Var.e;
        int i4 = r05Var.d;
        f7c f7cVar = f7c.c;
        final l4c l4cVarA = z4c.a(f7cVar, new ug5(r05Var, i3, (byte) 2));
        final int i5 = z ? i : i2;
        l4c l4cVarA2 = z4c.a(f7cVar, new Function0() { // from class: uyi
            public final Object invoke() {
                r05 r05Var2 = r05Var;
                njl njlVar2 = (njl) r05Var2.e;
                int iIntValue = ((Number) l4cVarA.getValue()).intValue();
                eyi eyiVar2 = eyiVar;
                boolean z2 = eyiVar2.b;
                boolean z3 = eyiVar2.g() == n26.a;
                int i6 = i3;
                long j = njlVar2.j(i6);
                xbe xbeVar = njlVar2.b;
                int i7 = xjl.c;
                int iG = (int) (j >> 32);
                int i8 = xbeVar.f;
                if (xbeVar.d(iG) != iIntValue) {
                    iG = iIntValue >= i8 ? njlVar2.g(i8 - 1) : njlVar2.g(iIntValue);
                }
                int iC = (int) (j & 4294967295L);
                if (xbeVar.d(iC) != iIntValue) {
                    iC = iIntValue >= i8 ? xbeVar.c(i8 - 1, false) : xbeVar.c(iIntValue, false);
                }
                int i9 = i5;
                if (iG == i9) {
                    return r05Var2.r(iC);
                }
                if (iC == i9) {
                    return r05Var2.r(iG);
                }
                if (!(z2 ^ z3) ? i6 >= iG : i6 > iC) {
                    iG = iC;
                }
                return r05Var2.r(iG);
            }
        });
        nyiVar.getClass();
        if (i3 == i4) {
            return nyiVar;
        }
        if (((Number) l4cVarA.getValue()).intValue() != njlVar.b.d(i4)) {
            return (nyi) l4cVarA2.getValue();
        }
        int i6 = nyiVar.b;
        long j = njlVar.j(i6);
        if (i4 != -1) {
            if (i3 != i4) {
                if (!(z ^ ((i2 < i ? n26.b : i2 > i ? n26.a : n26.c) == n26.a))) {
                }
            }
            return r05Var.r(i3);
        }
        int i7 = xjl.c;
        return (i6 == ((int) (j >> 32)) || i6 == ((int) (j & 4294967295L))) ? (nyi) l4cVarA2.getValue() : r05Var.r(i3);
    }

    @Override // defpackage.wpj
    public final float b(ViewGroup viewGroup, View view) {
        return view.getTranslationX();
    }
}
