package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import com.google.android.material.button.MaterialButton;
import com.opera.android.bookmarks.ImportBookmarksBanner;
import com.opera.android.bookmarks.h;
import com.opera.android.custom_views.AnimationEmptyListView;
import com.opera.android.custom_views.OrientationFitConstraintLayout;
import com.opera.android.custom_views.StylingImageView;

/* loaded from: classes.dex */
public final class am3 extends wz7 {
    public cm3 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final om3 k;
    public final hxk l;
    public final h m;
    public final x5f n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am3(boolean z, boolean z2, boolean z3, om3 om3Var, hxk hxkVar, h hVar, x5f x5fVar) {
        super(2, 2132018053, 2131951632, 0);
        cm3 cm3Var = cm3.d;
        this.g = cm3Var;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = om3Var;
        this.l = hxkVar;
        this.m = hVar;
        this.n = x5fVar;
    }

    @Override // defpackage.wz7
    public final void G(xz7 xz7Var) {
        yl3 yl3Var = xz7Var instanceof yl3 ? (yl3) xz7Var : null;
        if (yl3Var != null) {
            wl3 wl3Var = yl3Var.b;
            pt1 pt1Var = wl3Var.a;
            yl3Var.V(this.g.b);
            yl3Var.U(this.g.a);
            int i = this.g.c;
            AnimationEmptyListView animationEmptyListView = (AnimationEmptyListView) pt1Var.e;
            if (i < -1) {
                i = -1;
            }
            animationEmptyListView.c = i;
            animationEmptyListView.a();
            ((ImportBookmarksBanner) pt1Var.f).setVisibility(this.h ? 0 : 8);
            wl3Var.b = !this.h;
            ((AnimationEmptyListView) pt1Var.e).setVisibility(wl3Var.a(wl3Var.getResources().getConfiguration()) ? 0 : 8);
            ((OrientationFitConstraintLayout) pt1Var.c).setVisibility(this.i ? 0 : 8);
            pt1Var.b.setVisibility(this.j ? 0 : 8);
        }
    }

    @Override // defpackage.wz7
    /* renamed from: H */
    public final xz7 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.a != 2) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        int i2 = wl3.c;
        Context context = viewGroup.getContext();
        int i3 = this.d;
        int i4 = this.c;
        wl3 wl3Var = new wl3(context);
        pt1 pt1Var = wl3Var.a;
        ((AnimationEmptyListView) pt1Var.e).c(i3);
        ((AnimationEmptyListView) pt1Var.e).b(i4);
        AnimationEmptyListView animationEmptyListView = (AnimationEmptyListView) pt1Var.e;
        int i5 = this.b;
        if (i5 < -1) {
            i5 = -1;
        }
        animationEmptyListView.c = i5;
        wl3Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((MaterialButton) ((ImportBookmarksBanner) pt1Var.f).a.d).setOnClickListener(new gf((Object) this, (byte) 24));
        ((StylingImageView) ((ImportBookmarksBanner) pt1Var.f).a.c).setOnClickListener(new nf(this, wl3Var, (byte) 17));
        pt1Var.g.setOnClickListener(new gf((Object) new zl3(this, (byte) 0), (byte) 22));
        pt1Var.b.setOnClickListener(new gf((Object) new zl3(this, (byte) 1), (byte) 23));
        return new yl3(wl3Var);
    }

    @Override // defpackage.wz7
    public final /* bridge */ /* synthetic */ void onBindViewHolder(i iVar, int i) {
        G((xz7) iVar);
    }
}
