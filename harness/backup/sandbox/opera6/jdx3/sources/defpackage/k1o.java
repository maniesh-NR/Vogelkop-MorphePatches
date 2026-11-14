package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class k1o extends g1o {
    public final byte g;

    /* JADX WARN: Multi-variable type inference failed */
    public k1o(int i, String str, int i2) {
        super(str, 2131232397, 2132018289, 2131102906, i, 0);
        this.g = i2;
    }

    @Override // defpackage.g1o
    public final String a(Context context) {
        byte b = this.g;
        return context.getString(b != 0 ? b != 2 ? b != 3 ? b != 4 ? 2132021635 : 2132022277 : 2132022278 : 2132022275 : 2132021862);
    }

    @Override // defpackage.g1o
    public final int b() {
        byte b = this.g;
        return (b == 0 || b == 3 || b == 4) ? 1 : 0;
    }

    @Override // defpackage.g1o
    public final int c() {
        byte b = this.g;
        return (b == 0 || b == 2 || b == 3 || b == 4) ? 1 : 0;
    }

    @Override // defpackage.g1o
    public final boolean d() {
        byte b = this.g;
        return (b == 4 || b == 3 || b == 0) ? false : true;
    }
}
