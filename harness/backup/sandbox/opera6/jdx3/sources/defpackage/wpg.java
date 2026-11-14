package defpackage;

import android.text.StaticLayout;
import com.opera.android.widget.UrlFieldEditText;
import java.util.Objects;

/* loaded from: classes.dex */
public final class wpg {
    public final String a;
    public final String b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public wpg(UrlFieldEditText urlFieldEditText, String str, String str2) {
        Objects.requireNonNull(urlFieldEditText);
        this.a = str;
        this.b = str2;
        StaticLayout.Builder.obtain(str, 0, str.length(), urlFieldEditText.getPaint(), Integer.MAX_VALUE).build().getLineWidth(0);
        this.c = (int) Math.ceil(StaticLayout.Builder.obtain(str2, 0, str2.length(), urlFieldEditText.getPaint(), Integer.MAX_VALUE).build().getLineWidth(0));
    }

    public wpg(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }
}
