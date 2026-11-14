package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public final class sz9 implements ni {
    public final /* synthetic */ nh4 a;

    public sz9(nh4 nh4Var) {
        this.a = nh4Var;
    }

    public final void a(int i, Intent intent) {
        nh4 nh4Var = this.a;
        if (nh4Var.r() instanceof c0f) {
            p0i p0iVar = t0i.b;
            nh4Var.resumeWith(Boolean.valueOf(i == -1));
        }
    }
}
