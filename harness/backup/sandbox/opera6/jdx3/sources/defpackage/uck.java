package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class uck {
    public final n4l a;
    public sck b;
    public final d5a c;
    public final /* synthetic */ ev7 d;

    public uck(final ev7 ev7Var, n4l n4lVar) {
        this.d = ev7Var;
        this.a = n4lVar;
        tsd tsdVarW = a26.w((pde) ev7Var.a, p37.z(n4lVar.a));
        final byte b = 0;
        this.b = new sck(0);
        final byte b2 = 1;
        final byte b3 = 2;
        this.c = new d5a(tsdVarW, n4lVar, (v8a) ev7Var.d, (pde) ev7Var.g, new Function0() { // from class: tck
            public final Object invoke() {
                byte b4 = b;
                uck uckVar = this;
                ev7 ev7Var2 = ev7Var;
                switch (b4) {
                    case 0:
                        ((ypd) ev7Var2.e).q(uckVar.b.a);
                        break;
                    case 1:
                        ((ypd) ev7Var2.e).p0(uckVar.b.a);
                        break;
                    default:
                        ((ypd) ev7Var2.e).E(uckVar.b.a);
                        break;
                }
                return Unit.a;
            }
        }, new Function0() { // from class: tck
            public final Object invoke() {
                byte b4 = b2;
                uck uckVar = this;
                ev7 ev7Var2 = ev7Var;
                switch (b4) {
                    case 0:
                        ((ypd) ev7Var2.e).q(uckVar.b.a);
                        break;
                    case 1:
                        ((ypd) ev7Var2.e).p0(uckVar.b.a);
                        break;
                    default:
                        ((ypd) ev7Var2.e).E(uckVar.b.a);
                        break;
                }
                return Unit.a;
            }
        }, new d7k((Object) ev7Var, (Object) this, (byte) 5), new Function0() { // from class: tck
            public final Object invoke() {
                byte b4 = b3;
                uck uckVar = this;
                ev7 ev7Var2 = ev7Var;
                switch (b4) {
                    case 0:
                        ((ypd) ev7Var2.e).q(uckVar.b.a);
                        break;
                    case 1:
                        ((ypd) ev7Var2.e).p0(uckVar.b.a);
                        break;
                    default:
                        ((ypd) ev7Var2.e).E(uckVar.b.a);
                        break;
                }
                return Unit.a;
            }
        });
        TextView textView = n4lVar.b;
        kkf kkfVar = new kkf(this, (byte) 28);
        dll dllVarS = q9n.s(textView);
        if (dllVarS == null) {
            return;
        }
        u8n.b(dllVarS, textView, kkfVar);
    }

    public final void a() {
        ConstraintLayout constraintLayout = this.a.a;
        b8h b8hVarF = ((eyj) ((pde) this.d.g).g()).i.f();
        constraintLayout.setBackground(b8hVarF != null ? b8hVarF.f(constraintLayout.getContext()) : null);
    }
}
