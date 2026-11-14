package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import org.chromium.printing.Printable;
import org.chromium.ui.base.WindowAndroid;

/* loaded from: classes.dex */
public final class lyg implements q1o {
    public static final qmm d = new qmm(new odf(26));
    public final WindowAndroid a;
    public jyg b;
    public pjg c;

    public lyg(WindowAndroid windowAndroid) {
        this.a = windowAndroid;
        windowAndroid.t.b(this);
    }

    public static lyg c(WindowAndroid windowAndroid) {
        pmm pmmVar = windowAndroid.l;
        qmm qmmVar = d;
        qmmVar.getClass();
        lyg lygVar = (lyg) pmmVar.a(qmmVar);
        if (lygVar != null) {
            return lygVar;
        }
        lyg lygVar2 = new lyg(windowAndroid);
        qmmVar.a(pmmVar, lygVar2);
        return lygVar2;
    }

    public final void a() throws Resources.NotFoundException {
        e();
    }

    public final boolean d() {
        jyg jygVar = this.b;
        return jygVar != null && jygVar.o;
    }

    public final void e() throws Resources.NotFoundException {
        jyg jygVar = this.b;
        if (jygVar != null) {
            jygVar.b();
        }
        pjg pjgVar = this.c;
        if (pjgVar != null) {
            this.c = null;
            pjgVar.run();
        }
    }

    public final void f(Printable printable, iyg iygVar, int i, int i2) throws Resources.NotFoundException {
        if (d()) {
            wxe.t("Pending print can't be set. PrintingController is busy.", new Object[0]);
            return;
        }
        jyg jygVar = this.b;
        if (jygVar != null) {
            jygVar.b();
        }
        jyg jygVar2 = new jyg(printable, iygVar, i, i2);
        this.b = jygVar2;
        pjg pjgVar = this.c;
        if (pjgVar != null) {
            jygVar2.l = pjgVar;
            this.c = null;
        }
    }

    public final void g() throws Resources.NotFoundException {
        if (d()) {
            wxe.t("Pending print can't be started. PrintingController is busy.", new Object[0]);
            return;
        }
        jyg jygVar = this.b;
        if (jygVar == null) {
            wxe.t("Pending print can't be started. No pending print session.", new Object[0]);
            e();
            return;
        }
        if (!jygVar.p) {
            if (jygVar.q == null) {
                wxe.t("Pending print can't be started. No PrintManager provided.", new Object[0]);
            } else {
                Printable printable = jygVar.j;
                if (printable == null || !printable.b()) {
                    wxe.t("Pending print can't be started. Printable can't perform printing.", new Object[0]);
                } else {
                    Activity activity = (Activity) this.a.m().get();
                    if (activity == null || !(activity.isFinishing() || activity.isDestroyed())) {
                        jygVar.o = true;
                        iyg iygVar = jygVar.q;
                        jygVar.q = null;
                        fyg fygVar = jygVar.r;
                        String title = jygVar.j.getTitle();
                        fygVar.getClass();
                        if (iygVar.f(title, fygVar)) {
                            return;
                        } else {
                            jygVar.o = false;
                        }
                    } else {
                        wxe.t("Pending print can't be started. Activity is finishing or destroyed.", new Object[0]);
                    }
                }
            }
        }
        e();
    }
}
