package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public enum o7j implements lrf {
    AUTO(2132021389, "auto"),
    ENABLED(2132021391, "enabled"),
    DISABLED(2132021390, "disabled");

    public final int a;
    public final String b;

    o7j(int i, String str) {
        this.a = i;
        this.b = str;
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
