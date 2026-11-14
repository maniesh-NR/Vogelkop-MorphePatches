package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class etd extends BaseAdapter {
    public final itd a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public etd(itd itdVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = itdVar;
        this.f = i;
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
        ArrayList arrayListL;
        boolean z = this.d;
        itd itdVar = this.a;
        if (z) {
            itdVar.i();
            arrayListL = itdVar.j;
        } else {
            arrayListL = itdVar.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (ptd) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z = this.d;
        itd itdVar = this.a;
        if (z) {
            itdVar.i();
            arrayListL = itdVar.j;
        } else {
            arrayListL = itdVar.l();
        }
        return this.b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        boolean z = this.a.m() && i2 != (i3 >= 0 ? getItem(i3).b : i2);
        ImageView imageView = listMenuItemView.h;
        if (imageView != null) {
            imageView.setVisibility((listMenuItemView.o || !z) ? 8 : 0);
        }
        pud pudVar = (pud) view;
        if (this.c) {
            listMenuItemView.q = true;
            listMenuItemView.m = true;
        }
        pudVar.d(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
