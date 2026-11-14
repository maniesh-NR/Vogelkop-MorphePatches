package com.leanplum.messagetemplates.controllers;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.leanplum.core.R;
import com.leanplum.utils.SizeUtil;
import com.leanplum.views.CloseButton;
import com.leanplum.views.ViewUtils;

/* loaded from: classes.dex */
abstract class BaseController extends Dialog {
    protected Activity activity;
    protected RelativeLayout contentView;
    protected boolean isClosing;

    public BaseController(Activity activity) {
        super(activity, ViewUtils.getThemeId(activity));
        this.isClosing = false;
        this.activity = activity;
        SizeUtil.init(activity);
    }

    private CloseButton createCloseButton(View view) {
        CloseButton closeButton = new CloseButton(this.activity);
        closeButton.setId(R.id.close_button);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (isFullscreen()) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            int i = SizeUtil.dp5;
            layoutParams.setMargins(0, i, i, 0);
        } else {
            layoutParams.addRule(6, view.getId());
            layoutParams.addRule(7, view.getId());
            int i2 = -SizeUtil.dp7;
            layoutParams.setMargins(0, i2, i2, 0);
        }
        closeButton.setLayoutParams(layoutParams);
        closeButton.setOnClickListener(new a(this, (byte) 1));
        return closeButton;
    }

    private RelativeLayout createContentView() {
        RelativeLayout relativeLayout = new RelativeLayout(this.activity);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        relativeLayout.setBackgroundColor(0);
        relativeLayout.setLayoutParams(layoutParams);
        return relativeLayout;
    }

    private RelativeLayout createMessageView() {
        RelativeLayout relativeLayout = new RelativeLayout(this.activity);
        relativeLayout.setId(R.id.container_view);
        relativeLayout.setLayoutParams(createLayoutParams());
        ViewUtils.applyBackground(relativeLayout, 0, !isFullscreen());
        addMessageChildViews(relativeLayout);
        return relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createCloseButton$0(View view) {
        runDismissAction();
        cancel();
    }

    public abstract void addMessageChildViews(RelativeLayout relativeLayout);

    public abstract void applyWindowDecoration();

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.isClosing) {
            return;
        }
        this.isClosing = true;
        Animation animationCreateFadeOutAnimation = ViewUtils.createFadeOutAnimation(350L);
        animationCreateFadeOutAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.leanplum.messagetemplates.controllers.BaseController.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                BaseController.this.onFadeOutAnimationEnd();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        this.contentView.startAnimation(animationCreateFadeOutAnimation);
    }

    public abstract RelativeLayout.LayoutParams createLayoutParams();

    public View getContentView() {
        return this.contentView;
    }

    public abstract boolean hasDismissButton();

    public void init() {
        this.contentView = createContentView();
        RelativeLayout relativeLayoutCreateMessageView = createMessageView();
        this.contentView.addView(relativeLayoutCreateMessageView);
        if (hasDismissButton()) {
            this.contentView.addView(createCloseButton(relativeLayoutCreateMessageView));
        }
        applyWindowDecoration();
        RelativeLayout relativeLayout = this.contentView;
        setContentView(relativeLayout, relativeLayout.getLayoutParams());
        this.contentView.setAnimation(ViewUtils.createFadeInAnimation(350L));
    }

    public abstract boolean isFullscreen();

    @Override // android.app.Dialog
    public void onBackPressed() {
        runDismissAction();
        super.onBackPressed();
    }

    public void onFadeOutAnimationEnd() {
        super.cancel();
    }

    public abstract void runDismissAction();
}
