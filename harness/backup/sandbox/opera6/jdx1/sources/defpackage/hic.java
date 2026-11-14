package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class hic extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ iic b;

    public hic(iic iicVar) {
        this.b = iicVar;
        a();
    }

    public final void a() {
        itd itdVar = this.b.c;
        ptd ptdVar = itdVar.w;
        if (ptdVar != null) {
            itdVar.i();
            ArrayList arrayList = itdVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((ptd) arrayList.get(i)) == ptdVar) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ptd getItem(int i) {
        itd itdVar = this.b.c;
        itdVar.i();
        ArrayList arrayList = itdVar.j;
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (ptd) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        itd itdVar = this.b.c;
        itdVar.i();
        int size = itdVar.j.size();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.b.inflate(2131558416, viewGroup, false);
        }
        ((pud) view).d(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
