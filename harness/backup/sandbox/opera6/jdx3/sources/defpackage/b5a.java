package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b5a extends iph {
    public final RecyclerView a;
    public final boolean b;
    public final a5a c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final WeakHashMap k = new WeakHashMap();
    public int l;

    public b5a(RecyclerView recyclerView, boolean z, a5a a5aVar, int i, boolean z2) {
        this.a = recyclerView;
        this.b = z;
        this.c = a5aVar;
        this.d = i;
        this.e = z2;
        this.f = fan.a(2.0f, recyclerView.getContext().getResources());
        this.g = fan.a(12.0f, recyclerView.getContext().getResources());
        this.h = fan.a(8.0f, recyclerView.getContext().getResources());
        this.i = fan.a(16.0f, recyclerView.getContext().getResources());
        this.j = fan.a(4.0f, recyclerView.getContext().getResources());
        pc5 pc5Var = new pc5(this, (byte) 23);
        q9n.e(recyclerView, pc5Var);
        pc5Var.a(recyclerView);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, vph vphVar) {
        d dVar;
        rect.setEmpty();
        int iS = RecyclerView.S(view);
        int i = this.j;
        boolean z = this.b;
        if (z && (dVar = this.a.m) != null && iS + 1 == dVar.getItemCount()) {
            rect.bottom -= i;
        } else if (!z && iS == 0) {
            rect.top -= i;
        }
        a5a a5aVar = this.c;
        if (a5aVar.Q(iS)) {
            z4a z4aVarQ = a5aVar.q(iS);
            if (this.e) {
                int i2 = rect.left;
                int i3 = this.g;
                rect.left = i2 + i3;
                rect.right += i3;
            }
            int iOrdinal = z4aVarQ.ordinal();
            int i4 = this.h;
            if (iOrdinal == 0) {
                rect.top += i4;
                return;
            }
            int i5 = this.f;
            if (iOrdinal == 1) {
                rect.top += i5;
                rect.bottom += i4;
            } else if (iOrdinal == 2) {
                rect.top += i5;
            } else if (iOrdinal != 3) {
                h9o.p();
            } else {
                rect.top += i4;
                rect.bottom += i4;
            }
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, vph vphVar) {
        int bindingAdapterPosition;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            i iVarT = this.a.T(recyclerView.getChildAt(i));
            if (iVarT != null && (bindingAdapterPosition = iVarT.getBindingAdapterPosition()) != -1) {
                a5a a5aVar = this.c;
                if (a5aVar.Q(bindingAdapterPosition)) {
                    z4a z4aVarQ = a5aVar.q(bindingAdapterPosition);
                    WeakHashMap weakHashMap = this.k;
                    if (((z4a) weakHashMap.get(iVarT)) != z4aVarQ) {
                        weakHashMap.put(iVarT, z4aVarQ);
                        ColorStateList colorStateListU = f03.u(2130970279, iVarT.itemView.getContext(), 2131103629);
                        int iOrdinal = z4aVarQ.ordinal();
                        int i2 = this.i;
                        if (iOrdinal == 0) {
                            View view = iVarT.itemView;
                            int i3 = this.l;
                            float f = i2;
                            ShapeDrawable shapeDrawableQ = ui6.q(f, f, 0.0f, 0.0f);
                            shapeDrawableQ.getPaint().setColor(i3);
                            view.setBackground(new RippleDrawable(colorStateListU, shapeDrawableQ, ui6.q(f, f, 0.0f, 0.0f)));
                        } else if (iOrdinal == 1) {
                            View view2 = iVarT.itemView;
                            int i4 = this.l;
                            float f2 = i2;
                            ShapeDrawable shapeDrawableQ2 = ui6.q(0.0f, 0.0f, f2, f2);
                            shapeDrawableQ2.getPaint().setColor(i4);
                            view2.setBackground(new RippleDrawable(colorStateListU, shapeDrawableQ2, ui6.q(0.0f, 0.0f, f2, f2)));
                        } else if (iOrdinal == 2) {
                            iVarT.itemView.setBackground(new RippleDrawable(colorStateListU, new ColorDrawable(this.l), null));
                        } else {
                            if (iOrdinal != 3) {
                                h9o.p();
                                return;
                            }
                            View view3 = iVarT.itemView;
                            int i5 = this.l;
                            float f3 = i2;
                            ShapeDrawable shapeDrawableQ3 = ui6.q(f3, f3, f3, f3);
                            shapeDrawableQ3.getPaint().setColor(i5);
                            view3.setBackground(new RippleDrawable(colorStateListU, shapeDrawableQ3, ui6.q(f3, f3, f3, f3)));
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
