package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class zxf implements w6f {
    public ArrayList a;
    public l0c b;
    public final HashSet c = new HashSet();
    public final /* synthetic */ dyf d;

    public zxf(dyf dyfVar) {
        this.d = dyfVar;
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        xxf xxfVar = (xxf) obj;
        HashSet hashSet = this.c;
        if (hashSet.isEmpty()) {
            g();
            dyf dyfVar = this.d;
            dyfVar.g.b(this);
            dyfVar.d();
        }
        hashSet.add(xxfVar);
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        HashSet hashSet = this.c;
        hashSet.remove((xxf) obj);
        if (hashSet.isEmpty()) {
            dyf dyfVar = this.d;
            dyfVar.g.c(this);
            dyfVar.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [bwf] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, zqe] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [bwf] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, jvl] */
    public final ArrayList a() {
        nre nreVar;
        ?? zqeVar;
        dyf dyfVar = this.d;
        Context context = dyfVar.a;
        if (!f()) {
            return null;
        }
        String[] strArr = OperaApplication.K;
        fue fueVarZ = ((OperaApplication) context.getApplicationContext()).z();
        fueVarZ.d();
        if (fueVarZ.a.ordinal() != 1 || (nreVar = (nre) dyfVar.a().b) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListB = b(nreVar);
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListB.get(i);
            i++;
            yqe yqeVar = (yqe) obj;
            boolean zEquals = yqeVar.equals(yqe.d);
            WeakHashMap weakHashMap = dyfVar.e;
            if (zEquals) {
                zqeVar = (bwf) weakHashMap.get("topnews");
                if (zqeVar == 0) {
                    zqeVar = new jvl(context, (p0c) dyfVar.b.get());
                    weakHashMap.put("topnews", zqeVar);
                }
            } else {
                zqeVar = (bwf) weakHashMap.get(yqeVar);
                if (zqeVar == 0) {
                    zqeVar = new zqe();
                    zqeVar.a = yqeVar;
                    weakHashMap.put(yqeVar, zqeVar);
                } else {
                    ((zqe) zqeVar).a = yqeVar;
                }
            }
            arrayList.add(zqeVar);
        }
        return arrayList;
    }

    public ArrayList b(nre nreVar) {
        return i41.y(nreVar.d, nreVar.g != null);
    }

    public final l0c c() {
        nre nreVar;
        if (!f()) {
            return null;
        }
        dyf dyfVar = this.d;
        Context context = dyfVar.a;
        String[] strArr = OperaApplication.K;
        fue fueVarZ = ((OperaApplication) context.getApplicationContext()).z();
        fueVarZ.d();
        if (fueVarZ.a.ordinal() != 1 || (nreVar = (nre) dyfVar.a().b) == null) {
            return null;
        }
        return nreVar.c;
    }

    public final List e() {
        ArrayList arrayList;
        if (!this.c.isEmpty() && (arrayList = this.a) != null) {
            return arrayList;
        }
        ArrayList arrayListA = a();
        return arrayListA != null ? arrayListA : Collections.EMPTY_LIST;
    }

    public boolean f() {
        return true;
    }

    public final void g() {
        ArrayList arrayListA = a();
        l0c l0cVarC = c();
        if (Objects.equals(l0cVarC, this.b) && Objects.equals(arrayListA, this.a)) {
            return;
        }
        this.a = arrayListA;
        this.b = l0cVarC;
        Iterator it = new HashSet(this.c).iterator();
        while (it.hasNext()) {
            ((xxf) it.next()).f();
        }
    }
}
