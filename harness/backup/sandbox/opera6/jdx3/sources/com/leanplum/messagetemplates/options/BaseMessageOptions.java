package com.leanplum.messagetemplates.options;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.internal.Util;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import com.leanplum.utils.BitmapUtil;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class BaseMessageOptions {
    private int acceptButtonBackgroundColor;
    private String acceptButtonText;
    private int acceptButtonTextColor;
    private int backgroundColor;
    private Bitmap backgroundImage;
    private ActionContext context;
    private int messageColor;
    private String messageText;
    private String title;
    private int titleColor;

    public BaseMessageOptions(ActionContext actionContext) {
        this.context = actionContext;
        setTitle(actionContext.stringNamed(MessageTemplateConstants.Args.TITLE_TEXT));
        setTitleColor(actionContext.numberNamed(MessageTemplateConstants.Args.TITLE_COLOR).intValue());
        setMessageText(actionContext.stringNamed(MessageTemplateConstants.Args.MESSAGE_TEXT));
        setMessageColor(actionContext.numberNamed(MessageTemplateConstants.Args.MESSAGE_COLOR).intValue());
        InputStream inputStreamStreamNamed = actionContext.streamNamed(MessageTemplateConstants.Args.BACKGROUND_IMAGE);
        if (inputStreamStreamNamed != null) {
            try {
                setBackgroundImage(BitmapFactory.decodeStream(inputStreamStreamNamed));
            } catch (Throwable unused) {
            }
        }
        setBackgroundColor(actionContext.numberNamed(MessageTemplateConstants.Args.BACKGROUND_COLOR).intValue());
        setAcceptButtonText(actionContext.stringNamed(MessageTemplateConstants.Args.ACCEPT_BUTTON_TEXT));
        setAcceptButtonBackgroundColor(actionContext.numberNamed(MessageTemplateConstants.Args.ACCEPT_BUTTON_BACKGROUND_COLOR).intValue());
        setAcceptButtonTextColor(actionContext.numberNamed(MessageTemplateConstants.Args.ACCEPT_BUTTON_TEXT_COLOR).intValue());
    }

    private void setAcceptButtonBackgroundColor(int i) {
        this.acceptButtonBackgroundColor = i;
    }

    private void setAcceptButtonText(String str) {
        this.acceptButtonText = str;
    }

    private void setAcceptButtonTextColor(int i) {
        this.acceptButtonTextColor = i;
    }

    private void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    private void setBackgroundImage(Bitmap bitmap) {
        this.backgroundImage = bitmap;
    }

    private void setMessageColor(int i) {
        this.messageColor = i;
    }

    private void setMessageText(String str) {
        this.messageText = str;
    }

    private void setTitle(String str) {
        this.title = str;
    }

    private void setTitleColor(int i) {
        this.titleColor = i;
    }

    public static ActionArgs toArgs(Context context) {
        return new ActionArgs().with(MessageTemplateConstants.Args.TITLE_TEXT, Util.getApplicationName(context)).withColor(MessageTemplateConstants.Args.TITLE_COLOR, -16777216).with(MessageTemplateConstants.Args.MESSAGE_TEXT, MessageTemplateConstants.Values.POPUP_MESSAGE).withColor(MessageTemplateConstants.Args.MESSAGE_COLOR, -16777216).withFile(MessageTemplateConstants.Args.BACKGROUND_IMAGE, null).withColor(MessageTemplateConstants.Args.BACKGROUND_COLOR, -1).with(MessageTemplateConstants.Args.ACCEPT_BUTTON_TEXT, MessageTemplateConstants.Values.OK_TEXT).withColor(MessageTemplateConstants.Args.ACCEPT_BUTTON_BACKGROUND_COLOR, -1).withColor(MessageTemplateConstants.Args.ACCEPT_BUTTON_TEXT_COLOR, -16745729).withAction(MessageTemplateConstants.Args.ACCEPT_ACTION, null);
    }

    public void accept() {
        this.context.runTrackedActionNamed(MessageTemplateConstants.Args.ACCEPT_ACTION);
    }

    public void dismiss() {
        this.context.runActionNamed(MessageTemplateConstants.Args.DISMISS_ACTION);
    }

    public int getAcceptButtonBackgroundColor() {
        return this.acceptButtonBackgroundColor;
    }

    public String getAcceptButtonText() {
        return this.acceptButtonText;
    }

    public int getAcceptButtonTextColor() {
        return this.acceptButtonTextColor;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public Bitmap getBackgroundImage() {
        return this.backgroundImage;
    }

    public Bitmap getBackgroundImageRounded(int i) {
        return BitmapUtil.getRoundedCornerBitmap(this.backgroundImage, i);
    }

    public int getMessageColor() {
        return this.messageColor;
    }

    public String getMessageText() {
        return this.messageText;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTitleColor() {
        return this.titleColor;
    }
}
