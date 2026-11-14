package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.leanplum.internal.Constants;

/* loaded from: classes.dex */
public final class psh extends gze {
    public final String l;
    public final String m;
    public final boolean n;

    public psh(Context context, ywh ywhVar, qtm qtmVar, String str, String str2, String str3, qre qreVar, uy8 uy8Var, boolean z) {
        super(context, ywhVar, qreVar, qtmVar, uy8Var, str);
        this.l = str3;
        this.m = str2;
        this.n = z;
    }

    @Override // defpackage.n82
    public final void Q(Uri.Builder builder) {
        builder.appendQueryParameter("exclude", "summary");
        builder.appendEncodedPath("v1/related").appendEncodedPath(this.k);
        String str = this.l;
        if (!TextUtils.isEmpty(str)) {
            builder.appendQueryParameter(Constants.Params.TYPE, str);
        }
        builder.appendQueryParameter("refer_reqid", this.m);
        if (this.n) {
            builder.appendQueryParameter("referrer", "push");
        }
    }
}
