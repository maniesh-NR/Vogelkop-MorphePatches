package defpackage;

import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import com.opera.android.ui.catalog.widget.OperaTextView;

/* loaded from: classes.dex */
public final class ttg {
    public final OperaTextView a;
    public final OperaTextView b;
    public final OperaMaterialButton c;

    public ttg(OperaTextView operaTextView, OperaTextView operaTextView2, OperaMaterialButton operaMaterialButton) {
        this.a = operaTextView;
        this.b = operaTextView2;
        this.c = operaMaterialButton;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ttg) {
            ttg ttgVar = (ttg) obj;
            if (this.a == ttgVar.a && this.b == ttgVar.b && this.c.equals(ttgVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
