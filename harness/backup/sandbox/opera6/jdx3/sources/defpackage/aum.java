package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import com.opera.android.OperaApplication;
import com.opera.android.annotations.WeakOwner;

/* loaded from: classes.dex */
public final class aum {
    public static aum d;
    public final Context a;
    public pu8 b;

    @NonNull
    @WeakOwner
    private final q8j c = new xy(this, 4);

    public aum(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        String[] strArr = OperaApplication.K;
        fue fueVarZ = ((OperaApplication) applicationContext.getApplicationContext()).z();
        fueVarZ.d();
        if (fueVarZ.a == cue.NewsFeed) {
            a();
        } else {
            fueVarZ.b(new ztm(this, fueVarZ));
        }
    }

    public final void a() {
        String[] strArr = OperaApplication.K;
        uqe uqeVarC = ((OperaApplication) this.a.getApplicationContext()).y().c();
        uqeVarC.s.b(this.c);
    }
}
