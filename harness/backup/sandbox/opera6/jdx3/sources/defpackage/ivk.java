package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class ivk implements r8n {
    public final hvk a;
    public final String b;
    public final Rect c = new Rect();
    public final RecyclerView d;
    public final Drawable e;
    public int f;
    public int g;
    public String h;
    public int i;
    public boolean j;
    public final /* synthetic */ nvk k;

    public ivk(nvk nvkVar, RecyclerView recyclerView, hvk hvkVar) {
        this.k = nvkVar;
        byte b = 3;
        Drawable.Callback wk7Var = new wk7(this, (byte) 3);
        Context context = recyclerView.getContext();
        this.d = recyclerView;
        this.a = hvkVar;
        this.b = context.getString(hvkVar.b);
        if (hvkVar instanceof kvk) {
            this.e = sgb.F(2131232203, context);
        } else {
            if (!(hvkVar instanceof mvk)) {
                qp2.o("Action does not define an icon");
                throw null;
            }
            mvk mvkVar = (mvk) hvkVar;
            f3d lvkVar = new lvk(context);
            lvkVar.setCallback(wk7Var);
            int i = mvkVar.d;
            u2d.e(context, i, u2d.j(i, context)).b(new hg2(lvkVar, (byte) 2));
            for (i3d i3dVar : mvkVar.e) {
                lvkVar.a(i3dVar.a, Integer.valueOf(i3dVar.c), new roj(context, i3dVar, b));
            }
            this.e = lvkVar;
        }
        b(context);
    }

    @Override // defpackage.r8n
    public final void a(View view) {
        b(view.getContext());
    }

    public final void b(Context context) {
        hvk hvkVar = this.a;
        this.f = f03.t(hvkVar.a, context, 2131102430);
        this.g = f03.t(hvkVar.c, context, 2131101243);
        Drawable drawable = this.e;
        if (drawable instanceof f3d) {
            drawable.invalidateSelf();
        } else {
            drawable.mutate().setColorFilter(new PorterDuffColorFilter(this.g, PorterDuff.Mode.SRC_IN));
        }
    }
}
