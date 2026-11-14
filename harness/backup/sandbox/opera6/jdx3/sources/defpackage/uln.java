package defpackage;

import androidx.fragment.app.Fragment;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class uln implements lkf {
    public final nw3 a;
    public final Lazy b;
    public final Lazy c;
    public final j4c d;
    public final mw3 e;
    public final nw3 f;
    public final mw3 g;
    public final umi h;
    public final gjm i;
    public final j4c j;
    public final Lazy k;
    public final e4i l;

    public uln(nw3 nw3Var, Lazy lazy, Lazy lazy2, j4c j4cVar, mw3 mw3Var, nw3 nw3Var2, mw3 mw3Var2, umi umiVar, gjm gjmVar, j4c j4cVar2, Lazy lazy3, e4i e4iVar) {
        this.a = nw3Var;
        this.b = lazy;
        this.c = lazy2;
        this.d = j4cVar;
        this.e = mw3Var;
        this.f = nw3Var2;
        this.g = mw3Var2;
        this.h = umiVar;
        this.i = gjmVar;
        this.j = j4cVar2;
        this.k = lazy3;
        this.l = e4iVar;
    }

    public final Fragment b(Class cls) {
        OperaApplication operaApplication = this.a.b;
        boolean zA = Intrinsics.a(cls, ukn.class);
        mw3 mw3Var = this.g;
        nw3 nw3Var = this.f;
        Lazy lazy = this.k;
        j4c j4cVar = this.j;
        mw3 mw3Var2 = this.e;
        Lazy lazy2 = this.c;
        Lazy lazy3 = this.b;
        if (zA) {
            return new ukn(this.i, (qln) lazy3.get(), (onn) lazy2.get(), operaApplication.J(), (ysj) mw3Var2.get(), (orm) nw3Var.get(), (eej) mw3Var.get(), (k3i) j4cVar.get(), (x4i) lazy.get());
        }
        if (Intrinsics.a(cls, jmn.class)) {
            qln qlnVar = (qln) lazy3.get();
            onn onnVar = (onn) lazy2.get();
            pde pdeVar = ((inn) this.d.get()).e;
            SettingsManager settingsManagerJ = operaApplication.J();
            ysj ysjVar = (ysj) mw3Var2.get();
            return new jmn(this.i, qlnVar, onnVar, pdeVar, settingsManagerJ, ysjVar, this.h, (x4i) lazy.get(), this.l);
        }
        if (Intrinsics.a(cls, nkn.class)) {
            return new nkn(this.i, (qln) lazy3.get(), (onn) lazy2.get(), operaApplication.J(), (ysj) mw3Var2.get(), (orm) nw3Var.get(), (eej) mw3Var.get(), (k3i) j4cVar.get(), (x4i) lazy.get());
        }
        if (!Intrinsics.a(cls, tln.class)) {
            return null;
        }
        return new tln(this.i, (qln) lazy3.get(), (onn) lazy2.get(), operaApplication.J(), (ysj) mw3Var2.get(), (orm) nw3Var.get(), (eej) mw3Var.get(), (k3i) j4cVar.get(), (x4i) lazy.get());
    }
}
