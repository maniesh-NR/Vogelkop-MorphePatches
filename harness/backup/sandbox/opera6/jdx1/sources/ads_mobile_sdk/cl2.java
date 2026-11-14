package ads_mobile_sdk;

import ads_mobile_sdk.cl2;
import android.content.Context;
import defpackage.bql;
import defpackage.ce2;
import defpackage.glo;
import defpackage.kap;
import defpackage.qpo;
import defpackage.sso;
import defpackage.xq9;
import defpackage.yjp;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class cl2 implements glo {
    public final Context a;
    public final kap b;
    public final yjp c;
    public final th3 d;
    public final ExecutorService e;
    public final pl2 f;
    public final z6 g;

    public cl2(Context context, kap kapVar, yjp yjpVar, th3 th3Var, ExecutorService executorService, pl2 pl2Var, z6 z6Var) {
        this.a = context;
        this.b = kapVar;
        this.c = yjpVar;
        this.d = th3Var;
        this.e = executorService;
        this.f = pl2Var;
        this.g = z6Var;
    }

    @Override // defpackage.glo
    public final ef9 a() {
        fl0 fl0Var = fl0.EVENT_ID_DG_FETCHER_FETCH_PROGRAM;
        kap kapVar = this.b;
        Objects.requireNonNull(kapVar);
        ce2 ce2Var = new ce2(kapVar, (byte) 9);
        ExecutorService executorService = this.e;
        ef9 ef9VarH = ef9.h(yr9.e(ce2Var, executorService));
        final byte b = 0;
        xq9 xq9Var = new xq9(this) { // from class: rso
            public final /* synthetic */ cl2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0073 A[Catch: all -> 0x022f, TRY_LEAVE, TryCatch #9 {all -> 0x022f, blocks: (B:9:0x0049, B:11:0x004f, B:13:0x005a, B:21:0x006c, B:23:0x0073, B:20:0x0068), top: B:110:0x0049 }] */
            /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
            @Override // defpackage.xq9
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r25) {
                /*
                    Method dump skipped, instructions count: 636
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.rso.apply(java.lang.Object):java.lang.Object");
            }
        };
        m97 m97Var = m97.a;
        final byte b2 = 1;
        ef9 ef9VarI = o3.i(g7.i(g7.j(g7.i(ef9VarH, xq9Var, m97Var), new sso(this, (byte) 0), m97Var), new xq9(this) { // from class: rso
            public final /* synthetic */ cl2 b;

            {
                this.b = this;
            }

            @Override // defpackage.xq9
            public final Object apply(Object v) {
                /*
                    Method dump skipped, instructions count: 636
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.rso.apply(java.lang.Object):java.lang.Object");
            }
        }, executorService), qpo.class, new bql((byte) 8), m97Var);
        this.d.a(fl0Var, ef9VarI);
        return ef9VarI;
    }
}
