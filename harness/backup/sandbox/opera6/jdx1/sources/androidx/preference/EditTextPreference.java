package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.ehh;
import defpackage.j06;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        int iJ = xih.j(2130969587, context, R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iJ);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ehh.c, iJ, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            j06 j06Var = j06.b;
            if (j06Var == null) {
                j06Var = new j06((byte) 5);
                j06.b = j06Var;
            }
            this.g = j06Var;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }
}
