package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class wgf extends s0f {
    public final Uri c;
    public final lqm d;

    public wgf(Context context, Bundle bundle) {
        super(bundle);
        lqm lqmVarD = lqm.d(bundle.getInt("action_open_url_origin", 11));
        lqmVarD = lqmVarD == null ? lqm.i : lqmVarD;
        String string = bundle.getString("action_open_url");
        String[] strArr = wqm.a;
        Uri uriD0 = a26.d0(string);
        if (uriD0 == null) {
            throw new djb("action_open_url");
        }
        if (mdb.e(string)) {
            lk6 lk6Var = lk6.a;
            if (lk6.f(0, ik6.b, lqmVarD, context, uriD0)) {
                this.c = uriD0;
                this.d = lqmVarD;
                return;
            }
        }
        throw new djb("action_open_url", null);
    }

    public wgf(Uri uri, lqm lqmVar) {
        this.c = uri;
        this.d = lqmVar;
    }

    @Override // defpackage.s0f
    public final Intent a(Context context) {
        return b(context, "com.opera.android.action.OPEN_URL");
    }

    @Override // defpackage.s0f
    public final Bundle c() {
        Bundle bundleC = super.c();
        bundleC.putString("action_open_url", this.c.toString());
        bundleC.putInt("action_open_url_origin", this.d.ordinal());
        return bundleC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s0f
    public final boolean e(BrowserActivity browserActivity) {
        lk6 lk6Var = lk6.a;
        return lk6.f(0, ik6.a, this.d, browserActivity, this.c);
    }

    @Override // defpackage.s0f
    public final Uri f(Context context) {
        c37 c37Var = new c37(new t1(context.getApplicationContext(), (byte) 12), new rqd((byte) 26));
        Uri uri = this.c;
        if (c37Var.A(uri.toString()) == null) {
            return null;
        }
        return uri;
    }

    @Override // defpackage.s0f
    public final boolean g(Context context) {
        lk6 lk6Var = lk6.a;
        return lk6.f(0, ik6.b, this.d, context, this.c);
    }
}
