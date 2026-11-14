package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class q87 extends iph {
    public final /* synthetic */ byte a;
    public final Context b;
    public final int c;
    public Drawable d;
    public final Object e;
    public Object f;

    public q87(Context context) {
        this.a = (byte) 0;
        this.b = context;
        this.c = fan.a(16.0f, context.getResources());
        this.e = new HashSet();
        this.f = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.listDivider});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.d = resourceId == 0 ? null : sgb.F(resourceId, context);
        typedArrayObtainStyledAttributes.recycle();
    }

    public q87(Context context, int i, ll7 ll7Var) {
        this.a = (byte) 1;
        this.b = context;
        this.c = i;
        this.e = ll7Var;
        this.d = sgb.F(i, context);
        this.f = sgb.F(2131233317, context);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, vph vphVar) {
        switch (this.a) {
            case 0:
                HashSet hashSet = (HashSet) this.f;
                HashSet hashSet2 = (HashSet) this.e;
                rect.setEmpty();
                Drawable drawable = this.d;
                i iVarT = recyclerView.T(view);
                d dVar = recyclerView.m;
                if (drawable != null && iVarT != null && dVar != null) {
                    int bindingAdapterPosition = iVarT.getBindingAdapterPosition();
                    hashSet2.remove(Integer.valueOf(bindingAdapterPosition));
                    if (bindingAdapterPosition > 0) {
                        GridLayoutManager gridLayoutManager = recyclerView.n;
                        p87 p87VarT = recyclerView.T(view);
                        if ((p87VarT instanceof p87 ? p87VarT : null) != null) {
                            int itemViewType = iVarT.getItemViewType();
                            int i = bindingAdapterPosition - 1;
                            int itemViewType2 = dVar.getItemViewType(i);
                            int i2 = this.c;
                            if (itemViewType != itemViewType2) {
                                if (gridLayoutManager instanceof GridLayoutManager) {
                                    GridLayoutManager gridLayoutManager2 = gridLayoutManager;
                                    int iD = gridLayoutManager2.g.d(bindingAdapterPosition, gridLayoutManager2.b);
                                    if (gridLayoutManager2.g.e(bindingAdapterPosition, gridLayoutManager2.b) == 0) {
                                        hashSet2.add(Integer.valueOf(bindingAdapterPosition));
                                    }
                                    hashSet.add(Integer.valueOf(iD));
                                } else {
                                    hashSet2.add(Integer.valueOf(bindingAdapterPosition));
                                }
                                rect.top = drawable.getIntrinsicHeight() + i2;
                                break;
                            } else if (gridLayoutManager instanceof GridLayoutManager) {
                                GridLayoutManager gridLayoutManager3 = gridLayoutManager;
                                tx7 tx7Var = gridLayoutManager3.g;
                                int iD2 = tx7Var.d(bindingAdapterPosition, gridLayoutManager3.b);
                                if (iD2 != tx7Var.d(i, gridLayoutManager3.b)) {
                                    hashSet.remove(Integer.valueOf(iD2));
                                    break;
                                } else if (hashSet.contains(Integer.valueOf(iD2))) {
                                    rect.top = drawable.getIntrinsicHeight() + i2;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                super.getItemOffsets(rect, view, recyclerView, vphVar);
                break;
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, vph vphVar) {
        Drawable drawable;
        int width;
        int paddingLeft;
        switch (this.a) {
            case 0:
                if (recyclerView.n != null && (drawable = this.d) != null) {
                    canvas.save();
                    if (recyclerView.h) {
                        paddingLeft = recyclerView.getPaddingLeft();
                        width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                        canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                    } else {
                        width = recyclerView.getWidth();
                        paddingLeft = 0;
                    }
                    int childCount = recyclerView.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = recyclerView.getChildAt(i);
                        i iVarT = recyclerView.T(childAt);
                        if (iVarT != null && ((HashSet) this.e).contains(Integer.valueOf(iVarT.getBindingAdapterPosition()))) {
                            Rect rect = new Rect();
                            RecyclerView.V(rect, childAt);
                            int iB = (this.c / 2) + zed.b(childAt.getTranslationY()) + rect.top;
                            drawable.setBounds(paddingLeft, iB, width, drawable.getIntrinsicHeight() + iB);
                            drawable.draw(canvas);
                        }
                    }
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.onDraw(canvas, recyclerView, vphVar);
                break;
        }
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, vph vphVar) {
        int bindingAdapterPosition;
        switch (this.a) {
            case 1:
                ll7 ll7Var = (ll7) this.e;
                super.onDrawOver(canvas, recyclerView, vphVar);
                for (int i = 0; i < recyclerView.getChildCount(); i++) {
                    i iVarT = recyclerView.T(recyclerView.getChildAt(i));
                    if (iVarT != null && (bindingAdapterPosition = iVarT.getBindingAdapterPosition()) != -1 && ll7Var.b(bindingAdapterPosition)) {
                        int iRound = Math.round(iVarT.itemView.getX());
                        int iRound2 = Math.round(iVarT.itemView.getY());
                        Drawable drawable = ll7Var.l(bindingAdapterPosition) ? (Drawable) this.f : this.d;
                        drawable.setBounds(iRound, iRound2, iVarT.itemView.getWidth() + iRound, iVarT.itemView.getHeight() + iRound2);
                        drawable.draw(canvas);
                    }
                }
                break;
            default:
                super.onDrawOver(canvas, recyclerView, vphVar);
                break;
        }
    }
}
