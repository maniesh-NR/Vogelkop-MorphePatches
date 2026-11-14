package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import com.google.firebase.components.ComponentRegistrar;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.content.browser.androidoverlay.AndroidOverlayProviderImpl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n9a implements f45, ee5, tad, vuj, u2j, v3o, oeb, b42, wf3, a54, kuh, he5 {
    public static List d;
    public static LinkedHashMap e;
    public static AndroidOverlayProviderImpl p;
    public static n9a q;
    public final /* synthetic */ byte a;
    public static final n9a b = new n9a(1);
    public static final n9a c = new n9a(2);
    public static final n9a f = new n9a(3);
    public static final n9a g = new n9a(4);
    public static final n9a h = new n9a(6);
    public static final n9a i = new n9a(7);
    public static final sa2 j = new sa2((byte) 6);
    public static final n9a k = new n9a(9);
    public static final n9a l = new n9a(10);
    public static final n9a m = new n9a(11);
    public static final n9a n = new n9a(12);
    public static final n9a o = new n9a(13);

    public /* synthetic */ n9a(byte b2) {
        this.a = b2;
    }

    public static hs3 n(String str) {
        return Intrinsics.a(str, "opera") ? hs3.b : Intrinsics.a(str, "beta") ? hs3.c : hs3.d;
    }

    public static w56 o() {
        w56 w56Var = new w56(2431, -1, 19);
        w56Var.p(2, -1, System.currentTimeMillis());
        return w56Var;
    }

    public static hs3 s(Context context) {
        if (s6e.b(context).c()) {
            vq8 vq8Var = s6e.b(context).b;
            String str = vq8Var != null ? (String) vq8Var.g : "";
            if (str.length() > 0) {
                return n(str);
            }
        }
        return n("beta");
    }

    public static String t(Context context) {
        return s(context).d(context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void u(orb orbVar, ks3 ks3Var, wub wubVar) {
        Unit q0iVar;
        dlj zuhVar;
        oia oiaVar;
        Unit q0iVar2;
        nia niaVar;
        gsb gsbVarO = kfo.O(orbVar);
        try {
            String strE = orbVar.e("method");
            byte b2 = 2;
            byte b3 = 3;
            byte b4 = 1;
            mt5 mt5Var = null;
            int i2 = 0;
            switch (strE.hashCode()) {
                case -1475161441:
                    if (strE.equals("actions.v1.updateNavbarAppearance")) {
                        orb orbVarC = orbVar.b("params").c(0);
                        orbVarC.e("color");
                        boolean z = orbVarC.a.getBoolean("useLightText");
                        eka ekaVar = new eka(gsbVarO, wubVar, (byte) 12);
                        ks3Var.getClass();
                        try {
                            p0i p0iVar = t0i.b;
                            ((vga) ks3Var.c).H(z);
                            q0iVar = Unit.a;
                        } catch (Throwable th) {
                            p0i p0iVar2 = t0i.b;
                            q0iVar = new q0i(th);
                        }
                        Throwable thD = t0i.d(q0iVar);
                        if (thD != null) {
                            ekaVar.n(new rw7(new dqb(thD)));
                            break;
                        } else {
                            ekaVar.n(new sw7(q0iVar));
                            break;
                        }
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), wubVar);
                    break;
                case -1447189234:
                    if (strE.equals("actions.v1.getCrashId")) {
                        ((wyn) ks3Var.e).a(new y0a(new eka(gsbVarO, wubVar, (byte) 7), (byte) 4));
                        break;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), wubVar);
                    break;
                case -1268616645:
                    if (strE.equals("analytics.v1.reportEvent")) {
                        orb orbVarC2 = orbVar.b("params").c(0);
                        orb orbVarC3 = orbVarC2.c(NotificationCompat.CATEGORY_EVENT);
                        JSONObject jSONObject = orbVarC3.a;
                        if (jSONObject.has(NotificationCompat.CATEGORY_EVENT)) {
                            orbVarC3.e("type");
                            orbVarC3.e(NotificationCompat.CATEGORY_EVENT);
                            zuhVar = new dlj();
                        } else if (jSONObject.has("source")) {
                            orbVarC3.e("type");
                            zuhVar = new s7h(orbVarC3.e("source"));
                        } else {
                            zuhVar = new zuh();
                        }
                        orbVarC2.e("page");
                        ks3Var.f(zuhVar, new eka(gsbVarO, wubVar, (byte) 5));
                        break;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), wubVar);
                    break;
                case -1079991253:
                    if (strE.equals("actions.v1.updateUserLocation")) {
                        orb orbVarC4 = orbVar.b("params").c(0).c("userLocation");
                        na2.B((ddc) ks3Var.a, null, null, new s71(new eka(gsbVarO, wubVar, (byte) 9), orbVarC4.a.has("locationId") ? new qia(orbVarC4.e("locationId"), orbVarC4.e("locationName")) : new pia(), ks3Var, (mt5) null, (byte) 22), 3);
                        break;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), wubVar);
                    break;
                case -821689111:
                    if (strE.equals("actions.v1.updateFCMTopics")) {
                        orb orbVarC5 = orbVar.b("params").c(0);
                        ArrayList arrayList = new ArrayList();
                        vpb vpbVarB = orbVarC5.b("topics");
                        int length = vpbVarB.a.length();
                        while (i2 < length) {
                            arrayList.add(vpbVarB.d(i2));
                            i2++;
                        }
                        na2.B((ddc) ks3Var.a, null, null, new s71(new eka(gsbVarO, wubVar, (byte) 8), ks3Var, arrayList, (mt5) null, (byte) 19), 3);
                        break;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), wubVar);
                    break;
                case -809810051:
                    if (strE.equals("actions.v1.updateNotificationDebug")) {
                        na2.B((ddc) ks3Var.a, null, null, new vf6(new eka(gsbVarO, wubVar, (byte) 1), ks3Var, orbVar.b("params").c(0).a.getBoolean("enabled"), (mt5) null), 3);
                        break;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), wubVar);
                    break;
                case -809281107:
                    if (strE.equals("actions.v1.updateTemperatureUnit")) {
                        String strM = orbVar.b("params").c(0).m("temperatureUnit", (String) null);
                        if (strM == null) {
                            oiaVar = null;
                        } else {
                            oia[] oiaVarArrValues = oia.values();
                            int length2 = oiaVarArrValues.length;
                            while (true) {
                                if (i2 >= length2) {
                                    oiaVar = oia.UNDEFINED;
                                } else {
                                    oia oiaVar2 = oiaVarArrValues[i2];
                                    if (oiaVar2 == oia.UNDEFINED || !strM.equals(oiaVar2.a)) {
                                        i2++;
                                    } else {
                                        oiaVar = oiaVar2;
                                    }
                                }
                            }
                        }
                        na2.B((ddc) ks3Var.a, null, null, new s71(new eka(gsbVarO, wubVar, (byte) 11), oiaVar, ks3Var, (mt5) null, (byte) 21), 3);
                        break;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), wubVar);
                    break;
                case 1165518465:
                    if (strE.equals("actions.v1.setCloseAppOnBackButton")) {
                        boolean z2 = orbVar.b("params").c(0).a.getBoolean("close");
                        eka ekaVar2 = new eka(gsbVarO, wubVar, (byte) 2);
                        ks3Var.getClass();
                        try {
                            p0i p0iVar3 = t0i.b;
                            ((vga) ks3Var.c).e(z2);
                            q0iVar2 = Unit.a;
                        } catch (Throwable th2) {
                            p0i p0iVar4 = t0i.b;
                            q0iVar2 = new q0i(th2);
                        }
                        Throwable thD2 = t0i.d(q0iVar2);
                        if (thD2 != null) {
                            ekaVar2.n(new rw7(new dqb(thD2)));
                            break;
                        } else {
                            ekaVar2.n(new sw7(q0iVar2));
                            break;
                        }
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), wubVar);
                    break;
                case 1172760871:
                    if (strE.equals("actions.v1.requestNotificationPermission")) {
                        na2.B((ddc) ks3Var.a, null, null, new mz9(new eka(gsbVarO, wubVar, (byte) 4), ks3Var, mt5Var, b4), 3);
                        break;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), wubVar);
                    break;
                case 1373496959:
                    if (strE.equals("device.v1.getDeviceInfo")) {
                        na2.B((ddc) ks3Var.a, null, null, new mz9(new eka(gsbVarO, wubVar, (byte) 3), ks3Var, mt5Var, b2), 3);
                        break;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), wubVar);
                    break;
                case 1855238694:
                    if (strE.equals("views.v1.getHostState")) {
                        na2.B((ddc) ks3Var.a, null, null, new mz9(new eka(gsbVarO, wubVar, (byte) 6), ks3Var, mt5Var, b3), 3);
                        break;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), wubVar);
                    break;
                case 2007662598:
                    if (strE.equals("actions.v1.openLink")) {
                        String strE2 = orbVar.b("params").c(0).e("url");
                        eka ekaVar3 = new eka(gsbVarO, wubVar, (byte) 0);
                        ((vga) ks3Var.c).y(strE2);
                        ekaVar3.n(new sw7(Unit.a));
                        break;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), wubVar);
                    break;
                case 2023365251:
                    if (strE.equals("actions.v1.updateLocationMode")) {
                        String strE3 = orbVar.b("params").c(0).e("mode");
                        nia[] niaVarArrValues = nia.values();
                        int length3 = niaVarArrValues.length;
                        while (true) {
                            if (i2 >= length3) {
                                niaVar = nia.UNDEFINED;
                            } else {
                                niaVar = niaVarArrValues[i2];
                                if (niaVar == nia.UNDEFINED || !strE3.equals(niaVar.a)) {
                                    i2++;
                                }
                            }
                        }
                        na2.B((ddc) ks3Var.a, null, null, new s71(new eka(gsbVarO, wubVar, (byte) 10), ks3Var, niaVar, (mt5) null, (byte) 20), 3);
                        break;
                    }
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), wubVar);
                    break;
                default:
                    kfo.F(gsbVarO, new cqb(-32601, "Method not found"), wubVar);
                    break;
            }
        } catch (Throwable th3) {
            dqb dqbVar = new dqb(th3);
            try {
                orbVar.e("method");
            } catch (JSONException unused) {
            }
            kfo.F(gsbVarO, dqbVar, wubVar);
        }
    }

    public final orb a() {
        return vep.p("type", "plain");
    }

    @Override // defpackage.kuh
    public final int b(oj9 oj9Var) {
        String str = oj9Var.n;
        if ("video/mp2t".equals(str) || "video/mp4".equals(str) || "video/ogg".equals(str) || "video/webm".equals(str) || "video/avc".equals(str) || "video/x-vnd.on2.vp8".equals(str) || "video/hevc".equals(str) || "video/x-vnd.on2.vp9".equals(str) || "video/dolby-vision".equals(str)) {
            return kuh.g(oj9Var.O == 0 ? 4 : 2, 0, 0, 0);
        }
        return dzd.o(str) ? kuh.g(1, 0, 0, 0) : kuh.g(0, 0, 0, 0);
    }

    public final List c(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (kd5 kd5Var : componentRegistrar.getComponents()) {
            String str = kd5Var.a;
            if (str != null) {
                ge5 ge5Var = new ge5((Object) str, (Object) kd5Var, (byte) 0);
                Set set = kd5Var.b;
                Set set2 = kd5Var.c;
                byte b2 = kd5Var.d;
                boolean z = kd5Var.e;
                kd5Var = new kd5(str, set, set2, b2, z ? 1 : 0, ge5Var, kd5Var.g);
            }
            arrayList.add(kd5Var);
        }
        return arrayList;
    }

    @Override // defpackage.a54
    public final byte[] copyFrom(byte[] bArr, int i2, int i3) {
        return Arrays.copyOfRange(bArr, i2, i3 + i2);
    }

    @Override // defpackage.wf3
    public final long e(long j2) {
        return j2;
    }

    @Override // defpackage.u2j
    public final Object getDefaultValue() {
        return new lee(true);
    }

    @Override // defpackage.kuh
    public final String getName() {
        return "Video";
    }

    @Override // defpackage.kuh
    public final int getTrackType() {
        return 2;
    }

    @Override // defpackage.v3o
    public final r3o h(Context context, o27 o27Var) {
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if (!(baseContext instanceof Activity) && !(baseContext instanceof InputMethodService)) {
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() == null) {
                    break;
                }
                baseContext = contextWrapper.getBaseContext();
            } else {
                break;
            }
        }
        if (baseContext instanceof Activity) {
            Activity activity = (Activity) baseContext;
            hr3.Fo.getClass();
            return new r3o(new gr3((Build.VERSION.SDK_INT >= 30 ? ir3.a : qs7.c).c(activity)), o27Var.b(activity));
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            qp2.o("Must provide a UiContext or Application Context");
            return null;
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new r3o(new Rect(0, 0, point.x, point.y), o27Var.b(context));
    }

    public final void i(uad uadVar, sad sadVar, Object obj) {
    }

    public final sad j(uad uadVar, Object obj, int i2, sad sadVar) {
        zad zadVar = (zad) sadVar;
        return zadVar == null ? new zad(obj, i2) : new yad(obj, i2, zadVar);
    }

    public final uad k(fbd fbdVar, int i2) {
        return new abd(fbdVar, i2);
    }

    public final sad l(uad uadVar, sad sadVar, sad sadVar2) {
        zad zadVar = (zad) sadVar;
        zad zadVar2 = (zad) sadVar2;
        Object obj = zadVar.a;
        int i2 = zadVar.b;
        return zadVar2 == null ? new zad(obj, i2) : new yad(obj, i2, zadVar2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: q6 */
    public final void m(pna pnaVar, kuk kukVar) throws q6 {
        switch (this.a) {
            case 1:
                cr9 cr9Var = (cr9) kukVar;
                c30 c30Var = new c30((byte) 7, "ObservableContent", false);
                mpa mpaVar = pnaVar.d;
                c30 c30Var2 = mpa.l;
                ArrayList arrayList = ((cfg) mpaVar).a;
                if (!mpaVar.e(c30Var)) {
                    int iC = mpaVar.c(c30Var2);
                    if (iC == -1) {
                        throw new q6("Phase " + c30Var2 + " was not registered for this pipeline", (byte) 4);
                    }
                    int i2 = iC + 1;
                    int size = arrayList.size() - 1;
                    if (i2 <= size) {
                        while (true) {
                            Object obj = arrayList.get(i2);
                            fdg fdgVar = obj instanceof fdg ? (fdg) obj : null;
                            if (fdgVar != null) {
                                ui6 ui6Var = fdgVar.b;
                                ffg ffgVar = ui6Var instanceof ffg ? (ffg) ui6Var : null;
                                if (ffgVar != null && ffgVar.s == c30Var2) {
                                    iC = i2;
                                }
                                if (i2 != size) {
                                    i2++;
                                }
                            }
                        }
                    }
                    arrayList.add(iC + 1, new fdg(c30Var, new ffg(c30Var2)));
                }
                mpaVar.f(c30Var, new z40(cr9Var, (mt5) null, (byte) 0));
                return;
            case 10:
                pnaVar.d.f(mpa.j, new x11((byte) 7, (mt5) null, (dr9) kukVar));
                return;
            default:
                pnaVar.e.f(mpa.p, new y40((byte) 4, (mt5) null, (er9) kukVar));
                return;
        }
    }

    public final neb q() {
        AndroidOverlayProviderImpl androidOverlayProviderImpl = p;
        if (androidOverlayProviderImpl != null) {
            return androidOverlayProviderImpl;
        }
        AndroidOverlayProviderImpl androidOverlayProviderImpl2 = new AndroidOverlayProviderImpl();
        p = androidOverlayProviderImpl2;
        return androidOverlayProviderImpl2;
    }

    public final Object r(x79 x79Var) {
        return fr3.I((Executor) x79Var.h(new qfh(c03.class, Executor.class)));
    }

    @Override // defpackage.u2j
    public final Object readFrom(InputStream inputStream) throws wx5 {
        byte[] bArr;
        try {
            msg msgVarO = msg.o(inputStream);
            lee leeVar = new lee(false);
            isg[] isgVarArr = (isg[]) Arrays.copyOf(new isg[0], 0);
            leeVar.b();
            if (isgVarArr.length > 0) {
                isg isgVar = isgVarArr[0];
                throw null;
            }
            for (Map.Entry entry : msgVarO.l().entrySet()) {
                String str = (String) entry.getKey();
                qsg qsgVar = (qsg) entry.getValue();
                int iU = qsgVar.u();
                switch (iU == 0 ? -1 : jsg.a[vep.A(iU)]) {
                    case -1:
                        throw new wx5("Value case is null.", null);
                    case 0:
                    default:
                        h9o.p();
                        return null;
                    case 1:
                        leeVar.d(new hsg(str), Boolean.valueOf(qsgVar.l()));
                        break;
                    case 2:
                        leeVar.d(new hsg(str), Float.valueOf(qsgVar.p()));
                        break;
                    case 3:
                        leeVar.d(new hsg(str), Double.valueOf(qsgVar.o()));
                        break;
                    case 4:
                        leeVar.d(new hsg(str), Integer.valueOf(qsgVar.q()));
                        break;
                    case 5:
                        leeVar.d(new hsg(str), Long.valueOf(qsgVar.r()));
                        break;
                    case 6:
                        leeVar.d(new hsg(str), qsgVar.s());
                        break;
                    case 7:
                        leeVar.d(new hsg(str), CollectionsKt.n0(qsgVar.t().n()));
                        break;
                    case 8:
                        hsg hsgVar = new hsg(str);
                        d54 d54VarM = qsgVar.m();
                        int size = d54VarM.size();
                        if (size == 0) {
                            bArr = jfb.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            d54VarM.i(size, bArr2);
                            bArr = bArr2;
                        }
                        leeVar.d(hsgVar, bArr);
                        break;
                    case 9:
                        throw new wx5("Value not set.", null);
                }
            }
            return new lee(new LinkedHashMap(leeVar.a()), true);
        } catch (cjb e2) {
            throw new wx5("Unable to parse preferences proto.", e2);
        }
    }

    @Override // defpackage.kuh
    public final int supportsMixedMimeTypeAdaptation() {
        return 0;
    }

    public final String toString() {
        switch (this.a) {
            case 7:
                return "NoDeclaredBrand";
            case 11:
                return "Start";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(android.content.Context r13, nt5 r14) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n9a.v(android.content.Context, nt5):java.lang.Object");
    }

    @Override // defpackage.u2j
    public final Unit writeTo(Object obj, OutputStream outputStream) {
        hv9 hv9VarB;
        Map mapA = ((lee) obj).a();
        ksg ksgVarN = msg.n();
        for (Map.Entry entry : mapA.entrySet()) {
            hsg hsgVar = (hsg) entry.getKey();
            Object value = entry.getValue();
            String str = hsgVar.a;
            if (value instanceof Boolean) {
                psg psgVarV = qsg.v();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                psgVarV.e();
                psgVarV.b.w(zBooleanValue);
                hv9VarB = psgVarV.b();
            } else if (value instanceof Float) {
                psg psgVarV2 = qsg.v();
                float fFloatValue = ((Number) value).floatValue();
                psgVarV2.e();
                psgVarV2.b.z(fFloatValue);
                hv9VarB = psgVarV2.b();
            } else if (value instanceof Double) {
                psg psgVarV3 = qsg.v();
                double dDoubleValue = ((Number) value).doubleValue();
                psgVarV3.e();
                psgVarV3.b.y(dDoubleValue);
                hv9VarB = psgVarV3.b();
            } else if (value instanceof Integer) {
                psg psgVarV4 = qsg.v();
                int iIntValue = ((Number) value).intValue();
                psgVarV4.e();
                psgVarV4.b.A(iIntValue);
                hv9VarB = psgVarV4.b();
            } else if (value instanceof Long) {
                psg psgVarV5 = qsg.v();
                long jLongValue = ((Number) value).longValue();
                psgVarV5.e();
                psgVarV5.b.B(jLongValue);
                hv9VarB = psgVarV5.b();
            } else if (value instanceof String) {
                psg psgVarV6 = qsg.v();
                psgVarV6.e();
                psgVarV6.b.C((String) value);
                hv9VarB = psgVarV6.b();
            } else if (value instanceof Set) {
                psg psgVarV7 = qsg.v();
                nsg nsgVarO = osg.o();
                nsgVarO.e();
                ((osg) nsgVarO.b).l((Set) value);
                psgVarV7.e();
                psgVarV7.b.D((osg) nsgVarO.b());
                hv9VarB = psgVarV7.b();
            } else {
                if (!(value instanceof byte[])) {
                    qp2.n("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return null;
                }
                psg psgVarV8 = qsg.v();
                byte[] bArr = (byte[]) value;
                d54 d54VarH = d54.h(0, bArr.length, bArr);
                psgVarV8.e();
                psgVarV8.b.x(d54VarH);
                hv9VarB = psgVarV8.b();
            }
            ksgVarN.getClass();
            str.getClass();
            ksgVarN.e();
            ((msg) ksgVarN.b).m().put(str, (qsg) hv9VarB);
        }
        msg msgVar = (msg) ksgVarN.b();
        int iA = msgVar.a(null);
        Logger logger = x75.f;
        if (iA > 4096) {
            iA = 4096;
        }
        x75 x75Var = new x75(outputStream, iA);
        msgVar.b(x75Var);
        if (x75Var.d > 0) {
            x75Var.j();
        }
        return Unit.a;
    }
}
