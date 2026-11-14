package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class xbk extends i7c {
    public final /* synthetic */ z43 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbk(z43 z43Var) {
        super((byte) 0);
        this.d = z43Var;
    }

    @Override // defpackage.i7c
    public final Object e(Object obj) {
        return this.d.r(((Context) obj).getApplicationContext());
    }
}
