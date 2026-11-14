package defpackage;

import J.N;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.settings.SettingsManager;
import com.opera.android.undo.UndoBar;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class cx extends j93 {
    public final ot2 d;
    public final sw e;
    public final AutofillManager f;
    public final nkm g;
    public final ode h;
    public final bx i;
    public UndoBar j;

    public cx(ot2 ot2Var, d8j d8jVar, SettingsManager settingsManager, sw swVar, AutofillManager autofillManager, nkm nkmVar) {
        super(settingsManager, d8jVar);
        this.d = ot2Var;
        this.e = swVar;
        this.f = autofillManager;
        this.g = nkmVar;
        this.h = new ode();
        byte b = 0;
        bx bxVar = new bx(this, (byte) 0);
        this.i = bxVar;
        g();
        swVar.d.b(bxVar);
        AutofillManager autofillManager2 = swVar.a;
        if (swVar.e == null) {
            fv2 fv2Var = new fv2(swVar, b);
            autofillManager2.getClass();
            swVar.e = AutofillManager.b(fv2Var);
            swVar.a(autofillManager2).invoke(new iu2(swVar, (byte) 2));
        }
    }

    public final void e() {
        this.e.H(this.i);
        UndoBar undoBar = this.j;
        if (undoBar != null) {
            undoBar.a(true);
        }
        this.j = null;
    }

    public final void g() {
        this.f.getClass();
        boolean zMMr_2O4r = N.MMr_2O4r();
        ArrayList arrayListB = this.e.b();
        this.h.r(new zw(zMMr_2O4r, arrayListB.isEmpty() ? jw.h : new kw(arrayListB)));
    }
}
