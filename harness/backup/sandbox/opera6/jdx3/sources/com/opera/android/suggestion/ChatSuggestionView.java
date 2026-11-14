package com.opera.android.suggestion;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.lb4;
import defpackage.pvb;
import defpackage.tu4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/opera/android/suggestion/ChatSuggestionView;", "Lyq1;", "Lpvb;", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChatSuggestionView extends yq1 implements pvb {
    public lb4 h;

    /* JADX WARN: Multi-variable type inference failed */
    public ChatSuggestionView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (isAttachedToWindow()) {
            na2.r(this);
        } else {
            addOnAttachStateChangeListener(new tu4(this, this, (byte) 0));
        }
    }

    @Override // defpackage.pvb
    public final String c() {
        return getText().toString();
    }

    @Override // defpackage.pvb
    public final void f() {
        lb4 lb4Var = this.h;
        if (lb4Var != null) {
            lb4Var.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pvb
    public final View getView() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pvb
    /* renamed from: j */
    public final boolean getA() {
        return getVisibility() == 0;
    }

    @Override // defpackage.pvb
    public final i1 m() {
        return null;
    }
}
