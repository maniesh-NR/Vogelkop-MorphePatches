package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class cj3 {
    public final tcl a;
    public final vx b;
    public final f9d c;
    public final jze d;
    public final kze e;
    public final qie f;
    public Set g;
    public Set h;
    public final LinkedHashSet i;
    public Set j;

    public cj3(tcl tclVar, h42 h42Var, h42 h42Var2, vx vxVar, f9d f9dVar) {
        this.a = tclVar;
        this.b = vxVar;
        this.c = f9dVar;
        v08 v08Var = v08.a;
        jze jzeVar = new jze(v08Var);
        this.d = jzeVar;
        this.e = new kze(Boolean.FALSE);
        this.f = new qie((byte) 19);
        this.g = v08Var;
        this.h = v08Var;
        this.i = new LinkedHashSet();
        this.j = v08Var;
        pqh pqhVar = new pqh();
        jzeVar.l.s(b8h.d(h42Var), new ug(new aj3(pqhVar, this), (byte) 11));
        jzeVar.s(h42Var2, new ug(new aj3(this, pqhVar), (byte) 11));
    }

    public final void a(Uri uri) {
        if (uri == null || this.h.isEmpty()) {
            return;
        }
        Set set = this.h;
        LinkedHashSet linkedHashSet = this.i;
        Set<wj3> setD = b5j.d(set, linkedHashSet);
        this.h = v08.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (wj3 wj3Var : setD) {
            Set set2 = (Set) linkedHashMap.get(new c8a(wj3Var.b));
            if (set2 != null) {
                set2.add(wj3Var);
            } else {
                linkedHashMap.put(new c8a(wj3Var.b), a5j.b(new wj3[]{wj3Var}));
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = ((c8a) entry.getKey()).a;
            Set set3 = (Set) entry.getValue();
            linkedHashSet.addAll(set3);
            lj3 lj3Var = (lj3) this.b.get();
            wx wxVar = new wx(str, new wx((Object) this, (Object) set3, (byte) 15), this.c);
            ArrayList arrayList = lj3Var.e;
            tm5 tm5Var = lj3Var.b;
            if (tm5Var.c == null) {
                tm5Var.a = sle.d();
            }
            if (tm5Var.a) {
                lj3Var.a(uri, str, wxVar);
            } else {
                boolean zIsEmpty = arrayList.isEmpty();
                arrayList.add(new jj3(uri, str, wxVar));
                if (zIsEmpty) {
                    tm5Var.d.add(new kj3(lj3Var));
                    if (tm5Var.c == null) {
                        tm5Var.c = sle.a(tm5Var);
                        tm5Var.a = sle.d();
                    }
                }
            }
        }
    }
}
