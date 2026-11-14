package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.emoji2.emojipicker.EmojiView;
import androidx.recyclerview.widget.i;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class mz7 extends i {
    public final d7h b;
    public final iy7 c;
    public final iy7 d;
    public final ys2 e;
    public final EmojiView f;
    public nz7 g;
    public ua7 h;

    public mz7(Context context, int i, int i2, d7h d7hVar, iy7 iy7Var, iy7 iy7Var2) {
        super(new EmojiView(context, null));
        this.b = d7hVar;
        this.c = iy7Var;
        this.d = iy7Var2;
        this.e = new ys2(this, context, (byte) 2);
        EmojiView emojiView = (EmojiView) this.itemView;
        emojiView.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
        emojiView.setClickable(true);
        emojiView.setOnClickListener(new yk4(this, (byte) 17));
        this.f = emojiView;
    }

    public static nz7 U(String str) {
        LinkedHashMap linkedHashMap = n9a.e;
        if (linkedHashMap == null) {
            qp2.n("BundledEmojiListLoader.load is not called or complete");
            return null;
        }
        l08 l08Var = (List) linkedHashMap.get(str);
        if (l08Var == null) {
            l08Var = l08.a;
        }
        return new nz7(str, l08Var);
    }
}
