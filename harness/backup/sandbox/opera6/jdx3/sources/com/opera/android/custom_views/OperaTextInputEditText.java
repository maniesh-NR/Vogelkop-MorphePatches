package com.opera.android.custom_views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.textfield.TextInputEditText;
import defpackage.khh;

/* loaded from: classes.dex */
public class OperaTextInputEditText extends TextInputEditText {
    public final boolean i;

    public OperaTextInputEditText(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, khh.u, 0, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
            typedArrayObtainStyledAttributes.recycle();
            this.i = z;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTextContextMenuItem(int i) {
        boolean zOnTextContextMenuItem = super/*bq1*/.onTextContextMenuItem(i);
        if (i == 16908322 && this.i) {
            OperaEditText.h(getEditableText());
        }
        return zOnTextContextMenuItem;
    }
}
