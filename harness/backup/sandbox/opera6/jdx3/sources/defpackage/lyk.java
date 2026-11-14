package defpackage;

import com.opera.api.Callback;

/* loaded from: classes.dex */
public final class lyk extends cb implements ih4 {
    public final Runnable a;
    public final Callback b;
    public String c;
    public boolean d;
    public final /* synthetic */ myk e;

    public lyk(myk mykVar, Runnable runnable, Callback callback, String str) {
        this.e = mykVar;
        this.a = runnable;
        this.b = callback;
        this.c = str;
        mykVar.b.a(this);
    }

    @Override // defpackage.cb
    public final void b() {
        h("Failed to sign in");
    }

    @Override // defpackage.cb
    public final void c() {
        h(null);
    }

    @Override // defpackage.ih4
    public final void cancel() {
        h("Cancelled");
    }

    public final void h(String str) {
        if (this.d) {
            return;
        }
        this.d = true;
        myk mykVar = this.e;
        if (mykVar.i == this) {
            mykVar.i = null;
        }
        mykVar.b.h(this);
        if (str == null) {
            String str2 = this.c;
            if (str2 != null) {
                mykVar.c(str2);
            }
            this.a.run();
        } else {
            this.b.run(str);
        }
        this.c = null;
    }
}
