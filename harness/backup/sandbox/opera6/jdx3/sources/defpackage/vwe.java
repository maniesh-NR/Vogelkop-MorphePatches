package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.PagerAdapter;
import com.opera.android.custom_views.ContentWrapperLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class vwe extends PagerAdapter {
    public final sv2[] a;
    public final sv2[] b;
    public final sv2[] c;
    public sv2[] d;
    public final /* synthetic */ xwe e;

    public vwe(xwe xweVar) {
        this.e = xweVar;
        sv2[] sv2VarArr = {new sv2(2131559147, 2131232652, 2131363694), new sv2(2131559147, 2131232654, 2131363696), new sv2(2131559147, 2131232653, 2131363695)};
        this.a = sv2VarArr;
        this.b = new sv2[]{new sv2(2131559146, 2131232652, 2131363694), new sv2(2131559146, 2131232654, 2131363696), new sv2(2131559146, 2131232653, 2131363695)};
        this.c = new sv2[]{new sv2(2131559148, 2131232652, 2131363694), new sv2(2131559148, 2131232654, 2131363696), new sv2(2131559148, 2131232653, 2131363695)};
        this.d = sv2VarArr;
        a();
    }

    public final void a() {
        xwe xweVar = this.e;
        sv2[] sv2VarArr = xweVar.j ? this.c : xweVar.i.b ? this.a : this.b;
        if (sv2VarArr == this.d) {
            return;
        }
        this.d = sv2VarArr;
        notifyDataSetChanged();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView(((wwe) obj).a);
    }

    public final int getCount() {
        return this.d.length;
    }

    public final int getItemPosition(Object obj) {
        return ((wwe) obj).b == this.d ? -1 : -2;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        sv2 sv2Var = this.d[i];
        sv2Var.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(sv2Var.a, viewGroup, false);
        WeakHashMap weakHashMap = r5n.a;
        ((ImageView) ((View) m5n.f(viewInflate, 2131363183))).setImageResource(sv2Var.b);
        ContentWrapperLayout contentWrapperLayout = (ContentWrapperLayout) ((View) m5n.f(viewInflate, 2131362423));
        int i2 = sv2Var.c;
        for (int i3 = 0; i3 < contentWrapperLayout.getChildCount(); i3++) {
            View childAt = contentWrapperLayout.getChildAt(i3);
            childAt.setVisibility(childAt.getId() == i2 ? 0 : 4);
        }
        viewGroup.addView(viewInflate);
        return new wwe(viewInflate, this.d);
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == ((wwe) obj).a;
    }
}
