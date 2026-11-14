package defpackage;

import android.text.style.ForegroundColorSpan;

/* loaded from: classes.dex */
public final class lpm extends ForegroundColorSpan implements npm {
    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof npm) && getForegroundColor() == ((lpm) obj).getForegroundColor();
    }

    public final int hashCode() {
        return getForegroundColor();
    }
}
