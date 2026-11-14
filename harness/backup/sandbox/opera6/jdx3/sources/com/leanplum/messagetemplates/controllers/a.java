package com.leanplum.messagetemplates.controllers;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ BaseController b;

    public /* synthetic */ a(BaseController baseController, byte b) {
        this.a = b;
        this.b = baseController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        BaseController baseController = this.b;
        switch (b) {
            case 0:
                ((AbstractPopupController) baseController).lambda$createAcceptButton$0(view);
                break;
            default:
                baseController.lambda$createCloseButton$0(view);
                break;
        }
    }
}
