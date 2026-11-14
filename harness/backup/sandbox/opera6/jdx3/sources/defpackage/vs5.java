package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.CircleImageView;
import com.opera.android.custom_views.StylingImageView;

/* loaded from: classes.dex */
public final /* synthetic */ class vs5 implements r8n {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vs5(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    @Override // defpackage.r8n
    public final void a(View view) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                FrameLayout frameLayout = (FrameLayout) obj2;
                or2 or2Var = (or2) obj;
                frameLayout.setBackground(sgb.F(2131231331, view.getContext()));
                frameLayout.setForeground(f03.x(R.attr.selectableItemBackground, view.getContext()));
                if (!((at5) obj3).l) {
                    at5.g((StylingImageView) or2Var.d);
                }
                at5.g((StylingImageView) or2Var.e);
                break;
            case 1:
                Context context = ((iv6) ((d5o) obj3).c).b.getContext();
                ((ImageView) obj2).setImageDrawable(eti.d((l6e) obj, context, fan.a(24.0f, context.getResources())));
                break;
            case 2:
                zzb zzbVar = (zzb) obj3;
                ?? r3 = (StylingImageView) obj2;
                if (zzbVar.a.indexOf((tzb) ((LinearLayout) ((y83) obj).b).getTag()) != zzbVar.d) {
                    r3.c(ColorStateList.valueOf(f03.q(r3.getContext())));
                    break;
                } else {
                    r3.c(f03.v(r3.getContext()));
                    break;
                }
            case 3:
                dxh dxhVar = (dxh) obj3;
                dxh dxhVar2 = (dxh) obj2;
                StatusBarDrawingFrameLayout statusBarDrawingFrameLayout = (StatusBarDrawingFrameLayout) obj;
                int iA = dxhVar != null ? dxhVar.a(view.getContext()) : dxhVar2.a(view.getContext());
                if (Color.alpha(iA) == 255) {
                    iA = p37.m0(iA, Color.alpha(dxhVar2.a(view.getContext())));
                }
                if (iA != statusBarDrawingFrameLayout.k) {
                    statusBarDrawingFrameLayout.k = iA;
                    statusBarDrawingFrameLayout.b();
                    break;
                }
                break;
            case 4:
                eri eriVar = (eri) obj3;
                MenuItem menuItem = (MenuItem) obj;
                dkf dkfVar = (dkf) ((akg) obj2).s;
                if (dkfVar == null) {
                    dkfVar = null;
                }
                menuItem.setIcon(eti.d(eriVar, dkfVar, z7h.h(dkfVar, 24.0f)));
                break;
            default:
                Context context2 = (Context) obj2;
                CircleImageView circleImageView = ((g7d) obj).c;
                umn umnVar = ((ymn) obj3).k;
                Bitmap bitmap = umnVar.g;
                if (bitmap != null && f03.H(context2)) {
                    circleImageView.setImageBitmap(bitmap);
                    break;
                } else {
                    circleImageView.setImageBitmap(umnVar.f);
                    break;
                }
                break;
        }
    }
}
