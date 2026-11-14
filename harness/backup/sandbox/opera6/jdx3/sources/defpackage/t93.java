package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.f;
import androidx.viewpager.widget.PagerAdapter;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class t93 extends PagerAdapter {
    public Object[] a;
    public final /* synthetic */ y93 d;
    public final HashMap c = new HashMap();
    public int b = 0;

    public t93(y93 y93Var) {
        this.d = y93Var;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        u93 u93Var = (u93) obj;
        this.c.remove(u93Var.c);
        viewGroup.removeView(u93Var.a);
        RecyclerView recyclerView = u93Var.b;
        d dVar = u93Var.e;
        if (dVar != null) {
            dVar.unregisterAdapterDataObserver(u93Var);
            u93Var.e = null;
        }
        recyclerView.y0((d) null);
        recyclerView.C0((f) null);
    }

    public final int getCount() {
        return this.b;
    }

    public final int getItemPosition(Object obj) {
        Object obj2 = ((u93) obj).c;
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return -2;
            }
            if (objArr[i].equals(obj2)) {
                return i;
            }
            i++;
        }
    }

    public final CharSequence getPageTitle(int i) {
        return this.d.K0(this.a[i]);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        Object obj = this.a[i];
        y93 y93Var = this.d;
        u93 u93VarH0 = y93Var.H0(viewGroup, obj);
        RecyclerView recyclerView = u93VarH0.b;
        recyclerView.setId(View.generateViewId());
        this.c.put(obj, u93VarH0);
        viewGroup.addView(u93VarH0.a);
        d dVarG0 = y93Var.G0(obj, u93VarH0.d);
        recyclerView.y0(dVarG0);
        recyclerView.m(new r8a(recyclerView, y93Var.I0(obj)));
        d dVar = u93VarH0.e;
        if (dVar != null) {
            dVar.unregisterAdapterDataObserver(u93VarH0);
        }
        u93VarH0.e = dVarG0;
        dVarG0.registerAdapterDataObserver(u93VarH0);
        return u93VarH0;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == ((u93) obj).a;
    }

    public final void notifyDataSetChanged() {
        y93 y93Var = this.d;
        Object[] objArrL0 = y93Var.L0();
        this.a = objArrL0;
        this.b = objArrL0.length;
        for (Object obj : objArrL0) {
            u93 u93Var = (u93) this.c.get(obj);
            if (u93Var != null) {
                RecyclerView recyclerView = u93Var.b;
                d dVarG0 = y93Var.G0(obj, u93Var.d);
                recyclerView.M0(dVarG0, false);
                r8a r8aVar = (r8a) recyclerView.X(0);
                r8aVar.b = y93Var.I0(obj);
                r8aVar.e = null;
                r8aVar.a.a0();
                d dVar = u93Var.e;
                if (dVar != null) {
                    dVar.unregisterAdapterDataObserver(u93Var);
                }
                u93Var.e = dVarG0;
                dVarG0.registerAdapterDataObserver(u93Var);
            }
        }
        super.notifyDataSetChanged();
    }
}
