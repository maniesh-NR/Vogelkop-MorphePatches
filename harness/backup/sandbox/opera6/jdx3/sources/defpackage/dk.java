package defpackage;

import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class dk extends hk {
    public final OperaListItem b;

    /* JADX WARN: Multi-variable type inference failed */
    public dk(OperaListItem operaListItem) {
        super(operaListItem);
        this.b = operaListItem;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof dk) && this.b.equals(((dk) obj).b);
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
