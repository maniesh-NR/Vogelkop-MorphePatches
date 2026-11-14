package defpackage;

import androidx.emoji2.emojipicker.EmojiPickerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class sy7 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ EmojiPickerView u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sy7(EmojiPickerView emojiPickerView, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.u = emojiPickerView;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        EmojiPickerView emojiPickerView = this.u;
        switch (b) {
            case 0:
                return new sy7(emojiPickerView, mt5Var, (byte) 0);
            default:
                return new sy7(emojiPickerView, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        EmojiPickerView emojiPickerView = this.u;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                emojiPickerView.i = emojiPickerView.a();
                jy7 jy7Var = emojiPickerView.j;
                if (jy7Var == null) {
                    jy7Var = null;
                }
                jy7Var.notifyDataSetChanged();
                break;
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                boolean z = EmojiPickerView.l;
                emojiPickerView.d();
                break;
        }
        return Unit.a;
    }
}
