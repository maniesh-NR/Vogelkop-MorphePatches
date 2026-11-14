package defpackage;

import android.content.Context;
import com.leanplum.ActionContext;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class u9c extends ActionCallback {
    public final Context a;
    public final c37 b;

    public u9c(OperaApplication operaApplication) {
        Context applicationContext = operaApplication.getApplicationContext();
        this.a = applicationContext;
        this.b = new c37(new t1(applicationContext.getApplicationContext(), (byte) 12), new rqd((byte) 26));
    }

    @Override // com.leanplum.callbacks.ActionCallback
    public final boolean onResponse(ActionContext actionContext) {
        z0c z0cVarA = this.b.A(actionContext.stringNamed(MessageTemplateConstants.Args.URL));
        byte b = 0;
        if (z0cVarA == null) {
            return false;
        }
        LeanplumActivityHelper.queueActionUponActive(new t9c(z0cVarA, this, b));
        return true;
    }
}
