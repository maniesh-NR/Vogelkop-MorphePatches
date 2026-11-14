package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.URLUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes.dex */
public abstract class fip {
    public static int e;
    public static boolean f;
    public static int g;
    public static final ng2 j;
    public static final HashMap a = new HashMap();
    public static final ArrayList b = new ArrayList();
    public static final omj c = new omj((byte) 26);
    public static final ArrayList d = new ArrayList();
    public static final koj h = new koj(15);
    public static final EnumMap i = new EnumMap(vhp.class);

    static {
        NetworkInfo activeNetworkInfo;
        ng2 ng2Var = new ng2((byte) 9);
        ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) phf.a.a).getSystemService("connectivity");
        ng2Var.b = (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getType() != 1) ? (byte) 2 : (byte) 4;
        j = ng2Var;
    }

    public static void a(Context context, String str, int i2, int i3, vhp vhpVar, zhp zhpVar) {
        if (TextUtils.isEmpty(str)) {
            zhpVar.a(1);
            return;
        }
        whp whpVar = new whp(str, i2, i3, vhpVar);
        lep.a.c(whpVar);
        Context applicationContext = context.getApplicationContext();
        gxo gxoVar = gxo.c;
        HashMap map = a;
        aip aipVar = (aip) map.get(whpVar);
        if (aipVar == null) {
            aip aipVar2 = new aip(applicationContext, whpVar);
            ArrayList arrayList = aipVar2.b;
            arrayList.add(zhpVar);
            arrayList.size();
            map.put(whpVar, aipVar2);
            d(whpVar);
            return;
        }
        whp whpVar2 = aipVar.c;
        ArrayList arrayList2 = aipVar.b;
        arrayList2.add(zhpVar);
        arrayList2.size();
        if (b.remove(whpVar2)) {
            d(whpVar2);
        }
    }

    public static void b(Context context, String str, zhp zhpVar) {
        int iMax = g;
        if (iMax == 0) {
            List list = sjo.a;
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int[] iArr = {(int) displayMetrics.density, displayMetrics.heightPixels, displayMetrics.widthPixels};
            iMax = Math.max(iArr[1], iArr[2]);
            g = iMax;
        }
        int i2 = iMax;
        a(context, str, i2, i2, vhp.b, zhpVar);
    }

    public static z9p c(vhp vhpVar) {
        EnumMap enumMap = i;
        synchronized (enumMap) {
            z9p z9pVarL = (z9p) enumMap.get(vhpVar);
            if (z9pVarL == null) {
                if (enumMap.containsKey(vhpVar)) {
                    return null;
                }
                gxo gxoVar = gxo.c;
                File fileB = sjo.b(1);
                String path = fileB != null ? fileB.getPath() : null;
                if (path != null) {
                    try {
                        File file = new File(path, vhpVar.a);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        z9pVarL = z9p.l(file);
                    } catch (IOException unused) {
                        Objects.toString(vhpVar);
                    }
                }
                i.put((EnumMap) vhpVar, (vhp) z9pVarL);
            }
            return z9pVarL;
        }
    }

    public static void d(whp whpVar) {
        String str = whpVar.b;
        if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
            b.add(whpVar);
            return;
        }
        aip aipVar = (aip) a.get(whpVar);
        if (aipVar != null) {
            gxo gxoVar = gxo.c;
            if (aipVar.f != null) {
                return;
            }
            aipVar.f = new iy8(aipVar);
            aipVar.e();
            try {
                aipVar.f.executeOnExecutor(gxo.c.a, new Void[0]);
            } catch (Exception unused) {
                aipVar.e = 11;
                aipVar.g();
            }
        }
    }

    public static void e() {
        ArrayList arrayList = d;
        arrayList.size();
        ng2 ng2Var = j;
        byte b2 = ng2Var.b;
        if (arrayList.isEmpty() || e >= ng2Var.b) {
            return;
        }
        Collections.sort(arrayList, c);
        int i2 = 0;
        while (e < ng2Var.b && i2 < arrayList.size()) {
            whp whpVar = (whp) arrayList.remove(i2);
            i2++;
            aip aipVar = (aip) a.get(whpVar);
            if (aipVar != null) {
                String str = whpVar.b;
                e++;
                gxo gxoVar = gxo.c;
                if (aipVar.g == null) {
                    aipVar.g = new yhp(aipVar);
                    aipVar.e();
                    yhp yhpVar = aipVar.g;
                    if (dpj.c == null) {
                        yhpVar.getClass();
                        dpj.c = new dpj((byte) 11);
                    }
                    iro iroVar = new iro(yhpVar.a.c.b, new rii((Object) yhpVar, (byte) 28));
                    ev4 ev4Var = ev4.g;
                    if (ev4Var == null) {
                        ev4Var = new ev4((byte) 8);
                        ev4.g = ev4Var;
                    }
                    LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) ev4Var.e;
                    linkedBlockingDeque.push(iroVar);
                    if (ev4Var.c) {
                        while (!linkedBlockingDeque.isEmpty()) {
                            gxo.c.b(new ttn(linkedBlockingDeque.poll(), (byte) 13));
                            ev4Var.c = false;
                        }
                        ev4Var.c = true;
                    }
                }
            }
        }
    }
}
