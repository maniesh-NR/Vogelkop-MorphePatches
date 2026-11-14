package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public enum s7j implements lrf {
    MOBILE(2132021476),
    DESKTOP(2132021475);

    public final int a;

    s7j(int i) {
        this.a = i;
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
