package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.undo.UndoBar;
import com.opera.android.widget.SelectableRelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class jy0 extends bca {
    public final tzi a;
    public final nv6 b;
    public final int c = 2132017403;
    public final j4c d = new j4c(new vx(this, 1), (byte) 1);
    public final LinkedHashSet e = new LinkedHashSet();
    public wjh f = new wjh((List) l08.a);
    public final String g;
    public final String h;
    public final String i;
    public RecyclerView j;

    public jy0(r rVar, tzi tziVar, nv6 nv6Var) {
        this.a = tziVar;
        this.b = nv6Var;
        this.g = rVar.getString(2132019253);
        this.h = rVar.getString(2132019254);
        this.i = rVar.getString(2132019251);
    }

    @Override // defpackage.bca
    public final int G() {
        return this.c;
    }

    @Override // defpackage.bca
    public final aca H(long j) {
        return (gy0) ((LinkedHashMap) this.f.b).get(Long.valueOf(j));
    }

    @Override // defpackage.bca
    public final j4c I() {
        return this.d;
    }

    @Override // defpackage.bca
    public final boolean J() {
        return getItemCount() == 0;
    }

    @Override // defpackage.bca
    public final void K(i iVar) {
        gy0 gy0Var;
        RecyclerView recyclerView;
        if (!(iVar instanceof qy0) || (gy0Var = (gy0) ((qy0) iVar).f) == null || (recyclerView = this.j) == null) {
            return;
        }
        recyclerView.post(new xa(this, gy0Var, (byte) 10));
    }

    @Override // defpackage.bca
    public final void L(List list) {
        this.e.addAll(list);
        UndoBar undoBar = ((dda) this.b.a).D;
        if (undoBar == null) {
            undoBar = null;
        }
        undoBar.c(list);
        RecyclerView recyclerView = this.j;
        if (recyclerView != null) {
            recyclerView.post(new c4(this, (byte) 17));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            e5d e5dVar = this.a.a;
            if (((LinkedHashSet) e5dVar.c).remove(Long.valueOf(jLongValue))) {
                e5dVar.c(jLongValue, false);
            }
        }
    }

    public final void M() {
        LinkedHashSet linkedHashSet;
        ((ArrayList) this.f.c).clear();
        ArrayList arrayList = (ArrayList) this.f.d;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            linkedHashSet = this.e;
            if (i2 >= size) {
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (!linkedHashSet.contains(Long.valueOf(((fy0) obj).b()))) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            ((ArrayList) this.f.c).add(new hy0(this.g));
            ((ArrayList) this.f.c).addAll(arrayList2);
        }
        ArrayList arrayList3 = (ArrayList) this.f.e;
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList3.get(i3);
            i3++;
            if (!linkedHashSet.contains(Long.valueOf(((fy0) obj2).b()))) {
                arrayList4.add(obj2);
            }
        }
        if (!arrayList4.isEmpty()) {
            ((ArrayList) this.f.c).add(new hy0(this.h));
            ((ArrayList) this.f.c).addAll(arrayList4);
        }
        ArrayList arrayList5 = (ArrayList) this.f.f;
        ArrayList arrayList6 = new ArrayList();
        int size3 = arrayList5.size();
        while (i < size3) {
            Object obj3 = arrayList5.get(i);
            i++;
            if (!linkedHashSet.contains(Long.valueOf(((fy0) obj3).b()))) {
                arrayList6.add(obj3);
            }
        }
        if (!arrayList6.isEmpty()) {
            ((ArrayList) this.f.c).add(new hy0(this.i));
            ((ArrayList) this.f.c).addAll(arrayList6);
        }
        notifyDataSetChanged();
        if (J()) {
            tzi tziVar = this.a;
            if (tziVar.g) {
                tziVar.d();
            }
        }
    }

    public final int getItemCount() {
        return ((ArrayList) this.f.c).size();
    }

    public final long getItemId(int i) {
        return ((fy0) ((ArrayList) this.f.c).get(i)).b();
    }

    public final int getItemViewType(int i) {
        return ((fy0) ((ArrayList) this.f.c).get(i)).c().ordinal();
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.m(new qic(recyclerView.getContext()));
        this.j = recyclerView;
    }

    public final void onBindViewHolder(i iVar, int i) {
        ((sy0) iVar).j0((fy0) ((ArrayList) this.f.c).get(i));
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        ey0 ey0Var = ey0.a;
        tzi tziVar = this.a;
        if (i == 0) {
            return new ry0(kf.f(layoutInflaterFrom, viewGroup), tziVar);
        }
        View viewInflate = layoutInflaterFrom.inflate(2131558472, viewGroup, false);
        int i2 = 2131363256;
        StylingImageView stylingImageView = (StylingImageView) w1h.j(2131363256, viewInflate);
        if (stylingImageView != null) {
            i2 = 2131363263;
            StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363263, viewInflate);
            if (stylingTextView != null) {
                return new qy0(new ov0((SelectableRelativeLayout) viewInflate, stylingImageView, stylingTextView, (byte) 0), tziVar, this);
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    public final void onViewRecycled(i iVar) {
        ((sy0) iVar).e0();
    }
}
