package com.opera.android.browser.passwordmanager;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import defpackage.rtd;

/* loaded from: classes.dex */
public class PasswordGenerationMessageView extends LayoutDirectionLinearLayout implements rtd {
    public PasswordGenerationMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.rtd
    public final void a() {
    }

    @Override // defpackage.rtd
    public final void c(ptd ptdVar) {
        ((TextView) findViewById(2131362478)).setText(ptdVar.e);
    }
}
