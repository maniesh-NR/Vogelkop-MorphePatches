package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
class e0h extends agc {
    public final /* synthetic */ f0h e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0h(f0h f0hVar, Context context) {
        super(context);
        this.e = f0hVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        f0h f0hVar = this.e;
        f0hVar.d.n0(en0.i);
        f0hVar.g0(new ozg(f0hVar.a, f0hVar.b, f0hVar.c, f0hVar.d, f0hVar.e));
    }
}
