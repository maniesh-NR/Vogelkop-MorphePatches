package defpackage;

import J.N;
import android.os.Build;
import com.opera.android.autofill.PasswordManager;
import com.opera.android.settings.SettingsManager;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k6g implements u9j {
    public final SettingsManager a;
    public final PasswordManager b;
    public final x5g c;
    public final yu2 d;
    public final zwk e;
    public final yv3 f;
    public final n6g g;
    public final cq5 h;
    public final j6g k;
    public final v9j i = new v9j(this);
    public final s9 j = new s9(this, 27);
    public final z5g l = new z5g(this, 1);
    public final t77 m = new t77((Object) this, (byte) 7);

    public k6g(SettingsManager settingsManager, PasswordManager passwordManager, x5g x5gVar, yu2 yu2Var, zwk zwkVar, db dbVar, yv3 yv3Var, n6g n6gVar, cq5 cq5Var) {
        this.a = settingsManager;
        this.b = passwordManager;
        this.c = x5gVar;
        this.d = yu2Var;
        this.e = zwkVar;
        this.f = yv3Var;
        this.g = n6gVar;
        this.h = cq5Var;
        this.k = new j6g(dbVar, settingsManager, zwkVar, new e6g(0, this, k6g.class, "updateState", "updateState()V", 0, (byte) 1));
    }

    public final void a() {
        this.b.getClass();
        boolean zMaxktGXn = N.MaxktGXn();
        SettingsManager settingsManager = this.a;
        jji jjiVar = zMaxktGXn ? settingsManager.i("password_manager_autosave") ? jji.ALWAYS : jji.ASK : jji.NEVER;
        boolean zMkdlpo6n = N.Mkdlpo6n();
        yu2 yu2Var = this.d;
        ns2 ns2Var = new ns2(yu2Var.b(), yu2Var.a());
        ryc rycVar = new ryc(((Boolean) this.f.get()).booleanValue(), settingsManager.p());
        i6g i6gVar = this.k.e;
        lxk lxkVar = new lxk(i6gVar.a, i6gVar.b);
        a4g a4gVar = this.c.f;
        List listUnmodifiableList = a4gVar != null ? Collections.unmodifiableList(a4gVar.a) : null;
        if (listUnmodifiableList == null) {
            listUnmodifiableList = l08.a;
        }
        int size = listUnmodifiableList.size();
        n6g n6gVar = this.g;
        n6gVar.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 30 && m5h.q() && !m5h.A(n6gVar.a, "OFA_SHORTCUT_PASSWORDS")) {
            z = true;
        }
        this.i.r(new h6g(jjiVar, zMkdlpo6n, ns2Var, rycVar, lxkVar, size, z, ((f8f) this.h.getValue()).g()));
    }

    @Override // defpackage.u9j
    public final void j() {
        a();
    }

    @Override // defpackage.u9j
    public final void m(kze kzeVar) {
        a26.V(this.a, kzeVar, this.j);
        a26.V(this.c, kzeVar, this.l);
        a26.V(this.e, kzeVar, this.k);
        a26.S(xf8.u(this.h), kzeVar, this.m);
    }
}
