package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class dqe implements esk {
    public String a;
    public boolean b;
    public final /* synthetic */ fqe c;

    public dqe(fqe fqeVar) {
        this.c = fqeVar;
    }

    public final Object get() {
        if (this.b) {
            return this.a;
        }
        Context context = this.c.a;
        String[] strArr = OperaApplication.K;
        return ((OperaApplication) context.getApplicationContext()).i().a();
    }
}
