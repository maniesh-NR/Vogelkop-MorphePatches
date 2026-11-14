package defpackage;

import android.net.Uri;
import android.os.Parcelable;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class ilk implements lnf {
    public final BrowserActivity a;
    public final pde b;
    public final ebh c;

    public ilk(BrowserActivity browserActivity, pde pdeVar, ebh ebhVar) {
        this.a = browserActivity;
        this.b = pdeVar;
        this.c = ebhVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.app.Activity, android.content.Context, com.opera.android.BrowserActivity] */
    @Override // defpackage.lnf
    public final knf a(Uri uri, boolean z, Parcelable parcelable) {
        String[] strArr = OperaApplication.K;
        ?? r1 = this.a;
        OperaApplication operaApplication = (OperaApplication) r1.getApplication();
        return new hlk(r1, this.b, uri.toString(), operaApplication.M(), operaApplication.R(), operaApplication.c(), operaApplication.D(), this.c, operaApplication.E(), ru9.c(r1));
    }
}
