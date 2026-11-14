package defpackage;

import ads_mobile_sdk.fs0;
import ads_mobile_sdk.gj1;
import ads_mobile_sdk.q6;
import android.net.ConnectivityManager;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class z23 extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z23(Object obj, Object obj2, Object obj3, byte b) {
        super(0);
        this.i = b;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z23(Function1 function1, pac pacVar, a33 a33Var, rrg rrgVar) {
        super(0);
        this.i = (byte) 0;
        this.j = function1;
        this.k = pacVar;
        this.l = rrgVar;
    }

    public final Object invoke() {
        switch (this.i) {
            case 0:
                ((Function1) this.j).invoke(new qrg(((pac) this.k).e, (rrg) this.l));
                return Unit.a;
            case 1:
                if (((lqh) this.j).a) {
                    qs7 qs7VarX = qs7.x();
                    int i = q4o.a;
                    qs7VarX.getClass();
                    ((ConnectivityManager) this.k).unregisterNetworkCallback((eg7) this.l);
                }
                return Unit.a;
            case 2:
                Object obj = odj.b;
                of3 of3Var = (of3) this.j;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.k;
                odj odjVar = (odj) this.l;
                synchronized (obj) {
                    LinkedHashMap linkedHashMap = odj.c;
                    linkedHashMap.remove(of3Var);
                    if (linkedHashMap.isEmpty()) {
                        qs7 qs7VarX2 = qs7.x();
                        int i2 = q4o.a;
                        qs7VarX2.getClass();
                        connectivityManager.unregisterNetworkCallback(odjVar);
                    }
                }
                return Unit.a;
            case 3:
                q6 q6Var = (q6) this.j;
                View view = (View) this.k;
                fs0 fs0Var = (fs0) this.l;
                if (!q6Var.f) {
                    q6Var.b.a(view, fs0Var);
                }
                return Unit.a;
            case 4:
                gj1 gj1Var = (gj1) this.j;
                View view2 = (View) this.k;
                fs0 fs0Var2 = (fs0) this.l;
                for (q6 q6Var2 : gj1Var.e.values()) {
                    if (!q6Var2.f) {
                        q6Var2.b.a(view2, fs0Var2);
                    }
                }
                gj1Var.f.a(view2, fs0Var2);
                return Unit.a;
            default:
                guo guoVar = (guo) this.j;
                d3k d3kVar = guoVar.n;
                if (d3kVar != null) {
                    d3kVar.k((CancellationException) null);
                }
                guoVar.n = null;
                lqh lqhVar = (lqh) this.k;
                if (!lqhVar.a) {
                    lqhVar.a = true;
                    ((vvm) this.l).invoke();
                }
                return Unit.a;
        }
    }
}
