package defpackage;

import android.view.View;
import com.opera.android.custom_views.LayoutDirectionViewPager;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class twe implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xwe b;

    public /* synthetic */ twe(xwe xweVar, byte b) {
        this.a = b;
        this.b = xweVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        xwe xweVar = this.b;
        switch (b) {
            case 0:
                LayoutDirectionViewPager layoutDirectionViewPager = xweVar.f;
                if (layoutDirectionViewPager.q() != layoutDirectionViewPager.a.a.getCount() - 1) {
                    xweVar.h.G();
                    break;
                } else {
                    xweVar.l = true;
                    xweVar.g0();
                    List listF = xweVar.getFragmentManager().c.f();
                    if (listF.isEmpty() || !(am2.l(1, listF) instanceof kxe)) {
                        xweVar.k.e(new exe(), false);
                        break;
                    }
                }
                break;
            case 1:
                xweVar.g0();
                break;
            default:
                xweVar.g0();
                break;
        }
    }
}
