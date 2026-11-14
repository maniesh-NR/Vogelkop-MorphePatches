package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.AnimationEmptyListView;
import com.opera.android.custom_views.EmptyListView;

/* loaded from: classes.dex */
public class wz7 extends d {
    public final int a;
    public final int b;
    public int c;
    public int d;
    public boolean e;
    public RecyclerView f;

    public wz7(int i, int i2, int i3, int i4) {
        this.a = i;
        this.d = i2;
        this.c = i3;
        this.b = i4;
    }

    public void G(xz7 xz7Var) {
        xz7Var.V(this.d);
        xz7Var.U(this.c);
    }

    @Override // 
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public xz7 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int iA = vep.A(this.a);
        if (iA == 0) {
            EmptyListView emptyListViewD = EmptyListView.d(this.d, viewGroup.getContext(), this.c);
            emptyListViewD.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return new vz7(emptyListViewD, (byte) 1);
        }
        if (iA != 1) {
            EmptyListView emptyListViewD2 = EmptyListView.d(this.d, viewGroup.getContext(), this.c);
            emptyListViewD2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return new vz7(emptyListViewD2, (byte) 1);
        }
        Context context = viewGroup.getContext();
        int i2 = this.d;
        int i3 = this.c;
        AnimationEmptyListView animationEmptyListView = new AnimationEmptyListView(context, null, 14);
        animationEmptyListView.c(i2);
        animationEmptyListView.b(i3);
        int i4 = this.b;
        if (i4 < -1) {
            i4 = -1;
        }
        animationEmptyListView.c = i4;
        animationEmptyListView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return new vz7(animationEmptyListView, (byte) 0);
    }

    public final int getItemCount() {
        return this.e ? 1 : 0;
    }

    public final int getItemViewType(int i) {
        return 2131362679;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        f fVar;
        this.f = recyclerView;
        boolean z = this.e;
        if (recyclerView == null || (fVar = recyclerView.n) == null) {
            return;
        }
        fVar.setMeasurementCacheEnabled(!z);
    }

    public /* bridge */ /* synthetic */ void onBindViewHolder(i iVar, int i) {
        G((xz7) iVar);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f = null;
    }
}
