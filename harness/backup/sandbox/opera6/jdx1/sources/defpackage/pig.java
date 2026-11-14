package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public final class pig extends i {
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final /* synthetic */ uig e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pig(uig uigVar, View view) {
        super(view);
        this.e = uigVar;
        this.b = (TextView) view.findViewById(2131362784);
        this.c = (TextView) view.findViewById(2131362807);
        this.d = (ImageView) view.findViewById(2131362782);
        view.setOnClickListener(new zvd(this, (byte) 17));
    }
}
