package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class pki {
    public final ijd a;
    public dp1 b;

    public pki(ijd ijdVar) {
        this.a = ijdVar;
    }

    public final Bundle a(String str) {
        ijd ijdVar = this.a;
        if (!ijdVar.b) {
            qp2.n("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = (Bundle) ijdVar.h;
        if (bundle == null) {
            return null;
        }
        Bundle bundleH = bundle.containsKey(str) ? n1h.h(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            ijdVar.h = null;
        }
        return bundleH;
    }

    public final oki b(String str) {
        oki okiVar;
        ijd ijdVar = this.a;
        synchronized (((ftj) ijdVar.f)) {
            okiVar = (oki) ((see) ijdVar.g).g(str);
        }
        return okiVar;
    }

    public final void c(String str, oki okiVar) {
        ijd ijdVar = this.a;
        synchronized (((ftj) ijdVar.f)) {
            if (((see) ijdVar.g).b(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            ((see) ijdVar.g).m(str, okiVar);
        }
    }

    public final void d() {
        if (!this.a.c) {
            qp2.n("Can not perform this action after onSaveInstanceState");
            return;
        }
        dp1 dp1Var = this.b;
        if (dp1Var == null) {
            dp1Var = new dp1(this);
        }
        this.b = dp1Var;
        try {
            ebc.class.getDeclaredConstructor(null);
            dp1 dp1Var2 = this.b;
            if (dp1Var2 != null) {
                ((LinkedHashSet) dp1Var2.b).add(ebc.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + ebc.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
