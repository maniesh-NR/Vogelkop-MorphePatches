package defpackage;

import androidx.emoji2.emojipicker.EmojiPickerView;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class uy7 extends nt5 {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ EmojiPickerView v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy7(EmojiPickerView emojiPickerView, nt5 nt5Var) {
        super(nt5Var);
        this.v = emojiPickerView;
    }

    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= LinearLayoutManager.INVALID_OFFSET;
        return this.v.b(this);
    }
}
