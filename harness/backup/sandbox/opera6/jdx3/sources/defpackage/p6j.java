package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class p6j implements q6j {
    public final int a;

    public p6j(int i) {
        this.a = i;
    }

    @Override // defpackage.q6j
    public final String a(Context context) {
        int i = this.a;
        return i == 0 ? "" : context.getString(i);
    }
}
