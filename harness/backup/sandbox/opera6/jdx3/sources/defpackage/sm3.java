package defpackage;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public final class sm3 extends o73 {
    public final /* synthetic */ byte j;
    public final int k;
    public final Object l;

    public /* synthetic */ sm3(int i, Object obj, byte b) {
        this.j = b;
        this.k = i;
        this.l = obj;
    }

    @Override // defpackage.o73
    public final void m(r9i r9iVar, View view) {
        byte b = this.j;
        int i = 0;
        int i2 = this.k;
        switch (b) {
            case 0:
                r9iVar.L(2131755022);
                ((m66) r9iVar.c).u(2132018703, (CharSequence) null, 0, (Drawable) null, (View) null);
                m66 m66Var = (m66) r9iVar.c;
                int iA = vep.A(i2);
                if (iA == 1) {
                    i = 2131362165;
                } else if (iA == 2) {
                    i = 2131362164;
                } else if (iA == 3) {
                    i = 2131362166;
                } else if (iA == 4) {
                    i = 2131362167;
                } else if (iA == 5) {
                    i = 2131362168;
                }
                m66Var.findItem(i).setChecked(true);
                break;
            default:
                r9iVar.L(2131755054);
                ((m66) r9iVar.c).u(2132018703, (CharSequence) null, 0, (Drawable) null, (View) null);
                m66 m66Var2 = (m66) r9iVar.c;
                int iA2 = vep.A(i2);
                if (iA2 == 0) {
                    i = 2131363492;
                } else if (iA2 == 1) {
                    i = 2131363495;
                } else if (iA2 == 2) {
                    i = 2131363493;
                } else if (iA2 == 3) {
                    i = 2131363494;
                }
                m66Var2.findItem(i).setChecked(true);
                break;
        }
    }

    @Override // defpackage.dog
    public final boolean onMenuItemClick(MenuItem menuItem) {
        byte b = this.j;
        Object obj = this.l;
        switch (b) {
            case 0:
                va2 va2Var = (va2) obj;
                if (menuItem.getItemId() == 2131362165) {
                    va2Var.m(2);
                } else if (menuItem.getItemId() == 2131362166) {
                    va2Var.m(4);
                } else if (menuItem.getItemId() == 2131362167) {
                    va2Var.m(5);
                } else if (menuItem.getItemId() == 2131362168) {
                    va2Var.m(6);
                } else if (menuItem.getItemId() == 2131362164) {
                    va2Var.m(3);
                }
                break;
            default:
                r9g r9gVar = (r9g) obj;
                if (menuItem.getItemId() == 2131363492) {
                    r9gVar.h(1);
                } else if (menuItem.getItemId() == 2131363494) {
                    r9gVar.h(4);
                } else if (menuItem.getItemId() == 2131363495) {
                    r9gVar.h(2);
                } else if (menuItem.getItemId() == 2131363493) {
                    r9gVar.h(3);
                }
                break;
        }
        return true;
    }
}
