package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public enum q7j implements lrf {
    BACKGROUND(2132021434),
    FOREGROUND(2132021436);

    public final int a;

    q7j(int i) {
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
