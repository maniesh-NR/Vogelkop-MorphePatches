package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class qv8 extends ka2 {
    public final tx7 e;
    public int f;
    public ShapeDrawable g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv8(Point point, int i, tx7 tx7Var, byte b) {
        super(point, i);
        this.h = b;
        this.e = tx7Var;
    }

    @Override // defpackage.ka2
    public final int e(int i) {
        switch (this.h) {
            case 0:
                return this.e.e(i, this.b);
            default:
                return 0;
        }
    }

    @Override // defpackage.ka2
    public final boolean g(View view, RecyclerView recyclerView, vph vphVar, wa2 wa2Var) {
        View viewH;
        switch (this.h) {
            case 0:
                if (!i(view, recyclerView, vphVar, wa2Var) || (viewH = h(view, recyclerView, vphVar)) == null) {
                    return false;
                }
                i iVarT = recyclerView.T(view);
                int iB0 = iVarT instanceof lx8 ? ((lx8) iVarT).b0() : 0;
                i iVarT2 = recyclerView.T(viewH);
                int iB02 = iVarT2 instanceof lx8 ? ((lx8) iVarT2).b0() : 0;
                return iB0 == 2 || iB02 == 2 || !(iB0 == 1 || iB02 == 1);
            default:
                return i(view, recyclerView, vphVar, wa2Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View h(android.view.View r17, androidx.recyclerview.widget.RecyclerView r18, vph r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            int r3 = r2.indexOfChild(r1)
            r4 = 0
            byte r5 = r0.b
            r6 = 1
            r9 = r4
            r8 = r5
            r7 = r6
        L11:
            r10 = 0
            if (r7 > r8) goto L8d
            int r11 = r3 + r7
            android.view.View r11 = r2.getChildAt(r11)
            if (r11 == 0) goto L8a
            if (r5 == r6) goto L8e
            androidx.recyclerview.widget.i r12 = r2.T(r11)
            boolean r13 = r12 instanceof defpackage.ab2
            if (r13 == 0) goto L8a
            android.view.View r13 = r12.itemView
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            boolean r14 = r13 instanceof y2k
            r15 = -1
            if (r14 == 0) goto L3c
            y2k r13 = (y2k) r13
            dqj r13 = r13.e
            if (r13 != 0) goto L39
            r13 = r15
            goto L46
        L39:
            int r13 = r13.e
            goto L46
        L3c:
            boolean r14 = r13 instanceof x4a
            if (r14 == 0) goto L45
            x4a r13 = (x4a) r13
            int r13 = r13.e
            goto L46
        L45:
            r13 = r4
        L46:
            if (r13 < 0) goto L8d
            if (r13 != 0) goto L56
            android.view.View r14 = r12.itemView
            int r14 = r14.getHeight()
            if (r14 != 0) goto L54
            int r8 = r8 + r5
            goto L8a
        L54:
            int r9 = r9 + 1
        L56:
            if (r9 == 0) goto L8a
            if (r9 > r6) goto L8d
            ab2 r12 = (defpackage.ab2) r12
            int r12 = r12.U()
            if (r12 != r15) goto L63
            r12 = r5
        L63:
            if (r12 != r6) goto L8e
            androidx.recyclerview.widget.i r12 = r2.T(r1)
            android.view.View r12 = r12.itemView
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            boolean r14 = r12 instanceof y2k
            if (r14 == 0) goto L7c
            y2k r12 = (y2k) r12
            dqj r12 = r12.e
            if (r12 == 0) goto L86
            int r15 = r12.e
            goto L86
        L7c:
            boolean r14 = r12 instanceof x4a
            if (r14 == 0) goto L85
            x4a r12 = (x4a) r12
            int r15 = r12.e
            goto L86
        L85:
            r15 = r4
        L86:
            if (r15 < 0) goto L8d
            if (r15 == r13) goto L8e
        L8a:
            int r7 = r7 + 1
            goto L11
        L8d:
            r11 = r10
        L8e:
            if (r11 != 0) goto L91
            return r10
        L91:
            r1 = r19
            wa2 r1 = r0.f(r11, r2, r1)
            boolean r2 = r1.d
            java.util.ArrayList r0 = r0.d
            if (r2 == 0) goto La1
            r0.add(r1)
            return r10
        La1:
            r0.add(r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qv8.h(android.view.View, androidx.recyclerview.widget.RecyclerView, vph):android.view.View");
    }

    public final boolean i(View view, RecyclerView recyclerView, vph vphVar, wa2 wa2Var) {
        return wa2Var.c && h(view, recyclerView, vphVar) != null;
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, vph vphVar) {
        View viewH;
        if (recyclerView.n != null) {
            Context context = recyclerView.getContext();
            ShapeDrawable shapeDrawable = this.g;
            if (shapeDrawable == null) {
                shapeDrawable = new ShapeDrawable(new RectShape());
                shapeDrawable.setIntrinsicHeight(fan.a(1.0f, context.getResources()));
                this.g = shapeDrawable;
            }
            shapeDrawable.getPaint().setColor(context.getColor(2131099939));
            ShapeDrawable shapeDrawable2 = this.g;
            recyclerView.getResources();
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                wa2 wa2VarF = f(childAt, recyclerView, vphVar);
                boolean zG = g(childAt, recyclerView, vphVar, wa2VarF);
                ArrayList arrayList = this.d;
                arrayList.add(wa2VarF);
                if (zG && (viewH = h(childAt, recyclerView, vphVar)) != null) {
                    arrayList.add(f(childAt, recyclerView, vphVar));
                    Rect rect = this.c;
                    RecyclerView.V(rect, childAt);
                    int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                    int intrinsicHeight = iRound - shapeDrawable2.getIntrinsicHeight();
                    shapeDrawable2.setAlpha((int) (childAt.getAlpha() * 255.0f));
                    int iMin = Math.min(childAt.getLeft(), viewH.getLeft());
                    int iMax = Math.max(childAt.getRight(), viewH.getRight());
                    if (iMin == 0) {
                        recyclerView.getWidth();
                    }
                    shapeDrawable2.setBounds(iMin, intrinsicHeight, iMax, iRound);
                    shapeDrawable2.draw(canvas);
                }
            }
        }
    }
}
