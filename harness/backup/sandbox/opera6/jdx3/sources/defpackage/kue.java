package defpackage;

import android.view.View;
import com.opera.android.custom_views.FadingRecyclerView;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.feed.FeedViewPager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class kue {
    public int a;
    public final FadingRecyclerView b;
    public final View c;
    public final LayoutDirectionLinearLayout d;
    public final x93 e;
    public List f;
    public z4k g;
    public final HashSet h;
    public final jue i;
    public final jue j;
    public final List k;
    public boolean l;

    /* JADX WARN: Type inference failed for: r1v11, types: [android.view.View, androidx.recyclerview.widget.RecyclerView, com.opera.android.custom_views.FadingRecyclerView] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public kue(View view, LayoutDirectionLinearLayout layoutDirectionLinearLayout) {
        x93 x93Var = new x93((Object) this, (byte) 4);
        this.e = x93Var;
        this.f = new ArrayList();
        this.h = new HashSet();
        jue jueVar = new jue(this, new rqd((byte) 20));
        this.i = jueVar;
        jue jueVar2 = new jue(this, new rqd((byte) 21));
        this.j = jueVar2;
        this.k = Collections.unmodifiableList(nb6.K(new jue[]{jueVar, jueVar2}));
        this.c = view;
        this.d = layoutDirectionLinearLayout;
        l2c l2cVar = layoutDirectionLinearLayout.a;
        l2cVar.d(0);
        this.l = l2cVar.b();
        ?? r1 = (FadingRecyclerView) view.findViewById(2131363684);
        this.b = r1;
        r1.y0(x93Var);
        r1.setHorizontalFadingEdgeEnabled(true);
        ?? r8 = (StylingImageView) view.findViewById(2131363685);
        int iH = z7h.h(layoutDirectionLinearLayout.getContext(), 48.0f);
        uuj uujVar = new uuj();
        uujVar.a = iH;
        xh5 xh5Var = new xh5(new View(layoutDirectionLinearLayout.getContext()));
        uujVar.b = xh5Var;
        uujVar.c = new ArrayList();
        layoutDirectionLinearLayout.setTouchDelegate(xh5Var);
        layoutDirectionLinearLayout.addOnLayoutChangeListener(new z22(uujVar, (byte) 17));
        wwl wwlVar = new wwl(r8);
        ((ArrayList) uujVar.c).add(wwlVar);
        xh5 xh5Var2 = (xh5) uujVar.b;
        xh5Var2.a.add(wwlVar.c);
        r1.getContext();
        r1.C0(new dge(0, false));
        r8.setOnClickListener(new zvd(this, (byte) 1));
    }

    public final void a(int i) {
        int i2 = this.a;
        z4k z4kVar = this.g;
        if (i == i2) {
            c5k c5kVar = (c5k) z4kVar.b;
            c5kVar.f();
            xw8 xw8VarB = c5kVar.b();
            if (xw8VarB != null) {
                xw8VarB.g();
                return;
            }
            return;
        }
        c5k c5kVar2 = (c5k) z4kVar.b;
        List listE = c5kVar2.y.e();
        if ((listE.size() > i ? (bwf) listE.get(i) : null) != null) {
            FeedViewPager feedViewPager = c5kVar2.B;
            feedViewPager.setCurrentItem(feedViewPager.r(i), true);
        }
        ((c5k) this.g.b).f();
    }

    public final void b(int i, boolean z) {
        int i2 = this.a;
        if (i2 == i) {
            return;
        }
        this.a = i;
        FadingRecyclerView fadingRecyclerView = this.b;
        if (z) {
            fadingRecyclerView.H0(i);
        } else {
            fadingRecyclerView.x0(i);
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            hue hueVar = (hue) it.next();
            int adapterPosition = hueVar.getAdapterPosition();
            if (adapterPosition != -1) {
                hueVar.c.setSelected(adapterPosition == hueVar.b.a);
            }
        }
        x93 x93Var = this.e;
        x93Var.notifyItemChanged(i2);
        x93Var.notifyItemChanged(this.a);
    }
}
