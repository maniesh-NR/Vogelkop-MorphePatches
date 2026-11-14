package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class hth extends IOException {
    public final String a;

    public hth(String str, Throwable th) {
        super(str, th);
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
