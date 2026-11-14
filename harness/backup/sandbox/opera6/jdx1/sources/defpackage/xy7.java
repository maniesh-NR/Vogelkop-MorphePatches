package defpackage;

import androidx.emoji2.emojipicker.EmojiPickerView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;

/* loaded from: classes.dex */
public final class xy7 extends oph {
    public final /* synthetic */ ky7 a;
    public final /* synthetic */ EmojiPickerView b;
    public final /* synthetic */ GridLayoutManager c;

    public xy7(ky7 ky7Var, EmojiPickerView emojiPickerView, GridLayoutManager gridLayoutManager) {
        this.a = ky7Var;
        this.b = emojiPickerView;
        this.c = gridLayoutManager;
    }

    @Override // defpackage.oph
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        EmojiPickerView emojiPickerView = this.b;
        c82 c82Var = emojiPickerView.i;
        mt5 mt5Var = null;
        if (c82Var == null) {
            c82Var = null;
        }
        GridLayoutManager gridLayoutManager = this.c;
        int iFindFirstCompletelyVisibleItemPosition = gridLayoutManager.findFirstCompletelyVisibleItemPosition();
        byte b = 0;
        mea meaVarListIterator = ((ehc) c82Var.b).listIterator(0);
        int i3 = 0;
        while (true) {
            mea meaVar = meaVarListIterator;
            if (!meaVar.hasNext()) {
                t3p.t();
                return;
            }
            ukb ukbVar = (ukb) meaVar.next();
            if (iFindFirstCompletelyVisibleItemPosition < ukbVar.b()) {
                ky7 ky7Var = this.a;
                int i4 = ky7Var.b;
                if (i3 != i4) {
                    ky7Var.notifyItemChanged(i4);
                    ky7Var.notifyItemChanged(i3);
                    ky7Var.b = i3;
                }
                if (emojiPickerView.f) {
                    c82 c82Var2 = emojiPickerView.i;
                    if (c82Var2 == null) {
                        c82Var2 = null;
                    }
                    ukb ukbVar2 = emojiPickerView.h;
                    if (ukbVar2 == null) {
                        ukbVar2 = null;
                    }
                    IntRange intRangeD = c82Var2.d(ukbVar2);
                    int i5 = ((a) intRangeD).a;
                    int i6 = ((a) intRangeD).b;
                    int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
                    if (i5 > iFindFirstVisibleItemPosition || iFindFirstVisibleItemPosition > i6) {
                        na2.B(emojiPickerView.d, null, null, new wy7(emojiPickerView, mt5Var, b), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            iFindFirstCompletelyVisibleItemPosition -= ukbVar.b();
            i3++;
        }
    }
}
