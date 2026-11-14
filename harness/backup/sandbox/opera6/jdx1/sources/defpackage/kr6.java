package defpackage;

import android.content.Context;
import androidx.emoji2.emojipicker.EmojiPickerView;

/* loaded from: classes.dex */
public final class kr6 extends wxe {
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ kr6(Object obj, Object obj2, byte b) {
        this.m = b;
        this.n = obj;
        this.o = obj2;
    }

    private final void h0() {
    }

    @Override // defpackage.wxe
    public final void R() {
        switch (this.m) {
            case 0:
                ((eq6) this.o).a = cs5.g;
                break;
        }
    }

    @Override // defpackage.wxe
    public final void S() {
        byte b = this.m;
        Object obj = this.o;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                ((t0g) obj2).setValue(Boolean.TRUE);
                ((eq6) obj).a = new u0b(true);
                break;
            default:
                EmojiPickerView.l = true;
                EmojiPickerView emojiPickerView = (EmojiPickerView) obj2;
                a64 a64Var = emojiPickerView.d;
                cv6 cv6Var = bb7.a;
                na2.B(a64Var, mr6.b, null, new p71((Context) obj, emojiPickerView, (mt5) null, (byte) 11), 2);
                break;
        }
    }
}
