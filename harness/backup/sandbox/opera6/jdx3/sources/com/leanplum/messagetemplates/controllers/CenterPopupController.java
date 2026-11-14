package com.leanplum.messagetemplates.controllers;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import com.leanplum.messagetemplates.DialogCustomizer;
import com.leanplum.messagetemplates.MessageTemplates;
import com.leanplum.messagetemplates.options.BaseMessageOptions;
import com.leanplum.messagetemplates.options.CenterPopupOptions;
import com.leanplum.utils.SizeUtil;

/* loaded from: classes.dex */
public class CenterPopupController extends AbstractPopupController {
    public CenterPopupController(Activity activity, CenterPopupOptions centerPopupOptions) {
        super(activity, centerPopupOptions);
    }

    @Override // com.leanplum.messagetemplates.controllers.BaseController
    public void applyWindowDecoration() {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(2);
            window.setDimAmount(0.7f);
            DialogCustomizer customizer = MessageTemplates.getCustomizer();
            if (customizer != null) {
                customizer.customizeCenterPopup(this, this.contentView);
            }
        }
    }

    @Override // com.leanplum.messagetemplates.controllers.BaseController, android.app.Dialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
    }

    @Override // com.leanplum.messagetemplates.controllers.BaseController
    public RelativeLayout.LayoutParams createLayoutParams() {
        Point displaySize = SizeUtil.getDisplaySize(this.activity);
        int iDpToPx = SizeUtil.dpToPx(this.activity, ((CenterPopupOptions) this.options).getWidth());
        int iDpToPx2 = SizeUtil.dpToPx(this.activity, ((CenterPopupOptions) this.options).getHeight());
        int i = displaySize.x;
        int i2 = SizeUtil.dp20;
        int i3 = i - i2;
        int i4 = displaySize.y - i2;
        double d = iDpToPx;
        double d2 = d / iDpToPx2;
        if (iDpToPx > i3 && ((int) (d / d2)) < i4) {
            iDpToPx2 = (int) (i3 / d2);
            iDpToPx = i3;
        }
        if (iDpToPx2 <= i4 || ((int) (iDpToPx2 * d2)) >= i3) {
            i4 = iDpToPx2;
        } else {
            iDpToPx = (int) (i4 * d2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iDpToPx, i4);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.leanplum.messagetemplates.controllers.BaseController
    public /* bridge */ /* synthetic */ View getContentView() {
        return super.getContentView();
    }

    @Override // com.leanplum.messagetemplates.controllers.AbstractPopupController
    public /* bridge */ /* synthetic */ BaseMessageOptions getOptions() {
        return super.getOptions();
    }

    @Override // com.leanplum.messagetemplates.controllers.BaseController
    public boolean isFullscreen() {
        return false;
    }

    @Override // com.leanplum.messagetemplates.controllers.BaseController, android.app.Dialog
    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }
}
