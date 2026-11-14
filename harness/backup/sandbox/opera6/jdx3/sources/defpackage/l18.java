package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public class l18 extends o1e {
    public EditText f;
    public TextInputLayout g;
    public boolean h;

    @Override // defpackage.uim
    public final Dialog g0(Bundle bundle) {
        az0 az0Var = new az0(getActivity());
        View viewInflate = LayoutInflater.from(az0Var.getContext()).inflate(2131558692, (ViewGroup) null);
        this.f = (EditText) viewInflate.findViewById(2131363856);
        this.g = viewInflate.findViewById(2131363857);
        this.f.addTextChangedListener(new mj2(this, (byte) 8));
        az0Var.setView(viewInflate);
        az0Var.b(2132020324);
        az0Var.setPositiveButton(2132020325, (DialogInterface.OnClickListener) null);
        az0Var.setNegativeButton(2132018111, (DialogInterface.OnClickListener) null);
        bz0 bz0VarCreate = az0Var.create();
        bz0VarCreate.setOnShowListener(new kz0(this, bz0VarCreate, (byte) 2));
        return bz0VarCreate;
    }

    @Override // defpackage.o1e
    public final void k0() {
        this.h = true;
        super.k0();
    }

    @Override // defpackage.o1e
    public final void l0(String str) {
        this.g.p(str);
    }
}
