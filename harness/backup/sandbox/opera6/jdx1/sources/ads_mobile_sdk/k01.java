package ads_mobile_sdk;

import android.view.ViewTreeObserver;
import defpackage.ato;
import defpackage.tso;
import defpackage.udj;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class k01 implements ato, rko {
    public final nx5 a;
    public final s02 b;
    public final tso c;

    public k01(nx5 nx5Var, s02 s02Var, tso tsoVar) {
        this.a = nx5Var;
        this.b = s02Var;
        this.c = tsoVar;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        defpackage.na2.B(this.a, null, null, new udj((Object) cy0Var, (Object) this, (mt5) null, (byte) 24), 3);
        s02 s02Var = this.b;
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) s02Var.b.get();
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) s02Var.c.get();
        if (onScrollChangedListener == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            xh3.a("Failed to detach scroll changed listener.", null, 6);
        } else {
            viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
        }
        s02Var.a = new WeakReference(null);
        s02Var.b = new WeakReference(null);
        s02Var.c = new WeakReference(null);
        Object objA = cy0Var.a(mt5Var);
        return objA == px5.a ? objA : Unit.a;
    }

    public final Object a(mt5 mt5Var) {
        Object objA;
        cy0 cy0Var = (cy0) this.b.d.get();
        return (cy0Var != null && (objA = a(cy0Var, n08.a, mt5Var)) == px5.a) ? objA : Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 50;
    }
}
