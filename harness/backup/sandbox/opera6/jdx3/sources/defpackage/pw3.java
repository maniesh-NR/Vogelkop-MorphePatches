package defpackage;

import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final /* synthetic */ class pw3 extends b6h {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw3(Object obj, Class cls, String str, String str2, int i, byte b) {
        super(obj, cls, str, str2, i);
        this.b = b;
    }

    public final Object get() {
        switch (this.b) {
            case 0:
                return ((tw3) ((z84) this).receiver).a.a();
            case 1:
                return Boolean.valueOf(((BrowserActivity) ((z84) this).receiver).X0());
            case 2:
                return ((OperaApplication) ((z84) this).receiver).R();
            case 3:
                return ((BrowserActivity) ((z84) this).receiver).I0();
            case 4:
                return ((OperaApplication) ((z84) this).receiver).y();
            case 5:
                return ((OperaApplication) ((z84) this).receiver).y();
            case 6:
                return ((OperaApplication) ((z84) this).receiver).y();
            case 7:
                return ((OperaApplication) ((z84) this).receiver).y();
            case 8:
                return ((iak) ((z84) this).receiver).getValue();
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return ((iak) ((z84) this).receiver).getValue();
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return ((z84) this).receiver.getClass().getSimpleName();
            case 11:
                return ((iak) ((z84) this).receiver).getValue();
            case 12:
                return ((iak) ((z84) this).receiver).getValue();
            case 13:
                return ((iak) ((z84) this).receiver).getValue();
            case 14:
                return ((iak) ((z84) this).receiver).getValue();
            case 15:
                return ((OperaApplication) ((z84) this).receiver).L().c;
            case 16:
                return ((OperaApplication) ((z84) this).receiver).L().g;
            case 17:
                return ((OperaApplication) ((z84) this).receiver).h();
            case SizeUtil.textSize0_1 /* 18 */:
                return (pch) ((OperaApplication) ((z84) this).receiver).r.x0.get();
            default:
                return ((a5p) ((z84) this).receiver).a;
        }
    }
}
