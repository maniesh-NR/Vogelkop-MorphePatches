package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.material.appbar.CustomCollapsingToolbarLayout;

/* loaded from: classes.dex */
public final class e9c implements r8n {
    public final CustomCollapsingToolbarLayout a;
    public float b;
    public final /* synthetic */ f9c c;

    public e9c(f9c f9cVar, CustomCollapsingToolbarLayout customCollapsingToolbarLayout) {
        this.c = f9cVar;
        this.a = customCollapsingToolbarLayout;
    }

    @Override // defpackage.r8n
    public final void a(View view) {
        Context context = view.getContext();
        this.a.e(f03.t(2130971158, context, 2131101877));
        f9c f9cVar = this.c;
        r9i r9iVar = new r9i(f9cVar, context);
        f9cVar.u = r9iVar;
        r9iVar.W(((double) this.b) < 0.5d);
    }
}
