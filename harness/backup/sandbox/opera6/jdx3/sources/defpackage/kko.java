package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class kko extends FrameLayout {
    public final oep a;
    public View.OnClickListener b;
    public final kho c;

    public kko(Context context, m42 m42Var, Function0 function0) throws Resources.NotFoundException {
        super(context);
        oep oepVar = new oep(new b11(function0, (byte) 24));
        this.a = oepVar;
        kho khoVar = new kho(context, this);
        khoVar.setImageDrawable(context.getDrawable(2131233035));
        khoVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        khoVar.setClickable(true);
        khoVar.setFocusable(true);
        khoVar.setOnClickListener(oepVar);
        khoVar.setOnTouchListener(m42Var);
        this.c = khoVar;
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167276);
        addView(khoVar, new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
        setElevation(100.0f);
        setOutlineProvider(null);
    }
}
