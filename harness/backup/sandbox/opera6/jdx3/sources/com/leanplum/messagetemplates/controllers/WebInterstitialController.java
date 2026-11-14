package com.leanplum.messagetemplates.controllers;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.leanplum.Leanplum;
import com.leanplum.messagetemplates.DialogCustomizer;
import com.leanplum.messagetemplates.MessageTemplates;
import com.leanplum.messagetemplates.options.WebInterstitialOptions;

/* loaded from: classes.dex */
public class WebInterstitialController extends BaseController {

    @NonNull
    private WebInterstitialOptions webOptions;

    public WebInterstitialController(Activity activity, @NonNull WebInterstitialOptions webInterstitialOptions) {
        super(activity);
        this.webOptions = webInterstitialOptions;
        init();
    }

    private WebView createWebView(Context context) {
        WebView webView = new WebView(context);
        webView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        webView.setWebViewClient(new WebViewClient() { // from class: com.leanplum.messagetemplates.controllers.WebInterstitialController.1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                return WebInterstitialController.this.handleCloseEvent(str) || WebInterstitialController.this.handleGooglePlayUri(webView2.getContext(), str);
            }
        });
        webView.loadUrl(this.webOptions.getUrl());
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleCloseEvent(String str) {
        if (!str.contains(this.webOptions.getCloseUrl())) {
            return false;
        }
        runDismissAction();
        cancel();
        String[] strArrSplit = str.split("\\?");
        if (strArrSplit.length > 1) {
            for (String str2 : strArrSplit[1].split("&")) {
                String[] strArrSplit2 = str2.split("=");
                if (strArrSplit2.length > 1 && strArrSplit2[0].equals("result")) {
                    Leanplum.track(strArrSplit2[1]);
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleGooglePlayUri(Context context, String str) {
        Uri uri = Uri.parse(str);
        if ("market".equals(uri.getScheme())) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        return false;
    }

    @Override // com.leanplum.messagetemplates.controllers.BaseController
    public void addMessageChildViews(RelativeLayout relativeLayout) {
        relativeLayout.addView(createWebView(this.activity));
    }

    @Override // com.leanplum.messagetemplates.controllers.BaseController
    public void applyWindowDecoration() {
        DialogCustomizer customizer = MessageTemplates.getCustomizer();
        if (customizer != null) {
            customizer.customizeWebInterstitial(this, this.contentView);
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

    @NonNull
    public WebInterstitialOptions getWebOptions() {
        return this.webOptions;
    }

    @Override // com.leanplum.messagetemplates.controllers.BaseController
    public boolean hasDismissButton() {
        return this.webOptions.hasDismissButton();
    }

    @Override // com.leanplum.messagetemplates.controllers.BaseController
    public boolean isFullscreen() {
        return true;
    }

    @Override // com.leanplum.messagetemplates.controllers.BaseController, android.app.Dialog
    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.leanplum.messagetemplates.controllers.BaseController
    public void runDismissAction() {
        this.webOptions.dismiss();
    }
}
