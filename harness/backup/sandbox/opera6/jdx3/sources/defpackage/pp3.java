package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.opera.android.BrowserActivity;
import com.opera.android.bar.BottomBar;
import com.opera.android.custom_views.TabCountButton;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class pp3 extends z43 {
    public final BottomBar j;
    public final x43 k;
    public final p3k l;
    public final k5o m;
    public final yhe n;
    public final TabCountButton o;
    public final View p;
    public final View q;
    public final View r;
    public final ua7 s;
    public final esk t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.view.View, com.opera.android.custom_views.TabCountButton, java.lang.Object] */
    public pp3(pt3 pt3Var, k6l k6lVar, esk eskVar, ViewGroup viewGroup, BottomBar bottomBar, nwf nwfVar, ysl yslVar, v1f v1fVar, esk eskVar2, BrowserActivity browserActivity, pde pdeVar, Set set) {
        super(browserActivity, pt3Var, k6lVar, eskVar, viewGroup, yslVar, pdeVar);
        this.k = new x43(yul.d);
        this.j = bottomBar;
        this.l = new p3k(viewGroup, set);
        this.m = new k5o((ImageView) viewGroup.findViewById(2131361889), v1fVar, browserActivity.getLifecycle(), new op3(nwfVar, (byte) 0));
        this.n = new yhe(viewGroup.findViewById(2131364796), nwfVar, nwfVar);
        ?? r9 = (TabCountButton) viewGroup.findViewById(2131364656);
        this.o = r9;
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
        View viewFindViewById = viewGroup.findViewById(2131362109);
        this.p = viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(2131363022);
        this.q = viewFindViewById2;
        this.s = new ua7(nwfVar, viewFindViewById, viewFindViewById2);
        this.t = eskVar2;
        View viewFindViewById3 = viewGroup.findViewById(2131361880);
        this.r = viewFindViewById3;
        viewFindViewById3.setOnClickListener(new op3(nwfVar, (byte) 1));
        ((kze) ((w43) this.g).d).j(browserActivity, new k9(viewFindViewById3, b));
    }

    @Override // defpackage.z43
    public final jm7 a() {
        return new jm7(false, 1);
    }

    @Override // defpackage.z43
    public final dbl c(Context context, wv1 wv1Var, du3 du3Var, nue nueVar, du3 du3Var2, nwf nwfVar) {
        return new dbl(context, wv1Var, du3Var, nueVar, du3Var2, this.t, (kze) ((w43) this.g).d, nwfVar);
    }

    @Override // defpackage.z43
    public final ImageView f() {
        return (ImageView) this.m.b;
    }

    @Override // defpackage.z43
    public final View g(nje njeVar) {
        int iOrdinal = njeVar.ordinal();
        if (iOrdinal == 0) {
            View view = this.p;
            if (view.getVisibility() == 0) {
                return view;
            }
        } else if (iOrdinal == 1) {
            View view2 = this.q;
            if (view2.getVisibility() == 0) {
                return view2;
            }
        } else {
            if (iOrdinal != 2) {
                throw new RuntimeException(null, null);
            }
            View view3 = this.r;
            if (view3.getVisibility() == 0) {
                return view3;
            }
        }
        return null;
    }

    @Override // defpackage.z43
    public final View h() {
        return (View) this.n.b;
    }

    @Override // defpackage.z43
    public final x43 k() {
        return this.k;
    }

    @Override // defpackage.z43
    public final View l() {
        return this.o;
    }

    @Override // defpackage.z43
    public final boolean p() {
        return true;
    }

    @Override // defpackage.z43
    public final boolean q() {
        return this.j.f() == 0;
    }

    @Override // defpackage.z43
    public final void w(boolean z) {
        bn8 bn8Var = this.l.a.d;
        if (bn8Var.f == z) {
            return;
        }
        bn8Var.f = z;
        bn8Var.k.invalidate();
    }

    @Override // defpackage.z43
    public final void z(b2l b2lVar) {
        ua7 ua7Var = this.s;
        d7l d7lVar = (d7l) b2lVar;
        ((View) ua7Var.c).setEnabled(d7lVar.f());
        ((View) ua7Var.d).setEnabled(d7lVar.n());
    }
}
