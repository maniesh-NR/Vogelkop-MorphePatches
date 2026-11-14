package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public enum e7j implements lrf {
    c(2132021099, "CLASSIC"),
    d(2132021101, "TABLET");

    public final int a;
    public final int b;

    e7j(int i, String str) {
        this.a = i;
        this.b = i;
    }

    @Override // defpackage.lrf
    public final String d(Resources resources) {
        return resources.getString(this.b);
    }

    @Override // defpackage.lrf
    public final int getDescription() {
        return this.a;
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
