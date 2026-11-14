package defpackage;

import com.opera.android.autofill.AutofillManager;
import com.opera.android.settings.SettingsManager;
import com.opera.android.undo.UndoBar;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class dl4 extends j93 {
    public final ot2 d;
    public final gv2 e;
    public final nkm f;
    public final wh2 g;
    public final jvg h;
    public final ode i;
    public final s9 j;
    public final bx k;
    public UndoBar l;

    public dl4(ot2 ot2Var, d8j d8jVar, SettingsManager settingsManager, gv2 gv2Var, nkm nkmVar, gjm gjmVar, wh2 wh2Var) {
        super(settingsManager, d8jVar);
        this.d = ot2Var;
        this.e = gv2Var;
        this.f = nkmVar;
        this.g = wh2Var;
        this.h = new jvg(this, gjmVar);
        this.i = new ode();
        s9 s9Var = new s9(this, (byte) 9);
        this.j = s9Var;
        byte b = 2;
        bx bxVar = new bx(this, (byte) 2);
        this.k = bxVar;
        g();
        settingsManager.F(s9Var);
        gv2Var.d.b(bxVar);
        AutofillManager autofillManager = gv2Var.a;
        if (gv2Var.e == null) {
            fv2 fv2Var = new fv2(gv2Var, (byte) 0);
            autofillManager.getClass();
            gv2Var.e = AutofillManager.b(fv2Var);
            gv2Var.a(autofillManager).invoke(new iu2(gv2Var, b));
        }
    }

    public final void e() {
        this.b.H(this.j);
        this.e.H(this.k);
        UndoBar undoBar = this.l;
        if (undoBar != null) {
            undoBar.a(true);
        }
        this.l = null;
    }

    public final void g() {
        boolean zI = this.b.i("automatic_card_save_ask");
        ArrayList arrayListB = this.e.b();
        this.i.r(new bl4(zI, arrayListB.isEmpty() ? kk4.o : new lk4(arrayListB)));
    }
}
