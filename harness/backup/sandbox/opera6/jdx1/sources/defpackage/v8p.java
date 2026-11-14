package defpackage;

import ads_mobile_sdk.cm1;
import ads_mobile_sdk.dj0;
import ads_mobile_sdk.fl0;
import ads_mobile_sdk.g43;
import ads_mobile_sdk.ia3;
import ads_mobile_sdk.k43;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class v8p implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nzo b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ String d;
    public final /* synthetic */ View e;
    public final /* synthetic */ Activity f;

    public /* synthetic */ v8p(nzo nzoVar, Context context, String str, View view, Activity activity, byte b) {
        this.a = b;
        this.b = nzoVar;
        this.c = context;
        this.d = str;
        this.e = view;
        this.f = activity;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String strA;
        switch (this.a) {
            case 0:
                final k43 k43Var = (k43) this.b;
                final Context context = this.c;
                final String str = this.d;
                final View view = this.e;
                final Activity activity = this.f;
                final HashMap map = new HashMap();
                final byte b = 1;
                k43Var.g.a(fl0.EVENT_ID_ORCAS_ENGINE_COMPOSE_STATE, new Runnable() { // from class: u8p
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        String str2 = str;
                        Activity activity2 = activity;
                        View view2 = view;
                        Context context2 = context;
                        HashMap map2 = map;
                        k43 k43Var2 = k43Var;
                        switch (b2) {
                            case 0:
                                ia3 ia3Var = k43Var2.f;
                                ia3Var.getClass();
                                HashMap map3 = new HashMap();
                                Iterator it = ia3Var.a.iterator();
                                while (it.hasNext()) {
                                    ((opo) it.next()).a(map3, context2, view2);
                                }
                                map2.putAll(map3);
                                k43Var2.m4a(map2);
                                map2.put("f", "v");
                                map2.put("ctx", context2);
                                map2.put("view", view2);
                                map2.put("act", activity2);
                                map2.put("bds", str2);
                                break;
                            default:
                                ia3 ia3Var2 = k43Var2.f;
                                ia3Var2.getClass();
                                HashMap map4 = new HashMap();
                                Iterator it2 = ia3Var2.a.iterator();
                                while (it2.hasNext()) {
                                    ((opo) it2.next()).b(map4);
                                }
                                map2.putAll(map4);
                                k43Var2.m4a(map2);
                                map2.put("f", "c");
                                map2.put("ctx", context2);
                                map2.put("view", view2);
                                map2.put("act", activity2);
                                map2.put("bds", str2);
                                break;
                        }
                    }
                });
                String strA2 = k43Var.a(map);
                map.clear();
                return strA2;
            case 1:
                final k43 k43Var2 = (k43) this.b;
                final Context context2 = this.c;
                final String str2 = this.d;
                final View view2 = this.e;
                final Activity activity2 = this.f;
                final HashMap map2 = new HashMap();
                final byte b2 = 0;
                k43Var2.g.a(fl0.EVENT_ID_ORCAS_ENGINE_COMPOSE_STATE, new Runnable() { // from class: u8p
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b2;
                        String str22 = str2;
                        Activity activity22 = activity2;
                        View view22 = view2;
                        Context context22 = context2;
                        HashMap map22 = map2;
                        k43 k43Var22 = k43Var2;
                        switch (b22) {
                            case 0:
                                ia3 ia3Var = k43Var22.f;
                                ia3Var.getClass();
                                HashMap map3 = new HashMap();
                                Iterator it = ia3Var.a.iterator();
                                while (it.hasNext()) {
                                    ((opo) it.next()).a(map3, context22, view22);
                                }
                                map22.putAll(map3);
                                k43Var22.m4a(map22);
                                map22.put("f", "v");
                                map22.put("ctx", context22);
                                map22.put("view", view22);
                                map22.put("act", activity22);
                                map22.put("bds", str22);
                                break;
                            default:
                                ia3 ia3Var2 = k43Var22.f;
                                ia3Var2.getClass();
                                HashMap map4 = new HashMap();
                                Iterator it2 = ia3Var2.a.iterator();
                                while (it2.hasNext()) {
                                    ((opo) it2.next()).b(map4);
                                }
                                map22.putAll(map4);
                                k43Var22.m4a(map22);
                                map22.put("f", "c");
                                map22.put("ctx", context22);
                                map22.put("view", view22);
                                map22.put("act", activity22);
                                map22.put("bds", str22);
                                break;
                        }
                    }
                });
                String strA3 = k43Var2.a(map2);
                map2.clear();
                return strA3;
            default:
                g43 g43Var = (g43) this.b;
                Context context3 = this.c;
                String str3 = this.d;
                View view3 = this.e;
                Activity activity3 = this.f;
                cm1 cm1VarA = g43Var.a.a();
                if (cm1VarA == null) {
                    g43Var.d.b(fl0.EVENT_ID_DG_ENGINE_NULL_HANDLE);
                    return "";
                }
                synchronized (cm1VarA) {
                    dj0 dj0Var = cm1VarA.b;
                    ia3 ia3Var = dj0Var.b;
                    ia3Var.getClass();
                    HashMap map3 = new HashMap();
                    Iterator it = ia3Var.a.iterator();
                    while (it.hasNext()) {
                        ((opo) it.next()).b(map3);
                    }
                    dj0Var.a(map3);
                    map3.put("f", "c");
                    map3.put("ctx", context3);
                    map3.put("cs", str3);
                    map3.put("aid", null);
                    map3.put("view", view3);
                    map3.put("act", activity3);
                    byte[] bArrA = cm1VarA.a(map3);
                    if (cm1VarA.d) {
                        map3.clear();
                    }
                    strA = cm1.a(bArrA);
                }
                if (strA != null) {
                    return strA;
                }
                g43Var.d.b(fl0.EVENT_ID_DG_ENGINE_NULL_CLICK_SIGNALS);
                return "";
        }
    }
}
