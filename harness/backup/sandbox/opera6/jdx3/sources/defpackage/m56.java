package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m56 extends BaseAdapter {
    public static final Object e = new Object();
    public final itd a;
    public int b = -1;
    public boolean c;
    public final LayoutInflater d;

    public m56(itd itdVar, LayoutInflater layoutInflater) {
        this.d = layoutInflater;
        this.a = itdVar;
        a();
    }

    public final void a() {
        itd itdVar = this.a;
        ptd ptdVar = itdVar.w;
        if (ptdVar != null) {
            itdVar.i();
            ArrayList arrayList = itdVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((ptd) arrayList.get(i)) == ptdVar) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ptd getItem(int i) {
        ArrayList arrayListL = this.a.l();
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (ptd) arrayListL.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(ptd ptdVar, View view) {
        view.setId(ptdVar.a);
        view.setVisibility(ptdVar.isVisible() ? 0 : 8);
        view.setEnabled(ptdVar.isEnabled());
        Drawable background = view.getBackground();
        if (background instanceof jba) {
            ((jba) background).a(false);
        }
        if (view instanceof rtd) {
            rtd rtdVar = (rtd) view;
            if (this.c) {
                rtdVar.a();
            }
            rtdVar.c(ptdVar);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.b < 0 ? this.a.l().size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ptd item = getItem(i);
        ff ffVarZ = item != null ? item.z() : null;
        if (ffVarZ != null) {
            View viewD = ffVarZ.d(item);
            if (!(viewGroup instanceof FrameLayout) && (layoutParams2 = viewD.getLayoutParams()) != null && !(layoutParams2 instanceof AbsListView.LayoutParams)) {
                viewD.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
            }
            return viewD;
        }
        View actionView = item.getActionView();
        if (actionView != null) {
            c(item, actionView);
            if (!(viewGroup instanceof FrameLayout) && (layoutParams = actionView.getLayoutParams()) != null && !(layoutParams instanceof AbsListView.LayoutParams)) {
                actionView.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
            }
            return actionView;
        }
        Object obj = e;
        if (view == null || view.getTag(2131364456) != obj) {
            view = this.d.inflate(2131558629, viewGroup, false);
            view.setTag(2131364456, obj);
        }
        c(item, view);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return getItem(i).isEnabled();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
