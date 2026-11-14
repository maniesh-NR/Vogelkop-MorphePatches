package com.leanplum.messagetemplates.controllers;

import android.app.Activity;
import android.view.View;
import android.widget.RelativeLayout;
import com.leanplum.messagetemplates.DialogCustomizer;
import com.leanplum.messagetemplates.MessageTemplates;
import com.leanplum.messagetemplates.options.BaseMessageOptions;
import com.leanplum.messagetemplates.options.InterstitialOptions;

/* loaded from: classes.dex */
public class InterstitialController extends AbstractPopupController {
    public InterstitialController(Activity activity, InterstitialOptions interstitialOptions) {
        super(activity, interstitialOptions);
    }

    @Override // com.leanplum.messagetemplates.controllers.BaseController
    public void applyWindowDecoration() {
        DialogCustomizer customizer = MessageTemplates.getCustomizer();
        if (customizer != null) {
            customizer.customizeInterstitial(this, this.contentView);
        }
    }

    @Override // com.leanplum.messagetemplates.controllers.BaseController, android.app.Dialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
    }

    @Override // com.leanplum.messagetemplates.controllers.BaseController
    public RelativeLayout.LayoutParams createLayoutParams() {
        return new RelativeLayout.LayoutParams(-1, -1);
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
        return true;
    }

    @Override // com.leanplum.messagetemplates.controllers.BaseController, android.app.Dialog
    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }
}
