package com.opera.android.autofill;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class AutofillItem {
    public final String a;

    public AutofillItem(String str) {
        this.a = str;
    }

    @NonNull
    public final String getGuid() {
        return this.a;
    }
}
