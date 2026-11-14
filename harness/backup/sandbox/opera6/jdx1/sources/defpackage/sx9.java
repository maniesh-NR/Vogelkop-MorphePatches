package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class sx9 implements oyh {
    public final /* synthetic */ byte a = 1;
    public final Object b;

    public sx9(Context context) {
        this.b = context.getApplicationContext();
    }

    public sx9(zg3 zg3Var) {
        this.b = zg3Var;
    }

    @Override // defpackage.oyh
    public final boolean a(Object obj, trf trfVar) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return ((Uri) obj).getScheme().equals("android.resource");
        }
    }

    @Override // defpackage.oyh
    public final kyh b(Object obj, int i, int i2, trf trfVar) {
        switch (this.a) {
            case 0:
                return ah3.c((zg3) this.b, ((f3k) obj).b());
            default:
                return c((Uri) obj);
        }
    }

    public final kyh c(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        Context context = (Context) this.b;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(fki.p(uri, "Failed to obtain context or unrecognized Uri format for: "), e);
                }
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                qp2.o(fki.p(uri, "Failed to find resource id for: "));
                return null;
            }
        } else {
            if (pathSegments.size() != 1) {
                qp2.o(fki.p(uri, "Unrecognized Uri format: "));
                return null;
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(fki.p(uri, "Unrecognized Uri format: "), e2);
            }
        }
        Drawable drawableV = na2.v(context, contextCreatePackageContext, identifier, null);
        if (drawableV != null) {
            return new lx9(drawableV, (byte) 1);
        }
        return null;
    }
}
