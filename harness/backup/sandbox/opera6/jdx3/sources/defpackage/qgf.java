package defpackage;

import android.content.Context;
import android.view.View;
import com.opera.android.Lazy;
import com.opera.android.settings.SettingsManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.chromium.content_public.browser.NavigationHandle;

/* loaded from: classes.dex */
public final class qgf extends y08 {
    public final Context a;
    public final k6l b;
    public final kwf c;
    public final swf d;
    public final du3 e;
    public final du3 f;
    public final oz3 g;
    public f6l h;
    public ogf i;
    public boolean j;
    public final SettingsManager k;
    public final Lazy l;

    public qgf(Context context, du3 du3Var, k6l k6lVar, kwf kwfVar, swf swfVar, du3 du3Var2, du3 du3Var3, oz3 oz3Var, SettingsManager settingsManager, Lazy lazy) {
        pgf pgfVar;
        this.a = context;
        this.b = k6lVar;
        this.c = kwfVar;
        this.d = swfVar;
        this.e = du3Var2;
        this.f = du3Var3;
        this.g = oz3Var;
        this.k = settingsManager;
        this.l = lazy;
        if (ru9.c(context).a.getBoolean("external_apps.page_menu_hint.shown", false) || (pgfVar = (pgf) du3Var.b.Z.getValue()) == null) {
            return;
        }
        pgfVar.h.k(new d8d(this, (byte) 17));
        this.h = k6lVar.a(this);
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void E(b2l b2lVar, NavigationHandle navigationHandle) {
        if (navigationHandle.c || !navigationHandle.h) {
            return;
        }
        this.j = true;
        W(b2lVar);
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void S(d7l d7lVar) {
        this.j = false;
    }

    public final void W(b2l b2lVar) {
        ogf ogfVar;
        String str;
        View view;
        if (!this.j || b2lVar == null) {
            return;
        }
        d7l d7lVar = (d7l) b2lVar;
        if (d7lVar.j.isLoading() || (ogfVar = this.i) == null) {
            return;
        }
        if (ogfVar.a.equals(d7lVar.k0())) {
            this.j = false;
            ogf ogfVar2 = this.i;
            if (ru9.c(this.a).a.getBoolean("external_apps.page_menu_hint.shown", false) || d7lVar.j.m() || (str = ogfVar2.e) == null) {
                return;
            }
            Set set = ((ro7) ((vo7) this.l.get()).a.get()).a;
            if ((set instanceof Collection) && set.isEmpty()) {
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((qo7) it.next()).a.equals(str)) {
                    kwf kwfVar = this.c;
                    qwf qwfVar = qwf.t;
                    if (kwfVar.t(qwfVar) && !this.d.f.contains(qwfVar) && ((Boolean) this.e.get()).booleanValue() && (view = (View) this.f.get()) != null && this.k.i("feature_tips_notification")) {
                        ioc iocVar = new ioc((byte) 1, view, this);
                        oz3 oz3Var = this.g;
                        oz3Var.getClass();
                        oz3Var.b(iocVar, ijm.b);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void j(b2l b2lVar) {
        W(b2lVar);
    }
}
