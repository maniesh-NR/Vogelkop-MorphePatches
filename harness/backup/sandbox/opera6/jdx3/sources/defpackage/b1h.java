package defpackage;

import org.chromium.content.app.ContentChildProcessServiceDelegate;

/* loaded from: classes.dex */
public abstract class b1h extends zp5 {
    public final /* synthetic */ byte c;

    public final ContentChildProcessServiceDelegate a() {
        switch (this.c) {
            case 0:
                return new a1h((byte) 0);
            default:
                return new a1h((byte) 1);
        }
    }
}
