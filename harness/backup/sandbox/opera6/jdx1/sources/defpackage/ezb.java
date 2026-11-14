package defpackage;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* loaded from: classes.dex */
public final class ezb extends Paint {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ezb(byte b, int i) {
        super(i);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezb(PorterDuff.Mode mode) {
        super(1);
        this.a = (byte) 0;
        setXfermode(new PorterDuffXfermode(mode));
    }

    private final void a(LocaleList localeList) {
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 30) {
                    PointF pointF = l1e.a;
                    super.setAlpha(Math.max(0, Math.min(255, i)));
                    break;
                } else {
                    int color = getColor();
                    PointF pointF2 = l1e.a;
                    setColor((Math.max(0, Math.min(255, i)) << 24) | (color & 16777215));
                    break;
                }
            default:
                super.setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
        switch (this.a) {
            case 0:
                break;
            default:
                super.setTextLocales(localeList);
                break;
        }
    }
}
