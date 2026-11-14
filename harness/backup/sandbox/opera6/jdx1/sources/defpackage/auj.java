package defpackage;

import ads_mobile_sdk.km1;
import ads_mobile_sdk.mw0;
import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class auj implements bej, wom, djp, ee5 {
    public static auj b;
    public static final /* synthetic */ auj c = new auj(17);
    public final /* synthetic */ byte a;

    public /* synthetic */ auj(byte b2) {
        this.a = b2;
    }

    public static void e(WebView webView) {
        rii riiVar = new rii(webView, new auj((byte) 13));
        WebView webView2 = (WebView) riiVar.b;
        try {
            if (axn.b(WebViewFeature.WEB_MESSAGE_LISTENER)) {
                WebViewCompat.removeWebMessageListener(webView2, "omidJsAttestationListener");
                WebViewCompat.addWebMessageListener(webView2, "omidJsAttestationListener", new HashSet(Arrays.asList("*")), new ioj(riiVar, (byte) 11));
            }
        } catch (Exception | NoClassDefFoundError unused) {
        }
    }

    public static void f(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            List list3 = list2;
            ArrayList arrayList2 = new ArrayList(k95.o(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new a4o(iIntValue, ((Number) it2.next()).intValue()));
            }
            o95.t(arrayList2, arrayList);
        }
        CollectionsKt.n0(arrayList);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static wql g(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return wql.e;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return wql.d;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return wql.c;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return wql.f;
            }
        } else if (str.equals("SSLv3")) {
            return wql.g;
        }
        qp2.o("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static int h(nsh nshVar, String str, String str2) {
        ArrayList arrayList = nshVar.b;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            tlk tlkVar = (tlk) obj;
            if (Intrinsics.a(tlkVar.a, str) && Intrinsics.a(tlkVar.b, str2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void i(String str, JSONObject jSONObject) throws JSONException {
        if ("attest".equals(str)) {
            try {
                String string = jSONObject.getString("mechanism");
                String string2 = jSONObject.getString("version");
                HashMap mapD = yqo.d(jSONObject.getJSONObject("attestationArgs"));
                mapD.put("version", string2);
                n6h.b(q1p.b.a.getApplicationContext(), string, new qtk(mapD));
            } catch (Exception unused) {
            }
        }
    }

    public static l7l j(String str) {
        crb crbVar = n7l.d;
        crbVar.getClass();
        return (l7l) crbVar.a(str, l7l.Companion.serializer());
    }

    public final Object a(int i) {
        switch (this.a) {
            case 12:
                mw0 mw0Var = i != 0 ? null : mw0.TAG_UNKNOWN;
                return mw0Var == null ? mw0.UNRECOGNIZED : mw0Var;
            default:
                km1 km1VarA = km1.a(i);
                return km1VarA == null ? km1.UNRECOGNIZED : km1VarA;
        }
    }

    @Override // defpackage.bej
    public final f99 b(xkk xkkVar) {
        return new xd6(xkkVar, (byte) 12);
    }

    public final void c() {
    }

    public final boolean d() {
        return false;
    }

    public final Object r(x79 x79Var) {
        switch (this.a) {
            case 17:
                return AnalyticsConnectorRegistrar.zza(x79Var);
            default:
                d25 d25Var = new d25();
                bw1 bw1Var = new bw1((byte) 17);
                ReferenceQueue referenceQueue = d25Var.a;
                Set set = d25Var.b;
                set.add(new rrp(d25Var, referenceQueue, set, bw1Var));
                Thread thread = new Thread((Runnable) new ypp(referenceQueue, set, (byte) 0), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return d25Var;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }
}
