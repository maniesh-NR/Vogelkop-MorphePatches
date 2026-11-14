package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class ydj {
    public final ru9 a;

    public ydj(Context context, byte b) {
        switch (b) {
            case 1:
                this.a = ru9.c(context);
                break;
            default:
                this.a = ru9.c(context.getApplicationContext());
                break;
        }
    }
}
