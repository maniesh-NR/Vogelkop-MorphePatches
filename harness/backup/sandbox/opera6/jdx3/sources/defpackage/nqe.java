package defpackage;

import android.content.Context;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import java.net.URL;

/* loaded from: classes.dex */
public final class nqe extends lim implements mo7 {
    public final Context a;
    public final wnm b;
    public final ode c;
    public final mqe d;
    public final mqe e;
    public c6j f;
    public upc g;
    public URL h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [mqe] */
    /* JADX WARN: Type inference failed for: r1v6, types: [mqe] */
    public nqe(BrowserActivity browserActivity, dse dseVar, x0f x0fVar) {
        this.a = browserActivity.getApplicationContext();
        this.b = dseVar.a;
        this.c = x0fVar.a("news");
        final byte b = 0;
        this.d = new f7f(this) { // from class: mqe
            public final /* synthetic */ nqe b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                nqe nqeVar = this.b;
                switch (b2) {
                    case 0:
                        nqeVar.S();
                        break;
                    default:
                        nqeVar.S();
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.e = new f7f(this) { // from class: mqe
            public final /* synthetic */ nqe b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                nqe nqeVar = this.b;
                switch (b22) {
                    case 0:
                        nqeVar.S();
                        break;
                    default:
                        nqeVar.S();
                        break;
                }
            }
        };
    }

    public final void R(boolean z) {
        c6j c6jVar = this.f;
        if (!z) {
            if (c6jVar != null) {
                upc upcVar = this.g;
                if (upcVar != null) {
                    c6jVar.c.remove(upcVar);
                    this.g = null;
                }
                this.f = null;
                return;
            }
            return;
        }
        if (c6jVar == null) {
            String[] strArr = OperaApplication.K;
            c6j c6jVarH = ((OperaApplication) this.a.getApplicationContext()).y().c().h();
            this.f = c6jVarH;
            upc upcVar2 = new upc(this, (byte) 1);
            this.g = upcVar2;
            nre nreVar = (nre) c6jVarH.b;
            if (nreVar != null) {
                this.h = nreVar.b;
            }
            c6jVarH.c.add(upcVar2);
        }
    }

    public final void S() {
        cse cseVar = (cse) this.b.g();
        v0f v0fVar = (v0f) this.c.g();
        if (cseVar == cse.c || v0fVar == null) {
            return;
        }
        boolean z = false;
        boolean z2 = cseVar == cse.a && v0fVar == v0f.c;
        Context context = this.a;
        if (((aml) bml.u(context).i()).a && z2) {
            z = true;
        }
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context.getApplicationContext()).q().c(d59.e, z);
        R(z2);
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        bml.u(this.a).F(this);
    }

    @Override // defpackage.mo7
    public final void o(boolean z) {
        if (z) {
            this.b.k(this.d);
            this.c.k(this.e);
        }
        S();
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        bml.u(this.a).H(this);
        R(false);
        this.b.p(this.d);
        this.c.p(this.e);
    }
}
