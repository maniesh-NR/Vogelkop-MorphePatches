package defpackage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class xoi implements View.OnClickListener {
    public final Context a;
    public final s9i b;
    public final hu8 c;
    public final x5f d;
    public ExtendedFloatingActionButton e;
    public boolean f;
    public final RecyclerView g;
    public final vx h;
    public int i;

    public xoi(Context context, s9i s9iVar, RecyclerView recyclerView, vx vxVar, hu8 hu8Var) {
        this.a = context;
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) context.getApplicationContext();
        this.b = s9iVar;
        this.c = hu8Var;
        this.d = operaApplication.L().c;
        this.g = recyclerView;
        this.h = vxVar;
        recyclerView.o(new yc3(this, (byte) 5));
        recyclerView.V = new woi(this, context.getResources());
    }

    public final boolean a() {
        if (((Boolean) this.h.get()).booleanValue()) {
            return true;
        }
        RecyclerView recyclerView = this.g;
        i iVarM = recyclerView.M(0);
        return !((iVarM == null || iVarM.itemView.getTop() != 0) ? recyclerView.canScrollVertically(-1) : false);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f = true;
        this.b.U(this);
        xw8 xw8Var = this.c.a;
        xw8Var.g();
        xw8Var.e(q9n.x(xw8Var.o.c) ? 2 : 1, true);
    }
}
