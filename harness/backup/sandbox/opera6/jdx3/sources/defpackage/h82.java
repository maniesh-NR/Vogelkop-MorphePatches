package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h82 extends gze {
    @Override // defpackage.n82
    public final void Q(Uri.Builder builder) {
        builder.appendQueryParameter("exclude", "summary");
        builder.appendEncodedPath("v1/news/entry").appendEncodedPath(this.k);
    }

    @Override // defpackage.gze, defpackage.n82
    public final List T(d5o d5oVar, String str) {
        List listT = super.T(d5oVar, str);
        ArrayList arrayList = (ArrayList) listT;
        return arrayList.size() > 1 ? Collections.singletonList((oqe) arrayList.get(0)) : listT;
    }
}
