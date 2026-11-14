package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.TypedValue;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public abstract class w23 {
    public static float a(int i, Context context) {
        String string = context.getTheme().obtainStyledAttributes(i, new int[]{R.attr.textSize}).getString(0);
        if (string == null || !StringsKt.E(string, "sp", false)) {
            return 14.0f;
        }
        return Float.parseFloat(c.o(string, "sp", ""));
    }

    public static Typeface b(int i, Context context) throws Resources.NotFoundException {
        try {
            TypedValue typedValue = new TypedValue();
            TypedValue typedValue2 = new TypedValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{R.attr.fontFamily, R.attr.textStyle});
            typedArrayObtainStyledAttributes.getValue(0, typedValue);
            typedArrayObtainStyledAttributes.getValue(1, typedValue2);
            typedArrayObtainStyledAttributes.recycle();
            if (typedValue.resourceId == 0) {
                return Typeface.create(typedValue.string.toString(), typedValue2.data);
            }
            Typeface font = context.getResources().getFont(typedValue.resourceId);
            int style = font.getStyle();
            int i2 = typedValue2.data;
            return style == i2 ? font : Typeface.create(font, i2);
        } catch (Resources.NotFoundException unused) {
            return Typeface.create(Typeface.DEFAULT, 0);
        } catch (ArrayIndexOutOfBoundsException unused2) {
            return Typeface.create(Typeface.DEFAULT, 0);
        }
    }
}
