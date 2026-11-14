package defpackage;

import androidx.annotation.NonNull;
import com.opera.android.annotations.WeakOwner;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class rc9 {
    public final tcl a;
    public final bf9 b;
    public final ArrayList c = new ArrayList();
    public final h7f d = new h7f();

    @NonNull
    @WeakOwner
    private final sc9 e;
    public final ArrayList f;
    public ih4 g;

    public rc9(tcl tclVar, bf9 bf9Var) {
        qc9 qc9Var = new qc9(this);
        this.e = qc9Var;
        this.f = new ArrayList();
        this.a = tclVar;
        this.b = bf9Var;
        pc9 pc9VarQ = bf9Var.q();
        byte b = 0;
        if (pc9VarQ == null) {
            qc9Var.a(0, Collections.EMPTY_LIST);
            return;
        }
        pc9VarQ.e.add(qc9Var);
        pc9VarQ.f.add(qc9Var);
        qie qieVar = pc9VarQ.g;
        umi umiVar = pc9VarQ.b;
        nml nmlVarB = umiVar.b(new ec9(pc9VarQ, b));
        nmlVarB.b(umiVar.f(new ge5(pc9VarQ, qc9Var, (byte) 22)));
        qieVar.n(new oml(nmlVarB), null);
    }
}
