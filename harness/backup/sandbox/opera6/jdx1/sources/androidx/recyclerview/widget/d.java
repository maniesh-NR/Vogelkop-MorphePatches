package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.fph;
import defpackage.gph;
import defpackage.lph;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d {
    private final fph mObservable = new fph();
    private boolean mHasStableIds = false;
    private eph mStateRestorationPolicy = eph.a;

    public final void bindViewHolder(@NonNull i iVar, int i) {
        boolean z = iVar.mBindingAdapter == null;
        if (z) {
            iVar.mPosition = i;
            if (hasStableIds()) {
                iVar.mItemId = getItemId(i);
            }
            iVar.setFlags(1, 519);
            if (Trace.isEnabled()) {
                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(iVar.mItemViewType)));
            }
        }
        iVar.mBindingAdapter = this;
        int[] iArr = RecyclerView.C0;
        onBindViewHolder(iVar, i, iVar.getUnmodifiedPayloads());
        if (z) {
            iVar.clearPayload();
            ViewGroup.LayoutParams layoutParams = iVar.itemView.getLayoutParams();
            if (layoutParams instanceof lph) {
                ((lph) layoutParams).c = true;
            }
            Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        int iOrdinal = this.mStateRestorationPolicy.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 : getItemCount() > 0;
    }

    @NonNull
    public final i createViewHolder(@NonNull ViewGroup viewGroup, int i) {
        try {
            if (Trace.isEnabled()) {
                Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i)));
            }
            i iVarOnCreateViewHolder = onCreateViewHolder(viewGroup, i);
            if (iVarOnCreateViewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            iVarOnCreateViewHolder.mItemViewType = i;
            return iVarOnCreateViewHolder;
        } finally {
            Trace.endSection();
        }
    }

    public int findRelativeAdapterPositionIn(@NonNull d dVar, @NonNull i iVar, int i) {
        if (dVar == this) {
            return i;
        }
        return -1;
    }

    public int getItemCount() {
        return 1;
    }

    public long getItemId(int i) {
        return -1L;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    @NonNull
    public final eph getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasObservers() {
        return this.mObservable.a();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.b();
    }

    public final void notifyItemChanged(int i) {
        this.mObservable.d(i, 1, null);
    }

    public final void notifyItemChanged(int i, @Nullable Object obj) {
        this.mObservable.d(i, 1, obj);
    }

    public final void notifyItemInserted(int i) {
        this.mObservable.e(i, 1);
    }

    public final void notifyItemMoved(int i, int i2) {
        this.mObservable.c(i, i2);
    }

    public final void notifyItemRangeChanged(int i, int i2) {
        this.mObservable.d(i, i2, null);
    }

    public final void notifyItemRangeChanged(int i, int i2, @Nullable Object obj) {
        this.mObservable.d(i, i2, obj);
    }

    public final void notifyItemRangeInserted(int i, int i2) {
        this.mObservable.e(i, i2);
    }

    public final void notifyItemRangeRemoved(int i, int i2) {
        this.mObservable.f(i, i2);
    }

    public final void notifyItemRemoved(int i) {
        this.mObservable.f(i, 1);
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
    }

    public abstract void onBindViewHolder(@NonNull i iVar, int i);

    public void onBindViewHolder(@NonNull i iVar, int i, @NonNull List<Object> list) {
        onBindViewHolder(iVar, i);
    }

    @NonNull
    public abstract i onCreateViewHolder(@NonNull ViewGroup viewGroup, int i);

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(@NonNull i iVar) {
        return false;
    }

    public void onViewAttachedToWindow(@NonNull i iVar) {
    }

    public void onViewDetachedFromWindow(@NonNull i iVar) {
    }

    public void onViewRecycled(@NonNull i iVar) {
    }

    public void registerAdapterDataObserver(@NonNull gph gphVar) {
        this.mObservable.registerObserver(gphVar);
    }

    public void setHasStableIds(boolean z) {
        if (hasObservers()) {
            qp2.n("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            this.mHasStableIds = z;
        }
    }

    public void setStateRestorationPolicy(@NonNull eph ephVar) {
        this.mStateRestorationPolicy = ephVar;
        this.mObservable.g();
    }

    public void unregisterAdapterDataObserver(@NonNull gph gphVar) {
        this.mObservable.unregisterObserver(gphVar);
    }
}
