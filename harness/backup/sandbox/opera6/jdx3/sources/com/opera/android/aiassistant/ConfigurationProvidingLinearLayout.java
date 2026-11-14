package com.opera.android.aiassistant;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.kze;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/android/aiassistant/ConfigurationProvidingLinearLayout;", "Landroid/widget/LinearLayout;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConfigurationProvidingLinearLayout extends LinearLayout {
    public final kze a;

    public ConfigurationProvidingLinearLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = new kze(getResources().getConfiguration());
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a.r(configuration);
    }
}
