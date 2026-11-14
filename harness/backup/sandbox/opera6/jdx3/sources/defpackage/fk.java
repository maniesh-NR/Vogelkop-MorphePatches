package defpackage;

import com.opera.android.custom_views.StylingTextView;

/* loaded from: classes.dex */
public final class fk extends hk {
    public final StylingTextView b;

    /* JADX WARN: Multi-variable type inference failed */
    public fk(StylingTextView stylingTextView) {
        super(stylingTextView);
        this.b = stylingTextView;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof fk) && this.b.equals(((fk) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "";
    }
}
