package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public enum tc9 implements lrf {
    /* JADX INFO: Fake field, exist only in values array */
    CONNECT(2132018346),
    SHOW_QR_CODE(2132019115),
    SIGN_IN(2132019560),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_ACCOUNT(2132020213);

    public final int a;

    tc9(int i) {
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
