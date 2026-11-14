package com.leanplum.messagetemplates.options;

import android.content.Context;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.messagetemplates.MessageTemplateConstants;

/* loaded from: classes.dex */
public class InterstitialOptions extends BaseMessageOptions {
    public InterstitialOptions(ActionContext actionContext) {
        super(actionContext);
    }

    public static ActionArgs toArgs(Context context) {
        return BaseMessageOptions.toArgs(context).with(MessageTemplateConstants.Args.MESSAGE_TEXT, MessageTemplateConstants.Values.INTERSTITIAL_MESSAGE);
    }
}
