package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rkb extends iph {
    public final RecyclerView a;
    public final pde b;
    public final pde c;
    public final xh7 d;
    public final oji e;
    public final LinkedHashMap f = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();
    public Drawable h;
    public Drawable i;
    public Drawable j;
    public Drawable k;

    public rkb(pde pdeVar, RecyclerView recyclerView, pde pdeVar2, pde pdeVar3, xh7 xh7Var, oji ojiVar) {
        this.a = recyclerView;
        this.b = pdeVar2;
        this.c = pdeVar3;
        this.d = xh7Var;
        this.e = ojiVar;
        q9n.e(recyclerView, new pc5((Object) this, (byte) 29));
        final byte b = 0;
        a26.T(pdeVar2, pdeVar, new f7f(this) { // from class: nkb
            public final /* synthetic */ rkb b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                rkb rkbVar = this.b;
                switch (b2) {
                    case 0:
                        rkbVar.e();
                        break;
                    default:
                        RecyclerView recyclerView2 = rkbVar.a;
                        recyclerView2.a0();
                        recyclerView2.invalidate();
                        break;
                }
            }
        });
        final byte b2 = 1;
        a26.T(pdeVar3, pdeVar, new f7f(this) { // from class: nkb
            public final /* synthetic */ rkb b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b22 = b2;
                rkb rkbVar = this.b;
                switch (b22) {
                    case 0:
                        rkbVar.e();
                        break;
                    default:
                        RecyclerView recyclerView2 = rkbVar.a;
                        recyclerView2.a0();
                        recyclerView2.invalidate();
                        break;
                }
            }
        });
        a26.V(xh7Var, pdeVar, new okb(this, (byte) 0));
    }

    public final void e() {
        eyj eyjVar = (eyj) this.b.g();
        b8h b8hVar = eyjVar.m;
        RecyclerView recyclerView = this.a;
        this.h = b8hVar.f(recyclerView.getContext()).mutate();
        this.i = eyjVar.n.f(recyclerView.getContext()).mutate();
        this.j = eyjVar.o.f(recyclerView.getContext()).mutate();
        b8h b8hVar2 = eyjVar.q;
        this.k = b8hVar2 != null ? b8hVar2.f(recyclerView.getContext()) : null;
        recyclerView.a0();
        recyclerView.invalidate();
    }

    public final void f(int i, int i2, int i3, int i4, int i5, float f) {
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.g;
        Object qkbVar = linkedHashMap.get(numValueOf);
        if (qkbVar == null) {
            qkbVar = new qkb();
            linkedHashMap.put(numValueOf, qkbVar);
        }
        qkb qkbVar2 = (qkb) qkbVar;
        Rect rect = qkbVar2.a;
        if (rect.isEmpty()) {
            rect.set(i2, i3, i4, i5);
        } else {
            rect.union(i2, i3, i4, i5);
        }
        float f2 = qkbVar2.c;
        if (f2 >= f) {
            f = f2;
        }
        qkbVar2.c = f;
        qkbVar2.b++;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, vph vphVar) {
        x2c x2cVarA;
        Rect rect2;
        super.getItemOffsets(rect, view, recyclerView, vphVar);
        boolean z = recyclerView.getLayoutDirection() == 1;
        oxj oxjVar = ((eyj) this.b.g()).j;
        i iVarT = recyclerView.T(view);
        int bindingAdapterPosition = iVarT.getBindingAdapterPosition();
        LinkedHashMap linkedHashMap = this.f;
        if (bindingAdapterPosition == -1 && (rect2 = (Rect) linkedHashMap.get(iVarT)) != null) {
            rect.top = rect2.top;
            rect.left = rect2.left;
            rect.right = rect2.right;
            rect.bottom = rect2.bottom;
            return;
        }
        if (iVarT instanceof pkb) {
            pkb pkbVar = (pkb) iVarT;
            if (pkbVar.n()) {
                int i = rect.top;
                sxj sxjVar = oxjVar.c;
                rect.top = i + sxjVar.b;
                rect.bottom += sxjVar.d;
                rect.left = sxjVar.a(z) + rect.left;
                rect.right = oxjVar.c.b(z) + rect.right;
            } else if (pkbVar.N()) {
                int i2 = rect.top;
                sxj sxjVar2 = oxjVar.d;
                rect.top = i2 + sxjVar2.b;
                rect.bottom += sxjVar2.d;
                rect.left = sxjVar2.a(z) + rect.left;
                rect.right = oxjVar.d.b(z) + rect.right;
            } else {
                int i3 = rect.top;
                sxj sxjVar3 = oxjVar.a;
                rect.top = i3 + sxjVar3.b;
                rect.bottom += sxjVar3.d;
                rect.left = sxjVar3.a(z) + rect.left;
                rect.right = oxjVar.a.b(z) + rect.right;
            }
            if (pkbVar.getGroupId() != 0 && !pkbVar.d() && (x2cVarA = ((y2c) this.c.g()).a(iVarT)) != null) {
                if (x2cVarA.a) {
                    rect.left = oxjVar.b.a(z) + rect.left;
                }
                if (x2cVarA.b) {
                    rect.right = oxjVar.b.b(z) + rect.right;
                }
                int i4 = rect.top;
                sxj sxjVar4 = oxjVar.b;
                rect.top = i4 + sxjVar4.b;
                rect.bottom += sxjVar4.d;
            }
            if (pkbVar.n()) {
                int i5 = rect.top;
                oxjVar.getClass();
                rect.top = i5;
                rect.bottom = rect.bottom;
            }
            Object rect3 = linkedHashMap.get(iVarT);
            if (rect3 == null) {
                rect3 = new Rect();
                linkedHashMap.put(iVarT, rect3);
            }
            ((Rect) rect3).set(rect);
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, vph vphVar) {
        xh7 xh7Var;
        Object animatedValue;
        rkb rkbVar = this;
        super.onDraw(canvas, recyclerView, vphVar);
        c5l c5lVar = (c5l) rkbVar.e.a;
        int i = 0;
        boolean z = rkbVar.a.getLayoutDirection() == 1;
        oxj oxjVar = ((eyj) rkbVar.b.g()).j;
        h6n it = new g6n(recyclerView).iterator();
        while (true) {
            h6n h6nVar = it;
            float alpha = 0.0f;
            ValueAnimator valueAnimator = null;
            if (!h6nVar.hasNext()) {
                break;
            }
            View view = (View) h6nVar.next();
            pkb pkbVarT = recyclerView.T(view);
            if (pkbVarT instanceof pkb) {
                boolean z2 = pkbVarT instanceof h5l;
                int iB = zed.b((z2 || !c5lVar.w.contains(pkbVarT)) ? 0.0f : ((i) pkbVarT).itemView.getTranslationX());
                int iB2 = zed.b((z2 || !c5lVar.w.contains(pkbVarT)) ? 0.0f : ((i) pkbVarT).itemView.getTranslationY());
                View view2 = ((i) pkbVarT).itemView;
                x46 x46Var = x46.b;
                Object tag = view2.getTag(2131364682);
                if (tag != null) {
                    v46 v46Var = (v46) tag;
                    ValueAnimator valueAnimator2 = v46Var.b;
                    if (v46Var.a == x46Var && valueAnimator2.isRunning()) {
                        valueAnimator = valueAnimator2;
                    }
                }
                if (valueAnimator != null) {
                    alpha = valueAnimator.getAnimatedFraction();
                } else if (!(pkbVarT instanceof kj8)) {
                    alpha = ((i) pkbVarT).itemView.getAlpha();
                }
                float f = alpha;
                pkb pkbVar = pkbVarT;
                int groupId = pkbVar.getGroupId();
                if (groupId != 0 && !pkbVar.d()) {
                    sxj sxjVar = oxjVar.b;
                    rkbVar.f(groupId, (view.getLeft() - sxjVar.a(z)) + iB, (view.getTop() - sxjVar.b) + iB2, view.getRight() + sxjVar.b(z) + iB, view.getBottom() + sxjVar.d + iB2, f);
                }
                if (groupId == 0 || !pkbVar.n()) {
                    rkbVar = this;
                } else {
                    rkbVar = this;
                    rkbVar.f(groupId, view.getLeft() + iB, view.getTop() + iB2, view.getRight() + iB, view.getBottom() + iB2, f);
                }
            }
        }
        LinkedHashMap linkedHashMap = rkbVar.g;
        for (qkb qkbVar : linkedHashMap.values()) {
            if (qkbVar.b > 1) {
                Drawable drawable = rkbVar.h;
                if (drawable == null) {
                    drawable = null;
                }
                drawable.setAlpha(zed.b(qkbVar.c * 255.0f));
                Drawable drawable2 = rkbVar.h;
                if (drawable2 == null) {
                    drawable2 = null;
                }
                drawable2.setBounds(qkbVar.a);
                Drawable drawable3 = rkbVar.h;
                if (drawable3 == null) {
                    drawable3 = null;
                }
                drawable3.draw(canvas);
            }
        }
        for (qkb qkbVar2 : linkedHashMap.values()) {
            qkbVar2.a.setEmpty();
            qkbVar2.b = 0;
            qkbVar2.c = 0.0f;
        }
        h6n it2 = new g6n(recyclerView).iterator();
        float f2 = 0.0f;
        while (true) {
            h6n h6nVar2 = it2;
            boolean zHasNext = h6nVar2.hasNext();
            xh7Var = rkbVar.d;
            if (!zHasNext) {
                break;
            }
            View view3 = (View) h6nVar2.next();
            ValueAnimator valueAnimator3 = (ValueAnimator) ((LinkedHashMap) xh7Var.c).get(view3);
            float fFloatValue = (valueAnimator3 == null || (animatedValue = valueAnimator3.getAnimatedValue()) == null) ? 0.0f : ((Float) animatedValue).floatValue();
            if (fFloatValue > 0.0f) {
                Drawable drawable4 = rkbVar.i;
                if (drawable4 == null) {
                    drawable4 = null;
                }
                drawable4.setAlpha(zed.b(fFloatValue * 255.0f));
                Drawable drawable5 = rkbVar.i;
                if (drawable5 == null) {
                    drawable5 = null;
                }
                drawable5.setBounds(zed.b(view3.getTranslationX()) + view3.getLeft(), zed.b(view3.getTranslationY()) + view3.getTop(), zed.b(view3.getTranslationX()) + view3.getRight(), zed.b(view3.getTranslationY()) + view3.getBottom());
                Drawable drawable6 = rkbVar.i;
                if (drawable6 == null) {
                    drawable6 = null;
                }
                drawable6.draw(canvas);
                if (f2 < fFloatValue) {
                    f2 = fFloatValue;
                }
            }
        }
        h6n it3 = new g6n(recyclerView).iterator();
        while (true) {
            h6n h6nVar3 = it3;
            if (!h6nVar3.hasNext()) {
                break;
            }
            View view4 = (View) h6nVar3.next();
            float fA = (1.0f - f2) * xh7Var.a(view4);
            if (fA > 0.0f) {
                pkb pkbVarT2 = recyclerView.T(view4);
                Drawable drawable7 = rkbVar.j;
                if (drawable7 == null) {
                    drawable7 = null;
                }
                drawable7.setLevel((!(pkbVarT2 instanceof pkb) || pkbVarT2.getGroupId() == 0) ? 0 : 1);
                Drawable drawable8 = rkbVar.j;
                if (drawable8 == null) {
                    drawable8 = null;
                }
                drawable8.setAlpha(zed.b(fA * 255.0f));
                Drawable drawable9 = rkbVar.j;
                if (drawable9 == null) {
                    drawable9 = null;
                }
                drawable9.setBounds(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                Drawable drawable10 = rkbVar.j;
                if (drawable10 == null) {
                    drawable10 = null;
                }
                drawable10.draw(canvas);
            }
        }
        Drawable drawable11 = rkbVar.k;
        if (drawable11 != null) {
            int intrinsicWidth = drawable11.getIntrinsicWidth();
            int intrinsicHeight = drawable11.getIntrinsicHeight();
            int height = (recyclerView.getHeight() - intrinsicHeight) / 2;
            int childCount = recyclerView.getChildCount() - 1;
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                i++;
                View childAt2 = recyclerView.getChildAt(i);
                pkb pkbVarT3 = recyclerView.T(childAt);
                pkb pkbVarT4 = recyclerView.T(childAt2);
                if ((pkbVarT3 instanceof pkb) && (pkbVarT4 instanceof pkb)) {
                    pkb pkbVar2 = pkbVarT3;
                    pkb pkbVar3 = pkbVarT4;
                    if (pkbVar2.getGroupId() == pkbVar3.getGroupId() && Intrinsics.a(pkbVar2.k(), pkbVar3.k()) && pkbVar2.k() != null) {
                        int left = ((childAt2.getLeft() - childAt.getRight()) / 2) + childAt.getRight();
                        drawable11.setBounds(left, height, left + intrinsicWidth, height + intrinsicHeight);
                        drawable11.draw(canvas);
                    }
                }
            }
        }
    }
}
