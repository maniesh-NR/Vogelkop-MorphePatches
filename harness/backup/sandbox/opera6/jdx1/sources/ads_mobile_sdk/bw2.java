package ads_mobile_sdk;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import defpackage.ioj;
import defpackage.prb;
import defpackage.rkp;
import defpackage.wpb;
import defpackage.y9m;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class bw2 implements m3n, rkp {
    public static final ioj b = new ioj(12);
    public static final bw2 a = new bw2();
    public static final bw2 a$1 = new bw2();

    public static int a(prb prbVar, String str, int i) {
        if (prbVar != null) {
            try {
                return prbVar.u(str).f();
            } catch (Exception unused) {
            }
        }
        return i;
    }

    public static Bundle a(String str) {
        try {
            return c(y9m.c0(str).h());
        } catch (Exception e) {
            ArrayList arrayList = w8h.a(e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            return null;
        }
    }

    public static String a(prb prbVar, String str, String str2) {
        if (prbVar != null) {
            try {
                return prbVar.u(str).n();
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    public static prb a(pqb pqbVar) {
        if (pqbVar == null) {
            return null;
        }
        try {
            return pqbVar.h();
        } catch (Exception unused) {
            return null;
        }
    }

    public static prb a(prb prbVar, String str, prb prbVar2) {
        if (prbVar == null) {
            return prbVar2;
        }
        try {
            return prbVar.w(str);
        } catch (Exception unused) {
            return prbVar2;
        }
    }

    public static prb a(wpb wpbVar, int i) {
        if (wpbVar == null) {
            return null;
        }
        ArrayList arrayList = wpbVar.a;
        if (i >= arrayList.size()) {
            return null;
        }
        try {
            return ((pqb) arrayList.get(i)).h();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                webView.evaluateJavascript(str, null);
            } catch (IllegalStateException unused) {
                webView.loadUrl("javascript: " + str);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void a(wpb wpbVar, Bundle bundle, String str) {
        Object objN;
        ArrayList arrayList = wpbVar.a;
        if (arrayList.isEmpty()) {
            vr3 vr3Var = xu0.a;
            xu0.c("Unable to parse empty JsonArray for key: " + str, null);
            return;
        }
        pqb pqbVar = (pqb) CollectionsKt.J(wpbVar);
        pqbVar.getClass();
        int i = 0;
        if (pqbVar instanceof prb) {
            ArrayList arrayList2 = new ArrayList(k95.o(wpbVar, 10));
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                arrayList2.add(b(((pqb) obj).h()));
            }
            bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Bundle[0]));
            return;
        }
        if (!(pqbVar instanceof zrb)) {
            vr3 vr3Var2 = xu0.a;
            xu0.c("Unable to parse array element type: " + pqbVar, null);
            return;
        }
        ArrayList arrayList3 = new ArrayList(k95.o(wpbVar, 10));
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            zrb zrbVarI = ((pqb) obj2).i();
            Serializable serializable = zrbVarI.a;
            if (serializable instanceof Boolean) {
                objN = Boolean.valueOf(zrbVarI.c());
            } else if (serializable instanceof Number) {
                Number numberM = zrbVarI.m();
                int iIntValue = numberM.intValue();
                double dDoubleValue = numberM.doubleValue();
                objN = ((double) iIntValue) == dDoubleValue ? Integer.valueOf(iIntValue) : Double.valueOf(dDoubleValue);
            } else if (serializable instanceof String) {
                objN = zrbVarI.n();
            } else {
                vr3 vr3Var3 = xu0.a;
                xu0.c("Unexpected primitive json type: " + zrbVarI, null);
                objN = null;
            }
            arrayList3.add(objN);
        }
        if (CollectionsKt.K(arrayList3) instanceof String) {
            ArrayList arrayList4 = new ArrayList(k95.o(arrayList3, 10));
            int size3 = arrayList3.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList3.get(i4);
                i4++;
                arrayList4.add(obj3.toString());
            }
            bundle.putStringArray(str, (String[]) arrayList4.toArray(new String[0]));
            return;
        }
        if (CollectionsKt.K(arrayList3) instanceof Integer) {
            int size4 = arrayList3.size();
            int[] iArr = new int[size4];
            while (i < size4) {
                iArr[i] = ((Integer) arrayList3.get(i)).intValue();
                i++;
            }
            bundle.putIntArray(str, iArr);
            return;
        }
        if (CollectionsKt.K(arrayList3) instanceof Double) {
            int size5 = arrayList3.size();
            double[] dArr = new double[size5];
            while (i < size5) {
                dArr[i] = ((Double) arrayList3.get(i)).doubleValue();
                i++;
            }
            bundle.putDoubleArray(str, dArr);
            return;
        }
        if (!(CollectionsKt.K(arrayList3) instanceof Boolean)) {
            vr3 vr3Var4 = xu0.a;
            xu0.c("Unable to parse array element type: " + CollectionsKt.K(arrayList3), null);
            return;
        }
        int size6 = arrayList3.size();
        boolean[] zArr = new boolean[size6];
        while (i < size6) {
            zArr[i] = ((Boolean) arrayList3.get(i)).booleanValue();
            i++;
        }
        bundle.putBooleanArray(str, zArr);
    }

    public static void a(zrb zrbVar, Bundle bundle, String str) {
        Serializable serializable = zrbVar.a;
        if (serializable instanceof Boolean) {
            bundle.putBoolean(str, zrbVar.c());
            return;
        }
        if (serializable instanceof Number) {
            Number numberM = zrbVar.m();
            int iIntValue = numberM.intValue();
            double dDoubleValue = numberM.doubleValue();
            if (iIntValue == dDoubleValue) {
                bundle.putInt(str, iIntValue);
                return;
            } else {
                bundle.putDouble(str, dDoubleValue);
                return;
            }
        }
        if (serializable instanceof String) {
            bundle.putString(str, zrbVar.n());
            return;
        }
        vr3 vr3Var = xu0.a;
        xu0.c("Unexpected primitive json type: " + zrbVar, null);
    }

    public static boolean a(prb prbVar, String str, boolean z) {
        if (prbVar != null) {
            try {
                return prbVar.u(str).c();
            } catch (Exception unused) {
            }
        }
        return z;
    }

    public static Bundle b(prb prbVar) {
        Bundle bundleC = c(prbVar);
        return bundleC == null ? new Bundle() : bundleC;
    }

    public static Bundle c(prb prbVar) {
        try {
            Bundle bundle = new Bundle();
            egc it = prbVar.a.keySet().iterator();
            while (it.hasNext()) {
                String str = (String) it.a().f;
                pqb pqbVarU = prbVar.u(str);
                pqbVarU.getClass();
                if (pqbVarU instanceof zrb) {
                    a(pqbVarU.i(), bundle, str);
                } else if (pqbVarU instanceof wpb) {
                    a(pqbVarU.g(), bundle, str);
                } else if (pqbVarU instanceof prb) {
                    bundle.putBundle(str, b(pqbVarU.h()));
                }
            }
            return bundle;
        } catch (Exception e) {
            ArrayList arrayList = w8h.a(e).s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            return null;
        }
    }

    public static wpb e(prb prbVar, String str) {
        if (prbVar == null) {
            return null;
        }
        try {
            return prbVar.v(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.rkp
    public final Object a() {
        throw null;
    }

    @Override // defpackage.rkp
    public final Object a(defpackage.hp hpVar) {
        throw null;
    }

    @Override // defpackage.rkp
    public final Object a(defpackage.r83 r83Var) {
        throw null;
    }

    public final void a(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (objArr.length > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        sb.append("null");
                    } else if (obj instanceof String) {
                        String string = obj.toString();
                        if (string.startsWith("{")) {
                            sb.append(string);
                        } else {
                            sb.append('\"');
                            sb.append(string);
                            sb.append('\"');
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String string2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            if (Looper.myLooper() == handler.getLooper()) {
                a(webView, string2);
            } else {
                handler.post(new x52(this, webView, string2));
            }
        }
    }

    @Override // defpackage.rkp
    public final Object a$1() {
        throw null;
    }

    @Override // defpackage.rkp
    public final Object b(boolean z) {
        throw null;
    }

    public final void getVideoLifecycleCallbacks() {
        synchronized (this) {
        }
    }
}
