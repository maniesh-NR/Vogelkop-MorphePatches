package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.custom_views.LayoutDirectionViewPager;
import com.opera.android.custom_views.PageDotIndicator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class xwe extends k24 {
    public LayoutDirectionViewPager f;
    public vwe g;
    public ghf h;
    public tni i;
    public final boolean j;
    public final gjm k;
    public boolean l;
    public final it3 m = new it3(this, 1);

    public xwe(boolean z, gjm gjmVar) {
        this.j = z;
        this.k = gjmVar;
    }

    public final void dismiss() {
        g0();
    }

    @Override // defpackage.ryl
    public final void g0() {
        super.g0();
        Context context = getContext();
        String[] strArr = OperaApplication.K;
        x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
        vb0 vb0Var = this.l ? vb0.b : vb0.d;
        LayoutDirectionViewPager layoutDirectionViewPager = this.f;
        int currentItem = layoutDirectionViewPager == null ? 0 : layoutDirectionViewPager.getCurrentItem();
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            pj0 pj0Var = new pj0(2443, -1, 2);
            pj0Var.q(0, 1, vb0Var);
            pj0Var.p(1, 1, currentItem);
            qd0 qd0VarB = x56VarF.B(zpaVar);
            List list = (List) qd0VarB.n(33);
            ((list == null || list.isEmpty()) ? new hf0(qd0VarB, 33, vep.t(qd0VarB, 33, 1)) : new hf0(qd0VarB, 33, list)).add(pj0Var);
            x5fVar.U0(x56VarF);
        }
    }

    @Override // defpackage.k24
    public final View n0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (!this.j) {
            return layoutInflater.inflate(2131559143, viewGroup, false);
        }
        View viewInflate = layoutInflater.inflate(2131559145, viewGroup, false);
        WeakHashMap weakHashMap = r5n.a;
        ((View) m5n.f(viewInflate, 2131362544)).setOnClickListener(new twe(this, (byte) 2));
        return viewInflate;
    }

    @Override // defpackage.k24
    public final void onAttach(Context context) {
        super.onAttach(context);
        BrowserActivity activity = getActivity();
        int i = BrowserActivity.E1;
        tni tniVar = activity.l;
        this.i = tniVar;
        tniVar.a(this.m);
    }

    @Override // defpackage.k24
    public final void onDetach() {
        super.onDetach();
        tni tniVar = this.i;
        if (tniVar != null) {
            tniVar.c(this.m);
            this.i = null;
        }
    }

    @Override // defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) ((View) m5n.f(view, 2131363689));
        textView.setOnClickListener(new twe(this, (byte) 0));
        ((View) m5n.f(view, 2131364482)).setOnClickListener(new twe(this, (byte) 1));
        this.g = new vwe(this);
        LayoutDirectionViewPager layoutDirectionViewPager = (LayoutDirectionViewPager) ((View) m5n.f(view, 2131365011));
        this.f = layoutDirectionViewPager;
        layoutDirectionViewPager.setAdapter(this.g);
        this.f.addOnPageChangeListener(new uwe(this, textView));
        this.h = new ghf(this.f, ye1.a);
        PageDotIndicator pageDotIndicator = (PageDotIndicator) ((View) m5n.f(view, 2131365010));
        LayoutDirectionViewPager layoutDirectionViewPager2 = this.f;
        pageDotIndicator.b = layoutDirectionViewPager2;
        wwf wwfVar = pageDotIndicator.a;
        wwfVar.getClass();
        layoutDirectionViewPager2.addOnPageChangeListener(wwfVar);
        layoutDirectionViewPager2.getAdapter().registerDataSetObserver(new l46(wwfVar, (byte) 3));
        int currentItem = layoutDirectionViewPager2.getCurrentItem();
        wwfVar.b = currentItem;
        wwfVar.c = currentItem;
        wwfVar.a.m();
    }
}
