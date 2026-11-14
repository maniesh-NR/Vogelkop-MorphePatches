package defpackage;

import android.content.Context;
import android.security.KeyChainAliasCallback;
import org.chromium.base.ThreadUtils;

/* loaded from: classes.dex */
public final class bei implements KeyChainAliasCallback {
    public final long a;
    public final Context b;
    public boolean c;

    public bei(Context context, long j) {
        this.b = context;
        this.a = j;
    }

    @Override // android.security.KeyChainAliasCallback
    public final void alias(String str) {
        if (this.c) {
            return;
        }
        this.c = true;
        ThreadUtils.d(new q2g(this, str, (byte) 27));
    }
}
