package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public enum r7j implements lrf {
    NEVER(2132021228),
    BOTH(2132021230),
    ONLY_ADDRESS_BAR(2132021229);

    public final int a;

    r7j(int i) {
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
