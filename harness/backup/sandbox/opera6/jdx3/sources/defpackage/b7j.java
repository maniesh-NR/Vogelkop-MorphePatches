package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public enum b7j implements lrf {
    c(0, "TOP"),
    d(1, "BOTTOM");

    public final int a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    b7j(int i, String str) {
        this.a = i;
        this.b = i;
    }

    @Override // defpackage.lrf
    public final String d(Resources resources) {
        return resources.getString(this.a);
    }

    @Override // defpackage.lrf
    public final int getDescription() {
        return 0;
    }

    @Override // defpackage.lrf
    public final int getIcon() {
        return 0;
    }

    @Override // defpackage.lrf
    public final int getValue() {
        return ordinal();
    }
}
