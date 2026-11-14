package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import androidx.recyclerview.widget.i;

/* loaded from: classes.dex */
public abstract class o6n extends z6n {
    public final int b;

    public o6n(y46 y46Var, int i, tjn tjnVar) {
        super(y46Var);
        this.b = i;
        ((i) this).itemView.setOnClickListener(new n6n(tjnVar, (byte) 0));
    }

    public final RippleDrawable U(boolean z, ShapeDrawable shapeDrawable) {
        return xgh.i(shapeDrawable, ColorStateList.valueOf(((i) this).itemView.getContext().getColor(z ? 2131103628 : 2131103629)), this.b);
    }
}
