package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import com.opera.android.OperaApplication;
import com.opera.android.annotations.WeakOwner;

/* loaded from: classes.dex */
public final class pse extends lim {

    @NonNull
    @WeakOwner
    private final ose a;

    public pse(Context context) {
        this.a = new ose(context.getApplicationContext());
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        ose oseVar = this.a;
        oseVar.b.k(oseVar);
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        c6j c6jVar;
        ndcVar.getLifecycle().b(this);
        ose oseVar = this.a;
        Context context = oseVar.a;
        String[] strArr = OperaApplication.K;
        if (oseVar.f && (c6jVar = oseVar.d) != null) {
            c6jVar.c.remove(oseVar);
            oseVar.d = null;
        }
        oseVar.b.p(oseVar);
        oseVar.e = true;
    }
}
