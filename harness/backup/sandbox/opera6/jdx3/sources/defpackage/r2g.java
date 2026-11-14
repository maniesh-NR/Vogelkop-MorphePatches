package defpackage;

import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class r2g implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x79 b;
    public final /* synthetic */ xbf c;

    public /* synthetic */ r2g(x79 x79Var, xbf xbfVar, byte b) {
        this.a = b;
        this.b = x79Var;
        this.c = xbfVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        byte b2 = 1;
        xbf xbfVar = this.c;
        x79 x79Var = this.b;
        switch (b) {
            case 0:
                x2g x2gVar = (x2g) obj;
                if (x2gVar != null) {
                    x79Var.getClass();
                    x79Var.c0(x2gVar, 0, false, new r2g(x79Var, xbfVar, b2));
                    break;
                } else {
                    x79Var.e = null;
                    break;
                }
            default:
                x79Var.getClass();
                if (((Boolean) obj).booleanValue()) {
                    x79 x79Var2 = (x79) x79Var.e;
                    ArrayList arrayList = (ArrayList) x79Var2.e;
                    c3g c3gVar = (c3g) x79Var2.d;
                    i32 i32Var = (i32) xbfVar.b;
                    i32Var.getClass();
                    i32Var.f(new jbd(i32Var, arrayList, c3gVar, (byte) 12));
                    ode odeVar = (ode) xbfVar.f;
                    Objects.requireNonNull(odeVar);
                    xbfVar.i(new m2g(odeVar, (byte) 1));
                    ode odeVar2 = (ode) xbfVar.e;
                    Objects.requireNonNull(odeVar2);
                    m2g m2gVar = new m2g(odeVar2, (byte) 2);
                    i32 i32Var2 = (i32) xbfVar.b;
                    j12 j12Var = new j12(m2gVar, (byte) 11);
                    i32Var2.getClass();
                    i32Var2.f(new q2g(i32Var2, j12Var, (byte) 0));
                }
                x79Var.e = null;
                break;
        }
    }
}
