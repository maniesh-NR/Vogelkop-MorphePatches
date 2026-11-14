package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* loaded from: classes.dex */
public final class yx7 implements as6 {
    public final /* synthetic */ tcc a;

    public yx7(EmojiCompatInitializer emojiCompatInitializer, tcc tccVar) {
        this.a = tccVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume(ndc ndcVar) {
        Handler.createAsync(Looper.getMainLooper()).postDelayed(new bw1((byte) 2), 500L);
        this.a.b(this);
    }
}
