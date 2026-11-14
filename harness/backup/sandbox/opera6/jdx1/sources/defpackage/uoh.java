package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class uoh implements idc {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ uoh(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public uoh(Runnable runnable) {
        this.a = (byte) 3;
        qcc qccVar = qcc.a;
        this.b = runnable;
    }

    @Override // defpackage.idc
    public final void E(ndc ndcVar, occ occVar) throws NoSuchMethodException, SecurityException {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                rki rkiVar = (rki) obj;
                if (occVar != occ.ON_CREATE) {
                    qp2.g("Next event must be ON_CREATE");
                    return;
                }
                ndcVar.getLifecycle().b(this);
                Bundle bundleA = rkiVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (bundleA != null) {
                    ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                    if (stringArrayList == null) {
                        qp2.n("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                        return;
                    }
                    int size = stringArrayList.size();
                    int i = 0;
                    while (i < size) {
                        String str = stringArrayList.get(i);
                        i++;
                        String str2 = str;
                        try {
                            Class<? extends U> clsAsSubclass = Class.forName(str2, false, uoh.class.getClassLoader()).asSubclass(nki.class);
                            try {
                                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                                declaredConstructor.setAccessible(true);
                                try {
                                    ((ebc) ((nki) declaredConstructor.newInstance(null))).getClass();
                                    if (!(rkiVar instanceof w7n)) {
                                        rqd.e(rkiVar, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                        return;
                                    }
                                    v7n viewModelStore = ((w7n) rkiVar).getViewModelStore();
                                    pki savedStateRegistry = rkiVar.getSavedStateRegistry();
                                    LinkedHashMap linkedHashMap = viewModelStore.a;
                                    LinkedHashMap linkedHashMap2 = viewModelStore.a;
                                    Iterator it = CollectionsKt.n0(linkedHashMap.keySet()).iterator();
                                    while (it.hasNext()) {
                                        l7n l7nVar = (l7n) linkedHashMap2.get(it.next());
                                        if (l7nVar != null) {
                                            z4o.l(l7nVar, savedStateRegistry, rkiVar.getLifecycle());
                                        }
                                    }
                                    if (!CollectionsKt.n0(linkedHashMap2.keySet()).isEmpty()) {
                                        savedStateRegistry.d();
                                    }
                                } catch (Exception e) {
                                    h9o.s(sko.j("Failed to instantiate ", str2), e);
                                    return;
                                }
                            } catch (NoSuchMethodException e2) {
                                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            h9o.s(sko.k("Class ", str2, " wasn't found"), e3);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                xd5 xd5Var = (xd5) obj;
                xd5.access$ensureViewModelStore(xd5Var);
                xd5Var.getLifecycle().b(this);
                return;
            case 2:
                vu9[] vu9VarArr = (vu9[]) obj;
                if (vu9VarArr.length > 0) {
                    vu9 vu9Var = vu9VarArr[0];
                    throw null;
                }
                if (vu9VarArr.length <= 0) {
                    return;
                }
                vu9 vu9Var2 = vu9VarArr[0];
                throw null;
            case 3:
                if (((qdc) ndcVar.getLifecycle()).i.d(qcc.e)) {
                    ((Runnable) obj).run();
                    ndcVar.getLifecycle().b(this);
                    return;
                } else {
                    if (occVar == occ.ON_DESTROY) {
                        ndcVar.getLifecycle().b(this);
                        return;
                    }
                    return;
                }
            default:
                if (occVar != occ.ON_CREATE) {
                    rqd.e(occVar, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    ndcVar.getLifecycle().b(this);
                    ((lki) obj).b();
                    return;
                }
        }
    }
}
