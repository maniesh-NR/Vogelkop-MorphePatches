package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import java.util.Objects;

/* loaded from: classes.dex */
public final class wke implements View.OnClickListener {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final /* synthetic */ Object c;

    public wke(eog eogVar, MenuItem menuItem) {
        this.b = menuItem;
        Objects.requireNonNull(eogVar);
        this.c = eogVar;
    }

    public wke(pg5 pg5Var, px8 px8Var) {
        this.c = pg5Var;
        this.b = px8Var;
    }

    public wke(rtl rtlVar) {
        this.c = rtlVar;
        Context context = rtlVar.a.getContext();
        CharSequence charSequence = rtlVar.h;
        je jeVar = new je();
        jeVar.e = 4096;
        jeVar.g = 4096;
        jeVar.l = null;
        jeVar.m = null;
        jeVar.n = false;
        jeVar.o = false;
        jeVar.p = 16;
        jeVar.i = context;
        jeVar.a = charSequence;
        this.b = jeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                pg5 pg5Var = (pg5) obj2;
                int childCount = ((LayoutDirectionLinearLayout) pg5Var.e).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    ((LayoutDirectionLinearLayout) pg5Var.e).getChildAt(i).setEnabled(false);
                }
                ((px8) obj).c(view);
                pg5Var.b();
                break;
            case 1:
                MenuItem menuItem = (MenuItem) obj;
                eog eogVar = (eog) obj2;
                if (!vtp.M(eogVar)) {
                    if (menuItem.isCheckable()) {
                        menuItem.setChecked(!menuItem.isChecked());
                    }
                    eogVar.j0((qtd) menuItem);
                    break;
                }
                break;
            default:
                rtl rtlVar = (rtl) obj2;
                Window.Callback callback = rtlVar.k;
                if (callback != null && rtlVar.l) {
                    callback.onMenuItemSelected(0, (je) obj);
                    break;
                }
                break;
        }
    }
}
