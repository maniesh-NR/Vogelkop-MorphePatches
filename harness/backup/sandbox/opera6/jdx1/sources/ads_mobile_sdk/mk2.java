package ads_mobile_sdk;

import ads_mobile_sdk.mk2;
import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bql;
import defpackage.edp;
import defpackage.kap;
import defpackage.nzo;
import defpackage.yjp;

/* loaded from: classes.dex */
public final class mk2 implements edp {
    public final kap a;
    public final kap b;
    public final kap c;
    public final boolean d;
    public final long e;
    public final boolean f;
    public final boolean g;

    public mk2(kap kapVar, kap kapVar2, kap kapVar3, boolean z, long j, boolean z2, boolean z3) {
        this.a = kapVar;
        this.b = kapVar2;
        this.c = kapVar3;
        this.d = z;
        this.e = j;
        this.f = z2;
        this.g = z3;
    }

    @Override // defpackage.edp
    public final ListenableFuture a() {
        int iC = ((nzo) this.b.get()).c();
        kap kapVar = this.c;
        m97 m97Var = m97.a;
        if (iC == 4 && this.f && this.g) {
            n3 n3VarI = o3.i(ef9.h(((yjp) kapVar.get()).b()), Throwable.class, new bql((byte) 12), m97Var);
            final byte b = 0;
            return g7.j(n3VarI, new dd2(this) { // from class: lbp
                public final /* synthetic */ mk2 b;

                {
                    this.b = this;
                }

                public final ListenableFuture apply(Object obj) {
                    byte b2 = b;
                    mk2 mk2Var = this.b;
                    switch (b2) {
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                        default:
                            break;
                    }
                    return ((nzo) mk2Var.b.get()).a();
                }
            }, m97Var);
        }
        if (this.d) {
            final byte b2 = 1;
            e7 e7VarJ = g7.j(o3.i(ef9.h(((wl3) this.a.get()).a()), Throwable.class, new bql((byte) 13), m97Var), new dd2(this) { // from class: lbp
                public final /* synthetic */ mk2 b;

                {
                    this.b = this;
                }

                public final ListenableFuture apply(Object obj) {
                    byte b22 = b2;
                    mk2 mk2Var = this.b;
                    switch (b22) {
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                        default:
                            break;
                    }
                    return ((nzo) mk2Var.b.get()).a();
                }
            }, m97Var);
            final byte b3 = 2;
            return g7.j(e7VarJ, new dd2(this) { // from class: lbp
                public final /* synthetic */ mk2 b;

                {
                    this.b = this;
                }

                public final ListenableFuture apply(Object obj) {
                    byte b22 = b3;
                    mk2 mk2Var = this.b;
                    switch (b22) {
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            break;
                        default:
                            break;
                    }
                    return ((nzo) mk2Var.b.get()).a();
                }
            }, m97Var);
        }
        n3 n3VarI2 = o3.i(ef9.h(((yjp) kapVar.get()).b()), Throwable.class, new bql((byte) 14), m97Var);
        final byte b4 = 3;
        e7 e7VarJ2 = g7.j(n3VarI2, new dd2(this) { // from class: lbp
            public final /* synthetic */ mk2 b;

            {
                this.b = this;
            }

            public final ListenableFuture apply(Object obj) {
                byte b22 = b4;
                mk2 mk2Var = this.b;
                switch (b22) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    default:
                        break;
                }
                return ((nzo) mk2Var.b.get()).a();
            }
        }, m97Var);
        e7VarJ2.addListener(new ttn(this, (byte) 25), m97Var);
        return e7VarJ2;
    }

    @Override // defpackage.edp
    public final ListenableFuture a(Context context) {
        return ((nzo) this.b.get()).a(context);
    }

    @Override // defpackage.edp
    public final ListenableFuture a(Context context, String str, View view, Activity activity) {
        return ((nzo) this.b.get()).a(context, str, view, activity);
    }

    @Override // defpackage.edp
    public final void a(MotionEvent motionEvent) {
        ((nzo) this.b.get()).a(motionEvent);
    }

    @Override // defpackage.edp
    public final ListenableFuture b(Context context, String str, View view, Activity activity) {
        return ((nzo) this.b.get()).b(context, str, view, activity);
    }

    @Override // defpackage.edp
    public final String b() {
        return ((nzo) this.b.get()).b();
    }
}
