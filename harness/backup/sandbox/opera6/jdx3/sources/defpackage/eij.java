package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import java.net.URL;

/* loaded from: classes.dex */
public final class eij extends vhj {
    public final String q;
    public final String r;
    public final String s;
    public final String t;

    public eij(Context context, umi umiVar, Bundle bundle) {
        super(context, umiVar, bundle);
        if (this.d != cue.NewsFeed) {
            throw new djb("show_news_backend", null);
        }
        if (TextUtils.isEmpty(this.c)) {
            throw new djb("show_news_request_id");
        }
        this.q = bundle.getString("newsfeed_hot_topic", "");
        this.r = bundle.getString("newsfeed_category", "");
        this.s = bundle.getString("newsfeed_recommend_type", "");
        String string = bundle.getString("newsfeed_type");
        if (TextUtils.isEmpty(string)) {
            throw new djb("newsfeed_type");
        }
        this.t = string;
    }

    @Override // defpackage.vhj, defpackage.s0f
    public final Intent a(Context context) {
        return b(context, "com.opera.android.action.SHOW_NEWSFEED_ARTICLE");
    }

    @Override // defpackage.vhj, defpackage.s0f
    public final Bundle c() {
        Bundle bundleC = super.c();
        bundleC.putString("newsfeed_hot_topic", this.q);
        bundleC.putString("newsfeed_category", this.r);
        bundleC.putString("newsfeed_recommend_type", this.s);
        bundleC.putString("newsfeed_type", this.t);
        return bundleC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vhj, defpackage.s0f
    public final boolean e(BrowserActivity browserActivity) {
        if (TextUtils.isEmpty(this.c)) {
            return false;
        }
        String[] strArr = OperaApplication.K;
        uqe uqeVarC = ((OperaApplication) browserActivity.getApplicationContext()).y().c();
        ta7 ta7Var = uqeVarC.v;
        URL url = this.i;
        if (url != null) {
            String string = l45.r(url.toString(), null, null, null, ta7Var.s().getString("user_id", null)).toString();
            String[] strArr2 = wqm.a;
            this.i = a26.e0(string);
        }
        p12 p12Var = new p12(this.c, this.g, null, this.q, this.r, this.s, null, null);
        Uri uri = Uri.parse("");
        pre preVar = new pre();
        msh mshVar = new msh("", this.t, "", uri, this.j, Uri.EMPTY, uri, uri, null, 0L, 0L, "", "", 0, 0, 0, null, this.f, p12Var, null, null, null, preVar, null, null);
        String str = (String) mshVar.v.b;
        uqeVarC.h.j(mshVar, 0);
        uqeVarC.u.put(str, mshVar);
        uqeVarC.t.a(uqeVarC, str);
        return super.e(browserActivity);
    }
}
