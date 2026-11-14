package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.Locale;

/* loaded from: classes.dex */
public final class vpc {
    public final dj9 a;
    public final SettingsManager b;
    public final onc c;
    public final ode d = new ode();
    public final upc e = new upc(this, 0);
    public c6j f;

    public vpc(dj9 dj9Var, SettingsManager settingsManager, onc oncVar) {
        this.a = dj9Var;
        this.b = settingsManager;
        this.c = oncVar;
        settingsManager.F(new s9(this, (byte) 20));
        dj9Var.F(new vy(this, (byte) 6));
    }

    public final void a() {
        String str;
        String language;
        l1c l1cVar;
        c6j c6jVar = this.f;
        l0c l0cVar = (c6jVar == null || (l1cVar = (l1c) c6jVar.b) == null) ? null : l1cVar.c;
        String str2 = ((cj9) this.a.i()).b;
        if (l0cVar == null || (str = l0cVar.a) == null) {
            str = str2;
        }
        if (l0cVar == null || (language = l0cVar.b) == null) {
            language = Locale.getDefault().getLanguage();
        }
        xf8.E0(this.d, new tpc(str2, str, language));
    }

    public final void b() {
        c6j c6jVar;
        c6j c6jVar2 = this.f;
        upc upcVar = this.e;
        if (c6jVar2 != null) {
            c6jVar2.c.remove(upcVar);
        }
        if (this.b.i("enable_newsfeed")) {
            c6jVar = new c6j((t7j) this.c.get(), false);
            c6jVar.c.add(upcVar);
        } else {
            c6jVar = null;
        }
        this.f = c6jVar;
        a();
    }
}
