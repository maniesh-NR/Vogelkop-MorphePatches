package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class r8p {
    public static final List a = Arrays.asList("app13423536670400", "app13336434553408");

    public static final DisplayMetrics a(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }
}
