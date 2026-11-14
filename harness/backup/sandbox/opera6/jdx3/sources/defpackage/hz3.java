package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class hz3 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hz3(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                lz3 lz3Var = (lz3) obj;
                i7f i7fVar = lz3Var.c;
                g7f g7fVarC = u35.c(i7fVar, i7fVar);
                while (g7fVarC.hasNext()) {
                    ((kz3) g7fVarC.next()).f();
                }
                if (z) {
                    lz3Var.b(hjm.a);
                    break;
                }
                break;
            default:
                js6 js6Var = ((qkc) obj).b;
                js6Var.b = true;
                ((xoc) js6Var.g).a(z ? tg0.l : tg0.m);
                ((fs6) js6Var.d).a.V(z ? 1 : 0, "live_scores_odds_enabled");
                break;
        }
    }
}
