package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public final class cob implements dob {
    public final Intent a;
    public final int b;
    public final /* synthetic */ iob c;

    public cob(iob iobVar, Intent intent, int i) {
        this.c = iobVar;
        this.a = intent;
        this.b = i;
    }

    @Override // defpackage.dob
    public final void a() {
        this.c.stopSelf(this.b);
    }

    @Override // defpackage.dob
    public final Intent getIntent() {
        return this.a;
    }
}
