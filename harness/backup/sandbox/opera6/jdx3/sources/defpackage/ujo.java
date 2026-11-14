package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class ujo {
    public final qi8 a;
    public boolean b;
    public short c = 2;
    public n9h d;
    public Bitmap e;
    public TextureView f;
    public long g;

    public ujo(Context context, kvo kvoVar) {
        qi8 qi8VarA = new ai8(context).a();
        this.a = qi8VarA;
        this.b = true;
        qi8VarA.setVolume(0.0f);
        qi8VarA.setPlayWhenReady(false);
        qi8VarA.n.a(new zgo(this, kvoVar));
    }
}
