package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class imf implements a5n {
    public final /* synthetic */ byte a;
    public final View b;
    public final ImageView c;

    public /* synthetic */ imf(View view, ImageView imageView, byte b) {
        this.a = b;
        this.b = view;
        this.c = imageView;
    }

    public static imf a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.inflate(2131559188, viewGroup);
        ImageView imageView = (ImageView) w1h.j(2131363187, viewGroup);
        if (imageView != null) {
            return new imf(viewGroup, imageView, (byte) 1);
        }
        t3p.q("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(2131363187)));
        return null;
    }

    @Override // defpackage.a5n
    public final View getRoot() {
        byte b = this.a;
        return this.b;
    }
}
