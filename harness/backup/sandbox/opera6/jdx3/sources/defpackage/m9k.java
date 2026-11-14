package defpackage;

import android.app.Activity;
import com.opera.android.Lazy;
import com.opera.android.settings.SettingsManager;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class m9k extends lim {
    public final umi a;
    public final SettingsManager b;
    public final List c;
    public l9k d;
    public final jze e;
    public boolean f;
    public final t77 g;
    public oml h;

    public m9k(Activity activity, umi umiVar, Lazy lazy, SettingsManager settingsManager, m9c m9cVar) {
        List listAsList = Arrays.asList(new j9k(activity, umiVar, lazy, settingsManager), new bac(activity, m9cVar));
        this.a = umiVar;
        this.b = settingsManager;
        this.c = listAsList;
        this.d = l9k.a;
        this.e = new jze(Boolean.valueOf(settingsManager.i("has_waited_for_startup_dependencies") || !settingsManager.J()));
        this.g = new t77((Object) this, (byte) 11);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            this.e.s(((k9k) it.next()).a(), new w4i(new n6k((Object) this, (byte) 8), (byte) 15));
        }
    }

    public final void R(boolean z) {
        jze jzeVar = this.e;
        if (((Boolean) jzeVar.g()).booleanValue()) {
            return;
        }
        oml omlVar = this.h;
        if (omlVar != null) {
            omlVar.cancel(false);
        }
        this.h = null;
        l9k l9kVar = z ? l9k.d : l9k.c;
        if (this.d == l9k.a) {
            this.d = l9kVar;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((k9k) it.next()).b(z);
        }
        jzeVar.r(Boolean.TRUE);
    }

    public final void S() {
        if (this.f || ((Boolean) this.e.g()).booleanValue()) {
            return;
        }
        this.f = true;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((k9k) it.next()).start();
        }
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        this.e.k(this.g);
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.e.p(this.g);
        R(false);
    }
}
