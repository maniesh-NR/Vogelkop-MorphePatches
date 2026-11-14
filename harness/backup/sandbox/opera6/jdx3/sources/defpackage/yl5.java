package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.i;
import com.opera.android.custom_views.StylingImageView;

/* loaded from: classes.dex */
public final class yl5 extends i {
    public final StylingImageView b;
    public final TextView c;
    public final TextView d;
    public final View e;
    public final View f;
    public String g;
    public final /* synthetic */ am5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl5(am5 am5Var, ViewGroup viewGroup) {
        super(j7c.n(viewGroup, 2131558612, viewGroup, false));
        this.h = am5Var;
        this.b = (StylingImageView) ((i) this).itemView.findViewById(2131363256);
        this.c = (TextView) ((i) this).itemView.findViewById(2131363263);
        this.d = (TextView) ((i) this).itemView.findViewById(2131363257);
        View viewFindViewById = ((i) this).itemView.findViewById(2131363252);
        this.e = viewFindViewById;
        this.f = ((i) this).itemView.findViewById(2131363253);
        viewFindViewById.setOnClickListener(new yk4(this, (byte) 5));
    }
}
