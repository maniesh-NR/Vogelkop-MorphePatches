package defpackage;

import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class h3m {
    public static final om2 a;
    public static final ThreadLocal b;
    public static final ArrayList c;

    static {
        om2 om2Var = new om2();
        om2Var.G = false;
        om2Var.P(new bo8(2));
        om2Var.P(new kr4());
        om2Var.P(new bo8(1));
        a = om2Var;
        b = new ThreadLocal();
        c = new ArrayList();
    }

    public static void a(ViewGroup viewGroup, y2m y2mVar) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (y2mVar == null) {
            y2mVar = a;
        }
        y2m y2mVarClone = y2mVar.clone();
        c(viewGroup, y2mVarClone);
        viewGroup.setTag(2131364835, null);
        g3m g3mVar = new g3m();
        g3mVar.a = y2mVarClone;
        g3mVar.b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(g3mVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(g3mVar);
    }

    public static ArrayMap b() {
        ArrayMap arrayMap;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (arrayMap = (ArrayMap) weakReference.get()) != null) {
            return arrayMap;
        }
        ArrayMap arrayMap2 = new ArrayMap(0);
        threadLocal.set(new WeakReference(arrayMap2));
        return arrayMap2;
    }

    public static void c(ViewGroup viewGroup, y2m y2mVar) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((y2m) obj).A(viewGroup);
            }
        }
        if (y2mVar != null) {
            y2mVar.k(viewGroup, true);
        }
        if (viewGroup.getTag(2131364835) == null) {
            return;
        }
        h9o.t();
    }
}
