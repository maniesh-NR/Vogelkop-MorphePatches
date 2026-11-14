package defpackage;

import ads_mobile_sdk.ab3;
import ads_mobile_sdk.cm1;
import ads_mobile_sdk.dj0;
import ads_mobile_sdk.fl0;
import ads_mobile_sdk.g43;
import ads_mobile_sdk.ia3;
import ads_mobile_sdk.jl2;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class pko implements Callable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pko(ab3 ab3Var, jl2 jl2Var, byte[] bArr, byte[] bArr2) {
        this.b = ab3Var;
        this.c = jl2Var;
        this.d = bArr;
        this.e = bArr2;
    }

    public /* synthetic */ pko(g43 g43Var, Context context, String str, View view, Activity activity) {
        this.b = g43Var;
        this.c = context;
        this.d = view;
        this.e = activity;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String strA;
        switch (this.a) {
            case 0:
                ab3 ab3Var = (ab3) this.b;
                ab3Var.a.a((jl2) this.c, (byte[]) this.d, (byte[]) this.e);
                return null;
            default:
                g43 g43Var = (g43) this.b;
                Context context = (Context) this.c;
                View view = (View) this.d;
                Activity activity = (Activity) this.e;
                cm1 cm1VarA = g43Var.a.a();
                if (cm1VarA == null) {
                    g43Var.d.b(fl0.EVENT_ID_DG_ENGINE_NULL_HANDLE);
                    return "";
                }
                synchronized (cm1VarA) {
                    dj0 dj0Var = cm1VarA.b;
                    ia3 ia3Var = dj0Var.b;
                    Context context2 = dj0Var.a;
                    ia3Var.getClass();
                    HashMap map = new HashMap();
                    Iterator it = ia3Var.a.iterator();
                    while (it.hasNext()) {
                        ((opo) it.next()).a(map, context2, null);
                    }
                    dj0Var.a(map);
                    map.put("f", "v");
                    map.put("ctx", context);
                    map.put("aid", null);
                    map.put("view", view);
                    map.put("act", activity);
                    byte[] bArrA = cm1VarA.a(map);
                    if (cm1VarA.d) {
                        map.clear();
                    }
                    strA = cm1.a(bArrA);
                }
                if (strA != null) {
                    return strA;
                }
                g43Var.d.b(fl0.EVENT_ID_DG_ENGINE_NULL_VIEW_SIGNALS);
                return "";
        }
    }
}
