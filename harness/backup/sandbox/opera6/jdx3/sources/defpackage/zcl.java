package defpackage;

import android.os.PersistableBundle;

/* loaded from: classes.dex */
public final class zcl {
    public final int a;
    public PersistableBundle b;

    public zcl(int i) {
        this.a = i;
    }

    public zcl(zcl zclVar) {
        this.a = zclVar.a;
        PersistableBundle persistableBundle = zclVar.b;
        this.b = persistableBundle == null ? new PersistableBundle() : persistableBundle;
    }
}
