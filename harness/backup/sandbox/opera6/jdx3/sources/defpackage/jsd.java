package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;

/* loaded from: classes.dex */
public class jsd extends RelativeLayout {
    public final HashMap a;
    public final ImageView.ScaleType b;

    public jsd(Context context) {
        super(context, null, 0);
        this.b = ImageView.ScaleType.FIT_CENTER;
        this.a = new HashMap();
    }

    public static void c(aoo aooVar, cie cieVar) {
        d(aooVar, cieVar, new i4d((Object) cieVar, (byte) 4));
    }

    public static void d(aoo aooVar, cie cieVar, loo looVar) {
        aooVar.i = cieVar;
        x79 x79Var = phf.a;
        x79Var.getClass();
        gxo gxoVar = gxo.c;
        tvk tvkVar = (tvk) x79Var.e;
        if (tvkVar == null) {
            tvkVar = new tvk();
            x79Var.e = tvkVar;
        }
        aooVar.p = tvkVar;
        aooVar.j = cieVar.R;
        aooVar.k = cieVar.S;
        aooVar.d = cieVar.Q;
        aooVar.e = looVar;
        aooVar.m = cieVar.T;
        aooVar.n = cieVar.c;
        aooVar.h = cieVar.L;
        aooVar.r = cieVar.Y;
        aooVar.s = new zg(cieVar.y0, cieVar.M, cieVar.p0, cieVar.q);
        aooVar.l(cieVar.d);
    }

    public final void a(aoo aooVar) {
        addView(aooVar, new RelativeLayout.LayoutParams(-1, -1));
    }

    public void b(cie cieVar, w06 w06Var) {
        hsd isdVar;
        hsd hsdVar;
        if (getChildCount() > 0) {
            removeAllViews();
        }
        switch (gsd.a[w06Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                isdVar = new isd((Object) this, (byte) 0);
                hsdVar = isdVar;
                break;
            case 5:
                isdVar = new wub(this);
                hsdVar = isdVar;
                break;
            case 6:
                isdVar = new i4d((Object) this, (byte) 5);
                hsdVar = isdVar;
                break;
            case 7:
                isdVar = new lld((Object) this, (byte) 2);
                hsdVar = isdVar;
                break;
            case 8:
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                isdVar = new qfb((Object) this, (byte) 10);
                hsdVar = isdVar;
                break;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
                isdVar = new ga6((Object) this, (byte) 28);
                hsdVar = isdVar;
                break;
            case 15:
            case 16:
            case 17:
                isdVar = new nv6(this);
                hsdVar = isdVar;
                break;
            default:
                hsdVar = null;
                break;
        }
        if (hsdVar != null) {
            hsdVar.e(cieVar);
        }
        w06Var.toString();
    }

    public void e(cie cieVar) {
        HashMap map = this.a;
        fjo fjoVar = (fjo) map.get(cieVar);
        if (fjoVar != null) {
            fjoVar.unregister();
        }
        map.remove(cieVar);
    }
}
