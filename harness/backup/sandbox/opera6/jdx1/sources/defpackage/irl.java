package defpackage;

import android.widget.Toast$Callback;

/* loaded from: classes.dex */
public final class irl extends Toast$Callback {
    public final /* synthetic */ grl a;

    public irl(mhj mhjVar, grl grlVar) {
        this.a = grlVar;
    }

    public final void onToastHidden() {
        this.a.run();
    }
}
