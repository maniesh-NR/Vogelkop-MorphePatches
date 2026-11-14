package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class k3i {
    public final iv1 a;
    public final iv1 b;
    public final zyk c = z4c.b(new j3i(this, 0));

    public k3i(iv1 iv1Var, iv1 iv1Var2) {
        this.a = iv1Var;
        this.b = iv1Var2;
    }

    public final ikc a() {
        return (ikc) this.c.getValue();
    }

    public final boolean b() {
        f8f f8fVar = (f8f) ((cq5) this.a.invoke()).getValue();
        if (i0l.g()) {
            return false;
        }
        return f8fVar.j();
    }

    public final boolean c() {
        l08 l08Var;
        jdj jdjVar = (jdj) ((cq5) this.a.invoke()).d;
        synchronized (jdjVar) {
            int iP = (int) ((jdjVar.p() + jdjVar.k) - jdjVar.i);
            if (iP == 0) {
                l08Var = l08.a;
            } else {
                l08 arrayList = new ArrayList(iP);
                Object[] objArr = jdjVar.h;
                for (int i = 0; i < iP; i++) {
                    arrayList.add(ipe.C(objArr, jdjVar.i + i));
                }
                l08Var = arrayList;
            }
        }
        f8f f8fVar = (f8f) CollectionsKt.firstOrNull(l08Var);
        return (f8fVar == null ? m18.a : !(i0l.g() ? false : f8fVar.j()) ? m18.d : ((SettingsManager) this.b.invoke()).i("enable_rewards") ? m18.b : m18.c) == m18.b;
    }
}
