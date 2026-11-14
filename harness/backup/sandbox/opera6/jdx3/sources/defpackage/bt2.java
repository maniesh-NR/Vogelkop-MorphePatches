package defpackage;

import android.view.ViewGroup;
import com.opera.android.BrowserActivity;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class bt2 implements w6f, qo3 {
    public final dx3 a;
    public final ViewGroup b;
    public final nak c;
    public final rlh d;
    public final hp2 e;
    public final xs2 f;
    public final i7f g;
    public ov0 h;
    public final us2 i;

    public bt2(dx3 dx3Var, ViewGroup viewGroup) {
        this.a = dx3Var;
        this.b = viewGroup;
        nak nakVarF = z4o.f(Boolean.FALSE);
        this.c = nakVarF;
        this.d = a26.j(nakVarF);
        this.e = new hp2((byte) 13, false);
        this.f = new xs2(this);
        this.g = new i7f();
        this.i = new us2(this, (byte) 0);
        vw vwVar = new vw((byte) 1, (Object) this, dx3Var instanceof BrowserActivity);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(viewGroup, vwVar);
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        this.g.b((ss2) obj);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.g.c((ss2) obj);
    }

    @Override // defpackage.qo3
    public final lak m() {
        return this.d;
    }
}
