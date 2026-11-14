package defpackage;

import android.view.View;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final class toj implements View.OnClickListener {
    public final /* synthetic */ kag[] a;
    public final /* synthetic */ OperaListItem b;
    public final /* synthetic */ uoj c;

    public toj(uoj uojVar, kag[] kagVarArr, OperaListItem operaListItem) {
        this.a = kagVarArr;
        this.b = operaListItem;
        this.c = uojVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        uoj uojVar = this.c;
        z77 z77VarU = sfe.U(uojVar.getContext());
        pyc pycVarI0 = eog.i0(uojVar.getContext());
        eog eogVar = (eog) pycVarI0.a;
        OperaListItem operaListItem = this.b;
        kag[] kagVarArr = this.a;
        eogVar.h = new soj(this, kagVarArr, operaListItem);
        ps5 ps5Var = eogVar.d;
        s9g s9gVar = s9g.h;
        lag lagVar = uojVar.t;
        kag kagVarK = s9gVar.b.k(lagVar);
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= 3) {
                ps5Var.setHeaderTitle(ui6.S(uojVar.getContext(), lagVar));
                ps5Var.setGroupCheckable(1, true, true);
                z77VarU.getClass();
                z77VarU.b(pycVarI0, ijm.b);
                return;
            }
            kag kagVar = kagVarArr[i];
            qtd qtdVarA = ps5Var.a(1, i, 0, ui6.R(uojVar.getContext(), lagVar, kagVarArr[i], (String) null));
            if (kagVar != kagVarK) {
                z = false;
            }
            qtdVarA.setChecked(z);
            i++;
        }
    }
}
