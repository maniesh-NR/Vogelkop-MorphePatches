package defpackage;

import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class gk extends hk {
    public final OperaListItem b;

    /* JADX WARN: Multi-variable type inference failed */
    public gk(OperaListItem operaListItem) {
        super(operaListItem);
        this.b = operaListItem;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof gk) && this.b.equals(((gk) obj).b);
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
