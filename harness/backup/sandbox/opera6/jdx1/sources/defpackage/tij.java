package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final /* synthetic */ class tij implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ shf b;

    public /* synthetic */ tij(shf shfVar, byte b) {
        this.a = b;
        this.b = shfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        shf shfVar = this.b;
        switch (b) {
            case 0:
                nak nakVar = (nak) ((d7h) shfVar.b).b;
                nakVar.k((Object) null, s5h.a((s5h) nakVar.getValue(), (n8g) null, !((s5h) nakVar.getValue()).b, 0, 61));
                break;
            case 1:
                ((d7h) shfVar.b).f(1);
                break;
            case 2:
                ((d7h) shfVar.b).f(2);
                break;
            default:
                Context context = (Context) shfVar.c;
                ImageView imageView = ((ora) shfVar.a).o;
                x79 x79Var = new x79();
                x79Var.a = context;
                x79Var.c = imageView;
                itd itdVar = new itd(context);
                x79Var.b = itdVar;
                itdVar.e = new i4d(x79Var, (byte) 17);
                fud fudVar = new fud(2130970559, 0, itdVar, context, imageView, false);
                x79Var.d = fudVar;
                fudVar.g = 0;
                fudVar.k = new cog();
                new lsk(context).inflate(2131755034, (itd) x79Var.b);
                x79Var.e = new txi(shfVar, (byte) 4);
                fud fudVar2 = (fud) x79Var.d;
                if (!fudVar2.b()) {
                    if (fudVar2.f == null) {
                        qp2.n("MenuPopupHelper cannot be used without an anchor");
                        break;
                    } else {
                        fudVar2.d(0, 0, false, false);
                        break;
                    }
                }
                break;
        }
    }
}
