package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import com.opera.android.custom_views.StylingImageView;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class w6k {
    public static final w6k a;
    public static final w6k b;
    public static final /* synthetic */ w6k[] c;

    static {
        w6k w6kVar = new w6k("BLACK", 0);
        a = w6kVar;
        w6k w6kVar2 = new w6k("WHITE", 1);
        b = w6kVar2;
        c = new w6k[]{w6kVar, w6kVar2};
    }

    public static w6k valueOf(String str) {
        return (w6k) Enum.valueOf(w6k.class, str);
    }

    public static w6k[] values() {
        return (w6k[]) c.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(StylingImageView stylingImageView) {
        int color;
        int color2;
        Context context = stylingImageView.getContext();
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            color = context.getColor(2131099830);
            color2 = context.getColor(2131103629);
        } else if (iOrdinal != 1) {
            color = f03.t(2130969110, context, 2131101243);
            color2 = f03.t(2130969109, context, 2131101243);
        } else {
            color2 = context.getColor(2131103628);
            color = -1;
        }
        stylingImageView.c(ColorStateList.valueOf(color));
        Drawable background = stylingImageView.getBackground();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(color2);
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateListValueOf);
        }
    }
}
