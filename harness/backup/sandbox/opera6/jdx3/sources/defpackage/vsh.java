package defpackage;

import android.icu.text.DisplayContext;
import android.icu.text.RelativeDateTimeFormatter;
import android.icu.util.ULocale;

/* loaded from: classes.dex */
public abstract class vsh {
    public static final ua1 a = new ua1((byte) 3, 8);

    public static RelativeDateTimeFormatter a(ULocale uLocale, RelativeDateTimeFormatter.Style style) {
        DisplayContext displayContext = DisplayContext.CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE;
        String str = uLocale + "\t" + style + "\t" + displayContext;
        ua1 ua1Var = a;
        RelativeDateTimeFormatter relativeDateTimeFormatter = (RelativeDateTimeFormatter) ua1Var.get(str);
        if (relativeDateTimeFormatter != null) {
            return relativeDateTimeFormatter;
        }
        RelativeDateTimeFormatter relativeDateTimeFormatter2 = RelativeDateTimeFormatter.getInstance(uLocale, null, style, displayContext);
        ua1Var.put(str, relativeDateTimeFormatter2);
        return relativeDateTimeFormatter2;
    }
}
