package defpackage;

import J.N;
import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.opera.android.Lazy;
import com.opera.android.custom_views.EqualWidthLinearLayout;
import com.opera.android.settings.SettingsManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.google_apis.gaia.GoogleServiceAuthError;

/* loaded from: classes.dex */
public final class d5o implements im5, ijf, a47, cdo, ann {
    public static volatile d5o e;
    public Object a;
    public Object b;
    public Object c;
    public static final wu5 d = new wu5();
    public static final wlm f = new wlm(2);

    public d5o(byte b) {
        switch (b) {
            case 11:
                this.a = new y3d(16);
                long[] jArr = imi.a;
                this.b = new see();
                this.c = new auj((byte) 3);
                break;
            case 27:
                this.a = new Object();
                break;
            case 29:
                this.a = new qq6((byte) 4);
                this.b = new qq6((byte) 4);
                this.c = new qq6((byte) 4);
                break;
            default:
                this.a = new hw1(this);
                this.b = new iw1(this, (byte) 0);
                break;
        }
    }

    public d5o(Context context) {
        long jM;
        this.c = new Object();
        int i = Build.VERSION.SDK_INT;
        String str = i + "_" + Build.TIME;
        try {
            jM = i >= 33 ? t8.m(context) : context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode();
        } catch (PackageManager.NameNotFoundException unused) {
            jM = 1;
        }
        this.b = str + "." + jM;
        Context contextCreateDeviceProtectedStorageContext = context.isDeviceProtectedStorage() ? context : null;
        File file = new File(((contextCreateDeviceProtectedStorageContext == null && (contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext()) == null) ? context : contextCreateDeviceProtectedStorageContext).getCacheDir(), "emoji_picker");
        this.a = file;
        if (file.exists()) {
            return;
        }
        file.mkdir();
    }

    public /* synthetic */ d5o(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public d5o(n1 n1Var) {
        this.a = n1Var;
    }

    public static ArrayList G(File file) throws IOException {
        int i;
        if (!file.isFile()) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charsets.UTF_8), 8192);
        try {
            List listG = y1j.g(new do5(new d82(bufferedReader, (byte) 2)));
            bufferedReader.close();
            List list = listG;
            ArrayList arrayList = new ArrayList(k95.o(list, 10));
            Iterator it = list.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                arrayList.add(StringsKt.Y((String) it.next(), new String[]{","}, 0, 6));
            }
            ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                List list2 = (List) obj;
                arrayList2.add(new nz7((String) CollectionsKt.K(list2), CollectionsKt.G(list2, 1)));
            }
            return arrayList2;
        } finally {
        }
    }

    public static List P(File file, q14 q14Var) throws IOException {
        List<nz7> list = (List) q14Var.invoke();
        if (file.exists() && !file.delete()) {
            Log.wtf("emojipicker.FileCache", "Can't delete file: " + file);
        }
        if (!file.createNewFile()) {
            n57.d(file, "Can't create file: ");
            return null;
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), Charsets.UTF_8), 8192);
        try {
            for (nz7 nz7Var : list) {
                bufferedWriter.write(nz7Var.a);
                Iterator it = nz7Var.b.iterator();
                while (it.hasNext()) {
                    bufferedWriter.write("," + ((String) it.next()));
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            return list;
        } finally {
        }
    }

    public static wn6 v(jjd jjdVar) {
        esg esgVar = new esg((byte) 12);
        esgVar.c = null;
        Uri uri = jjdVar.c;
        String string = uri == null ? null : uri.toString();
        boolean z = jjdVar.h;
        tn tnVar = new tn();
        z4o.w((z && TextUtils.isEmpty(string)) ? false : true);
        tnVar.b = esgVar;
        tnVar.c = string;
        tnVar.a = z;
        tnVar.d = new HashMap();
        q4 q4VarN = jjdVar.e.j().n();
        while (true) {
            q4 q4Var = q4VarN;
            if (!q4Var.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) q4Var.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) tnVar.d)) {
                ((HashMap) tnVar.d).put(str, str2);
            }
        }
        HashMap map = new HashMap();
        UUID uuid = q54.a;
        i06 i06Var = new i06((byte) 2);
        UUID uuid2 = jjdVar.a;
        uuid2.getClass();
        boolean z2 = jjdVar.f;
        boolean z3 = jjdVar.g;
        int[] iArrB0 = sgb.b0(jjdVar.i);
        int length = iArrB0.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArrB0[i];
            z4o.w(i2 == 2 || i2 == 1);
        }
        wn6 wn6Var = new wn6(uuid2, tnVar, map, z2, (int[]) iArrB0.clone(), z3, i06Var);
        byte[] bArr = jjdVar.j;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        z4o.H(wn6Var.m.isEmpty());
        wn6Var.v = bArrCopyOf;
        return wn6Var;
    }

    public final sh4 A() {
        return ((uh4) this.c).a.c;
    }

    public final ArrayList B() {
        ArrayList arrayList = ((lx4) this.c).a;
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            dw4 dw4Var = (dw4) obj;
            Object objA = dw4Var.a();
            arrayList2.add(objA != null ? new nv4(dw4Var.getConfiguration(), objA, dw4Var.getKey()) : new ov4(dw4Var.getConfiguration(), dw4Var.getKey()));
        }
        return arrayList2;
    }

    public final synchronized ArrayList C(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            wbe wbeVar = (wbe) obj;
            if (!arrayList.contains(wbeVar.b) && wbeVar.a.isAssignableFrom(cls)) {
                arrayList.add(wbeVar.b);
            }
        }
        return arrayList;
    }

    public final long D() {
        return ((uh4) this.c).a.d;
    }

    public final boolean E() {
        return !(((awj) ((qq6) this.a).b).isEmpty() && ((awj) ((qq6) this.c).b).isEmpty() && ((awj) ((qq6) this.b).b).isEmpty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean F(int i, uo5 uo5Var, n5h n5hVar) {
        cb3 cb3Var = (cb3) this.b;
        int[] iArr = uo5Var.o0;
        int[] iArr2 = uo5Var.s;
        cb3Var.a = iArr[0];
        cb3Var.b = iArr[1];
        cb3Var.c = uo5Var.n();
        cb3Var.d = uo5Var.k();
        cb3Var.i = false;
        cb3Var.j = i;
        boolean z = cb3Var.a == 3;
        boolean z2 = cb3Var.b == 3;
        boolean z3 = z && uo5Var.V > 0.0f;
        boolean z4 = z2 && uo5Var.V > 0.0f;
        if (z3 && iArr2[0] == 4) {
            cb3Var.a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            cb3Var.b = 1;
        }
        n5hVar.d(uo5Var, cb3Var);
        uo5Var.J(cb3Var.e);
        uo5Var.G(cb3Var.f);
        uo5Var.D = cb3Var.h;
        uo5Var.D(cb3Var.g);
        cb3Var.j = (byte) 0;
        return cb3Var.i;
    }

    public final void H(sh4 sh4Var) {
        ((uh4) this.c).a.c = sh4Var;
    }

    public final void I(n27 n27Var) {
        ((uh4) this.c).a.a = n27Var;
    }

    public final void J(d2c d2cVar) {
        ((uh4) this.c).a.b = d2cVar;
    }

    public final void K(long j) {
        ((uh4) this.c).a.d = j;
    }

    public final void L(vo5 vo5Var, int i, int i2, int i3) {
        vo5Var.getClass();
        int i4 = vo5Var.a0;
        int i5 = vo5Var.b0;
        vo5Var.a0 = 0;
        vo5Var.b0 = 0;
        vo5Var.J(i2);
        vo5Var.G(i3);
        if (i4 < 0) {
            vo5Var.a0 = 0;
        } else {
            vo5Var.a0 = i4;
        }
        if (i5 < 0) {
            vo5Var.b0 = 0;
        } else {
            vo5Var.b0 = i5;
        }
        vo5 vo5Var2 = (vo5) this.c;
        vo5Var2.s0 = i;
        vo5Var2.P();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [dw4] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [bw4] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void M(ArrayList arrayList) {
        Pair pair;
        LinkedHashMap linkedHashMapO = xug.o(arrayList, px4.b);
        uj6 uj6Var = uj6.b;
        int i = 0;
        if (!uj6.b.a) {
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                hashSet.add(((mkj) obj).a);
            }
            if (hashSet.size() != arrayList.size()) {
                StringBuilder sb = new StringBuilder("Configurations must be unique: ");
                ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(((mkj) obj2).a);
                }
                sb.append(arrayList2);
                sb.append('.');
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        LinkedHashMap linkedHashMapO2 = xug.o(((lx4) this.c).a, qx4.b);
        ArrayList arrayList3 = new ArrayList(linkedHashMapO.size());
        for (Map.Entry entry : linkedHashMapO.entrySet()) {
            vkb vkbVar = (vkb) entry.getKey();
            mkj mkjVar = (mkj) entry.getValue();
            dw4 dw4Var = (dw4) linkedHashMapO2.get(vkbVar);
            if (dw4Var instanceof bw4) {
                pair = new Pair(dw4Var, mkjVar.b);
            } else if (dw4Var instanceof cw4) {
                ew4 ew4Var = mkjVar.b;
                int iOrdinal = ew4Var.ordinal();
                if (iOrdinal == 0) {
                    pair = new Pair(dw4Var, ew4Var);
                } else {
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        h9o.p();
                        return;
                    }
                    cw4 cw4Var = (cw4) dw4Var;
                    bw4 bw4VarX = mkh.x((i3j) this.a, mkjVar.a, cw4Var.b, cw4Var.c, 8);
                    vtp.A(bw4VarX.d);
                    pair = new Pair(bw4VarX, ew4Var);
                }
            } else {
                if (dw4Var != null) {
                    h9o.p();
                    return;
                }
                ew4 ew4Var2 = mkjVar.b;
                int iOrdinal2 = ew4Var2.ordinal();
                if (iOrdinal2 == 0) {
                    pair = new Pair(new cw4(mkjVar.a, hyg.p().toString(), null), ew4Var2);
                } else if (iOrdinal2 != 1 && iOrdinal2 != 2 && iOrdinal2 != 3) {
                    h9o.p();
                    return;
                } else {
                    bw4 bw4VarX2 = mkh.x((i3j) this.a, mkjVar.a, hyg.p().toString(), null, 12);
                    vtp.A(bw4VarX2.d);
                    pair = new Pair(bw4VarX2, ew4Var2);
                }
            }
            arrayList3.add(pair);
        }
        Set setKeySet = linkedHashMapO.keySet();
        for (Map.Entry entry2 : linkedHashMapO2.entrySet()) {
            vkb vkbVar2 = (vkb) entry2.getKey();
            dw4 dw4Var2 = (dw4) entry2.getValue();
            bw4 bw4Var = dw4Var2 instanceof bw4 ? (bw4) dw4Var2 : null;
            if (bw4Var != null && !setKeySet.contains(vkbVar2)) {
                bw4Var.g.e();
                vtp.B(bw4Var.d);
                bw4Var.f.k();
            }
        }
        lx4 lx4Var = (lx4) this.c;
        lx4Var.a.clear();
        int size3 = arrayList3.size();
        while (i < size3) {
            Object obj3 = arrayList3.get(i);
            i++;
            Pair pair2 = (Pair) obj3;
            ?? cw4Var2 = (dw4) pair2.a;
            ew4 ew4Var3 = (ew4) pair2.b;
            ArrayList arrayList4 = lx4Var.a;
            if (cw4Var2 instanceof bw4) {
                cw4Var2 = (bw4) cw4Var2;
                zm6 zm6Var = cw4Var2.g;
                rdc rdcVar = cw4Var2.d;
                int iOrdinal3 = ew4Var3.ordinal();
                if (iOrdinal3 == 0) {
                    k2j k2jVarC = cw4Var2.e.c();
                    cw4Var2.g.e();
                    vtp.B(cw4Var2.d);
                    cw4Var2.f.k();
                    cw4Var2 = new cw4(cw4Var2.a, cw4Var2.b, k2jVarC);
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 == 2) {
                        pcc pccVar = (pcc) rdcVar.c;
                        pcc pccVar2 = pcc.d;
                        if (pccVar.compareTo(pccVar2) < 0) {
                            zm6Var.d();
                            vtp.X(rdcVar);
                        } else if (((pcc) rdcVar.c).compareTo(pccVar2) > 0 && ((pcc) rdcVar.c) == pcc.e) {
                            rdcVar.onPause();
                        }
                    } else if (iOrdinal3 != 3) {
                        h9o.p();
                        return;
                    } else if (((pcc) rdcVar.c) != pcc.e) {
                        zm6Var.d();
                        vtp.T(rdcVar);
                    }
                } else if (((pcc) rdcVar.c) != pcc.c) {
                    zm6Var.e();
                    vtp.Z(rdcVar);
                }
            } else if (!(cw4Var2 instanceof cw4)) {
                h9o.p();
                return;
            }
            arrayList4.add(cw4Var2);
        }
    }

    public final void N() {
        qp3 qp3Var;
        pde pdeVar = (pde) this.c;
        ebl eblVar = (ebl) this.a;
        EqualWidthLinearLayout equalWidthLinearLayout = eblVar.b;
        if (equalWidthLinearLayout.getVisibility() == 0) {
            int height = equalWidthLinearLayout.getHeight() / 3;
            qp3Var = new qp3(height, (eblVar.w.getHeight() - equalWidthLinearLayout.getTop()) - height, 1.0f);
        } else {
            qp3Var = new qp3(((g03) ((pde) this.b).g()).a, 0, 1.0f);
        }
        xf8.F0(pdeVar, qp3Var);
    }

    public final void O(vo5 vo5Var) {
        ArrayList arrayList = (ArrayList) this.a;
        arrayList.clear();
        int size = vo5Var.p0.size();
        for (int i = 0; i < size; i++) {
            uo5 uo5Var = (uo5) vo5Var.p0.get(i);
            int[] iArr = uo5Var.o0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(uo5Var);
            }
        }
        vo5Var.r0.a = true;
    }

    @Override // defpackage.cdo
    public final float a() {
        ge4 ge4Var = ((pe4) this.a).b;
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
        Object objValueOf = Float.valueOf(1.0f);
        Object objC = ((ma4) ge4Var).c(key);
        if (objC != null) {
            objValueOf = objC;
        }
        Float f2 = (Float) objValueOf;
        float fFloatValue = f2.floatValue();
        if (((double) Math.abs(fFloatValue)) < ((double) Math.ulp(Math.abs(fFloatValue))) * 2.0d) {
            return 1.0f;
        }
        return f2.floatValue();
    }

    public final Lazy b() {
        return (ay) this.c;
    }

    @Override // defpackage.cdo
    public final h07 c(zrm zrmVar) {
        List listSingletonList = Collections.singletonList(CaptureRequest.SCALER_CROP_REGION);
        yrm yrmVar = yrm.a;
        return zrmVar.k(listSingletonList);
    }

    public final void d() {
        ((ju2) this.a).R(mp0.e, (String) this.b);
        ((tzn) this.c).invoke();
    }

    public final void e() {
        ((ju2) this.a).R(mp0.e, (String) this.b);
        ((tzn) this.c).invoke();
    }

    public final void g(GoogleServiceAuthError googleServiceAuthError) {
        N.MTN9MD0o((Object) null, 0L, googleServiceAuthError, ((hp2) this.b).b);
        ((jb) this.c).e();
    }

    public final xm5 h() {
        return ((mi) ((xbf) this.a).b).h();
    }

    @Override // defpackage.cdo
    public final float i() {
        return 1.0f;
    }

    public final void j(b8 b8Var) {
        hp2 hp2Var = (hp2) this.b;
        b8Var.getClass();
        N.MTN9MD0o("", 0L, new GoogleServiceAuthError(0), hp2Var.b);
        ((jb) this.c).e();
    }

    @Override // defpackage.cdo
    public final Rect l() {
        Rect rect = (Rect) this.b;
        return rect == null ? (Rect) this.c : rect;
    }

    @Override // defpackage.cdo
    public final h07 m(float f2, zrm zrmVar) {
        Rect rect = (Rect) this.c;
        if (Math.abs(f2) < Math.ulp(Math.abs(f2)) * 2.0d) {
            f2 = 1.0f;
        }
        float fWidth = rect.width() / f2;
        float fHeight = rect.height() / f2;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        Rect rect2 = new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
        this.b = rect2;
        return zrm.h(zrmVar, Collections.singletonMap(CaptureRequest.SCALER_CROP_REGION, rect2));
    }

    public final void n(m3c m3cVar, kjb kjbVar) {
        qq6 qq6Var = (qq6) this.a;
        qq6 qq6Var2 = (qq6) this.b;
        qq6 qq6Var3 = (qq6) this.c;
        int iOrdinal = kjbVar.ordinal();
        if (iOrdinal == 0) {
            qq6Var.b(m3cVar);
            qq6Var3.b(m3cVar);
            return;
        }
        if (iOrdinal == 1) {
            qq6Var2.b(m3cVar);
            qq6Var3.b(m3cVar);
            return;
        }
        if (iOrdinal == 2) {
            if (m3cVar.h != null) {
                qq6Var3.b(m3cVar);
                return;
            } else {
                qq6Var.b(m3cVar);
                return;
            }
        }
        if (iOrdinal != 3) {
            h9o.p();
        } else if (m3cVar.h != null) {
            qq6Var3.b(m3cVar);
        } else {
            qq6Var2.b(m3cVar);
        }
    }

    public final dx o(String str, boolean z) {
        ex exVar = (ex) this.b;
        return Intrinsics.a(str, "Jy6PlrM3") ? new dx("Adjust", exVar.c(z)) : Intrinsics.a(str, "weoN4Lb_MjWLuu") ? new dx("AppleAds", exVar.d("apple_ads", z)) : Intrinsics.a(str, "ocv9HNX_g") ? new dx("Facebook", exVar.d("facebook", z)) : Intrinsics.a(str, "S1_9Vsuj-Q") ? new dx("GoogleAds", exVar.d("adwords", z)) : Intrinsics.a(str, "t-TPeXsRi") ? new dx("GoogleMarketingPlatform", exVar.d("google_marketing_platform", z)) : Intrinsics.a(str, "QcD9GVNXZ") ? new dx("Snapchat", exVar.d("snapchat", z)) : Intrinsics.a(str, "tMLzMavbHZoxW0") ? new dx("Tencent", exVar.d("tencent", z)) : Intrinsics.a(str, "6-qobRfu") ? new dx("TikTokSan", exVar.d("tiktok_san", z)) : Intrinsics.a(str, "Skj79NodobQ") ? new dx("Twitter", exVar.d("twitter", z)) : Intrinsics.a(str, "HJSPc4ids-Q") ? new dx("YahooGemini", exVar.d("yahoo_gemini", z)) : Intrinsics.a(str, "gUbemZYaQwqxss") ? new dx("YahooJapanSearch", exVar.d("yahoo_japan_search", z)) : new dx("UNKNOWN", false);
    }

    public final i20 p() throws GeneralSecurityException {
        i4d i4dVar;
        m54 m54VarA;
        n20 n20Var = (n20) this.a;
        if (n20Var == null || (i4dVar = (i4d) this.b) == null) {
            t3p.w("Cannot build without parameters and/or key material");
            return null;
        }
        if (n20Var.a != ((m54) i4dVar.b).a.length) {
            t3p.w("Key size mismatch");
            return null;
        }
        if (n20Var.a() && ((Integer) this.c) == null) {
            t3p.w("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((n20) this.a).a() && ((Integer) this.c) != null) {
            t3p.w("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        m20 m20Var = ((n20) this.a).c;
        if (m20Var == m20.f) {
            m54VarA = juf.a;
        } else if (m20Var == m20.e || m20Var == m20.d) {
            m54VarA = juf.a(((Integer) this.c).intValue());
        } else {
            if (m20Var != m20.c) {
                j9h.u(((n20) this.a).c, "Unknown AesCmacParametersParameters.Variant: ");
                return null;
            }
            m54VarA = juf.b(((Integer) this.c).intValue());
        }
        return new i20((n20) this.a, (i4d) this.b, m54VarA, (Integer) this.c);
    }

    public final c40 q() throws GeneralSecurityException {
        i4d i4dVar;
        m54 m54VarB;
        h40 h40Var = (h40) this.a;
        if (h40Var == null || (i4dVar = (i4d) this.b) == null) {
            t3p.w("Cannot build without parameters and/or key material");
            return null;
        }
        if (h40Var.a != ((m54) i4dVar.b).a.length) {
            t3p.w("Key size mismatch");
            return null;
        }
        if (h40Var.a() && ((Integer) this.c) == null) {
            t3p.w("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((h40) this.a).a() && ((Integer) this.c) != null) {
            t3p.w("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        g40 g40Var = ((h40) this.a).d;
        if (g40Var == g40.e) {
            m54VarB = juf.a;
        } else if (g40Var == g40.d) {
            m54VarB = juf.a(((Integer) this.c).intValue());
        } else {
            if (g40Var != g40.c) {
                j9h.u(((h40) this.a).d, "Unknown AesGcmParameters.Variant: ");
                return null;
            }
            m54VarB = juf.b(((Integer) this.c).intValue());
        }
        return new c40((h40) this.a, (i4d) this.b, m54VarB, (Integer) this.c);
    }

    public final synchronized v7e r(Class cls, Class cls2) {
        byte b;
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) this.a;
            int size = arrayList2.size();
            boolean z = false;
            int i = 0;
            while (true) {
                b = 1;
                if (i >= size) {
                    break;
                }
                Object obj = arrayList2.get(i);
                i++;
                wbe wbeVar = (wbe) obj;
                if (((HashSet) this.b).contains(wbeVar)) {
                    z = true;
                } else if (wbeVar.a.isAssignableFrom(cls) && wbeVar.b.isAssignableFrom(cls2)) {
                    ((HashSet) this.b).add(wbeVar);
                    arrayList.add(wbeVar.c.w(this));
                    ((HashSet) this.b).remove(wbeVar);
                }
            }
            if (arrayList.size() > 1) {
                return new fc2(arrayList, (ua7) this.c, b);
            }
            if (arrayList.size() == 1) {
                return (v7e) arrayList.get(0);
            }
            if (z) {
                return f;
            }
            throw new yrh("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            ((HashSet) this.b).clear();
            throw th;
        }
    }

    public final b8 run() {
        a4f a4fVar = (a4f) ((jb) this.c).d;
        String str = ((CoreAccountInfo) this.a).b;
        int i = yb.a;
        new Account(str, "com.google");
        a4fVar.getClass();
        throw new UnsupportedOperationException("NullAccountManagerDelegate does not implement getAccessToken");
    }

    public final synchronized ArrayList s(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) this.a;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                wbe wbeVar = (wbe) obj;
                if (!((HashSet) this.b).contains(wbeVar) && wbeVar.a.isAssignableFrom(cls)) {
                    ((HashSet) this.b).add(wbeVar);
                    arrayList.add(wbeVar.c.w(this));
                    ((HashSet) this.b).remove(wbeVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final boolean t(m3c m3cVar) {
        return !(m3cVar.h == null) && (((awj) ((qq6) this.a).b).contains(m3cVar) || ((awj) ((qq6) this.b).b).contains(m3cVar));
    }

    public final void u(bnn bnnVar) {
        ((ju2) this.a).R(mp0.d, (String) this.b);
        ((tzn) this.c).invoke();
    }

    public final void w(u70 u70Var) {
        String str;
        String str2;
        String str3;
        hf0 hf0Var;
        gw0 gw0Var = (gw0) this.c;
        if (gw0Var == null) {
            return;
        }
        x5f x5fVar = (orm) this.b;
        t70 t70Var = gw0Var.a;
        fw0 fw0Var = gw0Var.b;
        if (fw0Var != null) {
            str2 = fw0Var.a;
            str3 = fw0Var.b;
            str = fw0Var.c;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        ArrayList arrayList = gw0Var.c;
        x5f x5fVar2 = x5fVar;
        if (x5fVar2.h) {
            zpa zpaVar = x5fVar2.d;
            x56 x56VarF = zpa.F();
            int i = 2443;
            w70 w70Var = new w70(2443, -1, 7);
            w70Var.q(0, 1, t70Var);
            if (str2 == null) {
                str2 = "organic";
            }
            w70Var.q(4, 1, str2);
            if (str3 == null) {
                str3 = "organic";
            }
            w70Var.q(5, 1, str3);
            if (str == null) {
                str = "organic";
            }
            w70Var.q(6, 1, str);
            w70Var.q(1, 1, u70Var);
            if (!arrayList.isEmpty()) {
                x70 x70Var = (x70) arrayList.get(0);
                w70Var.q(3, x70Var == null ? 0 : 1, x70Var);
                int i2 = 2;
                List list = (List) w70Var.n(2);
                if (list == null || list.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    w70Var.q(2, 1, arrayList2);
                    hf0Var = new hf0(w70Var, 2, arrayList2);
                } else {
                    hf0Var = new hf0(w70Var, 2, list);
                }
                int size = arrayList.size();
                int i3 = 1;
                while (i3 < size) {
                    v70 v70Var = new v70(i, -1, i2);
                    x70 x70Var2 = (x70) arrayList.get(i3 - 1);
                    v70Var.q(0, x70Var2 == null ? 0 : 1, x70Var2);
                    x70 x70Var3 = (x70) arrayList.get(i3);
                    v70Var.q(1, x70Var3 == null ? 0 : 1, x70Var3);
                    hf0Var.add(v70Var);
                    i3++;
                    i2 = 2;
                    i = 2443;
                }
            }
            qd0 qd0VarB = x56VarF.B(zpaVar);
            List list2 = (List) qd0VarB.n(50);
            ((list2 == null || list2.isEmpty()) ? new hf0(qd0VarB, 50, vep.t(qd0VarB, 50, 1)) : new hf0(qd0VarB, 50, list2)).add(w70Var);
            x5fVar2.U0(x56VarF);
        }
        this.c = null;
    }

    public final em7 x(qjd qjdVar) {
        wn6 wn6Var;
        qjdVar.b.getClass();
        jjd jjdVar = qjdVar.b.c;
        if (jjdVar == null) {
            return em7.a;
        }
        synchronized (this.a) {
            if (!jjdVar.equals((jjd) this.b)) {
                this.b = jjdVar;
                this.c = v(jjdVar);
            }
            wn6Var = (wn6) this.c;
            wn6Var.getClass();
        }
        return wn6Var;
    }

    @Override // defpackage.a47
    public final void y(Function1 function1) {
        z37 z37Var = (z37) this.b;
        if (z37Var != null) {
            function1.invoke(z37Var);
            return;
        }
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList != null) {
            arrayList.add(function1);
            return;
        }
        ArrayList arrayListJ = j95.j(new Function1[]{function1});
        this.c = arrayListJ;
        ((n1) this.a).y(new cv2(this, arrayListJ, (byte) 13));
    }

    public final void z(cnn cnnVar) {
        tzn tznVar = (tzn) this.c;
        String str = (String) this.b;
        ju2 ju2Var = (ju2) this.a;
        SettingsManager settingsManager = (SettingsManager) ju2Var.b;
        if (!settingsManager.J()) {
            ju2Var.R(mp0.c, str);
            tznVar.invoke();
            return;
        }
        settingsManager.a.e(str, settingsManager.c.getString("wallpaper_current", null));
        x5f x5fVar = (x5f) ju2Var.c;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            x56VarF.F(zpaVar).D(75, str);
            x5fVar.U0(x56VarF);
        }
        ju2Var.R(mp0.b, str);
        tznVar.invoke();
    }
}
