package defpackage;

import androidx.annotation.NonNull;
import com.opera.android.annotations.WeakOwner;
import com.opera.android.settings.SettingsManager;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class jvc extends lim implements p5j, due {

    @NonNull
    @WeakOwner
    private final q8j a = new xy(this, 2);
    public final SettingsManager b;
    public final fqe c;
    public final fue d;
    public final x5f e;
    public nre f;
    public cue g;
    public ch0 h;
    public boolean i;

    public jvc(SettingsManager settingsManager, fqe fqeVar, fue fueVar, x5f x5fVar) {
        this.b = settingsManager;
        this.c = fqeVar;
        this.d = fueVar;
        this.e = x5fVar;
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("enable_newsfeed".equals(str)) {
            S();
        }
    }

    public final void S() {
        if (!this.b.i("enable_newsfeed") || this.g != cue.NewsFeed || this.i) {
            T();
        } else {
            this.c.c().g(this.a);
            this.i = true;
        }
    }

    public final void T() {
        ch0 ch0Var;
        if (this.g == cue.NewsFeed && this.b.i("enable_newsfeed")) {
            nre nreVar = this.f;
            if (nreVar != null) {
                Iterator it = nreVar.d.iterator();
                while (it.hasNext()) {
                    if (((yqe) it.next()).a()) {
                        Iterator it2 = this.f.e.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                ch0Var = ch0.f;
                                break;
                            } else if (((yqe) it2.next()).a()) {
                                ch0Var = this.f.h ? ch0.e : ch0.d;
                            }
                        }
                    }
                }
                ch0Var = ch0.c;
            } else {
                ch0Var = ch0.c;
            }
        } else {
            ch0Var = ch0.b;
        }
        if (ch0Var == this.h) {
            return;
        }
        x5f x5fVar = this.e;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(zpaVar);
            b66VarF.getClass();
            b66VarF.q(59, 1, ch0Var);
            x5fVar.U0(x56VarF);
        }
        this.h = ch0Var;
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        this.b.F(this);
        fue fueVar = this.d;
        fueVar.d();
        this.g = fueVar.a;
        fueVar.b(this);
        S();
    }

    @Override // defpackage.due
    public final void b(cue cueVar) {
        this.g = cueVar;
        S();
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.b.H(this);
        this.d.e(this);
    }
}
