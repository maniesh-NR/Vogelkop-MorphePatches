package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class h31 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v31 b;

    public /* synthetic */ h31(v31 v31Var, byte b) {
        this.a = b;
        this.b = v31Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj) {
        byte b = this.a;
        LinkedHashMap linkedHashMap = null;
        boolean z = false;
        v31 v31Var = this.b;
        switch (b) {
            case 0:
                nx5 nx5Var = (nx5) obj;
                ajl ajlVar = v31Var.e0;
                if (ajlVar == null) {
                    ajlVar = new ajl(v31Var.k());
                    v31Var.e0 = ajlVar;
                }
                return new n91(v31Var, ajlVar, nx5Var);
            case 1:
                Function0 function0 = (Function0) obj;
                Handler handler = v31Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = v31Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new l31(function0, (byte) 0));
                    }
                }
                return Unit.a;
            case 2:
                v31Var.l.g(((lf9) obj).a, false);
                return Unit.a;
            case 3:
                yb7 yb7Var = v31Var.f;
                if (yb7Var != null) {
                    return yb7Var;
                }
                fh5 fh5VarO = v31Var.o();
                fh5VarO.e();
                rki rkiVar = fh5VarO.e;
                View view = (View) v31Var.getParent();
                Object tag = view.getTag(2131362390);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String strJ = sko.j("SaveableStateRegistry:", strValueOf);
                pki savedStateRegistry = rkiVar.getSavedStateRegistry();
                Bundle bundleA = savedStateRegistry.a(strJ);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str : bundleA.keySet()) {
                        linkedHashMap.put(str, bundleA.getParcelableArrayList(str));
                    }
                }
                m57 m57Var = new m57((byte) 8);
                hp7 hp7Var = xji.a;
                wji wjiVar = new wji(linkedHashMap, m57Var);
                if (savedStateRegistry.b(strJ) == null) {
                    try {
                        savedStateRegistry.c(strJ, new y51(wjiVar, (byte) 2));
                        z = true;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                yb7 yb7Var2 = new yb7(wjiVar, new zb7(z, savedStateRegistry, strJ));
                v31Var.f = yb7Var2;
                return yb7Var2;
            case 4:
                return Boolean.valueOf(v31Var.m());
            case 5:
                return v31Var.j();
            case 6:
                ajl ajlVar2 = v31Var.e0;
                if (ajlVar2 != null) {
                    return ajlVar2;
                }
                ajl ajlVar3 = new ajl(v31Var.k());
                v31Var.e0 = ajlVar3;
                return ajlVar3;
            case 7:
                r17 r17Var = v31Var.g0;
                if (r17Var == null) {
                    ajl ajlVar4 = v31Var.e0;
                    if (ajlVar4 == null) {
                        ajlVar4 = new ajl(v31Var.k());
                        v31Var.e0 = ajlVar4;
                    }
                    r17Var = new r17(ajlVar4);
                    v31Var.g0 = r17Var;
                }
                return r17Var;
            case 8:
                jb1 jb1Var = v31Var.l0;
                if (jb1Var != null) {
                    return jb1Var;
                }
                jb1 jb1Var2 = new jb1(v31Var);
                v31Var.l0 = jb1Var2;
                return jb1Var2;
            default:
                return v31Var.F0;
        }
    }
}
