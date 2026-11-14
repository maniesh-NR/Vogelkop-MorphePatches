package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public enum m7j implements lrf {
    OFF(2132021235),
    LOW(2132021233),
    MEDIUM(2132021234),
    HIGH(2132021232);

    public final int a;

    m7j(int i) {
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
