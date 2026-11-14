package defpackage;

import android.content.res.Resources;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.opera.android.custom_views.LayoutDirectionViewPager;

/* loaded from: classes.dex */
public final class sue extends uue implements ya2 {
    public final rue p;
    public final LayoutDirectionViewPager q;
    public final TextView r;
    public final ImageView s;
    public final ImageView t;

    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View, androidx.viewpager.widget.ViewPager, com.opera.android.custom_views.LayoutDirectionViewPager] */
    public sue(View view, uqe uqeVar, vue vueVar, vue vueVar2, dmg dmgVar, rl3 rl3Var, p0c p0cVar) {
        super(view, new r9i(uqeVar, vueVar, vueVar2, dmgVar, (byte) 22), rl3Var, p0cVar);
        rue rueVar = new rue(this);
        this.p = rueVar;
        ?? r9 = (LayoutDirectionViewPager) view.findViewById(2131362907);
        this.q = r9;
        r9.setAdapter(rueVar);
        r9.addOnPageChangeListener(new r2c(r9, new r93(this, (byte) 1)));
        r9.setOnTouchListener(new vfe(new GestureDetector(r9.getContext(), new v35(this, (byte) 5)), (byte) 1));
        this.r = (TextView) view.findViewById(2131362909);
        TabLayout tabLayoutFindViewById = view.findViewById(2131362910);
        this.s = (ImageView) view.findViewById(2131362912);
        this.t = (ImageView) view.findViewById(2131362913);
        tabLayoutFindViewById.m((ViewPager) r9, false);
    }

    @Override // defpackage.ya2
    public final void R() {
        j82 j82Var = (j82) a0();
        boolean zD = j82Var.d();
        ViewPager viewPager = this.q;
        if (!zD) {
            viewPager.setCurrentItem(cs5.W(viewPager) ? this.p.getCount() - 1 : 0);
            return;
        }
        SparseArray<Parcelable> sparseArray = j82Var.a;
        j82Var.a = null;
        viewPager.restoreHierarchyState(sparseArray);
    }

    @Override // defpackage.uue, defpackage.gu8, defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) throws Resources.NotFoundException {
        super.V(ja2Var, z);
        if (z) {
            return;
        }
        this.p.notifyDataSetChanged();
        R();
        x0(this.q.q());
    }

    @Override // defpackage.uue, defpackage.gu8, defpackage.ab2
    public final void Y() {
        super.Y();
        t();
        deg degVar = yne.b;
        degVar.c(this.s);
        degVar.c(this.t);
    }

    @Override // defpackage.uue, defpackage.gu8
    public final oqe e0() {
        return (jre) super.m0();
    }

    @Override // defpackage.gu8
    public final int f0() {
        return 2131362911;
    }

    @Override // defpackage.gu8
    public final void j0() {
    }

    @Override // defpackage.uue
    public final msh m0() {
        return (jre) super.m0();
    }

    @Override // defpackage.ya2
    public final void t() {
        SparseArray<Parcelable> u0gVar = new u0g<>();
        this.q.saveHierarchyState(u0gVar);
        ((j82) a0()).a = u0gVar;
    }

    public final jre w0() {
        return (jre) super.m0();
    }

    public final void x0(int i) {
        TextView textView = this.r;
        textView.setText(textView.getContext().getString(2132019030, Integer.valueOf(i + 1), Integer.valueOf(this.p.getCount())));
    }
}
