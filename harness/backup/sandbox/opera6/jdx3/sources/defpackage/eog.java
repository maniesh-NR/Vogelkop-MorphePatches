package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public class eog extends uim {
    public ps5 d;
    public LayoutInflater e;
    public View f;
    public ViewGroup g;
    public MenuItem.OnMenuItemClickListener h;

    public static pyc i0(Context context) {
        eog eogVar = new eog();
        ps5 ps5Var = new ps5(context);
        eogVar.d = ps5Var;
        ps5Var.c = eogVar;
        ps5Var.e = eogVar;
        eogVar.setRetainInstance(false);
        return new pyc(eogVar);
    }

    public static void k0(OperaListItem operaListItem, MenuItem menuItem) {
        String string = menuItem.getTitle().toString();
        if (!string.contains("\n")) {
            operaListItem.E(new qxh(string));
            operaListItem.C(null);
            return;
        }
        int iIndexOf = string.indexOf("\n");
        CharSequence charSequenceSubSequence = string.subSequence(0, iIndexOf);
        CharSequence charSequenceSubSequence2 = string.subSequence(iIndexOf + 1, string.length());
        operaListItem.E(new qxh(charSequenceSubSequence));
        operaListItem.C(new qxh(charSequenceSubSequence2));
    }

    public final int getTheme() {
        return 2132083342;
    }

    public final void j0(qtd qtdVar) {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = qtdVar.k;
        boolean z = onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(qtdVar);
        MenuItem.OnMenuItemClickListener onMenuItemClickListener2 = this.h;
        if (((onMenuItemClickListener2 == null || !onMenuItemClickListener2.onMenuItemClick(qtdVar)) ? z : true) && isAdded()) {
            h0();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.e = layoutInflater;
        View viewInflate = layoutInflater.inflate(2131559190, viewGroup, false);
        this.f = viewInflate;
        this.g = (ViewGroup) viewInflate.findViewById(2131363463);
        ps5 ps5Var = this.d;
        ps5Var.d(true);
        ps5Var.e();
        return this.f;
    }
}
