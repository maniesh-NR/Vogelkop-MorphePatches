package com.leanplum.messagetemplates;

import com.leanplum.ActionContext;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.VariablesChangedCallback;
import com.opera.android.BrowserActivity;
import defpackage.jbd;
import defpackage.orm;
import defpackage.tcl;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/leanplum/messagetemplates/OperaConfigBundleSheet$register$1$onResponse$1", "Lcom/leanplum/callbacks/VariablesChangedCallback;", "variablesChanged", "", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperaConfigBundleSheet$register$1$onResponse$1 extends VariablesChangedCallback {
    final /* synthetic */ ActionContext $context;
    final /* synthetic */ tcl $taskExecutor;
    final /* synthetic */ orm $usageReporter;

    public OperaConfigBundleSheet$register$1$onResponse$1(ActionContext actionContext, tcl tclVar, orm ormVar) {
        this.$context = actionContext;
        this.$taskExecutor = tclVar;
        this.$usageReporter = ormVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void variablesChanged$lambda$0(ActionContext actionContext, tcl tclVar, orm ormVar) {
        Object currentActivity = LeanplumActivityHelper.getCurrentActivity();
        if (currentActivity instanceof BrowserActivity) {
            BrowserActivity browserActivity = (BrowserActivity) currentActivity;
            OperaConfigBundleSheet.INSTANCE.initializeSheetRequest(actionContext, tclVar, ormVar, browserActivity.Q0(), browserActivity.O());
        }
    }

    @Override // com.leanplum.callbacks.VariablesChangedCallback
    public void variablesChanged() {
        LeanplumActivityHelper.queueActionUponActive(new jbd(this.$context, this.$taskExecutor, this.$usageReporter, (byte) 11));
    }
}
