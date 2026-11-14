package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
class dxd extends agc {
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxd(Context context, String str) {
        super(context);
        this.e = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        vx3 vx3VarA = ay3.a(this.e, lqm.w, false);
        vx3VarA.b = 3;
        o18.t(vx3VarA, true, vx3VarA);
    }
}
