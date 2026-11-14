package defpackage;

import android.content.Context;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final /* synthetic */ class jte implements h93, ivc, vlf {
    public final /* synthetic */ pte a;

    public /* synthetic */ jte(pte pteVar) {
        this.a = pteVar;
    }

    @Override // defpackage.ivc
    public final void b(bre breVar) {
        pte pteVar = this.a;
        pteVar.H0();
        Context contextRequireContext = pteVar.requireContext();
        String[] strArr = OperaApplication.K;
        ((OperaApplication) contextRequireContext.getApplicationContext()).y().c().m.h(breVar);
    }

    @Override // defpackage.h93
    public final void s() {
        BrowserActivity browserActivityO = q9n.o(this.a.requireContext());
        d8j d8jVar = browserActivityO != null ? (d8j) browserActivityO.g0.E(d8j.class) : null;
        if (d8jVar != null) {
            ((g8j) d8jVar).h();
        }
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        pte pteVar = this.a;
        if (!z) {
            ((x5f) pteVar.u).h0(fc0.c);
        }
        Context contextRequireContext = pteVar.requireContext();
        String[] strArr = OperaApplication.K;
        ((OperaApplication) contextRequireContext.getApplicationContext()).J().V(z ? 1 : 0, "enable_newsfeed");
    }
}
