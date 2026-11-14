package defpackage;

import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class pyg extends gtg {
    public final ArrayList d;
    public final ArrayList e;
    public final zy9 f;
    public final bp g;

    public pyg(ArrayList arrayList, zy9 zy9Var, r9g r9gVar, il ilVar) {
        super(r9gVar);
        this.e = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.d = arrayList2;
        this.f = zy9Var;
        dz[] dzVarArr = (dz[]) arrayList2.toArray(new dz[0]);
        int i = ilVar != null ? ilVar.a : Integer.MAX_VALUE;
        bp bpVar = new bp();
        bpVar.b = dzVarArr;
        bpVar.a = Math.max(1, i);
        this.g = bpVar;
    }

    @Override // defpackage.bz
    public final boolean a() {
        return l() >= 0;
    }

    @Override // defpackage.bz
    public final s50 b() {
        if (!this.e.isEmpty()) {
            return s50.e;
        }
        int iL = l();
        return iL == -1 ? s50.f : ((dz) this.d.get(iL)).b();
    }

    @Override // defpackage.bz
    public final int c() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int iC = ((dz) obj).c();
            if (iC > i) {
                i = iC;
            }
        }
        return i;
    }

    @Override // defpackage.bz
    public final yz d(az azVar) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = this.e;
            int size2 = arrayList2.size();
            int i2 = 0;
            yz yzVarD = null;
            while (i2 < size2) {
                Object obj = arrayList2.get(i2);
                i2++;
                SparseArray sparseArray = ((oyg) obj).b;
                yz yzVar = (yz) sparseArray.get(i);
                if (yzVar != null) {
                    sparseArray.put(i, null);
                }
                yzVarD = yzVar;
                if (yzVar != null) {
                    break;
                }
            }
            if (yzVarD == null) {
                yzVarD = ((dz) arrayList.get(i)).d(azVar);
            }
            if (yzVarD != null) {
                ((WeakHashMap) this.f.a).put(yzVarD, new lyf(new WeakReference(this), Integer.valueOf(i)));
                return yzVarD;
            }
        }
        return null;
    }

    @Override // defpackage.bz
    public final void e(zy zyVar, az azVar) {
        if (a()) {
            oyg oygVar = new oyg(this, zyVar);
            this.e.add(oygVar);
            bp bpVar = this.g;
            bpVar.getClass();
            new irf(bpVar, oygVar, azVar);
            return;
        }
        Locale locale = Locale.US;
        zyVar.onFailed("concurrent=" + Boolean.FALSE + ", providers count=" + this.d.size() + "\nads provider not available");
    }

    @Override // defpackage.gtg
    public final void j(sx sxVar, dl dlVar) {
        if (this.e.isEmpty()) {
            super.j(sxVar, dlVar);
        } else {
            sxVar.onFailed(null);
        }
    }

    @Override // defpackage.gtg
    public final boolean k(String str) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            bz bzVar = (bz) obj;
            if (bzVar.a()) {
                return (bzVar instanceof gtg) && ((gtg) bzVar).k(str);
            }
        }
        return true;
    }

    public final int l() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (((dz) arrayList.get(i)).a()) {
                return i;
            }
            i++;
        }
    }
}
