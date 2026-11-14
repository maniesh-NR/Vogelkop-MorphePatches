package com.leanplum.messagetemplates.options;

import android.content.Context;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.messagetemplates.MessageTemplateConstants;

/* loaded from: classes.dex */
public class CenterPopupOptions extends BaseMessageOptions {
    private int height;
    private int width;

    public CenterPopupOptions(ActionContext actionContext) {
        super(actionContext);
        setWidth(actionContext.numberNamed(MessageTemplateConstants.Args.LAYOUT_WIDTH).intValue());
        setHeight(actionContext.numberNamed(MessageTemplateConstants.Args.LAYOUT_HEIGHT).intValue());
    }

    private void setHeight(int i) {
        this.height = i;
    }

    private void setWidth(int i) {
        this.width = i;
    }

    public static ActionArgs toArgs(Context context) {
        return BaseMessageOptions.toArgs(context).with(MessageTemplateConstants.Args.LAYOUT_WIDTH, Integer.valueOf(MessageTemplateConstants.Values.CENTER_POPUP_WIDTH)).with(MessageTemplateConstants.Args.LAYOUT_HEIGHT, Integer.valueOf(MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT));
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
