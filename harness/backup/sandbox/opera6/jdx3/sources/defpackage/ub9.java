package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
class ub9 extends agc {
    public final /* synthetic */ String e;
    public final /* synthetic */ tw2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub9(tw2 tw2Var, Context context, String str) {
        super(context);
        this.e = str;
        this.f = tw2Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ((wb9) this.f.b).n.run(this.e);
    }
}
