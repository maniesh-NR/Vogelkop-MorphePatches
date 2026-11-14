package defpackage;

import com.leanplum.ActionContext;
import com.leanplum.messagetemplates.OperaArgs;

/* loaded from: classes.dex */
public final /* synthetic */ class vnf implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ActionContext b;

    public /* synthetic */ vnf(ActionContext actionContext, byte b) {
        this.a = b;
        this.b = actionContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ActionContext actionContext = this.b;
        switch (b) {
            case 0:
                actionContext.runTrackedActionNamed(OperaArgs.PRIMARY_ACTION);
                break;
            case 1:
                actionContext.runTrackedActionNamed(OperaArgs.SECONDARY_ACTION);
                break;
            case 2:
                actionContext.track(OperaArgs.CLOSE_X_ACTION, 0.0d, null);
                break;
            case 3:
                actionContext.runTrackedActionNamed(OperaArgs.PRIMARY_ACTION);
                break;
            case 4:
                actionContext.runTrackedActionNamed(OperaArgs.SECONDARY_ACTION);
                break;
            default:
                actionContext.track(OperaArgs.CLOSE_X_ACTION, 0.0d, null);
                break;
        }
    }
}
