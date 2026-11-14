package defpackage;

import android.text.TextUtils;
import java.io.InputStream;
import java.util.Date;

/* loaded from: classes.dex */
public final class xyo implements kro {
    public long b = 0;

    @Override // defpackage.kro
    public final String a() {
        return "last-modified";
    }

    @Override // defpackage.kro
    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b = Date.parse(str);
    }

    @Override // defpackage.kro
    public final Object b(InputStream inputStream) {
        return new mxo(dyg.c(inputStream), this.b);
    }
}
