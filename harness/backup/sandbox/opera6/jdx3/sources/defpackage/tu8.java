package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class tu8 extends lx8 implements xa2, za2 {
    public final OperaMaterialButton d;
    public final ImageView e;

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaMaterialButton] */
    public tu8(View view) {
        super(view);
        WeakHashMap weakHashMap = r5n.a;
        ?? r0 = (OperaMaterialButton) ((View) m5n.f(view, 2131362929));
        this.d = r0;
        r0.setOnClickListener(new yk4(this, (byte) 24));
        ImageView imageView = (ImageView) ((View) m5n.f(view, 2131362930));
        this.e = imageView;
        q9n.f(imageView, new e73(this, view, (byte) 6));
    }

    @Override // defpackage.za2
    public final void H() {
        this.d.R(false);
    }

    @Override // defpackage.xa2
    public final void J(wa2 wa2Var) {
        wa2Var.c = false;
    }

    @Override // defpackage.ab2
    public final int U() {
        return -1;
    }

    @Override // defpackage.ab2
    public final void V(ja2 ja2Var, boolean z) {
        this.d.R(((uu8) ja2Var).d);
    }
}
