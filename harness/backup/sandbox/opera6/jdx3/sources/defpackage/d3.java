package defpackage;

import android.text.TextUtils;
import com.opera.android.PushedContentHandler;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class d3 extends l7n {
    public static final SimpleDateFormat i;
    public final PushedContentHandler b;
    public final mdh c;
    public final b1o d;
    public final orm e;
    public final d8j f;
    public final nak g;
    public final rlh h;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmm", Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        i = simpleDateFormat;
    }

    public d3(String str, hom homVar, PushedContentHandler pushedContentHandler, mdh mdhVar, b1o b1oVar, orm ormVar, d8j d8jVar) {
        this.b = pushedContentHandler;
        this.c = mdhVar;
        this.d = b1oVar;
        this.e = ormVar;
        this.f = d8jVar;
        String strB = tz5.b();
        String strR = x1p.R(pushedContentHandler);
        String str2 = ((fom) homVar.i()).b;
        nak nakVarF = z4o.f(new b3(str, strB, strR, TextUtils.isEmpty(str2) ? null : str2));
        this.g = nakVarF;
        this.h = a26.j(nakVarF);
    }
}
