package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.settings.SettingsManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class qwk extends z5k {
    public final Context f;
    public final RecyclerView g;
    public final tsd h;
    public final zwk i;
    public final swk j;
    public final et3 k;
    public final yu8 l;
    public final ft3 m;
    public final ulp n;
    public final owk o;
    public final agm p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [owk, ywk] */
    public qwk(Context context, ijc ijcVar, RecyclerView recyclerView, tsd tsdVar, tsd tsdVar2, zwk zwkVar, swk swkVar, et3 et3Var, yu8 yu8Var, ft3 ft3Var) {
        super(rwk.class, ijcVar, e6k.m, 2131559358, (byte) 1);
        this.f = context;
        this.g = recyclerView;
        this.h = tsdVar2;
        this.i = zwkVar;
        this.j = swkVar;
        this.k = et3Var;
        this.l = yu8Var;
        this.m = ft3Var;
        this.n = u55.Ro;
        ?? r7 = new ywk() { // from class: owk
            @Override // defpackage.ywk
            public final void G(int i) {
                qwk qwkVar = this.a;
                qwkVar.A();
                swk swkVar2 = qwkVar.j;
                if (i == 2 && swkVar2.a.c()) {
                    SharedPreferences.Editor editorEdit = swkVar2.a().edit();
                    editorEdit.remove("passphrase.dismiss.time");
                    editorEdit.remove("passphrase.dismiss.count");
                    editorEdit.apply();
                }
            }
        };
        this.o = r7;
        this.p = new agm(new eek((Object) this, (Object) tsdVar, (byte) 6));
        swkVar.a.a(new b94(swkVar, new n6k((Object) this, (byte) 16), (byte) 4));
        zwkVar.F(r7);
    }

    @Override // defpackage.z5k
    public final agm C() {
        return this.p;
    }

    public final void D(boolean z) {
        Object next;
        if (z) {
            zwk zwkVar = this.i;
            zwkVar.getClass();
            wyk wykVarB = zwk.b();
            Set set = wykVarB.a;
            Iterator it = wykVarB.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((ne6) next).a == 3) {
                        break;
                    }
                }
            }
            ne6 ne6Var = (ne6) next;
            if (ne6Var != null) {
                set.add(ne6Var);
                zwkVar.k(set);
                SettingsManager settingsManager = this.l.b.a;
                settingsManager.getClass();
                settingsManager.V(1, SettingsManager.B(ne6Var));
            }
            SharedPreferences.Editor editorEdit = this.j.a().edit();
            editorEdit.putBoolean("password.promote", false);
            editorEdit.apply();
            A();
        }
    }

    public final void E() {
        this.n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        swk swkVar = this.j;
        SharedPreferences.Editor editorEdit = swkVar.a().edit();
        editorEdit.putInt("passphrase.dismiss.count", swkVar.a().getInt("passphrase.dismiss.count", 0) + 1);
        editorEdit.putLong("passphrase.dismiss.time", jCurrentTimeMillis);
        editorEdit.apply();
        A();
    }

    public final boolean F() {
        int i = swk.e;
        this.i.getClass();
        if (zwk.i()) {
            this.n.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            swk swkVar = this.j;
            if (swkVar.a().getInt("passphrase.dismiss.count", 0) < 2 && jCurrentTimeMillis - swkVar.a().getLong("passphrase.dismiss.time", 0L) >= swk.d) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ba2, defpackage.fa2
    public final void onDestroy() {
        this.i.H(this.o);
    }

    @Override // defpackage.u5k
    public final ja2 t() {
        if (!F()) {
            int i = 0;
            int i2 = 0;
            Class<qwk> cls = qwk.class;
            return new rwk(new rxh(2132020327), new rxh(2132020326), new rxh(2132020325), new j1k(i2, this, cls, "onSyncPasswordsAccept", "onSyncPasswordsAccept()V", i, (byte) 9), new j1k(i2, this, cls, "onSyncPasswordsDismiss", "onSyncPasswordsDismiss()V", i, (byte) 10));
        }
        int i3 = swk.e;
        this.i.getClass();
        if (zwk.i() && zwk.h()) {
            int i4 = 0;
            int i5 = 0;
            Class<qwk> cls2 = qwk.class;
            return new rwk(new rxh(2132021765), new rxh(2132020308), new rxh(2132018848), new j1k(i5, this, cls2, "onCredentialAccept", "onCredentialAccept()V", i4, (byte) 5), new j1k(i5, this, cls2, "onCredentialDismiss", "onCredentialDismiss()V", i4, (byte) 6));
        }
        int i6 = 0;
        int i7 = 0;
        Class<qwk> cls3 = qwk.class;
        return new rwk(new rxh(2132021766), new rxh(2132020320), new rxh(2132018851), new j1k(i7, this, cls3, "onCredentialAccept", "onCredentialAccept()V", i6, (byte) 7), new j1k(i7, this, cls3, "onCredentialDismiss", "onCredentialDismiss()V", i6, (byte) 8));
    }

    @Override // defpackage.u5k
    public final boolean z() {
        if (F()) {
            return true;
        }
        int i = swk.e;
        this.n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        swk swkVar = this.j;
        if (swkVar.a().getBoolean("password.promote", false) && jCurrentTimeMillis - swkVar.a().getLong("password.first.show", 0L) < swk.c) {
            this.i.getClass();
            if (!zwk.i() && zwk.e()) {
                Set set = zwk.b().b;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if (((ne6) it.next()).a == 3) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
