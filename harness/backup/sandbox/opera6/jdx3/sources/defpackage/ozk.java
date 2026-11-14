package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class ozk {
    public static final Set a = e82.E(new String[]{"ar", "be", "bg", "bn", "el", "fa", "he", "hi", "ja", "ko", "mu", "ru", "si", "ta", "th", "uk", "ur", "vi", "zh"});

    public static final void a(Resources.Theme theme, boolean z) {
        if (z) {
            return;
        }
        if (a.contains(Locale.getDefault().getLanguage())) {
            return;
        }
        theme.applyStyle(2132084374, true);
    }

    public static final boolean b(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(2130970993, typedValue, true) && typedValue.resourceId == 0;
    }
}
