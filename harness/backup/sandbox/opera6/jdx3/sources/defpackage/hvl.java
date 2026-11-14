package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.opera.android.BrowserActivity;
import com.opera.android.bar.OmniBoxRoot;
import com.opera.android.bar.OmniButtonView;
import com.opera.android.bar.TopToolbarContainer;
import com.opera.android.custom_views.TabCountButton;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class hvl extends uul {
    public final int l;
    public final p3k m;
    public final k5o n;
    public final yhe o;
    public final x43 p;
    public final TabCountButton q;
    public final View r;
    public final View s;
    public final View t;
    public final ua7 u;
    public final tt3 v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.view.View, com.opera.android.custom_views.TabCountButton, java.lang.Object] */
    public hvl(pt3 pt3Var, k6l k6lVar, tt3 tt3Var, TopToolbarContainer topToolbarContainer, nwf nwfVar, ysl yslVar, v1f v1fVar, tt3 tt3Var2, BrowserActivity browserActivity, pde pdeVar) {
        super(browserActivity, pt3Var, k6lVar, tt3Var, topToolbarContainer, yslVar, pdeVar);
        this.p = new x43(yul.d);
        this.l = topToolbarContainer.getResources().getDimensionPixelSize(2131165312);
        this.m = new p3k(this.j, p3k.j);
        this.n = new k5o((ImageView) topToolbarContainer.findViewById(2131361889), v1fVar, browserActivity.getLifecycle(), new op3(nwfVar, (byte) 0));
        this.o = new yhe(topToolbarContainer.findViewById(2131364796), nwfVar, nwfVar);
        ?? r9 = (TabCountButton) topToolbarContainer.findViewById(2131364656);
        this.q = r9;
        r9.getClass();
        new shf((kze) new z61(r9).b, k6lVar, r9.k, new n6k((Object) r9, (byte) 18));
        r9.setOnClickListener(new op3(nwfVar, (byte) 2));
        byte b = 14;
        r9.setOnLongClickListener(new zt(nwfVar, b));
        svk svkVar = new svk(r9, (byte) 3);
        dll dllVarS = q9n.s(r9);
        if (dllVarS != null) {
            u8n.b(dllVarS, r9, svkVar);
        }
        svkVar.a(r9);
        View viewFindViewById = topToolbarContainer.findViewById(2131362109);
        this.r = viewFindViewById;
        View viewFindViewById2 = topToolbarContainer.findViewById(2131363022);
        this.s = viewFindViewById2;
        this.u = new ua7(nwfVar, viewFindViewById, viewFindViewById2);
        this.v = tt3Var2;
        View viewFindViewById3 = topToolbarContainer.findViewById(2131361880);
        this.t = viewFindViewById3;
        viewFindViewById3.setOnClickListener(new op3(nwfVar, (byte) 3));
        ((kze) ((w43) this.g).d).j(browserActivity, new k9(viewFindViewById3, b));
    }

    @Override // defpackage.z43
    public final void A(x43 x43Var) {
    }

    @Override // defpackage.z43
    public final void B(boolean z) {
    }

    @Override // defpackage.z43
    public final v73 b(OmniBoxRoot omniBoxRoot, ydn ydnVar, BrowserActivity browserActivity, lg lgVar, SettingsManager settingsManager, wth wthVar, in3 in3Var, k5o k5oVar, ikc ikcVar, u0a u0aVar) {
        return new fq3(omniBoxRoot, ydnVar, browserActivity, lgVar, settingsManager, wthVar, in3Var, k5oVar, ikcVar, u0aVar, (byte) 1);
    }

    @Override // defpackage.z43
    public final dbl c(Context context, wv1 wv1Var, du3 du3Var, nue nueVar, du3 du3Var2, nwf nwfVar) {
        return new dbl(context, wv1Var, du3Var, nueVar, du3Var2, this.v, (kze) ((w43) this.g).d, nwfVar);
    }

    @Override // defpackage.z43
    public final int e() {
        return this.l;
    }

    @Override // defpackage.z43
    public final ImageView f() {
        return (ImageView) this.n.b;
    }

    @Override // defpackage.z43
    public final View g(nje njeVar) {
        int iOrdinal = njeVar.ordinal();
        if (iOrdinal == 0) {
            View view = this.r;
            if (view.getVisibility() == 0) {
                return view;
            }
        } else if (iOrdinal == 1) {
            View view2 = this.s;
            if (view2.getVisibility() == 0) {
                return view2;
            }
        } else {
            if (iOrdinal != 2) {
                throw new RuntimeException(null, null);
            }
            View view3 = this.t;
            if (view3.getVisibility() == 0) {
                return view3;
            }
        }
        return null;
    }

    @Override // defpackage.z43
    public final View h() {
        return (View) this.o.b;
    }

    @Override // defpackage.z43
    public final bp i() {
        OmniButtonView omniButtonViewQ = ((gbf) this.i).q();
        if (omniButtonViewQ == null || omniButtonViewQ.getResources().getConfiguration().smallestScreenWidthDp < 600) {
            return null;
        }
        return new bp(omniButtonViewQ, -fan.a(5.0f, omniButtonViewQ.getResources()));
    }

    @Override // defpackage.z43
    public final long j() {
        return 0L;
    }

    @Override // defpackage.z43
    public final x43 k() {
        return this.p;
    }

    @Override // defpackage.z43
    public final View l() {
        return this.q;
    }

    @Override // defpackage.z43
    public final boolean n() {
        return false;
    }

    @Override // defpackage.z43
    public final void w(boolean z) {
        bn8 bn8Var = this.m.a.d;
        if (bn8Var.f == z) {
            return;
        }
        bn8Var.f = z;
        bn8Var.k.invalidate();
    }

    @Override // defpackage.uul, defpackage.z43
    public final void z(b2l b2lVar) {
        super.z(b2lVar);
        ua7 ua7Var = this.u;
        d7l d7lVar = (d7l) b2lVar;
        ((View) ua7Var.c).setEnabled(d7lVar.f());
        ((View) ua7Var.d).setEnabled(d7lVar.n());
    }
}
