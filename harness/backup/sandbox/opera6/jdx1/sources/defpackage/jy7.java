package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.emoji2.emojipicker.EmojiView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jy7 extends d {
    public final Context a;
    public final int b;
    public final Float c;
    public final d7h d;
    public final al7 e;
    public final whf f;
    public final LayoutInflater g;
    public Integer h;
    public Integer i;

    public jy7(Context context, int i, Float f, d7h d7hVar, al7 al7Var, whf whfVar) {
        this.a = context;
        this.b = i;
        this.c = f;
        this.d = d7hVar;
        this.e = al7Var;
        this.f = whfVar;
        this.g = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.d
    public final int getItemCount() {
        Iterator it = ((ehc) ((c82) this.e.invoke()).b).iterator();
        int iB = 0;
        while (it.hasNext()) {
            iB += ((ukb) it.next()).b();
        }
        return iB;
    }

    @Override // androidx.recyclerview.widget.d
    public final long getItemId(int i) {
        return ((c82) this.e.invoke()).c(i).hashCode();
    }

    @Override // androidx.recyclerview.widget.d
    public final int getItemViewType(int i) {
        return ((c82) this.e.invoke()).c(i).b;
    }

    @Override // androidx.recyclerview.widget.d
    public final void onBindViewHolder(i iVar, int i) {
        olb olbVarC = ((c82) this.e.invoke()).c(i);
        int iOrdinal = nlb.values()[getItemViewType(i)].ordinal();
        if (iOrdinal == 0) {
            View view = iVar.itemView;
            WeakHashMap weakHashMap = r5n.a;
            ((TextView) ((View) m5n.f(view, 2131362287))).setText(((rp4) olbVarC).c);
            return;
        }
        if (iOrdinal == 1) {
            View view2 = iVar.itemView;
            WeakHashMap weakHashMap2 = r5n.a;
            ((TextView) ((View) m5n.f(view2, 2131362668))).setText(((ofg) olbVarC).c);
            return;
        }
        if (iOrdinal != 2) {
            h9o.p();
            return;
        }
        mz7 mz7Var = (mz7) iVar;
        String str = ((lz7) olbVarC).c;
        EmojiView emojiView = mz7Var.f;
        emojiView.d = str;
        emojiView.post(new cn7(str, emojiView, (byte) 4));
        nz7 nz7VarU = mz7.U(str);
        mz7Var.g = nz7VarU;
        if (nz7VarU.b.isEmpty()) {
            emojiView.setOnLongClickListener(null);
            emojiView.setLongClickable(false);
        } else {
            emojiView.setOnLongClickListener(mz7Var.e);
            emojiView.setLongClickable(true);
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [iy7] */
    /* JADX WARN: Type inference failed for: r11v0, types: [iy7] */
    @Override // androidx.recyclerview.widget.d
    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        Integer numValueOf = this.h;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(((viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight()) / this.b);
        }
        this.h = numValueOf;
        Integer numValueOf2 = this.i;
        final byte b = 1;
        if (numValueOf2 == null) {
            Float f = this.c;
            if (f != null) {
                float fFloatValue = f.floatValue();
                int measuredHeight = viewGroup.getMeasuredHeight();
                Context context = this.a;
                numValueOf2 = Integer.valueOf((int) (((measuredHeight - (context.getResources().getDimensionPixelSize(2131165646) << 1)) - context.getResources().getDimensionPixelSize(2131165647)) / fFloatValue));
            } else {
                numValueOf2 = null;
            }
            if (numValueOf2 == null) {
                numValueOf2 = this.h;
            }
        }
        this.i = numValueOf2;
        int iOrdinal = nlb.values()[i].ordinal();
        final byte b2 = 0;
        LayoutInflater layoutInflater = this.g;
        if (iOrdinal == 0) {
            View viewInflate = layoutInflater.inflate(2131558589, viewGroup, false);
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new zl5(viewInflate);
        }
        if (iOrdinal == 1) {
            View viewInflate2 = layoutInflater.inflate(2131558687, viewGroup, false);
            viewInflate2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            viewInflate2.setMinimumHeight(this.i.intValue());
            return new zl5(viewInflate2);
        }
        if (iOrdinal != 2) {
            h9o.p();
            return null;
        }
        return new mz7(this.a, this.h.intValue(), this.i.intValue(), this.d, new Function2(this) { // from class: iy7
            public final /* synthetic */ jy7 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b2;
                jy7 jy7Var = this.b;
                switch (b3) {
                    case 0:
                        jy7Var.f.invoke(jy7Var, (nz7) obj2);
                        return Unit.a;
                    default:
                        String str = (String) obj2;
                        LinkedHashMap linkedHashMap = n9a.e;
                        if (linkedHashMap == null) {
                            qp2.n("BundledEmojiListLoader.load is not called or complete");
                            return null;
                        }
                        String str2 = (String) ((List) linkedHashMap.get(str)).get(0);
                        int i2 = 0;
                        for (Object obj3 : (Iterable) jy7Var.e.invoke()) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                j95.n();
                                throw null;
                            }
                            olb olbVar = (olb) obj3;
                            if (olbVar instanceof lz7) {
                                LinkedHashMap linkedHashMap2 = n9a.e;
                                if (linkedHashMap2 == null) {
                                    qp2.n("BundledEmojiListLoader.load is not called or complete");
                                    return null;
                                }
                                lz7 lz7Var = (lz7) olbVar;
                                List list = (List) linkedHashMap2.get(lz7Var.c);
                                if (Intrinsics.a(list != null ? (String) list.get(0) : null, str2) && lz7Var.d) {
                                    lz7Var.c = str;
                                    jy7Var.notifyItemChanged(i2);
                                }
                            }
                            i2 = i3;
                        }
                        return Unit.a;
                }
            }
        }, new Function2(this) { // from class: iy7
            public final /* synthetic */ jy7 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b;
                jy7 jy7Var = this.b;
                switch (b3) {
                    case 0:
                        jy7Var.f.invoke(jy7Var, (nz7) obj2);
                        return Unit.a;
                    default:
                        String str = (String) obj2;
                        LinkedHashMap linkedHashMap = n9a.e;
                        if (linkedHashMap == null) {
                            qp2.n("BundledEmojiListLoader.load is not called or complete");
                            return null;
                        }
                        String str2 = (String) ((List) linkedHashMap.get(str)).get(0);
                        int i2 = 0;
                        for (Object obj3 : (Iterable) jy7Var.e.invoke()) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                j95.n();
                                throw null;
                            }
                            olb olbVar = (olb) obj3;
                            if (olbVar instanceof lz7) {
                                LinkedHashMap linkedHashMap2 = n9a.e;
                                if (linkedHashMap2 == null) {
                                    qp2.n("BundledEmojiListLoader.load is not called or complete");
                                    return null;
                                }
                                lz7 lz7Var = (lz7) olbVar;
                                List list = (List) linkedHashMap2.get(lz7Var.c);
                                if (Intrinsics.a(list != null ? (String) list.get(0) : null, str2) && lz7Var.d) {
                                    lz7Var.c = str;
                                    jy7Var.notifyItemChanged(i2);
                                }
                            }
                            i2 = i3;
                        }
                        return Unit.a;
                }
            }
        });
    }
}
