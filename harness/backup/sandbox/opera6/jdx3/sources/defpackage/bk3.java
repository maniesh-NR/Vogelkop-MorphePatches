package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class bk3 extends px8 {
    public final tx8 f;

    /* JADX WARN: Illegal instructions before constructor call */
    public bk3(msh mshVar, tx8 tx8Var, ox8 ox8Var) {
        String str = tx8Var.b;
        super(mshVar, 2131233000, new sxh(2132019373, new Object[]{str == null ? "" : str}), mshVar instanceof ure ? 2132018013 : 2132018009, ox8Var);
        this.f = tx8Var;
    }

    @Override // defpackage.px8
    public final List a(Context context, msh mshVar) {
        return Collections.singletonList(this.f);
    }

    @Override // defpackage.px8
    public final void c(View view) {
        view.getContext();
        this.e.f(Collections.singletonList(this.f));
    }
}
