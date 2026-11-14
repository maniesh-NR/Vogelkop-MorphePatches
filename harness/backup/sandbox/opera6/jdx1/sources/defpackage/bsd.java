package defpackage;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.a;

/* loaded from: classes.dex */
public final class bsd implements v7e {
    public final /* synthetic */ byte a;
    public final Context b;

    public bsd(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = context.getApplicationContext();
                break;
            case 2:
                this.b = context.getApplicationContext();
                break;
            default:
                this.b = context;
                break;
        }
    }

    @Override // defpackage.v7e
    public final u7e a(Object obj, int i, int i2, trf trfVar) {
        Long l;
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                Uri uri = (Uri) obj;
                return new u7e(new o6f(uri), new asd(context, uri, (byte) 0));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                return new u7e(new o6f(uri2), new m19((byte) 1, uri2, new s9i(a.b(context).d.t(), new pjn(context.getContentResolver(), (byte) 3), a.b(context).e, context.getContentResolver(), (byte) 1)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) trfVar.c(p3n.d)) == null || l.longValue() != -1) {
                    return null;
                }
                return new u7e(new o6f(uri3), new m19((byte) 1, uri3, new s9i(a.b(context).d.t(), new mnl(context.getContentResolver()), a.b(context).e, context.getContentResolver(), (byte) 1)));
        }
    }

    @Override // defpackage.v7e
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                return mkh.y((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return mkh.y(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return mkh.y(uri2) && uri2.getPathSegments().contains("video");
        }
    }
}
