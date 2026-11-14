package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes.dex */
public abstract class kki {
    public static final ix5 a = new ix5((byte) 28);
    public static final i06 b = new i06((byte) 28);
    public static final j06 c = new j06((byte) 28);

    public static final gki a(dde ddeVar) {
        gki gkiVar;
        LinkedHashMap linkedHashMap = ddeVar.a;
        rki rkiVar = (rki) linkedHashMap.get(a);
        Bundle bundle = null;
        if (rkiVar == null) {
            qp2.o("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        w7n w7nVar = (w7n) linkedHashMap.get(b);
        if (w7nVar == null) {
            qp2.o("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(c);
        String str = (String) linkedHashMap.get(u7n.a);
        if (str == null) {
            qp2.o("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        oki okiVarB = rkiVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        lki lkiVar = okiVarB instanceof lki ? (lki) okiVarB : null;
        if (lkiVar == null) {
            qp2.n("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        mki mkiVarC = c(w7nVar);
        gki gkiVar2 = (gki) mkiVarC.b.get(str);
        if (gkiVar2 != null) {
            return gkiVar2;
        }
        lkiVar.b();
        Bundle bundle3 = lkiVar.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                n08.a.getClass();
                bundle4 = ic4.m((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                lkiVar.c = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            gkiVar = new gki();
        } else {
            bundle2.setClassLoader(gki.class.getClassLoader());
            u9d u9dVar = new u9d(bundle2.size());
            for (String str2 : bundle2.keySet()) {
                u9dVar.put(str2, bundle2.get(str2));
            }
            gkiVar = new gki(u9dVar.g());
        }
        mkiVarC.b.put(str, gkiVar);
        return gkiVar;
    }

    public static final void b(rki rkiVar) {
        qcc qccVar = ((qdc) rkiVar.getLifecycle()).i;
        if (qccVar != qcc.b && qccVar != qcc.c) {
            j9h.o("Failed to enable `SavedStateHandle` for `", rkiVar, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", qccVar, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
        } else if (rkiVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            lki lkiVar = new lki(rkiVar.getSavedStateRegistry(), (w7n) rkiVar);
            rkiVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", lkiVar);
            rkiVar.getLifecycle().a(new uoh(lkiVar, (byte) 4));
        }
    }

    public static final mki c(w7n w7nVar) {
        return (mki) new plk(w7nVar.getViewModelStore(), new jki(), m5h.n(w7nVar)).n(uqh.a(mki.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
