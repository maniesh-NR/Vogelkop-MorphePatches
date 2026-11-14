package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public abstract class z3o {
    public static final see a;

    static {
        long[] jArr = imi.a;
        a = new see();
    }

    public static final zh5 a(View view) {
        Object tag = view.getTag(2131362030);
        if (tag instanceof zh5) {
            return (zh5) tag;
        }
        return null;
    }

    public static final hoh b(View view) {
        CoroutineContext coroutineContext;
        b8g b8gVar;
        if (!view.isAttachedToWindow()) {
            a8b.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        Object objH = y7h.h(view);
        while (objH instanceof View) {
            View view2 = (View) objH;
            if (view2.getId() == 16908290) {
                break;
            }
            objH = view2.getParent();
            view = view2;
        }
        zh5 zh5VarA = a(view);
        mt5 mt5Var = null;
        if (zh5VarA != null) {
            if (zh5VarA instanceof hoh) {
                return (hoh) zh5VarA;
            }
            qp2.n("root viewTreeParentCompositionContext is not a Recomposer");
            return null;
        }
        ((w3o) x3o.a.get()).getClass();
        b8g b8gVar2 = h.a;
        ot5 ot5Var = d.Hq;
        b8gVar2.getClass();
        zyk zykVar = ob1.l;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            coroutineContext = (CoroutineContext) ob1.l.getValue();
        } else {
            coroutineContext = (CoroutineContext) ob1.m.get();
            if (coroutineContext == null) {
                qp2.n("no AndroidUiDispatcher for this thread");
                return null;
            }
        }
        CoroutineContext coroutineContextPlus = coroutineContext.plus(b8gVar2);
        d9e d9eVar = (d9e) coroutineContextPlus.get(ujp.k);
        if (d9eVar != null) {
            b8gVar = new b8g(d9eVar);
            tn tnVar = b8gVar.b;
            synchronized (tnVar.b) {
                tnVar.a = false;
            }
        } else {
            b8gVar = null;
        }
        pqh pqhVar = new pqh();
        CoroutineContext aaeVar = (z9e) coroutineContextPlus.get(ulp.i);
        if (aaeVar == null) {
            aaeVar = new aae(view.getContext().getApplicationContext());
            pqhVar.a = aaeVar;
        }
        if (b8gVar != null) {
            b8gVar2 = b8gVar;
        }
        CoroutineContext coroutineContextPlus2 = coroutineContextPlus.plus(b8gVar2).plus(aaeVar);
        hoh hohVar = new hoh(coroutineContextPlus2);
        synchronized (hohVar.c) {
            hohVar.t = true;
        }
        a64 a64VarB = sgb.b(coroutineContextPlus2);
        ndc ndcVarJ = z7h.j(view);
        tcc lifecycle = ndcVarJ != null ? ndcVarJ.getLifecycle() : null;
        if (lifecycle == null) {
            a8b.c("ViewTreeLifecycleOwner not found from " + view);
            t3p.v();
            return null;
        }
        view.addOnAttachStateChangeListener(new tu4(view, hohVar, (byte) 8));
        lifecycle.a(new wl9(a64VarB, b8gVar, hohVar, pqhVar));
        view.setTag(2131362030, hohVar);
        jz9 jz9Var = jz9.a;
        Handler handler = view.getHandler();
        int i = e7a.a;
        view.addOnAttachStateChangeListener(new z61(na2.B(jz9Var, new d7a(handler, "windowRecomposer cleanup", false).e, null, new hkm(hohVar, view, mt5Var, (byte) 5), 2), (byte) 29));
        return hohVar;
    }
}
