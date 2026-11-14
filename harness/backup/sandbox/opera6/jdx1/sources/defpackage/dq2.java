package defpackage;

import androidx.emoji2.emojipicker.EmojiPickerView;
import java.util.List;

/* loaded from: classes.dex */
public final class dq2 extends tx7 {
    public final /* synthetic */ byte e = 1;
    public final Object f;

    public dq2(EmojiPickerView emojiPickerView) {
        this.f = emojiPickerView;
    }

    public dq2(dt1 dt1Var) {
        this.f = dt1Var;
        this.a = true;
    }

    @Override // defpackage.tx7
    public final int f(int i) {
        byte b = this.e;
        Object obj = this.f;
        switch (b) {
            case 0:
                dt1 dt1Var = (dt1) obj;
                if (i < ((List) dt1Var.c).size()) {
                    return ((int[]) dt1Var.b)[i];
                }
                return 2;
            default:
                EmojiPickerView emojiPickerView = (EmojiPickerView) obj;
                c82 c82Var = emojiPickerView.i;
                if (c82Var == null) {
                    c82Var = null;
                }
                int iOrdinal = c82Var.c(i).a.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    return emojiPickerView.b;
                }
                return 1;
        }
    }
}
