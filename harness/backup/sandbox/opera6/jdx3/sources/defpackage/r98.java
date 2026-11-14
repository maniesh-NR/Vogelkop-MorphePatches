package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.opera.android.OperaApplication;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class r98 extends wbh {
    public final /* synthetic */ byte r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r98(Context context, orm ormVar, skm skmVar, Bundle bundle, s0f s0fVar, byte b) {
        super(context, ormVar, skmVar, bundle, s0fVar);
        this.r = b;
    }

    @Override // defpackage.qyl
    public final Boolean b() {
        byte b = this.r;
        return null;
    }

    @Override // defpackage.qyl
    public final zn0 i() {
        switch (this.r) {
            case 0:
                return zn0.o;
            default:
                return zn0.k;
        }
    }

    @Override // defpackage.wbh
    public final String l() {
        switch (this.r) {
            case 0:
                return "esim";
            default:
                return "rewards";
        }
    }

    @Override // defpackage.wbh
    public final String o() {
        switch (this.r) {
            case 0:
                return "esim";
            default:
                return "rewards";
        }
    }

    @Override // defpackage.wbh
    public final int p() {
        switch (this.r) {
            case 0:
                return 5;
            default:
                return 4;
        }
    }

    @Override // defpackage.wbh
    public final boolean w() {
        byte b = this.r;
        vn0 vn0Var = vn0.q;
        Context context = this.a;
        switch (b) {
            case 0:
                if (wbh.m(context, "esim") != 1) {
                    t(vn0Var);
                } else {
                    if (!((Boolean) scd.g0(h.a, new yf((byte) 21, (mt5) null, this))).booleanValue()) {
                        t(vn0.s);
                    }
                }
                break;
            default:
                String[] strArr = OperaApplication.K;
                if (((k3i) ((OperaApplication) context.getApplicationContext()).D.get()).c()) {
                    if (wbh.m(context, "rewards") == 0) {
                        t(vn0Var);
                    } else {
                        s0f s0fVar = this.d;
                        if (s0fVar != null && !s0fVar.g(context)) {
                            t(vn0.n);
                        }
                    }
                }
                break;
        }
        return true;
    }
}
