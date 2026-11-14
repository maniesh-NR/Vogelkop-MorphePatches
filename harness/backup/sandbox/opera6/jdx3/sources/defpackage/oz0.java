package defpackage;

import android.content.DialogInterface;
import com.leanplum.ActionContext;
import com.leanplum.messagetemplates.MessageTemplateConstants;

/* loaded from: classes.dex */
public final /* synthetic */ class oz0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ActionContext b;

    public /* synthetic */ oz0(ActionContext actionContext, byte b) {
        this.a = b;
        this.b = actionContext;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        ActionContext actionContext = this.b;
        switch (b) {
            case 0:
                actionContext.runActionNamed(MessageTemplateConstants.Args.DISMISS_ACTION);
                break;
            case 1:
                actionContext.runTrackedActionNamed(MessageTemplateConstants.Args.ACCEPT_ACTION);
                break;
            default:
                actionContext.runActionNamed(MessageTemplateConstants.Args.CANCEL_ACTION);
                break;
        }
    }
}
