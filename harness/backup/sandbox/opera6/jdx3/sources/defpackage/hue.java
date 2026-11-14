package defpackage;

import android.view.View;
import androidx.recyclerview.widget.i;
import com.opera.android.ui.catalog.widget.OperaChip;

/* loaded from: classes.dex */
public final class hue extends i {
    public final /* synthetic */ kue b;
    public final OperaChip c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View, com.opera.android.ui.catalog.widget.OperaChip] */
    public hue(kue kueVar, View view) {
        super(view);
        this.b = kueVar;
        kueVar.h.add(this);
        ?? r2 = (OperaChip) view.findViewById(2131363671);
        this.c = r2;
        r2.setClickable(false);
        view.setOnClickListener(new zvd(this, (byte) 2));
    }
}
