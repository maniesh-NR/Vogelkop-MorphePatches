package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class k5k extends oph {
    public final h5k b;
    public final wy d;
    public final g5k e;
    public final f5k f;
    public eu8 g;
    public final ArrayList a = new ArrayList();
    public final HashMap c = new HashMap();
    public boolean h = true;

    public k5k(Context context, wy wyVar, bi biVar, x5f x5fVar, s9i s9iVar, boolean z) {
        this.d = wyVar;
        h5k h5kVar = new h5k();
        h5kVar.b = new HashMap();
        h5kVar.c = new HashSet();
        h5kVar.d = biVar;
        this.b = h5kVar;
        this.e = new g5k(this, xnh.t(context), x5fVar, s9iVar, z);
        this.f = new f5k(this);
    }

    public final mq a(List list, List list2) {
        if (list.isEmpty()) {
            return null;
        }
        uo uoVar = (uo) list.get(0);
        dl dlVar = uoVar.b;
        int i = (dlVar.a == 2 && sfh.d() == sfh.b) ? 3 : dlVar.a;
        if (dlVar.a != i) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                uo uoVar2 = (uo) it.next();
                if (uoVar2.b.a == i) {
                    uoVar = uoVar2;
                    break;
                }
            }
        }
        bz bzVar = uoVar.a;
        dl dlVar2 = uoVar.b;
        HashMap map = this.c;
        j5k j5kVar = (j5k) map.get(uoVar);
        if (j5kVar == null) {
            j5kVar = new j5k(this, dlVar2, bzVar);
            map.put(uoVar, j5kVar);
        }
        no noVar = new no(uoVar, this.d.l, this.e, list2);
        this.a.add(noVar);
        j5kVar.a.add(noVar);
        return noVar;
    }

    public final void f(mq mqVar) {
        if (mqVar.j()) {
            return;
        }
        for (j5k j5kVar : this.c.values()) {
            if (j5kVar.a.contains(mqVar)) {
                bz bzVar = j5kVar.d;
                dl dlVar = j5kVar.c;
                yz yzVarD = bzVar.d(new m43(dlVar, dlVar.c, 0, mqVar.f));
                if (yzVarD != null) {
                    j5kVar.b.remove(mqVar);
                    if (j5kVar.a(yzVarD, mqVar, null)) {
                        return;
                    }
                    yzVarD.b();
                    return;
                }
                return;
            }
        }
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        boolean z = i != 0;
        this.b.j(z);
        if (z) {
            this.h = false;
        } else {
            i iVarM = recyclerView.M(0);
            this.h = (iVarM == null || iVarM.itemView.getTop() != 0) ? true ^ recyclerView.canScrollVertically(-1) : true;
        }
    }
}
