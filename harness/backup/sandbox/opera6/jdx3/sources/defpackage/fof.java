package defpackage;

import android.content.Context;
import com.leanplum.ActionContext;
import com.leanplum.messagetemplates.OperaSubscriptionDialog;
import com.leanplum.messagetemplates.OperaSubscriptionSheet;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class fof implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ tcl c;
    public final /* synthetic */ ActionContext d;

    public /* synthetic */ fof(Context context, tcl tclVar, ActionContext actionContext, byte b) {
        this.a = b;
        this.b = context;
        this.c = tclVar;
        this.d = actionContext;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                OperaSubscriptionDialog.initializeDialogRequest$lambda$0(this.b, this.c, this.d, (tw7) obj);
                break;
            default:
                OperaSubscriptionSheet.initializeSheetRequest$lambda$0(this.b, this.c, this.d, (tw7) obj);
                break;
        }
    }
}
