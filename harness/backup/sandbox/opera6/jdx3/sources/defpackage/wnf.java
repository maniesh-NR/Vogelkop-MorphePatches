package defpackage;

import com.leanplum.ActionContext;
import com.leanplum.messagetemplates.OperaSheet;
import com.leanplum.messagetemplates.OperaSubscriptionSheet;
import com.leanplum.messagetemplates.ResourceWrapper;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class wnf implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ orm b;
    public final /* synthetic */ skm c;
    public final /* synthetic */ ActionContext d;

    public /* synthetic */ wnf(ActionContext actionContext, orm ormVar, skm skmVar) {
        this.a = (byte) 2;
        this.d = actionContext;
        this.b = ormVar;
        this.c = skmVar;
    }

    public /* synthetic */ wnf(orm ormVar, skm skmVar, ActionContext actionContext, byte b) {
        this.a = b;
        this.b = ormVar;
        this.c = skmVar;
        this.d = actionContext;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                OperaSheet.lambda$initializeSheetRequest$4(this.b, this.c, this.d, (tw7) obj);
                break;
            case 1:
                OperaSubscriptionSheet.onResourceLoaded$lambda$0(this.b, this.c, this.d, (tw7) obj);
                break;
            default:
                OperaSubscriptionSheet.onOffersApplied$lambda$0(this.d, this.b, this.c, (ResourceWrapper) obj);
                break;
        }
    }
}
