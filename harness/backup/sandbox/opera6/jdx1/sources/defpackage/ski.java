package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class ski extends t7n implements r7n {
    public final Application a;
    public final q7n b;
    public final Bundle c;
    public final tcc d;
    public final pki e;

    public ski(Application application, rki rkiVar, Bundle bundle) {
        q7n q7nVar;
        this.e = rkiVar.getSavedStateRegistry();
        this.d = rkiVar.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            q7nVar = q7n.c;
            if (q7nVar == null) {
                q7nVar = new q7n(application);
                q7n.c = q7nVar;
            }
        } else {
            q7nVar = new q7n(null);
        }
        this.b = q7nVar;
    }

    public final l7n a(Class cls, dde ddeVar) {
        LinkedHashMap linkedHashMap = ddeVar.a;
        String str = (String) linkedHashMap.get(u7n.a);
        if (str == null) {
            qp2.n("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(kki.a) == null || linkedHashMap.get(kki.b) == null) {
            if (this.d != null) {
                return e(cls, str);
            }
            qp2.n("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(q7n.d);
        boolean zIsAssignableFrom = kc1.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? tki.a(cls, tki.b) : tki.a(cls, tki.a);
        return constructorA == null ? this.b.a(cls, ddeVar) : (!zIsAssignableFrom || application == null) ? tki.b(cls, constructorA, kki.a(ddeVar)) : tki.b(cls, constructorA, application, kki.a(ddeVar));
    }

    public final l7n b(s15 s15Var, dde ddeVar) {
        return a(s15Var.a(), ddeVar);
    }

    public final l7n c(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(cls, canonicalName);
        }
        qp2.o("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public final void d(l7n l7nVar) {
        tcc tccVar = this.d;
        if (tccVar != null) {
            z4o.l(l7nVar, this.e, tccVar);
        }
    }

    public final l7n e(Class cls, String str) {
        tcc tccVar = this.d;
        if (tccVar == null) {
            yt7.k("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = kc1.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? tki.a(cls, tki.b) : tki.a(cls, tki.a);
        if (constructorA != null) {
            hki hkiVarK = z4o.K(this.e, tccVar, str, this.c);
            gki gkiVar = hkiVarK.b;
            l7n l7nVarB = (!zIsAssignableFrom || application == null) ? tki.b(cls, constructorA, gkiVar) : tki.b(cls, constructorA, application, gkiVar);
            l7nVarB.b("androidx.lifecycle.savedstate.vm.tag", hkiVarK);
            return l7nVarB;
        }
        if (application != null) {
            return this.b.c(cls);
        }
        s7n s7nVar = s7n.a;
        if (s7nVar == null) {
            s7nVar = new s7n();
            s7n.a = s7nVar;
        }
        return s7nVar.c(cls);
    }
}
