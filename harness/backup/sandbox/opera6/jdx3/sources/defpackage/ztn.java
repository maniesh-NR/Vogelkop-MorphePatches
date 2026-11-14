package defpackage;

import androidx.fragment.app.r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.opera.android.history.g;
import com.opera.android.undo.UndoBar;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class ztn extends bca {
    public static final DateFormat m = DateFormat.getDateInstance();
    public final r a;
    public final tzi b;
    public final ga6 c;
    public final int d = 2132019245;
    public final j4c e = new j4c(new jjg(this, 15), (byte) 1);
    public final HashSet f = new HashSet();
    public wjj g = new wjj(new ArrayList());
    public final HashSet h = new HashSet();
    public DateFormat i;
    public final String j;
    public final String k;
    public RecyclerView l;

    public ztn(r rVar, tzi tziVar, ga6 ga6Var) {
        this.a = rVar;
        this.b = tziVar;
        this.c = ga6Var;
        this.i = android.text.format.DateFormat.getTimeFormat(rVar);
        this.j = rVar.getResources().getString(2132019253);
        this.k = rVar.getResources().getString(2132019254);
    }

    @Override // defpackage.bca
    public final int G() {
        return this.d;
    }

    @Override // defpackage.bca
    public final aca H(long j) {
        return (g) ((LinkedHashMap) this.g.b).get(Long.valueOf(j));
    }

    @Override // defpackage.bca
    public final j4c I() {
        return this.e;
    }

    @Override // defpackage.bca
    public final boolean J() {
        return getItemCount() == 0;
    }

    @Override // defpackage.bca
    public final void K(i iVar) {
        g gVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (iVar != null) {
            if (iVar instanceof fxn) {
                wtn wtnVar = (wtn) ((fxn) iVar).f;
                if (wtnVar == null || (recyclerView2 = this.l) == null) {
                    return;
                }
                recyclerView2.post(new fmn((Object) this, (Object) wtnVar, (byte) 2));
                return;
            }
            if (!(iVar instanceof hxn) || (gVar = (g) ((hxn) iVar).f) == null || (recyclerView = this.l) == null) {
                return;
            }
            recyclerView.post(new fmn((Object) this, (Object) gVar, (byte) 3));
        }
    }

    @Override // defpackage.bca
    public final void L(List list) {
        this.f.addAll(list);
        UndoBar undoBar = ((dda) this.c.b).B;
        if (undoBar == null) {
            undoBar = null;
        }
        undoBar.c(list);
        RecyclerView recyclerView = this.l;
        byte b = 0;
        if (recyclerView != null) {
            recyclerView.post(new ttn(this, b));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            e5d e5dVar = this.b.a;
            if (((LinkedHashSet) e5dVar.c).remove(Long.valueOf(jLongValue))) {
                e5dVar.c(jLongValue, false);
            }
        }
    }

    public final void M() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ((ArrayList) this.g.d).clear();
        int size = ((ArrayList) this.g.c).size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            List<vtn> list = (List) ((ArrayList) this.g.c).get(i);
            linkedHashMap.clear();
            boolean z = false;
            for (vtn vtnVar : list) {
                if (!this.f.contains(Long.valueOf(vtnVar.c()))) {
                    vtnVar.e();
                    String strB = vtnVar.b();
                    if (strB == null) {
                        ((ArrayList) this.g.d).add(vtnVar);
                    } else {
                        vtn vtnVar2 = (vtn) linkedHashMap.get(strB);
                        if (vtnVar2 == null) {
                            ((ArrayList) this.g.d).add(vtnVar);
                            linkedHashMap.put(strB, vtnVar);
                        } else if (vtnVar2 instanceof wtn) {
                            ((wtn) vtnVar2).f(vtnVar);
                        } else {
                            wtn wtnVar = new wtn(vtnVar.b(), i);
                            wtnVar.f(vtnVar2);
                            wtnVar.f(vtnVar);
                            linkedHashMap.put(strB, wtnVar);
                            if (this.h.contains(Long.valueOf(wtnVar.c()))) {
                                wtnVar.e = true;
                            }
                            ArrayList arrayList = (ArrayList) this.g.d;
                            arrayList.set(arrayList.indexOf(vtnVar2), wtnVar);
                        }
                        z = true;
                    }
                }
            }
            if (!z) {
                ArrayList arrayList2 = (ArrayList) this.g.d;
                arrayList2.remove(arrayList2.size() - 1);
            }
        }
        while (size2 < ((ArrayList) this.g.d).size()) {
            vtn vtnVar3 = (vtn) ((ArrayList) this.g.d).get(size2);
            if (vtnVar3 instanceof wtn) {
                wtn wtnVar2 = (wtn) vtnVar3;
                ArrayList arrayList3 = wtnVar2.f;
                if (wtnVar2.e) {
                    ((ArrayList) this.g.d).addAll(size2 + 1, arrayList3);
                    size2 += arrayList3.size();
                }
            }
            size2++;
        }
        notifyDataSetChanged();
        if (J()) {
            tzi tziVar = this.b;
            if (tziVar.g) {
                tziVar.d();
            }
        }
    }

    public final int getItemCount() {
        return ((ArrayList) this.g.d).size();
    }

    public final long getItemId(int i) {
        return ((vtn) ((ArrayList) this.g.d).get(i)).c();
    }

    public final int getItemViewType(int i) {
        return ((vtn) ((ArrayList) this.g.d).get(i)).d().ordinal();
    }

    @Override // defpackage.bca
    public final boolean n(i iVar) {
        int itemViewType = iVar.getItemViewType();
        utn utnVar = utn.a;
        return itemViewType != 0;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.m(new qic(recyclerView.getContext()));
        recyclerView.m(new gj8(recyclerView.getContext()));
        this.l = recyclerView;
    }

    public final void onBindViewHolder(i iVar, int i) {
        ((jxn) iVar).j0((vtn) ((ArrayList) this.g.d).get(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0082 A[PHI: r3
      0x0082: PHI (r3v11 int) = (r3v10 int), (r3v12 int), (r3v13 int), (r3v14 int), (r3v15 int) binds: [B:9:0x003a, B:11:0x0046, B:13:0x0052, B:15:0x005e, B:17:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee A[PHI: r3
      0x00ee: PHI (r3v3 int) = (r3v2 int), (r3v4 int), (r3v5 int), (r3v6 int), (r3v7 int) binds: [B:26:0x00a6, B:28:0x00b2, B:30:0x00be, B:32:0x00ca, B:34:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.i onCreateViewHolder(android.view.ViewGroup r18, int r19) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztn.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.i");
    }

    public final void onViewRecycled(i iVar) {
        ((jxn) iVar).e0();
    }
}
