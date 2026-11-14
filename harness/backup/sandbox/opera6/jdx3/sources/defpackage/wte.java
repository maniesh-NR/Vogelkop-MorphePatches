package defpackage;

import android.content.Context;
import com.opera.android.settings.SettingsManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wte implements u9j {
    public final SettingsManager a;
    public final yqa b;
    public final fqe c;
    public final fue d;
    public final v9j e = new v9j(this);
    public final zxf f;
    public final zxf g;
    public final Set h;
    public final s9 i;
    public final tte j;
    public final kvc k;
    public final ute l;
    public final vte m;
    public List n;
    public boolean o;
    public bre p;
    public boolean q;
    public l0c r;
    public boolean s;
    public x77 t;
    public l0c u;

    public wte(Context context, SettingsManager settingsManager, dyf dyfVar, yqa yqaVar, fqe fqeVar, fue fueVar) {
        zxf yxfVar;
        this.a = settingsManager;
        this.b = yqaVar;
        this.c = fqeVar;
        this.d = fueVar;
        WeakReference weakReference = dyfVar.j;
        if (weakReference == null || (yxfVar = (zxf) weakReference.get()) == null) {
            yxfVar = new yxf(dyfVar);
            dyfVar.j = new WeakReference(yxfVar);
        }
        this.f = yxfVar;
        this.g = dyfVar.b();
        this.h = e82.E(new String[]{"enable_newsfeed", "enable_reading_mode_as_default", "personalized_news", "personalized_default", "process_news_topics", "recommendations_language_region"});
        this.i = new s9(this, (byte) 24);
        this.j = new tte(this);
        this.k = new kvc(this, (byte) 1);
        this.l = new ute(this, context);
        this.m = new vte(this);
        this.n = l08.a;
        fueVar.d();
        this.s = fueVar.a.a == 2;
    }

    public final boolean a() {
        l0c l0cVarC;
        zxf zxfVar = this.f;
        if (zxfVar.c.isEmpty() || (l0cVarC = zxfVar.b) == null) {
            l0cVarC = zxfVar.c();
        }
        return Intrinsics.a(l0cVarC, this.u);
    }

    public final void b() {
        jrh jrhVar;
        x77 x77Var;
        String string;
        SettingsManager settingsManager = this.a;
        boolean zI = settingsManager.i("enable_newsfeed");
        l0c l0cVar = this.u;
        o7j o7jVar = zI ? o7j.values()[settingsManager.n("enable_reading_mode_as_default")] : null;
        if (!zI || (x77Var = this.t) == null || l0cVar == null) {
            jrhVar = null;
        } else {
            Map map = (Map) x77Var.b;
            Context context = (Context) x77Var.c;
            if (((HashSet) x77Var.d) == null) {
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    String str = ((l0c) it.next()).a;
                    if (!hashSet2.add(str)) {
                        hashSet.add(str);
                    }
                }
                x77Var.d = hashSet;
            }
            q0c q0cVar = (q0c) map.get(l0cVar);
            if (((HashSet) x77Var.d).contains(l0cVar.a)) {
                Locale.getDefault();
                string = sko.v(context.getString(q0cVar.a), " - ", context.getString(q0cVar.b));
            } else {
                string = context.getString(q0cVar.a);
            }
            jrhVar = new jrh(string);
        }
        this.e.r(new ste(zI, o7jVar, jrhVar, (zI && (l0cVar != null && l0cVar.equals(this.r)) && this.o && this.s && settingsManager.M()) ? this.p : null, zI ? settingsManager.M() ? adg.ENABLED : adg.DISABLED : null, !zI ? heb.m : this.q ? jeb.m : new ieb(this.n)));
    }

    @Override // defpackage.u9j
    public final void j() {
        this.a.F(this.i);
        zxf zxfVar = this.f;
        tte tteVar = this.j;
        zxfVar.F(tteVar);
        this.g.F(tteVar);
        this.d.b(this.k);
        this.l.e();
        this.m.e();
        tteVar.f();
    }

    @Override // defpackage.u9j
    public final void onStopped() {
        this.m.a = true;
        this.l.a = true;
        this.d.e(this.k);
        this.g.H(this.j);
        this.f.H(this.j);
        this.a.H(this.i);
    }
}
