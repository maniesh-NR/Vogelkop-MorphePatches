package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class rgf extends s0f {
    public final joc c;

    public rgf(Bundle bundle) {
        super(bundle);
        if (!bundle.containsKey("action_show_match_id")) {
            throw new djb("action_show_match_id");
        }
        long j = bundle.getLong("action_show_match_id", -1L);
        if (j == -1) {
            throw new djb("action_show_match_id", null);
        }
        String string = bundle.getString("action_show_match_type");
        if (TextUtils.isEmpty(string)) {
            throw new djb("action_show_match_type");
        }
        try {
            this.c = new joc(j, zi4.M(string));
        } catch (IllegalArgumentException e) {
            throw new djb("action_show_match_type", e);
        }
    }

    @Override // defpackage.s0f
    public final Intent a(Context context) {
        return b(context, "com.opera.android.action.SHOW_LIVE_SCORE_MATCH");
    }

    @Override // defpackage.s0f
    public final Bundle c() {
        Bundle bundleC = super.c();
        joc jocVar = this.c;
        bundleC.putLong("action_show_match_id", jocVar.a);
        bundleC.putString("action_show_match_type", zi4.Z(jocVar.b));
        return bundleC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s0f
    public final boolean e(BrowserActivity browserActivity) {
        tc2 kqcVar;
        ndc ndcVarO = q9n.o(browserActivity);
        if (ndcVarO != null) {
            String[] strArr = OperaApplication.K;
            gs6 gs6Var = (gs6) ((snc) ((OperaApplication) browserActivity.getApplicationContext()).r.W.get()).f.getValue();
            gs6Var.getClass();
            joc jocVar = this.c;
            apc apcVar = jocVar.b;
            long j = jocVar.a;
            int iOrdinal = apcVar.ordinal();
            if (iOrdinal == 0) {
                kqcVar = new kqc(j, false);
            } else {
                if (iOrdinal != 1) {
                    throw new RuntimeException(null, null);
                }
                kqcVar = new iqc(j);
            }
            gs6Var.b.a(ndcVarO).D(browserActivity, kqcVar, new bl6(gs6Var, (byte) 5));
        }
        return true;
    }

    @Override // defpackage.s0f
    public final boolean g(Context context) {
        if (!((wnh) xnh.t(context).i()).b(1024)) {
            return false;
        }
        int iOrdinal = this.c.b.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return false;
        }
        throw new RuntimeException(null, null);
    }
}
