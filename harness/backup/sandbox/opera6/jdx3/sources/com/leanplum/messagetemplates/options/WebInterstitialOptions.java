package com.leanplum.messagetemplates.options;

import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.messagetemplates.MessageTemplateConstants;

/* loaded from: classes.dex */
public class WebInterstitialOptions {
    private ActionContext actionContext;
    private String closeUrl;
    private boolean hasDismissButton;
    private String url;

    public WebInterstitialOptions(ActionContext actionContext) {
        setUrl(actionContext.stringNamed(MessageTemplateConstants.Args.URL));
        setHasDismissButton(actionContext.booleanNamed(MessageTemplateConstants.Args.HAS_DISMISS_BUTTON));
        setCloseUrl(actionContext.stringNamed(MessageTemplateConstants.Args.CLOSE_URL));
        this.actionContext = actionContext;
    }

    private void setCloseUrl(String str) {
        this.closeUrl = str;
    }

    private void setHasDismissButton(boolean z) {
        this.hasDismissButton = z;
    }

    private void setUrl(String str) {
        this.url = str;
    }

    public static ActionArgs toArgs() {
        return new ActionArgs().with(MessageTemplateConstants.Args.URL, MessageTemplateConstants.Values.DEFAULT_URL).with(MessageTemplateConstants.Args.CLOSE_URL, MessageTemplateConstants.Values.DEFAULT_CLOSE_URL).with(MessageTemplateConstants.Args.HAS_DISMISS_BUTTON, Boolean.TRUE);
    }

    public void dismiss() {
        this.actionContext.runActionNamed(MessageTemplateConstants.Args.DISMISS_ACTION);
    }

    public String getCloseUrl() {
        return this.closeUrl;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean hasDismissButton() {
        return this.hasDismissButton;
    }
}
