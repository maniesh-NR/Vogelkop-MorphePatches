package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class g1h {
    public final f1h a;

    public g1h(f1h f1hVar) {
        this.a = f1hVar;
    }

    public final xcc a(ndc ndcVar, jf4 jf4Var, agm agmVar) {
        p12 p12Var = this.a.a;
        Trace.beginSection("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (p12Var.e() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
            }
            p12Var.v(1);
            return p12.a(p12Var, ndcVar, jf4Var, new bp3((ArrayList) agmVar.c, (k8n) agmVar.b, (ArrayList) agmVar.d));
        } finally {
            Trace.endSection();
        }
    }

    public final void b(qrm... qrmVarArr) {
        p12 p12Var = this.a.a;
        qrm[] qrmVarArr2 = (qrm[]) Arrays.copyOf(qrmVarArr, qrmVarArr.length);
        Trace.beginSection("CX:unbind");
        try {
            xug.i();
            if (p12Var.e() == 2) {
                throw new UnsupportedOperationException("Unbind UseCase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            ((cdc) p12Var.f).j(new bp3(e82.p(qrmVarArr2), null, l08.a), (HashSet) p12Var.h);
        } finally {
            Trace.endSection();
        }
    }
}
