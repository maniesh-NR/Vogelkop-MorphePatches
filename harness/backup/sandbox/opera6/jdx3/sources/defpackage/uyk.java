package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.i;
import java.util.Objects;

/* loaded from: classes.dex */
public final class uyk extends i {
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final /* synthetic */ vyk e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyk(vyk vykVar, View view) {
        super(view);
        Objects.requireNonNull(vykVar);
        this.e = vykVar;
        this.b = (TextView) view.findViewById(2131363525);
        this.c = (TextView) view.findViewById(2131364964);
        this.d = (ImageView) view.findViewById(2131362594);
        view.setOnClickListener(new ic(this, (byte) 10));
        view.setOnLongClickListener(new zkh(this, (byte) 1));
    }
}
