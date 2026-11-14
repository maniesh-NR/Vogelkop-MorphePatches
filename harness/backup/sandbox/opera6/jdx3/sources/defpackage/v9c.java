package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.leanplum.ActionContext;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import com.opera.android.OperaApplication;
import java.net.URISyntaxException;

/* loaded from: classes.dex */
public final class v9c extends ActionCallback {
    public final /* synthetic */ byte a;
    public final Context b;

    public v9c(OperaApplication operaApplication, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = operaApplication.getApplicationContext();
                break;
            case 2:
                this.b = operaApplication.getApplicationContext();
                break;
            default:
                this.b = operaApplication.getApplicationContext();
                break;
        }
    }

    @Override // com.leanplum.callbacks.ActionCallback
    public final boolean onResponse(ActionContext actionContext) throws URISyntaxException {
        switch (this.a) {
            case 0:
                String strC = wqm.c(actionContext.stringNamed(MessageTemplateConstants.Args.URL));
                if (wqm.s(strC)) {
                    Uri uri = Uri.parse(strC);
                    lk6 lk6Var = lk6.a;
                    if (lk6.f(0, ik6.b, lqm.K, this.b, uri)) {
                        LeanplumActivityHelper.queueActionUponActive(new t9c((ActionCallback) this, (Comparable) strC, (byte) 1));
                    }
                    break;
                }
                break;
            case 1:
                String strStringNamed = actionContext.stringNamed(MessageTemplateConstants.Args.URL);
                Uri uri2 = Uri.parse(strStringNamed);
                if ("intent".equals(uri2.getScheme())) {
                    try {
                        Intent.parseUri(strStringNamed, 1);
                        LeanplumActivityHelper.queueActionUponActive(new t9c((ActionCallback) this, (Comparable) uri2, (byte) 2));
                        break;
                    } catch (URISyntaxException unused) {
                        return false;
                    }
                }
                break;
            default:
                String strStringNamed2 = actionContext.stringNamed(MessageTemplateConstants.Args.URL);
                if (strStringNamed2 != null) {
                    String[] strArr = wqm.a;
                    Uri uri3 = Uri.parse(strStringNamed2);
                    if (uri3 != null && wqm.D(uri3)) {
                        LeanplumActivityHelper.queueActionUponActive(new t9c((Object) this, (Object) uri3, (byte) 3));
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
