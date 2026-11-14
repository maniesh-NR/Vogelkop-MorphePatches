package defpackage;

import android.content.Context;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class ose implements q8j, b6j, f7f {
    public final Context a;
    public final wnm b;
    public boolean c;
    public c6j d;
    public boolean e;
    public boolean f;

    public ose(Context context) {
        this.a = context;
        String[] strArr = OperaApplication.K;
        this.b = ((dse) ((OperaApplication) context.getApplicationContext()).r.j0.get()).a;
    }

    @Override // defpackage.q8j
    public final void a() {
        if (this.e || !this.f) {
            return;
        }
        String[] strArr = OperaApplication.K;
        ((OperaApplication) this.a.getApplicationContext()).y().a(this);
    }

    @Override // defpackage.b6j
    public final void b() {
        if (this.e) {
            return;
        }
        c6j c6jVar = this.d;
        nre nreVar = c6jVar != null ? (nre) c6jVar.b : null;
        if ((nreVar != null ? nreVar.b : null) != null) {
            this.c = true;
        }
    }

    @Override // defpackage.q8j
    public final void c(Object obj) {
    }

    public final void d0(Object obj) {
        int iOrdinal = ((cse) obj).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return;
                }
            } else if (!this.f) {
                return;
            } else {
                this.f = false;
            }
        } else if (this.f) {
            return;
        } else {
            this.f = true;
        }
        String[] strArr = OperaApplication.K;
        Context context = this.a;
        OperaApplication operaApplication = (OperaApplication) context.getApplicationContext();
        boolean z = this.f;
        if (!z) {
            c6j c6jVar = this.d;
            if (c6jVar != null) {
                c6jVar.c.remove(this);
                this.d = null;
                return;
            }
            return;
        }
        if (!this.e && z && this.d == null) {
            c6j c6jVarH = ((OperaApplication) context.getApplicationContext()).y().c().h();
            this.d = c6jVarH;
            if (!this.c) {
                this.c = true;
            }
            c6jVarH.c.add(this);
        }
        operaApplication.y().a(this);
    }
}
