package defpackage;

import android.view.ActionMode;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class eb1 implements ufl {
    public final View a;
    public final Function1 b;
    public final Function0 c;
    public final mfe d = new mfe();
    public final tuj e = new tuj(new za1(this, 0));
    public final za1 f = new za1(this, 1);
    public final za1 g = new za1(this, 2);
    public ActionMode h;
    public k3 i;
    public Runnable j;

    public eb1(View view, Function1 function1, Function0 function0) {
        this.a = view;
        this.b = function1;
        this.c = function0;
    }

    @Override // defpackage.ufl
    public final Object a(lfl lflVar, kuk kukVar) {
        Object objA = mfe.a(this.d, new u11((Object) this, (Object) lflVar, (mt5) null, (byte) 1), kukVar);
        return objA == px5.a ? objA : Unit.a;
    }
}
