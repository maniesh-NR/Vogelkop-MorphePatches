package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* loaded from: classes.dex */
public final class jq1 implements pq1, DialogInterface.OnClickListener {
    public bz0 a;
    public kq1 b;
    public CharSequence c;
    public final /* synthetic */ qq1 d;

    public jq1(qq1 qq1Var) {
        this.d = qq1Var;
    }

    @Override // defpackage.pq1
    public final boolean a() {
        bz0 bz0Var = this.a;
        if (bz0Var != null) {
            return bz0Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.pq1
    public final int b() {
        return 0;
    }

    @Override // defpackage.pq1
    public final void c(int i) {
    }

    @Override // defpackage.pq1
    public final CharSequence d() {
        return this.c;
    }

    @Override // defpackage.pq1
    public final void dismiss() {
        bz0 bz0Var = this.a;
        if (bz0Var != null) {
            bz0Var.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.pq1
    public final Drawable e() {
        return null;
    }

    @Override // defpackage.pq1
    public final void f(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // defpackage.pq1
    public final void g(int i) {
    }

    @Override // defpackage.pq1
    public final void h(int i) {
    }

    @Override // defpackage.pq1
    public final void i(int i, int i2) {
        if (this.b == null) {
            return;
        }
        qq1 qq1Var = this.d;
        az0 az0Var = new az0(qq1Var.b);
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            az0Var.setTitle(charSequence);
        }
        kq1 kq1Var = this.b;
        int selectedItemPosition = qq1Var.getSelectedItemPosition();
        wy0 wy0Var = az0Var.a;
        wy0Var.o = kq1Var;
        wy0Var.p = this;
        wy0Var.t = selectedItemPosition;
        wy0Var.s = true;
        bz0 bz0VarCreate = az0Var.create();
        this.a = bz0VarCreate;
        AlertController$RecycleListView alertController$RecycleListView = bz0VarCreate.g.g;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // defpackage.pq1
    public final int j() {
        return 0;
    }

    @Override // defpackage.pq1
    public final void k(ListAdapter listAdapter) {
        this.b = (kq1) listAdapter;
    }

    @Override // defpackage.pq1
    public final void m(Drawable drawable) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        qq1 qq1Var = this.d;
        qq1Var.setSelection(i);
        if (qq1Var.getOnItemClickListener() != null) {
            qq1Var.performItemClick(null, i, this.b.getItemId(i));
        }
        dismiss();
    }
}
