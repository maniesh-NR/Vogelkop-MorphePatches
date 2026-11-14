package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class sf2 implements a5n {
    public final /* synthetic */ byte a;
    public final ImageView b;

    public /* synthetic */ sf2(ImageView imageView, byte b) {
        this.a = b;
        this.b = imageView;
    }

    public static sf2 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(2131559426, viewGroup, false);
        if (viewInflate != null) {
            return new sf2((ImageView) viewInflate, (byte) 1);
        }
        t3p.q("rootView");
        return null;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        return this.b;
    }
}
