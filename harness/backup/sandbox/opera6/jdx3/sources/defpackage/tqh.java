package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.browser.OperaPageRootView;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tqh implements knf {
    public final pde a;
    public final shf b;
    public final String c;
    public final OperaPageRootView d;
    public final ScrollView e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaListItem] */
    public tqh(BrowserActivity browserActivity, pde pdeVar, String str) {
        this.a = pdeVar;
        this.c = str;
        View viewInflate = browserActivity.getLayoutInflater().inflate(2131559269, (ViewGroup) null, false);
        ScrollView scrollView = (ScrollView) q9n.y(2131362409, viewInflate);
        this.e = scrollView;
        OperaPageRootView operaPageRootView = (OperaPageRootView) viewInflate;
        this.d = operaPageRootView;
        this.b = new shf(pdeVar, scrollView);
        Object objFindViewById = operaPageRootView.findViewById(2131364284);
        Objects.requireNonNull(objFindViewById);
        ?? r3 = (OperaListItem) objFindViewById;
        Context context = r3.getContext();
        String[] strArr = OperaApplication.K;
        gc7 gc7VarL = ((OperaApplication) context.getApplicationContext()).l();
        r3.C(new qxh(gc7VarL.a() + ", " + ((fc7) gc7VarL.b.get()).c));
        if (etg.b(operaPageRootView.getContext()) != null) {
            Object objFindViewById2 = operaPageRootView.findViewById(2131364328);
            Objects.requireNonNull(objFindViewById2);
            OperaListItem operaListItem = (OperaListItem) objFindViewById2;
            StringBuilder sb = new StringBuilder();
            sb.append(etg.b(operaPageRootView.getContext()));
            sb.append(", ");
            Context context2 = operaPageRootView.getContext();
            nx1 nx1Var = etg.a;
            ctg ctgVar = (ctg) nx1Var.d(context2);
            sb.append(ctgVar != null ? ctgVar.b : null);
            sb.append(", ");
            ctg ctgVar2 = (ctg) nx1Var.d(operaPageRootView.getContext());
            sb.append(ctgVar2 != null ? ctgVar2.c : null);
            v0g.m(operaListItem, sb.toString());
        }
        Object objFindViewById3 = operaPageRootView.findViewById(2131364281);
        Objects.requireNonNull(objFindViewById3);
        Context context3 = operaPageRootView.getContext();
        hs3.a.getClass();
        ((OperaListItem) objFindViewById3).C(new qxh(n9a.t(context3)));
        Object objFindViewById4 = operaPageRootView.findViewById(2131364302);
        Objects.requireNonNull(objFindViewById4);
        OperaListItem operaListItem2 = (OperaListItem) objFindViewById4;
        String strG = vtp.G(1, operaPageRootView.getContext());
        operaListItem2.C(strG != null ? new qxh(strG) : null);
        operaListItem2.setOnClickListener(new n42((byte) 4));
    }

    @Override // defpackage.knf
    public final ikc B() {
        return this.a;
    }

    @Override // defpackage.knf
    public final void E() {
    }

    @Override // defpackage.knf
    public final void F() {
    }

    @Override // defpackage.knf
    public final void a() {
    }

    @Override // defpackage.knf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.knf
    public final void d() {
    }

    @Override // defpackage.knf
    public final void e() {
    }

    @Override // defpackage.knf
    public final String getUrl() {
        return this.c;
    }

    @Override // defpackage.knf
    public final OperaPageRootView getView() {
        return this.d;
    }

    @Override // defpackage.knf
    public final String n() {
        return "ReferrerPage";
    }

    @Override // defpackage.knf
    public final void o() {
        this.e.smoothScrollBy(0, 0);
    }

    @Override // defpackage.knf
    public final void q() {
        this.e.scrollTo(0, 0);
    }

    @Override // defpackage.knf
    public final void r() {
        shf shfVar = this.b;
        ScrollView scrollView = (ScrollView) shfVar.b;
        if (scrollView.isAttachedToWindow()) {
            return;
        }
        mnf mnfVar = (mnf) ((pde) shfVar.a).g();
        scrollView.setPadding(scrollView.getPaddingLeft(), mnfVar.a, scrollView.getPaddingRight(), mnfVar.b);
    }

    @Override // defpackage.knf
    public final void u() {
    }

    @Override // defpackage.knf
    public final boolean w() {
        return false;
    }

    @Override // defpackage.knf
    public final void y() {
    }

    @Override // defpackage.knf
    public final String z() {
        return "opera://referrer";
    }
}
