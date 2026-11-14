package defpackage;

import android.graphics.Paint;
import android.widget.TextView;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class uq1 {
    public static final y3d a = new y3d(30);
    public static Paint b;

    public static void a(TextView textView, String str) {
        if (Objects.equals(textView.getFontVariationSettings(), str)) {
            textView.setFontVariationSettings("");
        }
        textView.setFontVariationSettings(str);
    }
}
