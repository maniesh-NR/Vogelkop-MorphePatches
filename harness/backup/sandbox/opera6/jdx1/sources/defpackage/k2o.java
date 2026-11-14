package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class k2o extends WindowInsetsAnimation$Callback {
    public final s75 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public k2o(s75 s75Var) {
        super(s75Var.b);
        this.d = new HashMap();
        this.a = s75Var;
    }

    public final n2o a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        n2o n2oVar = (n2o) map.get(windowInsetsAnimation);
        if (n2oVar != null) {
            return n2oVar;
        }
        n2o n2oVar2 = new n2o(0, null, 0L);
        n2oVar2.a = new l2o(windowInsetsAnimation);
        map.put(windowInsetsAnimation, n2oVar2);
        return n2oVar2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.h(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.i(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            n2o n2oVarA = a(windowInsetsAnimation);
            n2oVarA.a.e(windowInsetsAnimation.getFraction());
            this.c.add(n2oVarA);
        }
        return this.a.j(g3o.g(null, windowInsets), this.b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        mgh mghVarK = this.a.k(a(windowInsetsAnimation), new mgh(bounds));
        mghVarK.getClass();
        dz0.f();
        return dz0.b(((r9b) mghVarK.b).e(), ((r9b) mghVarK.c).e());
    }
}
